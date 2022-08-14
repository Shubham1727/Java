class demo{
    double width;
    double height;
    double depth;

    double volume()
    {
       return width*depth*height;
    }
    void setdim(double w , double d , double h){
        width= w;
        depth = d;
        height = h;
    }    
}
class exam3 {
    public static void main (String []args)
    {
    demo mybox1 = new demo();
    demo mybox2 = new demo();    
    
    mybox1.setdim(5, 6, 8);
    mybox2.setdim(1, 7, 2);

    mybox1.volume();

    System.out.println("volume is"+ mybox1.volume());
    }
    
}