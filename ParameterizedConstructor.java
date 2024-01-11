class Demo {
    String userName;
    int age;



    int rollNumber;

    public Demo(String userName, int age, int rollNumber) {
        this.userName = userName;
        this.age = age;
        this.rollNumber = rollNumber;
    }
    void display(){
        System.out.println("Username: " + userName);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
    }
}

public class ParameterizedConstructor {
    public static void main(String[] args) {
        Demo demo = new Demo("Kausen", 21, 90);
        demo.display();
    }
}
