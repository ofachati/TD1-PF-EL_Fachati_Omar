import java.util.Set;

public interface Arbre<T> extends Sommable<T> {
    int taille();

    boolean contient(final T val);

    Set<T> valeurs();



}
