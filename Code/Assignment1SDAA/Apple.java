package Assignment1SDAA;

public class Apple implements Product { //apple class implemented from product interface

    private double price = 0.00; //private doubled variable meant to hold the price of the product

    @Override
    public void setPrice(){ //function implemented from product interface to set the price


        String className = this.getClass().getSimpleName();

        databaseAcessor test  = new databaseAcessor();

        this.price = test.getProductPrice(className); //set price to be the value obtained from the textfile


    }

    @Override
    public void getPrice(){ //function implemented from product interface to get the price

        if (this.price==0.00){ //checks if the price was not set

            System.out.println("No price set please use the setter");

        }else { //if the price is set then display it to the user

            System.out.println("The price of Apples is $" + price);

        }
    }



}
