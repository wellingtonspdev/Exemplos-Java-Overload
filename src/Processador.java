class Processador {

    public void processar(String texto, int numero) {
        System.out.println("Processando String, depois int: " + texto + ", " + numero);
    }

    public void processar(int numero, String texto) {
        System.out.println("Processando int, depois String: " + numero + ", " + texto);
    }
}