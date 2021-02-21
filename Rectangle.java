public class Rectangle extends Figure implements IntCallback {

    Rectangle(double a, double b){
        super(a,b);
    }
    
    double area() {
        System.out.println("Inside Area for Rectangle.");
        return (dim1 * dim2);
    }
    
    public void callback(int p){
        System.out.println("Callback called from Rectangle with " + p);
    }
    
    
}