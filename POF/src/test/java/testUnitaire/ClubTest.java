package testUnitaire;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import main.Club;
import main.Joueur;

import java.util.ArrayList;


public class ClubTest
{
    private Joueur j;
    private Club c;
    private ArrayList<Joueur> compo;
    

    
    @BeforeEach
    public void setUp() throws Exception
    {
        this.j = new Joueur();
        this.compo = new ArrayList<Joueur>();
        compo.add(j);
        this.c = new Club(); 
        c.setJoueurs(compo);
    }
    
    
    @Test
    public void NomClubTest()
    {
        this.j.setNomJoueur("Ronaldo");
        assertEquals("Man united", this.j.getNomClub());
    }    
    
    
//    @Test
//    public void testClub(){
//        assertEquals(this.c.getNomClub(), "Man united");
//    }
 

}

