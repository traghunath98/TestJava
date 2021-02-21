import java.lang.*;
public class IfSample{

    public static void main(String[] args){
        
        int x, y, z;
        
        x=10;
        y=20;
        
        if(x < y){
            System.out.println("x is less than y");
        }
        
        x = x*2;
        
        if(x == y){
            System.out.println("x is now equal to y");
        }
        
        x = x*2;
        
        if (x > y){
            System.out.println(" x is now greater than y");
        }
        
        if(x == y) {
            System.out.println("you won't see this");
        }
        
        for(z=0; z<10; z++){
            
           // System.out.println("This is z: " + z);
            // System.out.println("This is y: " + y);
            y = y - 2;
            
        }
        
        byte b=0;
        
        for(b=0; b<120; b++){
           // System.out.println("Byte b is: "+ b);
            
        }
        
        double pi, r, a;
        
        pi = Math.PI;
        r = 5.087234231234;
        a = pi * Math.pow(r,2);
        System.out.println("The Area is: "+a +" The value of pi is: " + pi);
        
        char c=0;
        for(c=0; c<128; c++){
            // System.out.println("The character c is:" + c);
        }
        
        byte aa=72, bb;
        int ii, cc;
        
        ii = aa << 1;
        bb = (byte) (aa << 1);
        cc = aa >> 1;
        
        System.out.println("Original value of aa: "+aa);
        System.out.println("ii is: " + ii + " bb is: " + bb + " cc is: " + cc);
        
        
        double akk=3.0, bkk=4.0, ckk;
        
        ckk = Math.sqrt(akk*akk + bkk*bkk);
        System.out.println("Hyptenuse is ckk: " + ckk);
        
        Factorial f = new Factorial(20);
        int i;
        
        for (i=0; i<20; i++) f.values[i]=i*2;
        f.printArray(20);
        
        System.out.println("Factorial of 3 is "+ f.fact(3));
        System.out.println("Factorial of 4 is "+ f.fact(4));
        System.out.println("Factorial of 5 is "+ f.fact(5));
        
        System.out.println("Factorial of 15 is "+ f.fact(15));
        
        System.out.println("Factorial of 25 is "+ f.fact(25));
        
        Outer outer = new Outer();
        outer.test();
        
        Outer.vaTest(1,2,3); //OK
        Outer.vaTest(true,false,false, true, false, false); //OK
        
        
        String strOb1 = "First String";
        String strOb2 = "Second String";
        String strOb3 = strOb1;
        
        System.out.println("Length of strOb1: "+ strOb1.length());
        System.out.println("Char at index 3 in strOb1: "+ strOb1.charAt(3));
        
        if(strOb1.equals(strOb2))
            System.out.println("strOb1 == strOb2");
        else
            System.out.println("strOb1 != strOb2");
        
        if(strOb1.equals(strOb3))
            System.out.println("strOb1 == strOb3");
        else
            System.out.println("strOb1 != strOb3");
        
        for (i=0; i< args.length; i++){
            System.out.println(" args[" + i +"] :"+args[i]);
        }
        
    }
}