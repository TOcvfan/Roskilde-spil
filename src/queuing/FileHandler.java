/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jonassimonsen
 */
public class FileHandler {
    
    public static ArrayList<Player> loadFile(String filename) {
        
        ArrayList<Player> personArray = new ArrayList<Player>();
        Scanner file_scanner = null;

        try {
            file_scanner = new Scanner(new File(filename));  //Connection to the file using the Scanner object
        } catch (FileNotFoundException ex) {
            System.out.println("Could not find the file to load from! Returning null.");
            ex.printStackTrace();
            return null;  //If something goes wrong the method returns null
        }

        while (file_scanner.hasNextLine()) //File found. Reading one line.         
        {      
            String line = file_scanner.nextLine();
            Scanner sc = new Scanner(line).useDelimiter(",");
            String navn = sc.next();
            Player p = new Player(navn);
            personArray.add(p);  //Reading in a single line and saving in the ArrayList
        }
        
        file_scanner.close();  //Closing the file
        return personArray; 
    }
    
    public static boolean saveFile(ArrayList<Player> personArray, String filename)
    {
        if( personArray == null ) { return false;  }  //Checking parameter for null.
        FileWriter output;  //Creating reference for filewriter.
        
        try {
                output = new FileWriter(new File(filename));  //Opening connection to file.
                for (Player personline : personArray) {   //running through the ArrayList.                    
                    output.write(personline.toString() + "\n");  //Each String object is written as a line in file.
            }

            output.close();  //Closing the file
        } catch (Exception ex) {  //If something goes wrong everything is send to system out.
            System.out.println("Could not save to file!");
            System.out.println(ex.toString());
            ex.printStackTrace();
            return false;  //If something goes wrong false is returned!
        }

        return true;
    }
}