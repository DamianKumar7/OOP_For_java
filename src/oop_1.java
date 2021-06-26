/*Student and Department Detail
Create a class Department with the following private member variables

int did
String dname
Include appropriate getters and setters method in Department class.

Create a class Student with the following private member variables

int sid
String sname
Department department
Include appropriate getters and setters method in Student class.

Create a TestMain class which has main method.

In addition to main method, create a method 

           public static Student createStudent() -  All input as shown in the sameple input should be got in this method.  Set the values to the Student object and return that object

Note : In main method, invoke the createStudent method and print the details of the object returned by that method.

Sample Input 1:

Enter the Department id:
100
Enter the Department name:
Computerscience

Enter the Student id:
123
Enter the Student name:
sudha
Sample Output 1:

Department id:100
Department name:Computerscience
Student id:123
Student name:sudha'
*/


import java.util.*;

 class Department{
    int did;
    String dname;
    Department(int n, String s){
        this.did = n;
        this.dname = s;
    } 
}
 class Student{
    int sid;
    String sname;
    Department department;
    Student(int n,String s,Department obj){
            this.sid = n;
            this.sname = s;
            this.department = obj;

    }
}
class TestMain{
    public static void main(String args[]){
        TestMain object = new TestMain();
        Student answer = object.createStudent();
        System.out.println("Student id:"+Integer.toString(answer.sid));
        System.out.println("Student Name:"+answer.sname);
        System.out.println("Student department:"+Integer.toString(answer.department.did));
        System.out.println("Departmen Name:"+answer.department.dname);
    }
    public static Student createStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the department id:");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the department name:");
        String name = sc.nextLine();
        Department department = new Department(n,name);
        System.out.println("Enter the sudent id");
        int sid = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Student Name");
        String sname = sc.nextLine();
        Student student = new Student(sid,sname,department);
        return student;
    }
}
/*
Enter the department id:
100
Enter the department name:
Computer Science
Enter the sudent id
54
Enter the Student Name
Damian
Student id:54
Student Name:Damian
Student department:100
Departmen Name:Computer Science
*/