import java.util.*;
class Movie{
    String MovieName;
    String MovieCategory;
    int TicketCost;
    Movie(String MovieName,String MovieCategory){
        this.MovieName = MovieName;
        this.MovieCategory = MovieCategory;
       
    }
    public int calculateTicketCost(String circle){
        
        if(circle.equals("gold") && MovieCategory.equals("2D")){
            this.TicketCost = 300;
           
        }
        else if(circle.equals("gold") && MovieCategory.equals("3D")){
            this.TicketCost = 500;
        }
        else if(circle.equals("silver") && MovieCategory.equals("2D")){
            this.TicketCost = 250;
        }
        else if(circle.equals("silver") && MovieCategory.equals("3D")){
            this.TicketCost = 450;
        }
        else if( circle != "silver " || circle != "gold"){
            return -1;
        }
        else if(MovieCategory != "2D" || MovieCategory != "3D"){
            return -2;
        }
        return this.TicketCost;
       
    }

}
class Main{
    public static Movie getMovieDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Movie name");
        String name= sc.nextLine();
        System.out.println("Enter the movie category");
        String category = sc.nextLine();
        Movie ob = new Movie(name,category);
        return ob;
    }
    public static String getCircle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the circle value");
        String circle = sc.nextLine();
        return circle;
    }
    public static void main(String[]args){
        
        Movie obj = Main.getMovieDetails();
        String circle = Main.getCircle();
        int answer = obj.calculateTicketCost(circle);
        System.out.println("Movie Name:"+obj.MovieName);
        System.out.println("Movie Category:"+obj.MovieCategory);
        System.out.println("Ticket Cost:"+ Integer.toString(answer));

    }

}