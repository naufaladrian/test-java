import javax.print.attribute.standard.Finishings;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Naufal");
//        System.out.println("Semarang, 6/9/2004");
//        System.out.println("Sekolah asal, SMAN 5 Semarang");
//        byte b=127;
//        short s=1000;
//        int i= 100000;
//        long l=1000000000;
//        float f= 12.12f;
//        char A='A';
//        char L='L';
//        char I='I';
//        System.out.print(A);
//        System.out.print(L);
//        System.out.println(I);
//        String h1="kucig";
//        String h2="anjing";
//        String h3="musang";
//        String h4="rubah";
//        String h5="\"lalat\"";
//        String h6="kuda";
//        String h7="siput";
//        String h8="burung";
//       final var h9="ikan";
//        String h10="gajah";
//        System.out.println(h5);
//        Long lg=7L;
//        int it=lg.intValue();
//        int it2=4;
//        System.out.println("qwe"+(it-it2));
//        System.out.print("Berapa umur kamu? ");
//        Scanner input = new Scanner(System.in);
//        if (input.hasNextInt()) {
//            int name = input.nextInt(); System.out.println("Your age is " + name);
//        } else {
//            System.out.println("Sorry! Saya tidak mengerti");}
//        System.out.print("Peringkat kamu:");
//        Scanner input = new Scanner(System.in);
//        if (!input.hasNextInt()) {
//            System.out.println("Input harus angka!");
//            return;
//        }
//        int nama = input.nextInt();
//        System.out.println("Selamat, kamu peringkat " + nama);
//        int ak=1;
//        if (ak==1) {
//          System.out.println("ini angka 1");
//        }
//        Scanner input = new Scanner(System.in);
//        System.out.print("Input Username : ");
//        String res1= input.nextLine();
//        System.out.print("Input Password : ");
//        String res2= input.nextLine();
//        System.out.print("usernamemu adalah "+res1+" dan passwordmu adalah "+res2);
//        final String user="guest1";
//        final String pass="1234";
//        Scanner input = new Scanner(System.in);
//        System.out.println("Silahkan login");
//        System.out.println("Input Username : ");
//        String res1= input.nextLine();
//        System.out.println("Input Password : ");
//        String res2= input.nextLine();
//        if (res1.equals(user) && res2.equals(pass)) System.out.println("login berhasil");
//        else System.out.println("username atau password salah");
//        for (var i=1; i<=20; i++){
//            System.out.println("bus berjalan sebanyak "+i+" kali");
//        boolean lelah = false;
//        int number = 1;
//        do {
//            System.out.print("Apakah kamu lelah (true/ false)? ");
//            Scanner input = new Scanner(System.in);
//            if (input.hasNextBoolean()) {
//                lelah = input.nextBoolean();
//                if (!lelah) {
//                    number++;
//                    System.out.println("Semangat" + number);
//                }
//            } else {
//                System.out.println("Sorry! Saya tidak mengerti");
//            }
//        } while (!lelah);
//        System.out.println("jumlah es krim : ");
//        Scanner input = new Scanner(System.in);
//        if (!input.hasNextInt()){
//            System.err.println("Input harus angka!");
//            return;
//        }
//        var res=input.nextInt();
//        for (var i=1; i<=res;i++) {
//            System.out.println("Eskrim " + i);
//        }
//        System.out.print("Pilih destinasi wisata : ");
//        Scanner input = new Scanner(System.in);
//        var res=input.nextLine().toLowerCase();
//        if (res.equals("indonesia")){
//            System.out.println("1. Pura Besakih\n2. Kepulauan Derawan\n3. Taman Nasional Way Kambas");
//        }else if (res.equals("amerika")) {
//            System.out.println("1. Fifth Avenue\n2. Central Park\n3. Brooklyn Bridge");
//        }else if (res.equals("china")) {
//            System.out.println("1. Museum Situs Mausoleum Kaisar Qinshihuang\n2. The Forbidden City\n3. Tembok Besar China");
//        }else {
//            System.out.println("negara "+res+" tidak tersedia");
//        }
//        System.out.println();
//        Scanner input = new Scanner(System.in);
//        System.out.print("value1 : ");
//        int res1 =input.nextInt();
//        System.out.print("value2 : ");
//        int res2 =input.nextInt();
//        System.out.println("hasil dari "+ res1 +" + "+ res2 +" = " +(res1+res2));

        Scanner input = new Scanner(System.in);
//        System.out.println("Masukan nilai bintang");
//        int v=input.nextInt();
//        for (var i=1 ; i<=v ;  i++){
//             System.out.print("*");
//        }

//        Date date=new Date();
//        System.out.println("Sekarang Tanggal : "+(date.getYear()+1900)+date.getMonth()+date.getDate());

//        var angka="7654321";
//        for (var i=1;i<=6; i++){
//            angka=angka.substring(1);
//            System.out.println(angka);
//        }
//        System.out.println("Kamu mau nukerin apa?");
//        System.out.println(" Input angka : ");
//        if (!input.hasNextInt()){
//            System.err.println("input harus angka");
//            return;
//        }
//        var value=input.nextInt();
//        switch (value){
//            case 1:
//                System.out.println("- hp\n" +
//                        "- laptop\n" +
//                        "- ps");
//                break;
//            case 2:
//                System.out.println("- Tv\n" +
//                        "- Kulkas\n" +
//                        "- Sepeda");
//                break;
//            case 3:
//                System.out.println("- Panci\n" +
//                        "- Gas Lpg Biru\n" +
//                        "- Kompor 4 lubang");
//                break;
//            default:
//                System.out.println("Pilihan ga ada");
//                break;
//        }
//        System.out.println("Input : ");
//        var value=input.nextLine();
//        var res= value.substring(0,1);
//        for (var i=1;i<value.length();i++){
//            res+="*";
//        }            System.out.print(res);
//        String[] arr=new String[3];
//        arr[0]="Carolina";
//        arr[1]="Joly";
//        arr[2]="Doe";
//        System.out.println(Arrays.toString(arr));
//        System.out.println("Assignment Array");
//        int[] num={1,2,3,4,5};
//        System.out.println(Arrays.toString(num));

//        String[] hw = {"lalat", "rubah", "babi", "kutu", "kura-kura"};
//        for (var i = 0; i <= 100; i++) {
//            if (i % 2 == 0) continue;
//            System.out.println("perulangan ganil" + i);
//        }
//
//        String[][] zoo = {
//                {"Apple", "Mangga", "Nanas"},
//                {"Singa", "Gajah", "Harimau"}
//        };
//        System.out.println(Arrays.toString(zoo));
//        String nama = "Naufal&nbsp;ardian";
//        String[]arr=nama.split("&nbsp;");
//        for (var value : arr){
//            System.out.println(value);
//        }
    }

}
