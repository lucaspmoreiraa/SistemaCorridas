
public class MotoristaPremium extends Motorista {

    private static final double bonus_por_corrida = 2.00;
    private static final double percentual_pagamento = 0.85;

    public MotoristaPremium(String nome, String placaVeiculo) {
        super(nome, placaVeiculo);
    }

    @Override
    public void registrarCorrida(double valor) {
        super.registrarCorrida(valor + bonus_por_corrida);
    }

    @Override
    public double calcularPagamentoLiquido() {
        return getValorTotalBruto() * percentual_pagamento;
    }
}
