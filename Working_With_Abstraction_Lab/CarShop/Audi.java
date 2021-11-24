package InterfacesAndAbstraction;

public class Audi extends CarImpl implements Rentable{
 private int minRentDay;
 private double pricePerDay;

    public Audi(String model, String color, int hp, String country, int minRentDay, double pricePerDay) {
        super(model, color, hp, country);
        this.minRentDay = minRentDay;
        this.pricePerDay = pricePerDay;
    }

    @Override
    public String toString() {
        return String.format("This is %s produced in %s and have %d tires\n" +
                "Minimum rental period of %d days. Price per day %f\n",getModel(),countryProduced(),TIRES,
                getMinRentDay(),getPricePerDay());
    }

    @Override
    public int getMinRentDay() {
        return minRentDay;
    }

    @Override
    public double getPricePerDay() {
        return pricePerDay;
    }
}
