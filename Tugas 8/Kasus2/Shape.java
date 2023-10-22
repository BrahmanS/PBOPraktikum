public abstract class Shape {
    private String shapeName;

    Shape(String shape){
        shapeName = shape;
    }
    abstract double area();

    public String toString(){
        
        return shapeName;
    }
}
