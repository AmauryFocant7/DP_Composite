import org.junit.Test;
import static org.junit.Assert.*;

public class SocieteMereTest {
    @Test //methode de test
    public void ajoutDeuxVehicules()
    {
        Societe societe2 = new SocieteMere();
        societe2.ajouteVehicule();
        societe2.ajouteVehicule();
        assertEquals("Deux vehicules",2,societe2.getNbreVehicule());
    }
    @Test
    public void ajoutSociete() //Tester l'ajout de feuille et noeux
    {
        SocieteSansFiliale societe3 = new SocieteSansFiliale();
        SocieteMere societeRoot = new SocieteMere();
        SocieteMere societe5 = new SocieteMere();
        societeRoot.ajoutFiliale(societe3);
        societeRoot.ajoutFiliale(societe3);
        societeRoot.ajoutFiliale(societe5);
        assertEquals("3 filiale",3,societeRoot.getNbreFiliale());
    }
    @Test
    public void nbreVehicule()
    {
        SocieteSansFiliale societe3 = new SocieteSansFiliale();
        SocieteMere societeRoot = new SocieteMere();
        SocieteMere societe5 = new SocieteMere();
        societeRoot.ajoutFiliale(societe3);
        societeRoot.ajoutFiliale(societe3);
        societeRoot.ajoutFiliale(societe5);
        societe3.ajouteVehicule();
        societe3.ajouteVehicule();
        societe5.ajouteVehicule();
        societeRoot.ajouteVehicule();
        assertEquals("6 vehicule",6,societeRoot.getNbreVehicule());
    }
    @Test
    public void calculeCoutEntretienDeuxVehicules(){
        SocieteSansFiliale societe3 = new SocieteSansFiliale();
        SocieteMere societeRoot = new SocieteMere();
        SocieteMere societe5 = new SocieteMere();
        societeRoot.ajoutFiliale(societe3);
        societeRoot.ajoutFiliale(societe3);
        societeRoot.ajoutFiliale(societe5);
        societe3.ajouteVehicule();
        societe3.ajouteVehicule();
        societe5.ajouteVehicule();
        societeRoot.ajouteVehicule();
        assertEquals("cout entretien",30.0,societeRoot.calculeCoutEntretien(),0.01);

    }


    }
