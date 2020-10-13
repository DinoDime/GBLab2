import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        room();
        Scanner JavaInput = new Scanner(System.in);
        System.out.println("Do you want to continue? y/n");
        boolean response = JavaInput.next().equals("y");
        while(response){
                room();
                System.out.println("Do you want to continue? y/n");
                response = JavaInput.next().equals("y");
        }
        }
    public static void room() {
        Scanner JavaInput = new Scanner(System.in);
        System.out.println("What is the length of the classroom?");
        double length = JavaInput.nextDouble();
        System.out.println("What is the width of the classroom?");
        double width = JavaInput.nextDouble();
        System.out.println("What is the height of the classroom?");
        double height = JavaInput.nextDouble();
        double area = length * width;
        System.out.println("Area: " + area);
        double perimeter = length + length + width + width;
        System.out.println("Perimeter: " + perimeter);
        double volume = length * width * height;
        System.out.println("Volume: " + volume);

    }

}


