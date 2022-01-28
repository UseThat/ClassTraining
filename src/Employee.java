public class Employee {
    String firstName;
    String lastName;
    int birthYear;
    int seniority;

    public Employee(String firstName, String lastName, int birthYear, int seniority){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.seniority = seniority;

    }

    public void printInformation(){
        System.out.println("First name: "+firstName+" last name: "+lastName+" birth year: "+birthYear+" company seniority: "+seniority);
    }
}
