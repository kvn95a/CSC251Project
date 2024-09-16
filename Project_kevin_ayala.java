import java.util.Scanner;
/**
 * The Project_kevin_ayala  Demonstrate the Policy class. 
 * The program asks the user to enter all necessary information to initialize the class, 
 * it creates a single instance of the Policy class using the constructor that accepts arguments, 
 * and then display all the information about the policy using the appropriate methods of the Policy class.
 */
 public class Project_kevin_ayala
 {
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
     
      int policyNumInput, //Holds the policy number
          ageInput; //Holds the policy holder's age
               
      String providerNameInput,//Provider Name
             firstNameInput,//Policyholder’s First Name
             lastNameInput,//Policyholder’s Last Name
             smokingStatusInput;//Policyholder’s Smoking Status
                  
      double heightInput,//Policyholder’s Height (in inches)
             weightInput,//Policyholder’s Weight (in pounds)
             holderBMI, ///Policyholder's BMI
             policyTotalPrice;//Policy total price
      
      System.out.print("Please enter the Policy Number: ");
      policyNumInput = keyboard.nextInt();
      keyboard.nextLine();//consume the remaining new line character.
      
      System.out.print("Please enter the Provider Name: ");
      providerNameInput = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's First Name: ");
      firstNameInput = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Last Name: ");
      lastNameInput = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Age:");
      ageInput = keyboard.nextInt();
      keyboard.nextLine();//consume the remaining new line character.
      
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker):");
      smokingStatusInput = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Height (in inches):");
      heightInput = keyboard.nextDouble();
      
      System.out.print("Please enter the Policyholder's Weight (in pounds):");
      weightInput = keyboard.nextDouble();
      
      Policy userPolicy = new Policy(
        policyNumInput, 
        ageInput, 
        providerNameInput, 
        firstNameInput, 
        lastNameInput, 
        smokingStatusInput, 
        heightInput, 
        weightInput
      );
      
      holderBMI = userPolicy.getPolicyholderBMI(heightInput, weightInput);
      
      policyTotalPrice = userPolicy.getPolicyPrice(ageInput, smokingStatusInput, holderBMI);
      
      displayValues(userPolicy, heightInput, weightInput, holderBMI, policyTotalPrice);
   }
   
     /**
        The displayValues Method displays the values of the 
        instance fields in the object of the Policy class. 
        @param object the Policy object
        @param height the Policyholder's height
        @param weight the Policyholder's weight
        @param BMI the Policyholder's BMI
        @param price the Policy price
      */
     public static void displayValues(Policy object, double height, double weight, double BMI, double price)
     {
       System.out.printf("\nPolicy Number: %s", object.getPolicyNum());
        System.out.printf("\nProvider Name: %s", object.getProviderName());
        System.out.printf("\nPolicyholder's First Name: %s", object.getPolicyHolderFirstName());
        System.out.printf("\nPolicyholder's Last Name: %s", object.getPolicyHolderLastName());
        System.out.printf("\nPolicyholder's Age: %d", object.getPolicyHolderAge());
        System.out.printf("\nPolicyholder's Smoking Status: %s", object.getPolicyHolderSmokingStatus());
        System.out.printf("\nPolicyholder's Height: %.2f inches", object.getPolicyHolderHeight());
        System.out.printf("\nPolicyholder's Weight: %.2f pounds", object.getPolicyHolderWeight());
        System.out.printf("\nPolicyholder's BMI: %.2f", BMI);
        System.out.printf("\nPolicy Price: $%.2f", price);
     }
   }
 