package en.ase.sqt.models.Builder.Inner;

public class CoffeeV2 {
    /*
    * Coffee Type (String): Required - The type of coffee (e.g., Espresso, Latte, Cappuccino).
Price (Float): Required - The price of the coffee order
Size (String): Required - The size of the coffee (e.g., Small, Medium, Large).
Milk Type (String): Optional - The type of milk (e.g., Whole, Skim, Almond, Soy).
Sugar Level (Integer): Optional - The amount of sugar (e.g., 0, 1, 2, 3).
Ice (Boolean): Optional - Whether the coffee has ice.
Flavor Shot (String): Optional - The flavor shot used (e.g., Vanilla, Hazelnut, etc).
Whipped Cream (Boolean): Optional - Whether the coffee has whipped cream.
*
* */

    private String type;
    private float price;
    private String size;
    private String milk;
    private boolean hasIce;
    private String flavour;

    private CoffeeV2(){

    }

    private CoffeeV2(String type, float price, String size) {
        this.type = type;
        this.price = price;
        this.size = size;
    }

    public static class CoffeeBuilderV2{
        private CoffeeV2 coffee = new CoffeeV2(); // eager

        public CoffeeBuilderV2(String type, float price, String size){
            this.coffee.type = type;
            this.coffee.price = price;
            this.coffee.size = size;
        }

        public CoffeeBuilderV2 addMilk(String milk){
            this.coffee.milk = milk;

            return this;
        }

        public CoffeeBuilderV2 addIce(){
            this.coffee.hasIce = true;

            return this;
        }

        public CoffeeBuilderV2 addFlavour(String flavour){
            this.coffee.flavour = flavour;

            return this;
        }

        public CoffeeV2 build(){
            return coffee;
        }
    }
}


