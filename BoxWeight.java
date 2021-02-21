public class BoxWeight extends Box {

    double weight;
    
    //construct clone of an object
    BoxWeight (BoxWeight ob){
        super(ob);
        weight = ob.weight;
    }
    
    //constructor when all parameters are specified
    BoxWeight(double w, double h, double d, double m){
        super(w,h,d);
        weight = m;
    }
    
    //default constructor
    BoxWeight(){
        super();
        System.out.println("Constructing BoxWeight");
        weight = -1;
    }
    
    //constructor used when cube is created
    BoxWeight (double len, double m){
        super(len);
        weight = m;
    }
    
    double volume() {
        System.out.println();
        System.out.println("In volume method of class BoxWeight (subclass)");
        System.out.println();
        return (super.volume());
    }
}