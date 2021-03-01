public abstract class Societe {
    protected int nbreVehicule;
    protected final double COUTPARVEHICULE = 5.0;

    protected double CoutEntretien;
    public void ajouteVehicule()
    {
        nbreVehicule++;
    }
    public abstract double calculeCoutEntretien();

    public abstract int getNbreVehicule();

    public abstract void ajoutFiliale(Societe societe);

}
