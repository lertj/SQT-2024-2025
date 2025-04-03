# EN

We are developing a software for a Coffee Shop. Customers can place custom coffee orders. Each coffee order has multiple attributes, and customers can request customizations to their coffees. Here are the attributes involved in creating a coffee order:

- Coffee Type (String): Required - The type of coffee (e.g., Espresso, Latte, Cappuccino).
- Price (Float): Required - The price of the coffee order
- Size (String): Required - The size of the coffee (e.g., Small, Medium, Large).
- Milk Type (String): Optional - The type of milk (e.g., Whole, Skim, Almond, Soy).
- Sugar Level (Integer): Optional - The amount of sugar (e.g., 0, 1, 2, 3).
- Ice (Boolean): Optional - Whether the coffee has ice.
- Flavor Shot (String): Optional - The flavor shot used (e.g., Vanilla, Hazelnut, etc).
- Whipped Cream (Boolean): Optional - Whether the coffee has whipped cream.

Some customers may want a basic coffee with no customization, while others may prefer multiple add-ons. The solution must ensure that:  
All required attributes (Coffee Type, Size, and Price) are set.  
Optional features can be included or omitted depending on customer preferences.

The creation process is clear and flexible, without overwhelming customers or developers with too many parameters at once.
