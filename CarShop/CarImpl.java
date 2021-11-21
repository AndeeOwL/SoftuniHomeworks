package InterfacesAndAbstraction;

public class CarImpl implements Car {
    private String model;
    private String color;
    private int hp;
    private String country;

    public CarImpl(String model, String color, int hp, String country) {
        this.model = model;
        this.color = color;
        this.hp = hp;
        this.country = country;
    }


    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public int getHorsePower() {
        return this.hp;
    }

    @Override
    public String countryProduced() {
        return this.country;
    }


}