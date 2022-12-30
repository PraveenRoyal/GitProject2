public class sortSentence {

    public static void main(String[] args) {
        String s = "is2 Sentence4 This1 a3";
        String b = sort(s);
        System.out.println(b);
    }

    public static String sort(String s) {

        String[] a = s.split(" ");
        String [] b = new String[a.length];
        int[] x = new int[a.length];

        for(int i = 0; i<a.length;i++) {
            b[i] = a[i].substring(0,a[i].length()-1);
            x[i] = Integer.parseInt(String.valueOf(a[i].charAt(a[i].length()-1)));
        }
        int num = 0;
        String temp ;
        for(int i = 0; i<a.length;i++) {
            for(int j = 1;j<a.length-i;j++) {
                if(x[j-1]>x[j]){
                    num = x[j-1];
                    x[j-1] = x[j];
                    x[j] = num;

                    temp = b[j-1];
                    b[j-1] = b[j];
                    b[j] = temp;
                }
            }
        }
        StringBuilder xy = new StringBuilder();
        for(int i = 0; i<a.length;i++) {
            xy.append(b[i]).append(" ");
        }
      return xy.toString().trim();

    }
}
