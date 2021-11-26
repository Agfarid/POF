package main;

public class Coach {
	
	Club club;
	String nomCoach;
	

	public Coach() {
		club = new Club();
		this.nomCoach = "null";
	}
	
	public String getNomCoach() {
		return nomCoach;
	}

	public void setNomCoach(String nomCoach) {
		this.nomCoach = nomCoach;
	}

	public Club getClub() {
		return club;
	}

	public void setClub(Club club) {
		this.club = club;
	}

	public void virerUnJoueur(Joueur joueur) {
		int index = 0;
		for(int i = 0; i < this.club.joueurs.size();i++) {
			if(this.club.joueurs.get(i).equals(joueur)) index = i;
		}
		
		this.club.joueurs.remove(index);
	}
	
	public void ajouterUnJoueur(Joueur joueur) {
		club.joueurs.add(joueur);
	}

}