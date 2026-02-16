import java.util.InputMismatchException;
import java.util.Scanner;
class Profile{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        boolean isStudent = false;
        boolean validInput = false;


        // Getting a String input
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();

        // Getting age and height input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your height: ");
        int height = scanner.nextInt();

        // Getting student status
        // Loop untill a valid boolean input is received
        while (!validInput) {
            System.out.print("Are you a Student? ");
            if (scanner.hasNextBoolean()){
                isStudent = scanner.nextBoolean();
                validInput = true;
            } else {
                System.out.println("Invalid input! Please enter true or false");
                scanner.next();
            }
        }
    System.out.println("__Profile__");
    System.out.println("Full Name: " + fullName);
    System.out.println("Age: " + age);
    System.out.println("Height: " + height);
    System.out.println("isStudent: " + isStudent);
    
    scanner.close();
        
    }
}