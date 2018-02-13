package oop;

public class BankAccount implements IRate {

    //define variable

    String accountNumber;
    private String name;
    private String ssn;
    private static String routingNumber;
    String accountType;
    double balance = 0;
    //define constructors - unique methods - define properties of object

    BankAccount(){
        System.out.println("New Account is Created");

    }

    BankAccount(String accountType){
        System.out.println("New Account is " +accountType);
    }
    BankAccount(String accountType, double initDeposit){
        System.out.println("NEW ACCOUNT: " +accountType);
        System.out.println("Initial Deposit of $: " +initDeposit);
        String mesg = null;
        if (initDeposit < 1000) {

            mesg = "Error: minimum deposit should be greater than $1000";
        }
            else{
            mesg = "Thanks for your Initial deposit";
            }
            System.out.println(mesg);
            balance = balance + initDeposit;

        }


   //define methods

    void deposit(double amount){
        balance = balance + amount;
        showActivity("Deposit");

    }

    void withdraw(double amount){
        balance = balance + amount;
        showActivity("Withdraw");

    }

    void checkBalance(){
        System.out.println("Your Balance is: $" + balance);


    }
    //getter/setter Allow User to define the Name
   public void setName(String name){

        this.name = "Miss." +name;

   }

   public String getName(){
        return name;
   }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    void checkStatus(){


    }
    //Interface methods

    public void setRate(){
        System.out.println("SETTING RATE");

    }
    public void increaseRate(){
        System.out.println("INCREASING RATE");

    }
    private void showActivity(String showActivity){

        System.out.println("Your Recent Transaction" +showActivity);
        System.out.println("Your New Balance is: $" +balance);
    }
    //@method over right
    public String toString(){

        return "[" + name + "." +accountNumber+ ".BALANCE: " +balance + "& " +accountType+ "." +routingNumber+"]";
    }





}
