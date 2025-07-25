package Oops.Inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight(double side, double weight) {
        super(side);// used to initialise values in parent class
        this.weight = weight;
    }
}
