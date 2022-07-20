import java.util.Scanner;

public class MainResto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FieldResto fieldResto=new FieldResto();
        System.out.print("Makanan :");
        String makanan = scanner.nextLine();
        fieldResto.makanan=makanan;
        System.out.print("Porsi :");
        String porsi = scanner.nextLine();
        fieldResto.porsi=porsi;
        System.out.print("Jumlah :");
        int jumlah = scanner.nextInt();
        fieldResto.jumlah=jumlah;

        System.out.println(fieldResto);
    }
}
