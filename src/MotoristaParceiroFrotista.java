
public class MotoristaParceiroFrotista extends Motorista {

    private static final double percentual_pagamento = 0.80;
    private static final double aluguel_veiculo = 800.00;

    public MotoristaParceiroFrotista(String nome, String placaVeiculo) {
        super(nome, placaVeiculo);
    }

    @Override
    public double calcularPagamentoLiquido() {
        double pagamentoLiquido =
                getValorTotalBruto() * percentual_pagamento
                        - aluguel_veiculo;

        if (pagamentoLiquido < 0) {
            return 0.0;
        }

        return pagamentoLiquido;
    }
}
