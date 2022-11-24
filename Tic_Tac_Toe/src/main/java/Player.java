import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Player {

    Scanner scanner=new Scanner(System.in);
    List cList=new ArrayList<>();
    public void addToList(List list){
        int playerNum=scanner.nextInt();
        if(list.contains(playerNum)){
            cList.add(playerNum);
            int useNum= list.indexOf(playerNum);
            list.remove(useNum);
            System.out.println("Player list"+list);
        }else {
            if(playerNum>9||playerNum<1){
                System.out.println("Enter correct number");
            }else{
                System.out.println("This  number already taken. Enter another number..");
            }

            addToList(list);
        }
    }

    public List getCList() {
        return cList;
    }
}
