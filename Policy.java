/**
   The Policy class will model an insurance policy for one person.
*/
public class Policy
{
   //****************************CLASS Attributes*********************************
   private int policyNum, //Holds the policy number
               policyHolderAge; //Holds the policy holder's age
               
   private String providerName,//Provider Name
                  policyHolderFirstName,//Policyholder’s First Name
                  policyHolderLastName,//Policyholder’s Last Name
                  policyHolderSmokingStatus;//Policyholder’s Smoking Status
                  
    private double policyHolderHeight,//Policyholder’s Height (in inches)
                   policyHolderWeight;//Policyholder’s Weight (in pounds)
    
    //***********************CONSTRUCTORS**************************************
    /**
      This is a no-args constructor, it sets 
      default values for all the class's fields.
    */
    public Policy()//no args constructor.
    {
      policyNum = 0;
      policyHolderAge = 0;
      
      providerName = "";
      policyHolderFirstName = "";
      policyHolderLastName = "";
      policyHolderSmokingStatus = "";
      
      policyHolderHeight = 0.0;
      policyHolderWeight = 0.0;
    }
    
    /**
      This constructor accepts all the arguments necessary 
      to fully initialize the Policy object.
      @param polNum The policy number
      @param holderAge The policy holder's age
      @param provName The provider name
      @param holderFirstName The policy holder's first name
      @param holderLastName The policy holder's last name
      @param holderSmoking The policy holder's smoking status
      @param holderHeight The policy holder's height (in inches)
      @param holderWeight The policy holder's weight (in pounds)
    */
    public Policy(int polNum, int holderAge, String provName, String holderFirstName, String holderLastName, String holderSmoking, double holderHeight, double holderWeight)
    {
      policyNum = polNum;
      policyHolderAge = holderAge;
      
      providerName = provName;
      policyHolderFirstName = holderFirstName;
      policyHolderLastName = holderLastName;
      policyHolderSmokingStatus = holderSmoking;
      
      policyHolderHeight = holderHeight;
      policyHolderWeight = holderWeight;
    }
    
    //***********************SETTERS_AND_GETTERS_METHODS**************************************
    
    //-------------------------------SETTERS_METHODS-------------------------------
    /**
      The setPolicyNum method set the policyNum field.
      @param polNum The policy number.
    */
    public void setPolicyNum(int polNum)
    {
      policyNum = polNum;
    }
    
    /**
      The setPolicyHolderAge method sets the policyHolderAge field.
      @param holderAge The policy holder's age.
    */
    public void setPolicyHolderAge(int holderAge)
    {
      policyHolderAge = holderAge;
    }
    
    /**
      The setProviderName method sets the providerName field.
      @param provName The provider name.
    */
    public void setProviderName(String provName)
    {
      providerName = provName;
    }
    
    /**
      The setPolicyHolderFirstName method sets the policyHolderFirstName field.
      @param holderFirstName The policy holder's first name
    */
    public void setPolicyHolderFirstName(String holderFirstName)
    {
      policyHolderFirstName = holderFirstName;
    }
    
    /**
      The setPolicyHolderLastName method sets the policyHolderLastName field.
      @param holderLastName The policy holder's last name.
    */
    public void setPolicyHolderLastName(String holderLastName)
    {
      policyHolderLastName = holderLastName;
    }
    
    /**
      The setPolicyHolderSmokingStatus method sets the policyHolderSmokingStatus field.
      @param holderSmoking The policy holder's smoking status.
    */
    public void setPolicyHolderSmokingStatus(String holderSmoking)
    {
      policyHolderSmokingStatus = holderSmoking;
    }
    
    /**
      The setPolicyHolderHeight method sets the policyHolderHeight field.
      @param holderHeight The policy holder's height (in inches).
    */
    public void setPolicyHolderHeight(double holderHeight)
    {
      policyHolderHeight = holderHeight;
    }
    
    /**
      The setPolicyHolderWeight method sets the policyHolderWeight field.
      @param holderWeight The policy holder's weight (in pounds).
    */
    public void setPolicyHolderWeight(double holderWeight)
    {
      policyHolderWeight = holderWeight;
    }
    
    
    //-------------------------------ACCESSOR_METHODS-------------------------------
    /**
      The getPolicyNum method returns the value in the policyNum field.
      @return the policy number (int datatype).
    */
    public int getPolicyNum()
    {
      return policyNum;
    }
    
    /**
      The getPolicyHolderAge method returns the value in the policyHolderAge field.
      @return the policy holder's age (int datatype).
    */
    public int getPolicyHolderAge()
    {
      return policyHolderAge;
    }
    
    /**
      The getProviderName method returns the value in the providerName field.
      @return the Provider Name (String datatype).
    */
    public String getProviderName()
    {
      return providerName;
    }
    
    /**
      The getPolicyHolderFirstName returns the value in the policyHolderFirstName field.
      @return Policyholder’s First Name (String datatype).
    */
    public String getPolicyHolderFirstName()
    {
      return policyHolderFirstName;
    }
    
    /**
      The getPolicyHolderLastName returns the value in the policyHolderLastName field.
      @return Policyholder’s Last Name (String datatype).
    */
    public String getPolicyHolderLastName()
    {
      return policyHolderLastName;
    }
    
    /**
      The getPolicyHolderSmokingStatus returns the value in the policyHolderSmokingStatus field.
      @return Policyholder’s Smoking Status (String datatype).
    */
    public String getPolicyHolderSmokingStatus()
    {
      return policyHolderSmokingStatus;
    }
    
    /**
      The getPolicyHolderHeight returns the value in the policyHolderHeight field.
      @return /Policyholder’s Height (double datatype).
    */
    public double getPolicyHolderHeight()
    {
      return policyHolderHeight;
    }
    
    /**
      The getPolicyHolderWeight returns the value in the policyHolderWeight field.
      @return Policyholder’s Weight (double datatype).
    */
    public double getPolicyHolderWeight()
    {
      return policyHolderWeight; 
    }
    
    
    //***********************OTHER_METHODS**************************************
    /**
      The getPolicyholderBMI method returns the BMI of the policyholder.
      @param holderHeight The policy holder's height (in inches).
      @param holderWeight The policy holder's weight (in pounds).
      @return The BMI of the policyholder. This is calculated 
              by dividing weight in pounds (lb) by height in inches (in) 
              squared and multiplying by a conversion factor of 703. 
              (It returns a double datatype). 
    */
    public double getPolicyholderBMI(double holderHeight, double holderWeight)
    {
      return (holderWeight * 703) / (Math.pow(holderHeight, 2));
    }
    
    /**
      The getPolicyPrice method returns the price of the insurance policy.
      @param holderAge
      @param 
    */
    public double getPolicyPrice(int holderAge, String holderSmoking, double holderBMI)
    {
      final double POLICY_BASE_FEE = 600.0,
                   AGE_ADDITIONAL_FEE = 75.0,
                   SMOKER_ADDITIONAL_FEE = 100.0;
            
      double ageAdditionalFee = (holderAge > 50) ? AGE_ADDITIONAL_FEE : 0;
      double smokerAdditionalFee = holderSmoking.equalsIgnoreCase("Smoker") ? SMOKER_ADDITIONAL_FEE : 0;
      double highBMIFee = (holderBMI > 35) ? ((holderBMI - 35) * 20) : 0;
      
      return POLICY_BASE_FEE + highBMIFee + ageAdditionalFee + smokerAdditionalFee;
    }
}
