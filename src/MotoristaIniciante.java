
public class MotoristaIniciante extends Motorista {

    public MotoristaIniciante(String nome, String placaVeiculo) {
        super(nome, placaVeiculo);
    }

    @Override
    public double calcularPagamentoLiquido() {
        double pagamentoLiquido = getValorTotalBruto() * 0.75;

        if (getQuantidadeCorridas() < 5) {
            pagamentoLiquido -= 50.00;
        }

        return pagamentoLiquido;
    }
}
