/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuing;

import java.util.ArrayList;

/**
 *
 * @author jonassimonsen
 */
public class ControlEngine {
    ArrayList<Player> personList;
    
    public void makeNewPerson(String name) {
        Player pers = new Player (name);
        personList.add(pers);
        savePerson();
    }
    
    public void savePerson() {
        FileHandler.saveFile(personList, "persons.txt");
    }
    
    public void loadPerson() {
        personList = FileHandler.loadFile("persons.txt");
    }
}