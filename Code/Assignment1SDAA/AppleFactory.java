package Assignment1SDAA;

public class AppleFactory implements GroceryProductFactory { //AppleFactiry implementing GroceryAbstractFactory to generate object of concrete Banana class


    @Override
    public Product getProduct(String shapeType){ //function that generates a concrete banana object
        if(shapeType.equalsIgnoreCase("apple")){
            return new Apple();
        }
        return null; //if the shapetype is not an apple return null
    }
}
