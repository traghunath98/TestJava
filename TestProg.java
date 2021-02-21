import java.lang.*;
import java.util.Random;
public class TestProg{
    public static void main(String[] args){
        System.out.println("This is a test program using XCode");
        int num; // this declares a vriable called num
    
        num = 100;
    
        System.out.println("This is num: " + num);
    
        num = num*2;
    
        System.out.print("The value of num * 2 is ");
        System.out.println(num);
    
        
        A superOb = new A();
        B subOb = new B();
        
        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Contents of superOb: ");
        superOb.showij();
        
        System.out.println();
        
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("Contents of subOb: ");
        subOb.showij();
        subOb.showk();
        System.out.println();
        
        System.out.println("Sum of i, j and k in subOb:");
        subOb.sum();
        
        TestProg.subroutine();
        System.out.println  ("Execution resumes from here");
        
        int aaa=0, bbb=0, ccc=0;
        Random r = new Random();
        int c[] = {2};
        
        for(int i=0; i<2; i++ ){
            try{
                
                bbb= r.nextInt();
                ccc = r.nextInt();
                aaa = 12345 / (bbb/ccc);
                c[i] = 234;
            } catch (ArithmeticException e){
                System.out.println("Division by Zero.");
                System.out.println("Exception is : " + e);
                e.printStackTrace();
                aaa = 0;
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Array Index OOB exception: " + e);
            } catch(Exception e){
                System.out.println ("Generic Exception catch.");
                
            }
            System.out.println("After try catch blocks aaa is: " + aaa);
        }
    }
    
    static void subroutine(){
    
        try{
            int da=0;
            int pa = 45/da;
            System.out.println("Division by Zero induced");
        } catch (ArithmeticException e){
            System.out.println("Division by zero");
        }
        System.out.println("After the catch statement");
    }
}