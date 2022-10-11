import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		

		String birthdate;
		String birthplace;
		long number;
		char Gender;
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("========= Personal Information ========= please enter to start,");
			scan.nextLine();
   

			   System.out.print("Enter your Firstname: ");
				scan.nextLine();
   
			System.out.print("Enter your Middlename: ");
				scan.nextLine();
				 
				System.out.print("Enter your Lastname:   ");
				scan.nextLine();
   

				System.out.print("Enter your BirthPlace: ");
				birthplace =scan.nextLine();
   
			System.out.print("Enter your Birthday: ");
				birthdate =scan.nextLine();
				
				System.out.print("Enter your Email: ");
			  String email =scan.nextLine();		 
				
				System.out.print("Gender ( M for male, F for Female, X for LGBTQ):    ");	
				 Gender = scan.next().charAt(0); 	
				 	
				System.out.print("Enter your Mobile Number :  ");
				number =scan.nextLong(); 
				
				System.out.print("isSingle ( Y for Yes,N for No):"); 
			     System.out.print("========= Summary Profile Information========= ");
			       System.out.println(" Fullname: Christian Jay Perez Abletia ");
			   	       
			   	       
			    System.out.println("Gender: " + Gender);
			    System.out.println("Birthdate: " + birthdate);
			    System.out.println("Birthplace: " + birthplace);
			    System.out.println("MobileNumber: " + number);
			    System.out.println("Email: " + email);
		}
		
		
			
	  System.out.println("isSingle: " + true );

         System.out.println("========== Summary Profile Information ==========");
		 
		System.out.println("Gender : " + Gender);
	    System.out.println("Birth Date : " + birthdate);
	    System.out.println("Birth Place : " + birthplace);
		System.out.println("Mobile Number : " + number);

	}
}

