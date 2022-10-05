package Assignment1SDAA;

public class BananaFactory implements GroceryProductFactory { //BananaFactory implementing GroceryAbstractFactory to generate object of concrete Banana class

    @Override
    public Product getProduct(String shapeType){ //function that generates a concrete banana object
        if(shapeType.equalsIgnoreCase("Banana")){
            return new Banana();
        }
        return null; //if the shapetype is not an apple return null
    }
}
