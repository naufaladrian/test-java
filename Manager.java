 class Employee{
    String nama;

    public Employee(String nama) {
        this.nama = nama;
    }

    void sayHello(String nama) {
        System.out.println("Hello " + nama + "." + "My name is Employee " + this.nama);
    }
}
 class Manager extends Employee{

     public Manager(String nama) {
         super(nama) ;
     }

     void sayHello(String nama) {
            System.out.println("Hello " + nama + "." + "My name is Manager " + this.nama);
        }}
class  VPresident extends Manager {
    public VPresident(String nama) {
        super(nama);
    }
    void sayHello(String nama) {
                System.out.println("Hello " + nama + "My name is VP" + this.nama);
            }
}
