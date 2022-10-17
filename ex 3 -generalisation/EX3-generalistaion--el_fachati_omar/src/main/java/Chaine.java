public class Chaine implements Sommable<Chaine>{
    private final Chaine valeur;

    public Chaine( final Chaine valeur) {
        this.valeur = valeur;
    }


    @Override
    public Chaine sommer(Chaine somme) {
        return somme;
    }
}
