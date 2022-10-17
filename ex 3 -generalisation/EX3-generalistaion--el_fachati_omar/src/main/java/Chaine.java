import java.util.Set;

public class Chaine<T extends Sommable<T>> implements Arbre<T> {
    private final Chaine valeur;

    public Chaine( final Chaine valeur) {
        this.valeur = valeur;
    }



    @Override
    public int taille() {
        return 0;
    }

    @Override
    public boolean contient(T val) {
        return false;
    }

    @Override
    public Set<T> valeurs() {
        return null;
    }
}
