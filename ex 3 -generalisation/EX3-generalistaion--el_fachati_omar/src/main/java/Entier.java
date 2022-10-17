public class Entier implements Sommable<Entier>{
    private final Integer valeur;

    public Entier( final Integer valeur) {
        this.valeur = valeur;
    }


    @Override
    public Entier sommer(Entier somme) {
        return somme;
    }
}
