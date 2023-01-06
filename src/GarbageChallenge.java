import java.util.HashMap;
import java.util.Map;

public class GarbageChallenge {
    public static void main(String[] args) {
        String[] garbage = {"G","P","GP","GG"};
        int[] travel = {2,4,3};
        System.out.println(garbageCollection(garbage,travel));
    }

    public static int garbageCollection(String[] garbage, int[] travel){
        Map<Character,Integer> truck = new HashMap<>();
        int collectG = 0;
        int collectP = 0;
        int collectM = 0;
        for(int i = 0;i<garbage.length;i++){
            for(int j = garbage[i].length()-1;j>=0;j--){
                if(garbage[i].charAt(j)=='G') {
                    collectG += 1;
                }
            }
            if(i!=garbage.length-1){
                collectG=collectG+travel[i];
            }
        }
        truck.put('G',collectG);

        for(int i = 0;i<garbage.length;i++){
            for(int j = garbage[i].length()-1;j>=0;j--){
                if(garbage[i].charAt(j)=='P') {
                    collectP += 1;
                }
            }
            if(i!=garbage.length-1){
                collectP=collectP+travel[i];
            }
        }
        truck.put('P',collectP);

        for(int i = 0;i<garbage.length;i++){
            for(int j = garbage[i].length()-1;j>=0;j--){
                if(garbage[i].charAt(j)=='M'){
                collectM+=1;}
            }
            if(i!=garbage.length-1 && garbage[i].contains("M")){
                collectM=collectM+travel[i];
            }
        }
        truck.put('M',collectM);

        System.out.println(truck);

        return 0;
    }
}
