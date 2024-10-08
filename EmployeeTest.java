import java.util.Scanner;

class Employee {
   private String name;
   private Double salary;

   public Employee(String name, Double salary) {
       System.out.print("Enter a Employee Name: ");
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        //return "Employee[Name: "+name+", Salary: "+salary+"]";
       // return String.format("Employee[Name: %s , Salary: %f]",name, salary);
       return String.format("Employee[Name: %s , Salary: %.2f]",name, salary);
     //  return "Employee[Name: %s , Salary: %.2f]".formatted(name, salary);
    }


}

public class EmployeeTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter a Employee Salary: ");
        Double salary = sc.nextDouble();

        Employee emp = new Employee(name, salary);

        System.out.println(emp.toString());
        /**
         * String - %s
         * Integer - %d
         * Double / Float - %f / %.2f
         * Boolean - %b
         *Character - %c
         */

       // System.out.format("Employee Salary is %.2f", 7452754.5067);

    }
}