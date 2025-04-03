package en.ase.sqt.models.Builder;

public class CoffeeBuilder {

    private Coffee coffee = new Coffee();

    public CoffeeBuilder(String type, float price, String size){
        this.coffee.type = type;
        this.coffee.price = price;
        this.coffee.size = size;
    }

    public CoffeeBuilder addMilk(String milk){
        this.coffee.milk = milk;

        return this;
    }

    public CoffeeBuilder addIce(){
        this.coffee.hasIce = true;

        return this;
    }

    public CoffeeBuilder addFlavour(String flavour){
        this.coffee.flavour = flavour;

        return this;
    }

    public Coffee build(){
        return coffee;
    }
}
