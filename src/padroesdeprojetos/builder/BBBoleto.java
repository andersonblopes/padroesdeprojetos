package padroesdeprojetos.builder;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class BBBoleto implements Boleto {

    private String sacado;

    private String cedente;

    private double valor;

    private Calendar vencimento;

    private int nossoNumero;

    public BBBoleto(String sacado, String cedente, double valor, Calendar vencimento, int nossoNumero) {
	this.sacado = sacado;
	this.cedente = cedente;
	this.valor = valor;
	this.vencimento = vencimento;
	this.nossoNumero = nossoNumero;
    }

    @Override
    public String getSacado() {
	return this.sacado;
    }

    @Override
    public String getCedente() {
	return this.cedente;
    }

    @Override
    public double getValor() {
	return this.valor;
    }

    @Override
    public Calendar getVencimento() {
	return this.vencimento;
    }

    @Override
    public int getNossoNumero() {
	return this.nossoNumero;
    }

    @Override
    public String toString() {
	StringBuilder stringBuilder = new StringBuilder();
	stringBuilder.append("Boleto BB");
	stringBuilder.append("\n");

	stringBuilder.append("Sacado: " + this.sacado);
	stringBuilder.append("\n");

	stringBuilder.append("Cedente: " + this.cedente);
	stringBuilder.append("\n");

	stringBuilder.append("Valor: R$ " + String.format("%.2f", this.valor));
	stringBuilder.append("\n");

	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
	String format = simpleDateFormat.format(this.getVencimento().getTime());
	stringBuilder.append("Vencimento: " + format);
	stringBuilder.append("\n");

	stringBuilder.append("Nosso número: " + this.nossoNumero);
	stringBuilder.append("\n");

	return stringBuilder.toString();
    }

}
