import java.util.Collections;
import java.util.List;

public class Checker {
    private final static int[][] corrArr={{1,2,3},{4,5,6,},{7,8,9},{1,4,7},{2,5,8},{3,6,9},{1,5,9},{3,5,7}};
     static boolean checker(List list){
         Collections.sort(list);
        for (int i = 0; i < corrArr.length; i++) {
            int counter=0;
            int[] picArr=corrArr[i];
            for (int j = 0; j < picArr.length; j++) {
                if(picArr[j]==(int)list.get(j)){
                    counter++;
                }
            }
            if(counter==3){
                return true;
            }
        }
        return false;
    }
}
