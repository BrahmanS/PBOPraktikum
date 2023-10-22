public class Paint {
    private double coverage;

    public Paint(double c){
        coverage = c;
    }

    public double amount(Shape s){
        System.out.println("Computing amount for " + s);
        double paintNeeded = s.area() / coverage;
        return paintNeeded;
    }

}
