package Animal;

public abstract class Animal {
    private String name;
    private String favouriteFood;
    public String explainSelf(){
        return String.format("I am %s and my favourite food is %s",name,favouriteFood);
    }

    public Animal(String name, String favouriteFood) {
        this.name = name;
        this.favouriteFood = favouriteFood;
    }
}
