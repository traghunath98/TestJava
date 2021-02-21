public class ColorBox extends Box{

    int color;
    
    //construct clone of an object
    ColorBox (ColorBox cb){
        super(cb);
        color = cb.color;
    }
    
    //default constructor
    ColorBox(){
        super();
        color = -1;
    }
    
    //constructor used when cube is created
    ColorBox (double len, int c){
        super(len);
        color = c;
    }

    
    //constructor when all parameters are specified
    ColorBox(double w, double h, double d, int c){
        super(w,h,d);
        color = c;
    }
}