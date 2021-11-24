package SayHello;

public abstract class BasePerson {
    private String name;

    public BasePerson(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
