public class ReversingInteger {
    public static void main(String[] args) {
        System.out.println(reverse(-123));
//        StringBuilder my = new StringBuilder("2345");
//        my.insert(0,"-");
//        System.out.println(my);

    }

    public static int reverse(int x){
        String s = "" + x;
        String xy  = "";
        if(s.charAt(0)== '-'){
            s = s.replace("-","");
            xy = "-";
        }
        StringBuilder hello = new StringBuilder(s);
        hello.reverse();
        s = hello.toString();
        int res = Integer.parseInt(s);
        if(xy.equals("-")){
            res = -res;
        }
        return res;
    }

}
