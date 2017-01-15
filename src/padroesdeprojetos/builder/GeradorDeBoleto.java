package padroesdeprojetos.builder;

import java.util.Calendar;

public class GeradorDeBoleto {

    private BoletoBuilder boletoBuilder;

    public GeradorDeBoleto(BoletoBuilder boletoBuilder) {
	this.boletoBuilder = boletoBuilder;
    }

    public Boleto geraBoleto() {
	this.boletoBuilder.buildSacado("Anderson Lopes");
	this.boletoBuilder.buildCedente("Boa Vista Tecnologia");
	this.boletoBuilder.buildValor(600.00);
	Calendar vencimento = Calendar.getInstance();
	vencimento.add(Calendar.DATE, 30);
	this.boletoBuilder.buildVencimento(vencimento);
	this.boletoBuilder.buildNossoNumero(123456);
	Boleto boleto = boletoBuilder.getBoleto();
	return boleto;
    }

}
