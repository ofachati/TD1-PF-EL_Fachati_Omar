import java.util.Objects;
import java.util.Set;

public class Entier<T extends Sommable<T>> implements Arbre<T> {
    private final Integer valeur;

    public Entier( final Integer valeur) {
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


    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Entier entier = (Entier) o;
        return Objects.equals(valeur, entier.valeur);
    }

}
