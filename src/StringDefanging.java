public class StringDefanging {

    public static void main(String[] args) {
        String add = "1.1.1.1";
        add = defangIPaddr(add);
        System.out.println(add);
    }

    public static String defangIPaddr(String address) {
       address =  address.replace(".","[.]");
       return address;
    }

}
