class Hewan {
    String name;
    String gender;
    int age;
    String type;


    void sounds(String sound){
        System.out.println(sound);
    }
    @Override
    public String toString() {
        return "Hewan{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", type='" + type + '\'' +
                '}';
    }
}
