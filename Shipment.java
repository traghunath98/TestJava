public class Shipment extends BoxWeight {

    double cost;
    
    //construt clone of an object
    Shipment (Shipment ob) {
        super(ob);
        cost = ob.cost;
    }
    
    //constructor when all parameters are specified
    Shipment (double w, double h, double d, double m, double c){
        super(w,h,d,m);
        cost = c;
    }
    
    //default constructor
    Shipment(){
        super();
        System.out.println("Constructing Shipment");
        cost = -1;
    }
    
    //Constructor used when cube is created
    Shipment(double len, double m, double c){
        super(len, m);
        cost = c;
    }
    
    
}