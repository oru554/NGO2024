/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ngo2024;

import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Edvin
 */
public class NGO2024 {
    
    private static InfDB idb;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
            idb = new InfDB("ngo_2024", "3306", "Edward", "Klanto321!!");
            new Inloggning(idb).setVisible(true);
            
        } catch (InfException ex){
            System.out.println(ex.getMessage()); 
        }
        
    }
    
}
