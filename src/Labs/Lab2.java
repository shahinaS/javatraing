package Labs;

import javax.lang.model.element.NestingKind;

public class Lab2 {
    public static void main(String[] args){
        Student stu1 = new Student("Shahina", "0019875");
        stu1.enrollCourse("Math");
        stu1.enrollCourse("English");
        stu1.enrollCourse("history");
        //stu1.showCourse();
        //stu1.checkBalance();
        stu1.payTution(600);
        //stu1.checkBalance();
        System.out.println(stu1.toString());
        stu1.setPhone("0012873430");
        System.out.println(stu1.getPhone());

    }

}
class Student {

    private String name;
    private String SSN;
    private static int iD = 1000;
    private String city;
    private String state;
    private String phone;
    private String email;
    private String userId;
    private String course = "";
    private static final int costOfCourse = 800;
    private int balance = 0;



    public Student(String name, String SSN){
        iD++;
        this.name =name;
        this.SSN = SSN;
        setEmail();
        setUserId();

    }
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    private void setEmail(){
        email = name.toLowerCase() +"."+iD +"@pucit.com";
        System.out.println("Your email ID is: " +email);

    }
    private void setUserId(){
        int max = 9000;
        int min = 1000;
        int randomNum = (int) (Math.random() *((max - min)));
        randomNum = randomNum+min;
        userId = iD + "" + randomNum + ""+ SSN.substring(2);
        System.out.println("Your User ID is: " +userId);



    }
    void enrollCourse(String courses){
        this.course = this.course + "\n" + courses;
        System.out.println(courses);
        balance = balance+costOfCourse;

    }
    public String toString(){
        return "Name"+name+ "Courses: " +course+ "BALANCE" +balance+ "";

    }
    void payTution(int amount){
        balance = balance - amount;
        System.out.println("Payment: $" +amount);


    }

    void checkBalance(){
        System.out.println("Your Current Balance is: $" +balance);

    }



    void showCourse(){
        System.out.println(course);


    }
}