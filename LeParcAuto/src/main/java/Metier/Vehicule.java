/*
TESTAS
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

import com.vaadin.data.util.BeanItemContainer;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Emilien
 */
public class Vehicule {

    private int id;
    private String marque;
    private String modele;
    private double prix;
    //attributs rajouter
    private int killometrage;
    private boolean controleTechniqueEtat;
    private int anneeMiseEnService;
    private boolean controleTechniqueGSB;
    private static BeanItemContainer<Vehicule> vehicules = new BeanItemContainer<>(Vehicule.class);
    private static BeanItemContainer<Visiteur> estAssocie = new BeanItemContainer<>(Visiteur.class);

    /**
     * @constructeur
     */
    public Vehicule() {
    }

    /**
     * @constructeur
     * @param id
     * @param marque
     * @param modele
     * @param prix 
     */
    public Vehicule(int id, String marque, String modele, double prix) {
        this.id = id;
        this.marque = marque;
        this.modele = modele;
        this.prix = prix;
        this.vehicules.addBean(this);
    }

    /**
     *
     * @return la marque du véhicule
     */
    public String getMarque() {
        return marque;
    }

    /**
     *
     * @return le modele du véhicule
     */
    public String getModele() {
        return modele;
    }

    /**
     *
     * @return le prix du véhicule
     */
    public double getPrix() {
        return prix;
    }

    /**
     *
     * @param marque
     */
    public void setMarque(String marque) {
        this.marque = marque;
    }

    /**
     *
     * @param modele
     */
    public void setModele(String modele) {
        this.modele = modele;
    }

    /**
     *
     * @param prix
     */
    public void setPrix(double prix) {
        this.prix = prix;
    }

    /**
     *
     * @return l'identifiant du véhicule
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return la collection de véhicule
     */
    public static BeanItemContainer<Vehicule> getVehicules() {
        return vehicules;
    }
    
    /**
     *
     * @return la collection de véhicule ayant un prix suppérieur a la variable prix
     */
    public static BeanItemContainer<Vehicule> getVehiculesPrixHaut(double prix) {
        BeanItemContainer<Vehicule> lesVehiculesPrixHaut = new BeanItemContainer<>(Vehicule.class);
        List<Vehicule> listeVehicule = vehicules.getItemIds();
        for( Vehicule unVehicule : listeVehicule){
            if(unVehicule.getPrix()> prix){
                lesVehiculesPrixHaut.addBean(unVehicule); //BUG
            }
        } 
        return lesVehiculesPrixHaut;
    }
    public static BeanItemContainer<Vehicule> getVehiculesPrixBas(double prix) {
        BeanItemContainer<Vehicule> lesVehiculesPrixBas = new BeanItemContainer<>(Vehicule.class);
        List<Vehicule> listeVehicule = vehicules.getItemIds();
        for( Vehicule unVehicule : listeVehicule){
            if(unVehicule.getPrix()< prix){
                lesVehiculesPrixBas.addBean(unVehicule); //BUG
            }
        } 
        return lesVehiculesPrixBas;
    }
    
    /*
     * procédure qui modifie l'atribut controleTechniqueGSB de l'objet 
     */
    public void verifierControleTechniqueGSB(){
        int annee = 2016;
        //On effectue le test si 
        if(this.killometrage < 200000 && this.controleTechniqueEtat == true && (annee - this.anneeMiseEnService) < 10 ){
            this.controleTechniqueGSB = true;
        }
        else{
            this.controleTechniqueGSB = false;
        }
    }
    
    /*
     * retourne une collèction de véhicule conforme
     */
    
}
