import java.util.Random;
import java.util.Scanner;

public class Game1 {
    public static void main(String[] args) {
        Random ra=new Random();
        Scanner input=new Scanner(System.in);
        while (true){
            String[] hewan={
                    "singa", "gajah", "jerapah", "semut", "kanguru"
            };
        String res=hewan[ra.nextInt(hewan.length)];
        System.out.println("Masukkan nama hewan :");
        String result=input.nextLine();
        if (result.equals(res)){
            System.out.println("benar, hasil "+res);
            return;
        }
        else System.out.println("NT, yg benar "+res);}
    }
}
