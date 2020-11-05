package Java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterLogic {
    public static void main(String[] args) {
    
//        String emailIdsList = "vishnu.kumar@hashedin.com,vishnu.kumarv.curefit.com,yogesh.kumar@hashedin.com,sumit@curefit.com";
        List<String> emailIdsList= new ArrayList<>();
        emailIdsList.add("vishnu.kumar@hashedin.com");
        emailIdsList.add("vishnu.kumar@v.curefit.com");
        emailIdsList.add("yogesh.kumar@hashedin.com");
        emailIdsList.add("sumit@curefit.com");
        
        String blockedIds = "yogesh.kumar@hashedin.com";
        String blockedDomains ="v.curefit.com";
        Map<String, List<String>> filteredMap = new HashMap<>();
    
        final List<String> configuredBlockedIdList = blockedIds != null ? Stream.of(blockedIds.split(",")).collect
            (Collectors.toList()) : new ArrayList<>(); // All Blocked email_id
        final List<String> configuredBlockedDomainsList = blockedDomains != null ? Stream.of(blockedDomains.split("," +
            "")).collect(Collectors.toList()) : new ArrayList<>();  // All Blocked domains
    
    
        final List<String> filteredEmailList = emailIdsList.stream().filter(email -> {
            String domain = FilterLogic.extractDomainNameFromEmail(email);
            return !configuredBlockedDomainsList.contains(domain);
        }).filter(email -> !configuredBlockedIdList.contains(email)).collect(Collectors.toList());
    
    
        List<String> blocked = emailIdsList.stream().filter(s -> !filteredEmailList.contains(s)).collect(Collectors
            .toList());
        System.out.println(1 & 0);
        System.out.println("T "+emailIdsList.toString());
        System.out.println("B "+blocked.toString());
        System.out.println("Pass "+filteredEmailList.toString());
        
        
    }
    private static String extractDomainNameFromEmail(String email) {
        return email.substring(email.indexOf("@") + 1);
    }
}
