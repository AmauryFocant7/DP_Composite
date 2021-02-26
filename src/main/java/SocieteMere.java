import java.util.ArrayList;

public class SocieteMere extends Societe{

    protected ArrayList<Societe> filiales = new ArrayList<>();
    int acc=0;

    @Override
    public double calculeCoutEntretien() {
        return getNbreVehicule() * COUTPARVEHICULE;
    }

    @Override
    public int getNbreVehicule() {
        for (Societe societe : filiales) {

            acc= acc + societe.getNbreVehicule();
            //acc += societe.getNbreVehicule();


        }
        return acc + nbreVehicule;
    }


    @Override
    public void ajoutFiliale(Societe societe) {
        filiales.add(societe);
    }

    public int getNbreFiliale()
    {
        return filiales.size();
    }
}
