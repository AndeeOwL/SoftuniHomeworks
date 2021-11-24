package InterfacesAndAbstraction;

public class Seat extends CarImpl implements Sellable {
    private double price;

    public Seat(String model, String color, int hp, String country,double price) {
        super(model, color, hp, country);
        this.price = price;
    }


    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("This is %s produced in %s and have %d tires\n" +
                "%s sells for %f\n",getModel(),countryProduced(),TIRES,getModel(),getPrice());
    }
}
