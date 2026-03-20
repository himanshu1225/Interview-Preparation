package CoreJava.day5basics;

public class Intern extends Employee {
    public Intern(String company) {
        super(company);
    }
    
    // This method cannot be overridden because it is declared as final in the Employee class.
    // @Override
    // public void greet() {
    //     System.out.println("Welcome to " + companyName + "!");
    // }

}
