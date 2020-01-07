import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static final Integer GAME_NUMBER = 15;
    public static Integer i = 1;
    static Computer computer;
    static ArrayList<Integer> number = new ArrayList<Integer>(GAME_NUMBER + 1);
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer n;
        System.out.println("The game has begun...");
        computer = new Computer();
        computer.start();
        while(i<GAME_NUMBER + 1) {
            n = in.nextInt();
            if(i<1) {
                break;
            }
            if (n == i) {
                number.add(i);
                i++;

            }
            for(Integer s: number )  {
                System.out.print(s+" ");
            }
            System.out.println();
        }
        if (i > 0) {
            System.out.print("Game over.\nYou win.");
        }

    }
}
