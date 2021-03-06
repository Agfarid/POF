package main;

import java.util.ArrayList;

public class Club {
	 
    String nomClub;
    ArrayList<Joueur> joueurs;
    Joueur capitaine;
    
    public Club()
    {
        nomClub="null";
        joueurs= new ArrayList<Joueur>();
    }
    
    
    public void setJoueurs(ArrayList<Joueur> joueurs) {
		this.joueurs = joueurs;
	}


	public String getNomClub () {
        return this.nomClub;
    }
    
    public ArrayList<Joueur> getJoueurs(){
    	return joueurs;
    }
    
    
    public void setNomClub (String nouveauNomClub) {
        this.nomClub = nouveauNomClub;
    }

    
    // connaitre le nom du club à partir du nom du joueur
    public String detectNomClub(String nomJoueur)
    {
        switch (nomJoueur) {
         case "Benzema":
             this.setNomClub("Real Madrid");
             break;
         case "Ronaldo":
             this.setNomClub("Man united");
             break;
         case "Messi":
             this.setNomClub("PSG");
             break;
         default:
             this.setNomClub("Autre");
        }
		return nomClub;
    }
    
    // affecter le statut de capitaine à un joueur
    public Joueur Capitaine (Joueur joueur) {
    	if(capitaine==null) {
    		return this.capitaine=joueur;
    	}
    	return capitaine;
    }
    
    
//  public Club(String nomClub, ArrayList<Joueur> joueurs)
//  {
//      this.nomClub = nomClub;
//      this.joueurs=joueurs;
//  }
    
//  public Joueur ajouterJoueur(Joueur j) {
//	return addJoueur(j);
//}
//
//public Joueur addJoueur(Joueur j) {
//	this.joueurs.add(j);
//	return j;
//}
    
}
