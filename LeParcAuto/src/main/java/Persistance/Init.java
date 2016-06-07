/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistance;

import Metier.Vehicule;
import Metier.Visiteur;
import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.Date;
import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
/**
 *
 * @author SESSION 2
 */

public class Init {
    private static Init uniqueInstance;
   
    /**
     * @constructeur
     */
    private Init() {
    }
    public static Init getInstance() {
        if (uniqueInstance==null){
            uniqueInstance = new Init();
           
        }
        return uniqueInstance;
    }

       

    /**
     * Permet de réaliser des tests
     */
    public static void initJeu(){
       Vehicule vehicule1 = new Vehicule(1, "Renault", "Clio", 10000);
       Vehicule vehicule2 = new Vehicule(2, "Audi", "A8", 12500);
       Vehicule vehicule3 = new Vehicule(3, "Toyota", "Yaris", 15005);
       Vehicule vehicule4 = new Vehicule(4, "Renault", "Zoe", 24100);
       
       Visiteur visiteur1 = new Visiteur(1, "Gallet", "Emilien" , "3 impasse berlioz" , 42350);
       Visiteur visiteur2 = new Visiteur(2, "Valjean", "Jean" , "10 rue Victor Hugo" , 42000);
       Visiteur visiteur3 = new Visiteur(3,"Hammad","Hamza","12 rue de la Terrasse", 42000);
    }


    public static void encoderXml(Vehicule vehicule) {
    //11 a 22

XMLEncoder encoder = null;

try {
    encoder = new XMLEncoder(new BufferedOutputStream(
      new FileOutputStream("vehicule.xml")));  
      encoder.writeObject(vehicule);
      encoder.flush();
} catch (final java.io.IOException e) {
  e.printStackTrace();
} finally {
  if (encoder != null) {
    encoder.close();
   }
  }
 }

  
    public static void decoderXml() {
       XMLDecoder decoder = null;
   try {
       decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream("vehicule.xml")));
       final Vehicule vehicule = (Vehicule) decoder.readObject();
       System.out.println(vehicule);
   } catch (final Exception e) {
       e.printStackTrace();
   } finally {
       if (decoder != null){
           decoder.close();
       }
   }
    }
}
        
 
    
    