class Damian{
    static int a = 10;
    void checking(){
        a  = 27;
        System.out.println(a);
    }
    public void bulao(){
        checking();
    }
    public static void main(String[] args) {
        
        Damian ob = new Damian();
        ob.bulao();
    }
}