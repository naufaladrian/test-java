public class OOP {
    public static void main(String[] args) {

//        Person person=new Person("naufal","mijen");
//        person.name="qwert";
//        System.out.println(person);
//        person.sayHello(person.name);
//       var bebas= sayHello();
//        System.out.println(bebas);

//        Person person1=new Person();
//        person1.name="qwere";
//        person1.address="mijen";
//        System.out.println(person);
//        person1.sayHello(person1.name);
//        Hewan hw=new Hewan();
//        hw.name="Gajah";
//        hw.gender="Male";
//        hw.age=12;
//        hw.type="Omnivora";
//        System.out.println(hw);
//        hw.sounds("Mouuuuuuu");

//        Manager manager=new Manager();
//        manager.nama="Car";
//        manager.sayHello("h");
//
//        VPresident vPresident=new VPresident();
//        vPresident.nama="Jess";
//        vPresident.sayHello("Harley");
        Employee employee=new Employee("ack");
        employee.sayHello("Silim");
        employee=new Manager("Carl");
        employee.sayHello("Doe");
        employee=new VPresident("h");
        employee.sayHello("Jessica");
    }

}
