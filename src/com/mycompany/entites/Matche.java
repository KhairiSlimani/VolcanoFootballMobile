/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entites;

/**
 *
 * @author DeLL
 */
public class Matche {
    //njib les attributs te3i kima samithom fl symfony
    private int id;
    private String NomMatche,NomArbitre,Stade,tour;
  

    public Matche() {
    }

    
    
    public Matche(int id, String NomMatche,String NomArbitre,String Stade,String tour) {
        this.id = id;
        this.NomMatche = NomMatche;
        this.NomArbitre = NomArbitre;
        this.Stade = Stade;
        this.tour = tour;
       
    }

    public Matche(String NomMatche,String NomArbitre, String Stade,String tour) {
        this.NomMatche = NomMatche;
        this.NomArbitre = NomArbitre;
        this.Stade = Stade; 
        this.tour = tour;      
       
    }

    public Matche(int parseInt, String toString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getNomMatche() {
        return NomMatche;
    }

    public void setNomMatche(String NomMatche) {
        this.NomMatche = NomMatche;
    }

    public String getNomArbitre() {
        return NomArbitre;
    }

    public void setNomArbitre(String NomArbitre) {
        this.NomArbitre = NomArbitre;
    }
     public String getStade() {
        return Stade;
    }

    public void setStade(String stade) {
        this.Stade = Stade;
    }
    public String getTour() {
        return tour;
    }

    public void setTour(String tour) {
        this.tour = tour;
    }


    
        
    
       
}
