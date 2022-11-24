import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Computer {
    Random random=new Random();
    List cList=new ArrayList<>();
    public void addToList(List list){
        int copNum=random.nextInt(1,10);
        if(list.contains(copNum)){
            cList.add(copNum);
            int useNum= list.indexOf(copNum);
            list.remove(useNum);
            System.out.println("Computer list "+list);
        }else {
            addToList(list);
        }
    }

    public List getCList() {
        return cList;
    }
}
