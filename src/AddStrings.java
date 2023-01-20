public class AddStrings {
    public static void main(String[] args) {
        System.out.println(addStrings("38766206223801494171","6529364523802684779"));
    }
    public static String addStrings(String num1, String num2){
        long num = Long.parseLong(num1) + Long.parseLong(num2);
        if(num > Integer.MAX_VALUE) num = Integer.MAX_VALUE;
        if(num==0)return "0";
        StringBuilder res = new StringBuilder();
        while(num>0){
            long a = num%10;
            res.append(a);
            num = num/10;
        }
        res.reverse();
        return res.toString();
    }
}
