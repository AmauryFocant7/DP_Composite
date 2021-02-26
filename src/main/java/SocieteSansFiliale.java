public class SocieteSansFiliale extends Societe{

    @Override
    public double calculeCoutEntretien() {
        CoutEntretien = nbreVehicule * COUTPARVEHICULE;
        return CoutEntretien;
    }

    @Override
    public int getNbreVehicule() {
        return nbreVehicule;
    }

    @Override
    public void ajoutFiliale(Societe societe) {

    }

}
