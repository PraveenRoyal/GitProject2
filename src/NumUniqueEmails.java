import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NumUniqueEmails {
    public static void main(String[] args) {
    String[] emails = {"test.email+alex@leetcode.com",
            "test.e.mail+bob.cathy@leetcode.com",
            "testemail+david@lee.tcode.com"};
        System.out.println(numUniqueEmails(emails));
        System.out.println(Arrays.toString(emails));

    }

    public static int numUniqueEmails(String[] emails){
        for(int i = 0; i<emails.length;i++){
            String[] m = emails[i].split("@");
            String[] n = m[0].split("\\+");
            n[0] = n[0].replace(".","");
            emails[i] = n[0] +"@" +m[1];
        }
        Set<String> res = new HashSet<>(Arrays.asList(emails));
        return res.size();
    }

}
