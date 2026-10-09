public abstract class Motorista {

    private String nome;
    private String placaVeiculo;
    private int quantidadeCorridas;
    private double valorTotalBruto;

    public Motorista(String nome, String placaVeiculo) {
        this.nome = nome;
        this.placaVeiculo = placaVeiculo;
        this.quantidadeCorridas = 0;
        this.valorTotalBruto = 0.0;
    }

    public void registrarCorrida(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException(
                    "O valor da corrida deve ser maior que zero."
            );
        }

        quantidadeCorridas++;
        valorTotalBruto += valor;
    }

    public abstract double calcularPagamentoLiquido();

    public String getNome() {
        return nome;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public int getQuantidadeCorridas() {
        return quantidadeCorridas;
    }

    public double getValorTotalBruto() {
        return valorTotalBruto;
    }
}
