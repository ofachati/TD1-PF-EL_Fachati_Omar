import java.util.HashSet;
import java.util.Set;


public class Feuille<T> implements Arbre<T> {

    private final T valeur;

    public Feuille(final T valeur) {
        this.valeur = valeur;
    }


    @Override
    public int taille() {
        return 1;
    }

    @Override
    public boolean contient(T val) {
        return val.equals(this.valeur);
    }

    @Override
    public Set<T> valeurs() {
        return Set.of(valeur);
    }

    @Override
    public T sommer(T somme) {
        return valeur;
    }
}