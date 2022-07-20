public class Method {
    //    public static void main(String[] args) {
//        int[] nilai = {
//                60, 60, 60, 60};
//        sayCongrats( "Carolina", nilai);
//    }
//        static void sayCongrats (String firstName, int[] value) {
//            int total = 0;
//            for (int n : value) {
//                total += n;
//            }
//            int nilaiAkhir = total / value.length;
//            if (nilaiAkhir >= 75) {
//                System.out.println("Kamu lulus");
//            } else {
//                System.out.println("Coba lagi");
//            }
//        }
//    public static void main(String[] args) {
//        sayCongrats("Carolina", "Joly");
//    }
//
//    static void sayCongrats() {
//        System.out.println("Hello ");
//    }
//
//    static void sayCongrats(String firstName) {
//        System.out.println("Hello," + firstName);
//    }
//
//    static void sayCongrats(String firstName, String LastName) {
//
//        System.out.println("Hello," + firstName + " " + LastName);
//    }
    public static void main(String[] args) {
        System.out.println(factorialRecursive(5));
    }

    static int factorialRecursive(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * factorialRecursive(value - 1);
        }
    }
}
