import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("pilih operasi matematika ( *, /, +, - )");
        var input2= input.nextLine();
        if (input2.equals("+")){
            System.out.println("penjumlahan");
            System.out.print("value1 : ");
            int res1 =input.nextInt();
            System.out.print("value2 : ");
            int res2 =input.nextInt();
            System.out.println("hasil dari "+ res1 +" + "+ res2 +" = " +(res1+res2));
        } else if (input2.equals("-")) {
            System.out.println("pengurangan");
            System.out.print("value1 : ");
            int res1 =input.nextInt();
            System.out.print("value2 : ");
            int res2 =input.nextInt();
            System.out.println("hasil dari "+ res1 +" - "+ res2 +" = " +(res1-res2));
        }else if (input2.equals("*")) {
            System.out.println("perkalian");
            System.out.print("value1 : ");
            int res1 =input.nextInt();
            System.out.print("value2 : ");
            int res2 =input.nextInt();
            System.out.println("hasil dari "+ res1 +" * "+ res2 +" = " +(res1*res2));
        }else if (input2.equals("/")) {
            System.out.println("pembagian");
            System.out.print("value1 : ");
            int res1 =input.nextInt();
            System.out.print("value2 : ");
            int res2 =input.nextInt();
            System.out.println("hasil dari "+ res1 +" / "+ res2 +" = " +(res1/res2));
        }else {
            System.out.println("operasi tidak tersedia");
        }
    }
}
