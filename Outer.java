public class Outer{

    int outer_x = 100;
    
    void test(){
        Inner inner = new Inner();
        inner.display();
        this.showy(inner);
    }
    
    //this is an inner class
    class Inner{
        int y=10;
        
        void display(){
            System.out.println("display: outer_x = " + outer_x);
        }
        
        void showy(){
            System.out.println("From Inner class method :" + y);
        }
    }
    
    void showy(Inner inner){
       inner.showy();
    }
    
    static void vaTest(int ...v){
        System.out.print("vaTest (int ...): " + "Number of args: " + v.length + " Contents : ");
        for (int x : v){
            System.out.print(x + " ");
        }
        System.out.println();
    }
    
    static void vaTest(boolean ... v){
        System.out.print("vaTest (boolean ...) " + "Number of args: " + v.length + " Contents : ");
        for(boolean x : v)
            System.out.print(x + " ");
        System.out.println();
    }
    
}