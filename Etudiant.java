/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;

/**
 *
 * @author malek
 */
public class Etudiant extends Personne {

    ArrayList<Integer> listeNotes = new ArrayList<Integer>();
    private double moyenne;

    public ArrayList<Integer> getListeNotes() {
        return listeNotes;
    }

    public void ajouterNote(int note) {
        if (note <= 0) {
            note = 0;
        }
        if (note > 20) {
            note = 20;
        }
        listeNotes.add(note);
        int moy = 0;
        for (int i = 0; i < listeNotes.size(); i++) {
            moy += listeNotes.get(i);
        }
        this.moyenne = moy / listeNotes.size();

    }

    public double getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }

    @Override
    public String toString() {
        return "Etudiant{" + "listeNotes=" + listeNotes + ", moyenne=" + moyenne + '}';
    }

    
    
}
