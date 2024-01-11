public class BicycleClass {
    private final String companyName = "Patwekar Cycle's";
    private final int numberOfWheels = 2;

    public String getCompanyName() {
        return companyName;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }
}

class MountainBike extends BicycleClass {
    String color;
    int numberOfGears;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }
    void display(){
        System.out.println("Company: " + getCompanyName());
        System.out.println("Number of Wheels: " + getNumberOfWheels());
        System.out.println("Color: " + getColor());
        System.out.println("Number of Gears: " + getNumberOfGears());
    }
}

class Main {
    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike();
        mountainBike.setColor("Black");
        mountainBike.setNumberOfGears(22);
        mountainBike.display();
    }
}
