package ie.atu;

public class Student {
    private String name;
    private int number;
    private int age;
    private String address;

    public Student() {
    }

    public Student(String name, int number, int age, String address) {
        this.name = name;
        this.number = number;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
