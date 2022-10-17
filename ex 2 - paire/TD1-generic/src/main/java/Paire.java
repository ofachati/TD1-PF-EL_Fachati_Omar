public class Paire<T,U> implements IPaire<T,U>{
    private T _fst;
    private U _snd;

    public Paire(T a, U b){
        this._fst=a;
        this._snd=b;
    }

    public String toString(){
        return  "(" + this.fst()+ "," + this.Snd()+ ")";
    }
    @Override
    public T fst() {
        return _fst;
    }

    @Override
    public U Snd() {
        return _snd;
    }

    @Override
    public <V> IPaire<V, U> changerFst(V v) {
        return new Paire<>(v,_snd);
    }


    @Override
    public <V> IPaire<T,V> changerSnd(V v) {
        return new Paire<>(_fst,v);
    }
}
