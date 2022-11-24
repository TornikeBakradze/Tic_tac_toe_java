import java.util.*;

public class Launcher {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<Object> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        Computer computer=new Computer();
        Player player=new Player();

        for (int i = 0; i < 3; i++) {
            if(i==2){
                player.addToList(list);
                if(Checker.checker(player.getCList())){
                    System.out.println("Player win ");
                    break;
                }
                computer.addToList(list);
                if(Checker.checker(computer.getCList())){
                    System.out.println("Computer win");
                    break;
                }else {
                    System.out.println("Game over");
                    break;
                }
            }
            player.addToList(list);
            computer.addToList(list);

        }
    }
}