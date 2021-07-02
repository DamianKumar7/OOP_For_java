class Base  
{  
     
    void method(int a){
           System.out.println("Base class");
    }
   
}  
   
class Derived extends Base  
{  
   
    void method(double d)  
    {  
        System.out.println("Derived class method called with double d ="+d);  
    }  
    public static void main(String[] args)  
    {  
        int a = 10;
        new Derived().method(a);  
    }  
}  
   
