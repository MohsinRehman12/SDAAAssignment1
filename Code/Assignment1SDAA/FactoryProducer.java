package Assignment1SDAA;

public class FactoryProducer { //Factory producer class to get factories by passing a product name

    public static GroceryProductFactory getFactory(String Name){ //function that creates a factory assocaited to the correct product name

            if(Name.equalsIgnoreCase("Apple")){
                return new AppleFactory();
            }
            if(Name.equalsIgnoreCase("Banana")){
                return new BananaFactory();
            }
            return null; //if the name of the product has no associated value return null
        }

}




