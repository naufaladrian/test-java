import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input Bilangan: ");
        int value=input.nextInt();
        int sisa=value % 2;
        if (sisa==0)System.out.println("genap");
        else System.out.println("ganjil");


    }
}
