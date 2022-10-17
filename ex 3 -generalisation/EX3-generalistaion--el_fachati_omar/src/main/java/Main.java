import java.util.List;

public class Main {
    public static void main(String[] args) {
        Arbre<Integer> f1= new Feuille<>(1);
        Arbre<Integer> f2= new Feuille<>(2);
        Arbre<Integer> r2= new Noeud<>(List.of(f1,f2));
    }
}