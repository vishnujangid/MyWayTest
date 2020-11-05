import com.amazonaws.xray.AWSXRay;
import com.iraksha.CustomHeaders;
import org.apache.log4j.Logger;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Enumeration;

public class XRAYAnnotationFilter implements Filter {
    private static final Logger LOG = Logger.getLogger(XRAYAnnotationFilter.class);

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpRequest = this.castServletRequest(servletRequest);
        Enumeration<String> headerNames = httpRequest.getHeaderNames();
        if (headerNames != null) {
            while (headerNames.hasMoreElements()) {
                String name = headerNames.nextElement();
                LOG.info("Header: "+name);
                if (CustomHeaders.GROUP_CODE.equals(name)) {
                    LOG.info("Header1: "+name+""+httpRequest.getHeader(name));
                    AWSXRay.getCurrentSegment().putAnnotation("TENANT", httpRequest.getHeader(name));
                    AWSXRay.getCurrentSegment().setUser(httpRequest.getHeader(name));
                    LOG.info("Header2: "+name+""+httpRequest.getHeader(name));
                    break;
                }
            }
        }
        chain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }

    private HttpServletRequest castServletRequest(ServletRequest request) {
        try {
            return (HttpServletRequest) request;
        } catch (ClassCastException var) {
            LOG.warn("Unable to cast ServletRequest to HttpServletRequest.", var);
            return null;
        }
    }
}
