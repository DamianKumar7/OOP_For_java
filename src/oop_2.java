import java.util.*;
class Student1{
    int id;
    String name;
    int[] marks;
    float average;
    char grade;
    Student1(int id,String name,int[] marks){
            this.id = id;
            this.name = name;
            this.marks = marks;
    }
    void calculateAverage(){
        for(int i = 0;i <marks.length;i++){
            average += marks[i];
        }
        average = average/marks.length;
    }
    void findGrade(){
        if(average >= 80 && average <= 100){
            grade = 'O';
        }
        else{
            grade = 'A';
        }
        for(int i = 0; i < marks.length;i++){
            if(marks[i] < 50){
                grade = 'F';
                break;
            }
        }
    }


}
class StudentMain{
    public static Student1 getStudentDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id:");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name:");
        String name = sc.nextLine();
        System.out.println("Enter the number of subjects:");
        int n = sc.nextInt();
        int[] marks = new int[n];
        for(int i = 0; i <n;i++){
            System.out.println("Enter the marks for subject:" );
            marks[i] = sc.nextInt();
        }
        Student1 student = new Student1(id,name,marks);
        return student;
    }
    public static void main(String[]args){
        Student1 answer = getStudentDetails();
        answer.calculateAverage();
        answer.findGrade();
        System.out.println("id:"+Integer.toString(answer.id));
        System.out.println("name:"+answer.name);
        System.out.println("Average:"+answer.average);
        System.out.println("Grade:"+answer.grade);
    }
}
/*Enter the id:
35
Enter the name:
Damian
Enter the number of subjects:
3
Enter the marks for subject:
99
Enter the marks for subject:
97
Enter the marks for subject:
98
id:35
name:Damian
Average:98.0
Grade:O
*/