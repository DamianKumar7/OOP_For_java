import java.util.*;
class Employee{
    int employeeId;
    String EmployeeName;
    double salary;
    double netSalary;
    Employee(int employeeId,String EmployeeName,double salary){
        this.employeeId = employeeId;
        this.EmployeeName =EmployeeName;
        this.salary = salary;
    }
    public void CalculateNetSalary(int pfpercentage){
        netSalary =  salary -(((pfpercentage)*salary)/100);
    }

}
class EmployeeDriver{
    public static Employee getEmployeeDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Employee Id:");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name of the employee:");
        String name = sc.nextLine();
        System.out.println("Enter the salary of the employee");
        double salary = sc.nextDouble();
        return new Employee(id,name,salary);
    }
    public static int getPFPercentage(){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the pf percentage");
        int pf = sc.nextInt();
        return pf;
    }
    public static void main(String[]args){
        EmployeeDriver ob = new EmployeeDriver();
        Employee obj = ob.getEmployeeDetails();
        int pf = getPFPercentage();
        obj.CalculateNetSalary(pf);
        System.out.println("The net salary of the employee is:" + Double.toString(obj.netSalary));

    }
}
/*Output
Enter the Employee Id:
123
Enter the name of the employee:
Damian
Enter the salary of the employee
60000
enter the pf percentage
5
The net salary of the employee is:57000.0
*/