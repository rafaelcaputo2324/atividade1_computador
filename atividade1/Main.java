public class Main {
    public static void main(String[] args) {
       
        Computador computador = new Computador(8000, 256000, 8, 1_000_000);

        
        SistemaOperacional so = new SistemaOperacional(computador);

        
        Programa p1 = new Programa(4000, 200000, 4, 2_000_000);

        System.out.println("Tentando executar programa 1:");
        so.executarPrograma(p1);

    }
}
