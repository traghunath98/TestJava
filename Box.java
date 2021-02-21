public class Box{

    private double width;
    private double height;
    private double depth;
    
    //display volume of the box
  /*  void volume() {
        System.out.print("The volume is ");
        System.out.println(width * height * depth);
    }
   */
    Box(){
        System.out.println("Constructing Box");
        width = -1;
        height = -1;
        depth = -1;
        
    }
    
    Box(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    
    Box(double len){
        width = height = depth = len;
    }
    
    Box(Box ob){
        this.width = ob.width;
        this.height = ob.height;
        this.depth = ob.depth;
    }
    
    boolean equalTo(Box ob){
        
        if(this.width == ob.width && this.height == ob.height && this.depth == ob.depth) return true; else return false;
    }
    
    double volume() {
        System.out.println();
        System.out.println("In volume method of class Box (super class)");
        System.out.println();
        return (width*height*depth);
    }
    
    void setDim(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
    
    protected void finalize(){
        System.out.println("In the finalize method.");
    }
}