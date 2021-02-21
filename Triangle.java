public class Triangle extends Figure implements IntCallback {

    Triangle(double a, double b){
        super(a, b);
    }
    
    double area(){
        System.out.println("Inside Area for Triangle");
        return (dim1 * dim2 / 2);
    }
    
    public void callback(int p){
        System.out.println(" Callback called from Triange with " + p*p);
    }
}