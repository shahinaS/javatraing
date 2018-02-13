package Labs;

public class BankAccountApp{
    public static void main(String[] args){
    //Create Object
    BankAccount ac1 = new BankAccount("88765732" , "Shahina Sarfraz", 6000);
    BankAccount ac2 = new BankAccount("442321", "Arif Mehmood", 9000);
    BankAccount ac3 = new BankAccount("334", "Mobeen Nisar", 455.98);

    ac3.setAccountName("Jorden");
        System.out.println(ac1.getAccountName());
    ac3.makeDeposit(899);
    ac3.makeDeposit(600);
    ac3.payBill(700);
    ac3.accrue();
        System.out.println(ac3.toString());


    }
}

class BankAccount implements IInterest{
    //Define Variables
    private static int iD = 100; //Internal Unique ID
    private String accountName;
    private String accountNumber; // id + 2 random numbers + first 2 digits on SSN
    private String SSN;
    private static final String routingNumber = "0091238472";
    private double balance;

//Constructor

    public BankAccount(String SSN , String accountName, double initDeposit){


       System.out.println("New Account title is: " +accountName);

       balance = initDeposit + balance;

        this.SSN = SSN;
        iD++;
        setAccountNumber();

    }
    //Write Function/Method
    public void setAccountNumber(){
        int random = (int) (Math.random() * 100);
        accountNumber = iD + "" + random + SSN.substring(0,2);
        System.out.println("Your Account Number is: " +accountNumber);

    }
    public void setAccountName(String name){
        this.accountName = name;
    }
    public String getAccountName(){
        return accountName;
    }
    public void payBill(double amount){
        balance = balance-amount;
        System.out.println("Paying Bill: " +amount);
        showBalance();

    }
    public void makeDeposit(double amount){
        balance = balance+amount;
        System.out.println("Making Deposit of: $" + amount);
        showBalance();
    }

    public void showBalance(){
        System.out.println("Your Current Balace is: " + balance);
    }

    @Override
    public void accrue() {
        balance = balance * (1 + rate/100);
        showBalance();
    }
    //@override
    public String toString(){
        return " Name: " + accountName + " Account Number " +accountNumber + " Routing Number " +routingNumber + " Balance " +balance ;

    }
}

