public class Factorial{

    int values[];
    
    Factorial(int i){
        values = new int[i];
    }
    
    // this is a recursive method
    public long fact(int n){
        long result;
        
        if(n==1) return 1;
        result = fact(n-1)*n;
        return result;
    }
    
    public void printArray(int i){
        if (i==0) return;
        else printArray(i-1);
        System.out.println(" [ " + (i-1) +" ] " + values[i - 1]);
    }

}