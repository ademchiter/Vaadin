/*
 * To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

import com.vaadin.data.util.BeanItemContainer;

/**
 *
 * @author Emilien
 */
public class Visiteur {
    
    private int id;
    private String nom;
    private String prenom;
    private String adresse;
    private int codePostal;
    private static BeanItemContainer<Visiteur> Visiteur = new BeanItemContainer<>(Visiteur.class);
    private Vehicule utilise;
    
    /**
     * @constructeur
     */
    public Visiteur() {
    }
   
    /**
     * @constructeur
     * @param id
     * @param nom
     * @param prenom
     * @param adresse
     * @param CodePostal
     */
    public Visiteur(int id, String nom, String prenom, String adresse, int CodePostal) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.codePostal = CodePostal;
        this.Visiteur.addBean(this);
    }
    
    /**
     *
     * @return leVisiteur
     */
    public static BeanItemContainer<Visiteur> getVisiteur(){
        return Visiteur;
    }

    /**
     *
     * @return l'id du visiteur
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return le nom du visiteur
     */
    public String getNom() {
        return nom;
    }

    /**
     *
     * @return le prénom du visiteur
     */
    public String getPrenom() {
        return prenom;
    }
    
    /**
     *
     * @return le code Postal du visiteur
     */
    public int getcodePostal() {
        return codePostal;
    }
        
    /**
     *
     * @return l'adresse du visiteur
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     *
     * @param prenom
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     *
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
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
     * @param adresse
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    
    /**
     *
     * @param codePostal
     */
    public void setcodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

}
