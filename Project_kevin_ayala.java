import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
/**
 * The Project_kevin_ayala  Demonstrate the Policy class,
 * The program reads the required data from the PolicyInformation.txt file to initialize the object, 
 * it creates a multiples instance of the Policy class using the constructor that accepts arguments, 
 * it then stores the objects in an ArrayList object and displays the information about each policy,
 * it display all the information about the policy using the appropriate methods of the Policy class.
 */
 public class Project_kevin_ayala
 {
   public static void main(String[] args) throws IOException
   {  
      //Create a File object to represent the PolicyInformation.txt
      File file = new File("C:\\Users\\kevin\\OneDrive\\Documents\\GitHubRepositories\\CSC251Project\\PolicyInformation.txt");
     
      int policyNumInput, //Holds the policy number
          ageInput; //Holds the policy holder's age
               
      String providerNameInput,//Provider Name
             firstNameInput,//Policyholder’s First Name
             lastNameInput,//Policyholder’s Last Name
             smokingStatusInput;//Policyholder’s Smoking Status
                  
      double heightInput,//Policyholder’s Height (in inches)
             weightInput;//Policyholder’s Weight (in pounds)
             
      int smokerCount = 0,//To hold the number of policies with a smoker.
          nonSmokerCount = 0;//To hold the number of policies with a non-smoker.
      
      //Create an ArrayList object to store the Policy objects.
      ArrayList<Policy> policiesList = new ArrayList<Policy>();
      
      if (file.exists())
      {
         //Create a Scanner object to read data from a file.
         Scanner inputFile = new Scanner(file);
         
         //Read lines from the PolicyInformation.txt files until no more are left.
         while (inputFile.hasNext())
         {
            policyNumInput = inputFile.nextInt();
            inputFile.nextLine();//consume the remaining new line character.
            
            providerNameInput = inputFile.nextLine();
            
            firstNameInput = inputFile.nextLine();
            
            lastNameInput = inputFile.nextLine();
            
            ageInput = inputFile.nextInt();
            inputFile.nextLine();//consume the remaining new line character.
            
            smokingStatusInput = inputFile.nextLine();
            //increment the corresponding counting variable. 
            if (smokingStatusInput.equalsIgnoreCase("Smoker"))
            {
               smokerCount++;
            }
            else
            {
               nonSmokerCount++;
            }
            
            heightInput = inputFile.nextDouble();
            
            weightInput = inputFile.nextDouble();
            
            //Create a Policy object. 
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
            
            //add the Policy object to the list. 
            policiesList.add(userPolicy);
         }
         
         //Close the file.
         inputFile.close();
         
         //Print information in the ArrayList objects.
         displayList(policiesList);
         
         System.out.printf("\nThe number of policies with a smoker is: %d", smokerCount);
         System.out.printf("\nThe number of policies with a non-smoker is: %d", nonSmokerCount);
      }
      else
      {
         System.out.println("The file PolicyInformation.txt is not found.");
      }
      
   }
   
     
     /**
        The displayValues Method displays the values of the 
        instance fields in a single object of the Policy class. 
        @param object the Policy object
        @param height the Policyholder's height
        @param weight the Policyholder's weight
        @param BMI the Policyholder's BMI
        @param price the Policy price
      */
     /**
     public static void displayValues(Policy object, double BMI, double price)
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
     */
     
     /**
      This method displays the details of each Policy object in the provided list.
      @param policies An ArrayList of Policy objects to be displayed.
     */
     public static void displayList(ArrayList<Policy> policies)
     {
      for (int i = 0; i < policies.size(); i++)
      {
         Policy policy = policies.get(i);
         
        //use the getPolicyholderBMI and getPolicyPrice methods to compute and display the data. 
        double holderBMI = policy.getPolicyholderBMI(policy.getPolicyHolderHeight(), policy.getPolicyHolderWeight());
            
        double policyTotalPrice = policy.getPolicyPrice(policy.getPolicyHolderAge(), policy.getPolicyHolderSmokingStatus(), holderBMI);
        
        // Access and print the fields of the Policy object.
        System.out.printf("\nPolicy Number: %s", policy.getPolicyNum());
        System.out.printf("\nProvider Name: %s", policy.getProviderName());
        System.out.printf("\nPolicyholder's First Name: %s", policy.getPolicyHolderFirstName());
        System.out.printf("\nPolicyholder's Last Name: %s", policy.getPolicyHolderLastName());
        System.out.printf("\nPolicyholder's Age: %d", policy.getPolicyHolderAge());
        System.out.printf("\nPolicyholder's Smoking Status: %s", policy.getPolicyHolderSmokingStatus());
        System.out.printf("\nPolicyholder's Height: %.2f inches", policy.getPolicyHolderHeight());
        System.out.printf("\nPolicyholder's Weight: %.2f pounds", policy.getPolicyHolderWeight());
        System.out.printf("\nPolicyholder's BMI: %.2f", holderBMI);
        System.out.printf("\nPolicy Price: $%.2f", policyTotalPrice);
        System.out.println();
      }
     }
   }
 