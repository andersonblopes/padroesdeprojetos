package padroesdeprojetos.builder;

public class TestaGeradorDeBoleto {

    public void builder() {
	System.out.println("\n=== PADRÃO BUILDER ===");

	BoletoBuilder boletoBuilder = new BBBoletoBuilder();
	GeradorDeBoleto geradorDeBoleto = new GeradorDeBoleto(boletoBuilder);
	Boleto boleto = geradorDeBoleto.geraBoleto();
	System.out.println(boleto);
    }

}
