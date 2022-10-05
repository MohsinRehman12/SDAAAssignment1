package Assignment1SDAA;

public class AbstractFactorDriver { //driver class meant to test and run the Factory and methods

    public static void main(String[] args){

        GroceryProductFactory productFactory = FactoryProducer.getFactory("Banana");

        Product product1 = productFactory.getProduct("Banana");

        product1.getPrice(); //use get price before setting it to see if the code prompts me to use the setter

        product1.setPrice(); //set price

        product1.getPrice(); //see if the output shows after we have set the price


        //repeat the same for the apple class

        GroceryProductFactory productFactory2 = FactoryProducer.getFactory("Apple");

        Product product2 = productFactory2.getProduct("Apple");

        product2.getPrice();


        product2.setPrice();


        product2.getPrice();

        //test for when there are product classes associated with the mismatching names (should be no output)

        GroceryProductFactory productFactory3 =  FactoryProducer.getFactory("Apple");

        Product product3 = productFactory.getProduct("Banana");



    }

}
