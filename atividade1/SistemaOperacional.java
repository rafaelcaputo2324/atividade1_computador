public class SistemaOperacional {
    private Computador computador;

    public SistemaOperacional(Computador computador) {
        this.computador = computador;
    }

    public Computador getComputador() {
        return computador;
    }

    public void setComputador(Computador computador) {
        this.computador = computador;
    }

    public boolean executarPrograma(Programa p) {
        Computador comp = this.getComputador();

        if (p.getSSDOcupado() > comp.getSSD()) {
            System.out.println("Erro na instalação do programa: SSD insuficiente.");
            return false;
        }

        if (p.getMemoriaRAMAlocada() > comp.getMemoriaRAM()) {
            System.out.println("Erro na execução do programa: memória RAM insuficiente.");
            return false;
        }

        System.out.println("Programa executado com sucesso!");

        float tempoExecucao = (float) p.getQuantidadeOperacoes() /
                             (comp.getOperacoesPorSegundo() * comp.getNucleos());

        System.out.printf("Tempo de execução: %.2f segundos.\n", tempoExecucao);

        return true;
    }
}
