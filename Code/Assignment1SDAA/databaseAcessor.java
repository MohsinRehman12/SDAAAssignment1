package Assignment1SDAA;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class databaseAcessor {



    public double getProductPrice(String className){

        BufferedReader databaseReader;

        //intialized string and double vaules to hold the string and numerical values for price
        String price ="";
        Double d =0.00;


        try
        {
            //create a new BufferReader to read the txt File acting as a database
            databaseReader = new BufferedReader(new FileReader("C:\\Users\\mshak\\IdeaProjects\\SofeYear3\\src\\Assignment1SDAA\\Products.txt"));
            String line = databaseReader.readLine(); //store value of the first line in the text file in a string


            while(line !=null) //loop keeps running until we reach the end of the file
            {
                line = line.toUpperCase(); //set the line to be uppercase so no case sensitive issues occur

                if (line.contains(className.toUpperCase())){ //checks if the tne line in the text file contains the name of the class

                    String[] lineCharArray = new String[0];

                    lineCharArray = line.split(":"); //store the values after the colon into a string array

                    //store the values of the price in the txt file to a string then convert it into a double number
                    price = lineCharArray[1];

                    d=Double.parseDouble(price);


                    break; //break out of loop
                }

                line = databaseReader.readLine(); //continue to next line




            }






            databaseReader.close(); //close buffer reader
        }
        catch (IOException e) //catch exception meant to run if the location on the text file is not found
        {
            System.out.println("Database Text File Is Not Found");
            e.printStackTrace();
        }


        return d; //return the price
    }




}

