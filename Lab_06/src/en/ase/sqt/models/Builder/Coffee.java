package en.ase.sqt.models.Builder;

public class Coffee {
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

    String type;
    float price;
    String size;
    String milk;
    boolean hasIce;
    String flavour;

    Coffee(){

    }

    Coffee(String type, float price, String size) {
        this.type = type;
        this.price = price;
        this.size = size;
    }
}


