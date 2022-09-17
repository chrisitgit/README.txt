import java.util.Scanner;
 class Activity#2.java
public static void main(String args[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Please fill up the form...");
    System.out.println("========== Personal Information ==========");

    // Input last name.
    System.out.print("Last Name : ");
    String lastName = input.nextLine();

    // Input first name.
    System.out.print("First Name : ");
    String firstName = input.nextLine();

     // Input middle name.
    System.out.print("Middle Name : ");
    String middleName = input.nextLine();

     // Input gender.
    System.out.print("Gender (M for Male, F for Female, N for non- binary) : ");
    String gender = input.nextLine().charAt(0);

     // Input first name.
    System.out.print("First Name : ");
    String firstName = input.nextLine();

}