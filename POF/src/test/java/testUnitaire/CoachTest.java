package testUnitaire;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;



import org.junit.jupiter.api.BeforeEach;


import main.Joueur;
import main.Club;
import main.Coach;

public class CoachTest {
	
	private Joueur j1= new Joueur();
	private Joueur j2= new Joueur();
	private ArrayList<Joueur> compo= new ArrayList<Joueur>();
	private ArrayList<Joueur> compoExp= new ArrayList<Joueur>();
	private Club cl= new Club();; 
	private Coach co= new Coach();

    
    @Test
    public void testVirerJoueur()
    {
        compoExp.add(j1);
    	compo.add(j1);
        compo.add(j2);
        cl.setJoueurs(compo);
        co.setClub(cl);
        
        co.virerUnJoueur(j2);
        assertEquals(cl.getJoueurs(), compoExp);
    }
    
    @Test
    public void testAjouterJoueur()
    {
        compoExp.add(j1);
    	compo.add(j1);
        compo.add(j2);
        cl.setJoueurs(compo);
        co.setClub(cl);
        
    	compoExp.add(j2);
    	compoExp.add(j1);
        co.ajouterUnJoueur(j1);
        //assertEquals(co.getClub().getJoueurs(), compoExp);
        assertTrue(compoExp.size() == co.getClub().getJoueurs().size() && compoExp.containsAll( co.getClub().getJoueurs()) &&  co.getClub().getJoueurs().containsAll(compoExp));
    }

}
