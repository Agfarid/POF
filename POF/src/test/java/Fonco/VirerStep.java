package Fonco;

import static org.junit.jupiter.api.Assertions.assertTrue;

//import cucumber.api.PendingException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import factory.GetPersonneFactory;
//import cucumber.api.java.en.And;

import java.util.ArrayList;

import main.Club;
import main.Coach;
import main.Joueur;

public class VirerStep {
	
	private Club club;
	private Coach coach;
	private Joueur joueurAT;
	private Joueur joueurDF;
	private Joueur JoueurVire;
	private ArrayList<Joueur> joueurs;
	
	@Given("un club nommé (.*), ayant (.*) et (.*) et un coach nommé (.*)")
	public void coach_veut_virer_un_joueur(String nomClub, String nomJoueurAT, String nomJoueurDF, String nomCoach) {
	
		this.club = new Club ();
		club.setNomClub(nomClub);
		
		this.coach = new Coach ();
		
		joueurAT = new Joueur ();
		joueurDF = new Joueur ();
		
		this.joueurs = new ArrayList<>();
		
		joueurs.add(joueurAT);
		joueurs.add(joueurDF);
		
		
		joueurAT.setNomJoueur(nomJoueurAT);
		joueurAT.setNomJoueur(nomJoueurDF);
		club.setJoueurs(joueurs);
		coach.setNomCoach(nomCoach);
		coach.setClub(club);
	}
	
	@When("le coach vire le joueur avant-centre (.*) de l équipe")
	public void coach_vire_un_attaquant(String nomPoste) {
		this.joueurAT.setPosteJoueur("AT");
		this.joueurDF.setPosteJoueur("DF");
		
	    for (int i = 0; i < joueurs.size(); i++) {
	        if (joueurs.get(i).getPosteJoueur()==nomPoste) {
	        	this.JoueurVire = joueurs.get(i);
	        }
	      }
	}
	
	@Then("l attanquant quitte le club")
	public void attaquant_quitte_le_club() {
		coach.virerUnJoueur(this.JoueurVire);
		
		ArrayList<Joueur> j = new ArrayList<Joueur>();
		j.add(joueurDF);
		
		assertTrue(j.size() == coach.getClub().getJoueurs().size() && j.containsAll(coach.getClub().getJoueurs() ) && coach.getClub().getJoueurs().containsAll(j));
	      
	}
	
	@Given("un club nommé (.*), ayantt (.*) et (.*) et un coach nommé (.*)")
	public void coach_veut_virer_un_autre_joueur(String nomClub, String nomJoueurAT, String nomJoueurDF, String nomCoach) {
	
		this.club = new Club ();
		club.setNomClub(nomClub);
		
		this.coach = new Coach ();
		
		joueurAT = new Joueur ();
		joueurDF = new Joueur ();
		
		this.joueurs = new ArrayList<>();
		
		joueurs.add(joueurAT);
		joueurs.add(joueurDF);
		
		joueurAT.setNomJoueur(nomJoueurAT);
		joueurAT.setNomJoueur(nomJoueurDF);
		club.setJoueurs(joueurs);
		coach.setNomCoach(nomCoach);
		coach.setClub(club);
	}
	
	@When("le coach vire le joueur défenseur (.*) de l équipe")
	public void coach_vire_un_defenseur(String nomPoste) {
		this.joueurAT.setPosteJoueur("AT");
		this.joueurDF.setPosteJoueur("DF");
		
	    for (int i = 0; i < joueurs.size(); i++) {
	        if (joueurs.get(i).getPosteJoueur()==nomPoste) {
	        	this.JoueurVire = joueurs.get(i);
	        }
	      }
	}
	
	@Then("le défenseur quitte le club")
	public void defenseur_quitte_le_club() {
		coach.virerUnJoueur(this.JoueurVire);
		
		ArrayList<Joueur> j = new ArrayList<Joueur>();
		j.add(joueurDF);
		
		assertTrue(j.size() == coach.getClub().getJoueurs().size() && j.containsAll( coach.getClub().getJoueurs() ) && coach.getClub().getJoueurs().containsAll(j));

	}
	

}
