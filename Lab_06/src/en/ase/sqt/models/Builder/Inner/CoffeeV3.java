package en.ase.sqt.models.Builder.Inner;

public class CoffeeV3 {
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

    private CoffeeV3(){

    }

    private CoffeeV3(String type, float price, String size) {
        this.type = type;
        this.price = price;
        this.size = size;
    }

    public static class CoffeeBuilderV3{ //lazy

        private String type;
        private float price;
        private String size;
        private String milk;
        private boolean hasIce;
        private String flavour;


        public CoffeeBuilderV3(String type, float price, String size){
            this.type = type;
            this.price = price;
            this.size = size;
        }

        public CoffeeBuilderV3 addMilk(String milk){
            this.milk = milk;

            return this;
        }

        public CoffeeBuilderV3 addIce(){
            this.hasIce = true;

            return this;
        }

        public CoffeeBuilderV3 addFlavour(String flavour){
            this.flavour = flavour;

            return this;
        }

        public CoffeeV3 build(){
            CoffeeV3 coffeeV3 = new CoffeeV3(type, price, size);
            coffeeV3.milk = milk;
            coffeeV3.flavour = flavour;
            return coffeeV3;
        }
    }
}


