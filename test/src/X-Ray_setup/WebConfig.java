package X

import com.amazonaws.xray.AWSXRay;
import com.amazonaws.xray.AWSXRayRecorderBuilder;
import com.amazonaws.xray.metrics.MetricsSegmentListener;
import com.amazonaws.xray.plugins.EC2Plugin;
import com.amazonaws.xray.plugins.ECSPlugin;
import com.amazonaws.xray.plugins.EKSPlugin;
import org.springframework.stereotype.Component;

@Component
public class WebConfig {
    static {
        AWSXRayRecorderBuilder builder = AWSXRayRecorderBuilder.standard()
                .withPlugin(new EC2Plugin())
                .withPlugin(new ECSPlugin())
                .withPlugin(new EKSPlugin())
                .withSegmentListener(new MetricsSegmentListener());
        AWSXRay.setGlobalRecorder(builder.build());

    }
}