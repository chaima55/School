/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author malek
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Prof> ProfList = new ArrayList();
        ArrayList<Etudiant> EtudiantList = new ArrayList();

        System.out.println("--------------------------");
        System.out.println("1.add prof");
        System.out.println("2.add student");
        System.out.println("3.add note");
        System.out.println("4.calcul moy");
        System.out.println("5.quit");
        System.out.println("--------------------------");

        boolean quit = false;
        while (!quit) {
            Scanner sc = new Scanner(System.in);
            System.out.println("You choice :");
            int str = Integer.parseInt(sc.nextLine());
            switch (str) {
                case 1:
                    Prof objet_p = new Prof();
                    System.out.println("nom :");
                    String nom = sc.nextLine();
                    objet_p.setNom(nom);
                    System.out.println("prenom :");
                    String prenom = sc.nextLine();
                    objet_p.setPrenom(prenom);
                    System.out.println("email :");
                    String email = sc.nextLine();
                    objet_p.setEmail(email);
                    System.out.println("num_tel :");
                    String num_tel = sc.nextLine();
                    objet_p.setNum_tel(num_tel);
                    System.out.println("matiere :");
                    String matiere = sc.nextLine();
                    objet_p.setMatiere(matiere);
                    ProfList.add(objet_p);

                    for (int i = 0; i < ProfList.size(); i++) {
                        System.out.println(ProfList.get(i));
                    }
                    break;
                case 2:
                    Etudiant objet_e = new Etudiant();
                    System.out.println("nom :");
                    nom = sc.nextLine();
                    objet_e.setNom(nom);
                    System.out.println("prenom :");
                    prenom = sc.nextLine();
                    objet_e.setPrenom(prenom);
                    System.out.println("email :");
                    email = sc.nextLine();
                    objet_e.setEmail(email);
                    System.out.println("num_tel :");
                    num_tel = sc.nextLine();
                    objet_e.setNum_tel(num_tel);
                    EtudiantList.add(objet_e);

                    for (int i = 0; i < EtudiantList.size(); i++) {
                        System.out.println(EtudiantList.get(i));
                    }
                    break;
                case 3:
                    if (EtudiantList.size() == 0) {
                        System.out.println("Erreur,liste des etudiants est vide.");
                    } else {
                        for (int i = 0; i < EtudiantList.size(); i++) {
                            System.out.println("ID de l'etudiant");
                            System.out.println(i);
                            System.out.println(EtudiantList.get(i).getNom());
                            System.out.println(EtudiantList.get(i).getPrenom());
                            System.out.println(EtudiantList.get(i).getEmail());

                        }
                        System.out.println("id de l'etudiant :");
                        int id = Integer.parseInt(sc.nextLine());
                        System.out.println("note de l'etudiant :");
                        int note = Integer.parseInt(sc.nextLine());
                        EtudiantList.get(id).ajouterNote(note);
                        for (int i = 0; i < EtudiantList.size(); i++) {
                            System.out.println(EtudiantList.get(i));
                        }
                    }

                    break;
                case 5:
                    quit = true;
                    System.out.println("Quit...");
                    break;

            }
        }

    }

}
