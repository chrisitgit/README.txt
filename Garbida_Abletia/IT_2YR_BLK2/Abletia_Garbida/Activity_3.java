package IT_2YR_BLK2.Abletia_Garbida;

import java.util.Scanner;

public class Activity_3 {
	
	private static String number;

	public static void main(String[] args) {
	
	    String lastName, firstName, middleName;
		String birthDate, birthPlace;
		char gender;
		long mobileNumber;
		String emailAddress;
		boolean isSingle;
		int presentHouseNo, presentLotNo;
		String presentStreetName, presentSubdivisionBarangay, presentMunicipality, presentProvince;
		int presentZipCode;
		int permanentHouseNo, permanentLotNo;
		String permanentStreetName, permanentSubdivisionBarangay, permanentMunicipality, permanentProvince;
		int permanentZipCode;
		try(Scanner scanner = new Scanner(System.in)){

		System.out.println(">>>>>>>>>>  Personal Information <<<<<<<<<<");
		System.out.print("Last Name : ");
	    lastName = scanner.nextLine();
		System.out.print("First Name : ");
        firstName = scanner.nextLine();
		System.out.print("Middle Name : ");
	    middleName = scanner.nextLine();
	    System.out.print("Gender (M for Male, F for Female, X for LGBTQ+) : ");
		gender = scanner.next().charAt(0);
		System.out.print("Are you single? (Y for Yes, N for No) : ");
		char status = scanner.next().charAt(0);
		if (status == 'Y' || status == 'y') {
		    isSingle = true;
		} else {
		    isSingle = false;
		}

		System.out.println(">>>>>>>>>> Birth Information <<<<<<<<<<");
		System.out.print("Birth Date (MM/dd/yyyy) : ");
		birthDate = scanner.next() + scanner.nextLine();
		System.out.print("Birth Place : ");
	    birthPlace = scanner.nextLine();

		System.out.println(">>>>>>>>>> Contact Information <<<<<<<<<<");
		System.out.print("Mobile Number (Omit +63 or 0) : ");
		mobileNumber = scanner.nextLong();
		System.out.print("Email Address : ");
	    emailAddress = scanner.next() + scanner.nextLine();
	    
	    System.out.println(">>>>>>>>>> Address Information <<<<<<<<<<");
	    System.out.println("Present Address");
	    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	    System.out.print("House No. : ");
	    presentHouseNo = Integer.parseInt(scanner.nextLine());
	    System.out.print("Lot No. : ");
	    presentLotNo = Integer.parseInt(scanner.nextLine());
	    System.out.print("Street : ");
	    presentStreetName = scanner.nextLine();
	    System.out.print("Subdivision/Barangay : ");
	    presentSubdivisionBarangay = scanner.nextLine();
	    System.out.print("Municipality : ");
	    presentMunicipality = scanner.nextLine();
	    System.out.print("Province : ");
	    presentProvince = scanner.nextLine();
	    System.out.print("Zip Code : ");
	    presentZipCode = Integer.parseInt(scanner.nextLine());
	    System.out.print("Does your present address is the same as your permanent address? (Y for yes, N for no) : ");
        char isPresentPermament = scanner.nextLine().charAt(0);

        if (isPresentPermament == 'N') {
        
        System.out.println("Permanent Address");
    	System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    	System.out.print("House No. : ");
    	permanentHouseNo = Integer.parseInt(scanner.nextLine());
    	System.out.print("Lot No. : ");
    	permanentLotNo = Integer.parseInt(scanner.nextLine());
        System.out.print("Street : ");
        permanentStreetName = scanner.nextLine();
    	System.out.print("Subdivision/Barangay : ");
    	permanentSubdivisionBarangay = scanner.nextLine();
    	System.out.print("Municipality : ");
    	permanentMunicipality = scanner.nextLine();
    	System.out.print("Province : ");
    	permanentProvince = scanner.nextLine();
    	System.out.print("Zip Code : ");
    	permanentZipCode = Integer.parseInt(scanner.nextLine());
    	
    	System.out.println(">>>>>>>>>> Summary Profile Information <<<<<<<<<<");
		System.out.println("Full Name : " + firstName + " " + middleName + " " + lastName );
		System.out.println("isSingle : " + isSingle);
		System.out.println("Gender : " + gender);
	    System.out.println("Birth Date : " + birthDate);
	    System.out.println("Birth Place : " + birthPlace);
		System.out.println("Mobile Number : " + mobileNumber);
		System.out.println("Email Address : " + emailAddress);
		System.out.println("Present Address : " + presentHouseNo + " " + presentLotNo + " " + presentStreetName + ", " + presentSubdivisionBarangay + ", " + presentMunicipality + ", " + presentProvince + " " + presentZipCode);
		System.out.println("Permanent Address : " + permanentHouseNo + " " + permanentLotNo + " " + permanentStreetName + ", " + permanentSubdivisionBarangay + ", " + permanentMunicipality + ", " + permanentProvince + " " + permanentZipCode);
       
        } else {
    	    
        	
		System.out.println(">>>>>>>>>> Summary Profile Information <<<<<<<<<<");
		System.out.println("Full Name : " + firstName + " " + middleName + " " + lastName );
		System.out.println("isSingle : " + isSingle);
		System.out.println("Gender : " + gender);
	    System.out.println("Birth Date : " + birthDate);
	    System.out.println("Birth Place : " + birthPlace);
		System.out.println("Mobile Number : " + number);}}

         }

	
	@Override
	public String toString() {
		return "Activity_3 []";
	}}