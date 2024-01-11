
class Copy {
    private final String userName;
    private final int age;

    public Copy(String userName, int age){
        System.out.println("Constructor is going to execute:");
        System.out.println("Name: " + (this.userName = userName));
        System.out.println("Age: " + (this.age = age));
    }

    public Copy(Copy copy){
        System.out.println("Copy constructor is going to execute:");
        System.out.println("Name: " + (this.userName = copy.userName));
        System.out.println("Age: " + (this.age = copy.age));
    }
}

public class CopyConstructor {
    public static void main(String[] args) {
        Copy copy = new Copy("Kausen", 21);
        Copy copy1 = new Copy(copy);
    }
}
