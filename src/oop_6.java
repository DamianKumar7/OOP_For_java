import java.util.*;

class Person{
    String name;
    char Gender;
    int age;
    Person(String name, char Gender,int age){
        this.name = name;
        this.Gender = Gender;
        this.age = age;
    }
}
class BusTicket{
    int ticketNo;
    float TicketPrice;
    float totalAmount;
    Person person;
    BusTicket(int ticketNo,float TicketPrice,Person person){
        this.ticketNo = ticketNo;
        this.TicketPrice = TicketPrice;
        
        this.person = person;
    }
    void calculateTotal(int age){
        int Dis = 0;
        if(age <16){
           totalAmount = TicketPrice/2;
        }

        else if(age>60){
            totalAmount = TicketPrice -( TicketPrice/4);
        }
        else{
            totalAmount = TicketPrice;
        }

    }
    public static BusTicket getTicketDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the passenger");
        String name = sc.nextLine();
        System.out.println("Enter the sex of the passenger");
        char sex = sc.next().charAt(0);
        System.out.println("Enter the age of the passenger");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the ticket number");
        int number = sc.nextInt();
        System.out.println("Enter the ticket price");
        int price = sc.nextInt();
        BusTicket obj = new BusTicket(number,price,new Person(name,sex,age));
        return obj;
    }
    public static void main(String[] args){
        BusTicket ob = getTicketDetails();
        ob.calculateTotal(ob.person.age);
        System.out.println("The ticket Price is :"+ob.totalAmount);


    }
}
