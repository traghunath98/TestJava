public class B extends A{
    int k;
    int total;
    
    void showk(){
        System.out.println("k: " + k);
    }

    void sum(){
        System.out.println(" i + j + k: "+ (i+j+k));
    }
    
    void sumTotal(){
        total = i + j;
    }
}