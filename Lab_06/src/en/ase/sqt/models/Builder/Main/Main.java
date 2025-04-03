package en.ase.sqt.models.Builder.Main;

import en.ase.sqt.models.Builder.Coffee;
import en.ase.sqt.models.Builder.CoffeeBuilder;
import en.ase.sqt.models.Builder.Inner.CoffeeV2;

public class Main {
    public static void main(String[] args) {

        Coffee coffee2 = new CoffeeBuilder("latte", 15, "Tall")
                .build();

        Coffee coffee3 = new CoffeeBuilder("latte", 15, "Tall")
                .addMilk("oat")
                .addFlavour("vanilla")
                .build();

        CoffeeV2 coffee = new CoffeeV2.CoffeeBuilderV2("latte", 15, "Tall").addFlavour("Caramel").build();

    }
}
