import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		String firstname;
		 String middlename ;
		String lastname;
		String birthdate;
		String birthplace;
	
		long number;
		char Gender;
		boolean isSingle;
		
		
		
		Scanner scan = new Scanner(System.in);
		
		
			
	  System.out.print("========= Personal Information ========= please enter to start,");
       String Personal =scan.nextLine ();  

	
		System.out.print("Enter your Firstname: ");
		firstname =scan.nextLine();
   
   	System.out.print("Enter your Middlename: ");
		middlename =scan.nextLine();
		 
		System.out.print("Enter your Lastname:   ");
		lastname =scan.nextLine();
		
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
         isSingle =scan.nextBoolean();
         
         System.out.print("========= Summary Profile Information========= ");
	       String Summary =scan.nextLine ();  
		
		 

     	
		System.out.println(" Fullname: Christian Jay Perez Abletia ");
       	       
       	       
        System.out.println("Gender: " + Gender);
        System.out.println("Birthdate: " + birthdate);
        System.out.println("Birthplace: " + birthplace);
        System.out.println("MobileNumber: " + number);
        System.out.println("Email: " + email);
        System.out.println("isSingle: " + true );
         
	}
}

