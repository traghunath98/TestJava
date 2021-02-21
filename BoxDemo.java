import java.lang.*;
import java.util.*;

public class BoxDemo{

    public static void main(String[] args){
        
        Box mybox1 = new Box(10,20,15);
        Box mybox2 = new Box(3,6,9);
        Box mybox3 = new Box(mybox1);
        Box mybox4 = new Box(20);
        
        BoxDemo bd = new BoxDemo();
        
        double vol = mybox4.volume();
        
        System.out.println("Volume is "+ mybox1.volume());
        
        System.out.println("Volume is " + mybox2.volume());
        
        System.out.println("Volume of box 3 is "+mybox3.volume());
        System.out.println("Volume of the cube (box 4) is "+ mybox4.volume());
        System.out.println("Volume of box1 after update is " + (bd.updateMethod(mybox1)).volume());
        
        Stack mystack1 = new Stack(10);
        Stack mystack2 = new Stack(20);
        
        //push some numbers onto the stack
        
        for (int i =0; i<10; i++) mystack1.push(i);
        for (int i=10; i <20; i++) mystack2.push(i);
        
        //pop those numbers off hte stack
        System.out.println("Stack in mystack1:");
        for(int i=0; i <10; i++)
            System.out.println ("Mystack1 - " + mystack1.pop());
        
        System.out.println("Stack in mystack2:");
        for(int i=0; i<10; i++)
           System.out.println("Mystack2 - " + mystack2.pop());
        
        OverloadDemo ob = new OverloadDemo();
        double result;
        
        ob.test();
        ob.test(10);
        ob.test(10,20);
        result = ob.test(123.25);
        System.out.println("Result of ob.test(123.25): " + Math.sqrt(result));
        
        
        BoxWeight weightbox = new BoxWeight(3,5,7,8.37);
        Box plainbox = new Box(5,5,5);
        double volume;
        
        volume = weightbox.volume();
        System.out.println("Volume of weightbox is " + volume);
        System.out.println("Weight of weightbox is " + weightbox.weight);
        System.out.println();
        
        plainbox = weightbox;
        
        volume = plainbox.volume();
        System.out.println("Volume of plainbox is "+ volume);
        
        Shipment shipment1 = new Shipment(10,20,15,10,3.41);
        Shipment shipment2 = new Shipment(2,3,4,0.76,1.28);
        
        double volS = shipment1.volume();
        System.out.println("Volume of shipment1 is " + volS);
        System.out.println("Weight of shipment1 is " + shipment1.weight);
        System.out.println("Shipping Cost: $" + shipment1.cost);
        System.out.println();
        
        double volS2 = shipment2.volume();
        System.out.println("Volume of Shipment2 is "+ volS2);
        System.out.println("Weigth of shipment2 is " + shipment2.weight);
        System.out.println("Shipping cost: $" + shipment2.cost);
       
        Shipment s3 = new Shipment();
        
        //Figure f = new Figure(10,10);
        
        Rectangle r = new Rectangle(9,5);
        Triangle t = new Triangle(10, 8);
        
        Figure figref;
        figref = r;
        
        System.out.println("Area is " + figref.area());
        
        figref = t;
        System.out.println("Area is "+ figref.area());
        
        System.out.println("Get Class" + figref.getClass()+ "Description is " + figref.toString());
        
        IntCallback c = r;
        c.callback(25);
        
        c=t;
        c.callback(25);
        
        
        //Test fixedStack and DynStack with interface IntStack
        
        IntStack mystack;
        
        DynStack ds = new DynStack(5);
        FixedStack fs = new FixedStack(8);
        
        mystack = ds; //load dynamic stack
        for(int i=0; i<12; i++) mystack.push(i);
        
        mystack = fs; //load fixed stack
        for(int i=0; i<8 ; i++) mystack.push(i);
        
        mystack=ds;
        System.out.println("Values in dynamic stack:");
        
        for ( int i=0; i<12; i++)
            System.out.println(mystack.pop());
        
        mystack = fs;
        System.out.println("Values in fixed stack:");
        for(int i=0;i<8;i++)
            System.out.println(mystack.pop());
    }
    
    Box updateMethod(Box ob) {
        ob.setDim(25,25,25);
        return (ob);
    }

}