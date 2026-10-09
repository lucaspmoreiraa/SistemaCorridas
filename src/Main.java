
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        MotoristaIniciante motoristaIniciante =
                new MotoristaIniciante("Iniciante", "ABC-1234");

        MotoristaPremium motoristaPremium =
                new MotoristaPremium("Premium", "DEF-5678");

        MotoristaParceiroFrotista motoristaFrotista =
                new MotoristaParceiroFrotista("Parceiro Frotista", "GHI-9012");

        motoristaIniciante.registrarCorrida(100.00);
        motoristaIniciante.registrarCorrida(80.00);
        motoristaIniciante.registrarCorrida(120.00);
        motoristaIniciante.registrarCorrida(90.00);

        motoristaPremium.registrarCorrida(100.00);
        motoristaPremium.registrarCorrida(150.00);
        motoristaPremium.registrarCorrida(80.00);

        motoristaFrotista.registrarCorrida(300.00);
        motoristaFrotista.registrarCorrida(300.00);
        motoristaFrotista.registrarCorrida(300.00);
        motoristaFrotista.registrarCorrida(300.00);

        imprimirExtrato(motoristaIniciante);
        imprimirExtrato(motoristaPremium);
        imprimirExtrato(motoristaFrotista);
    }

    public static void imprimirExtrato(Motorista motorista) {

        System.out.println("\n========================================");
        System.out.println("          HOLERITE DO MOTORISTA");
        System.out.println("========================================");

        System.out.println("Nome: " + motorista.getNome());
        System.out.println("Placa do veículo: " + motorista.getPlacaVeiculo());
        System.out.println("Quantidade de corridas: "
                + motorista.getQuantidadeCorridas());

        System.out.printf(
                Locale.forLanguageTag("pt-BR"),
                "Valor bruto arrecadado: R$ %.2f%n",
                motorista.getValorTotalBruto()
        );

        System.out.printf(
                Locale.forLanguageTag("pt-BR"),
                "Valor líquido a receber: R$ %.2f%n",
                motorista.calcularPagamentoLiquido()
        );

        System.out.println("========================================");
    }
}
