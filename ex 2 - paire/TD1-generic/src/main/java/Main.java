public class Main {
    public static void main(String[] args) {
        IPaire<Integer,String> v1=new Paire<>(1,"un");
        System.out.println(v1.toString());
        IPaire<Double,String> v2= v1.changerFst(1.0);
        System.out.println(v2.toString());
        IPaire<Double,IPaire<Integer,String>> v3= v2.changerSnd(v1);
        System.out.println(v3.toString());
    }
}

