class Bike{
    int speed = 90;
}
class Honda extends Bike{
    int speed = 150;
    public static void main(String[] args) {
        Bike obj = new Honda();
        System.out.println(obj.speed);
        // Honda ob = new Honda();
        // System.out.println(ob.speed);
    }
    
    
}