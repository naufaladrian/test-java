class Person{
    String name;
    String address;
    final String country="Indonesia";


    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    void sayHello(String people){
        System.out.println("Hello "+people+"."+" My,name is "+name);
    }
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

}
