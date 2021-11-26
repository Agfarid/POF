package testUnitaire;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import main.Club;
import main.Joueur;


public class JoueurTest {

    private Joueur j = new Joueur();
    Club c = new Club();
    ArrayList<Joueur> compo = new ArrayList<>();
    ArrayList<Joueur> a = new ArrayList<>();

    /**
     * Met en place les engagements.
     * Méthode appelée avant chaque appel de méthode de test.
     */
    
    @BeforeEach
    public void setUp() throws Exception
    {
        // Initialisation des engagements
    }

    /**
     * Supprime les engagements
     * Méthode appelée après chaque appel de méthode de test.
     */
    @AfterEach
    public void tearDown() // throws java.lang.Exception
    {
        //Libérez ici les ressources engagées par setUp()
    }

   
    @Test
    public void testChangePoste()
    {
    	compo.add(j);
    	this.c.setJoueurs(compo);
    	j.changerPoste(7, "MDf");
        assertEquals(7, j.getNumJoueur());
        assertEquals("MDf", j.getPosteJoueur());
    }
    
    @Test
    public void testCapitain()
    {
    	c.setJoueurs(compo);
    	c.Capitaine(j);
        assertEquals(true, j.isCapitain(j));
    }
    
}
