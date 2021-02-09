package HW5;

public class Employee {

    String name;
    String prof;
    String email;
    long phoneNum;
    int money;
    int age;

    public Employee (String name, String prof, String email, long phoneNum, int money, int age) {

        this.name = name;
        this.prof = prof;
        this.email = email;
        this.phoneNum = phoneNum;
        this.money = money;
        this.age = age;
    }

    public void info() {
        System.out.println(name + ", " + prof + ", " + email + ", " + phoneNum + ", " + money + ", " + age);
    }

    public int getAge() {
        return age;
    }
}
