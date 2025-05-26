public class ExemploOverload3 {
    public static void main(String[] args) {
        Processador p = new Processador();

        p.processar("Teste", 10);
        p.processar(20, "Outro Teste");
    }
}