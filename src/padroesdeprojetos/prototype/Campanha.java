package padroesdeprojetos.prototype;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

public class Campanha implements Prototype<Campanha> {

    private String nome;
    private Calendar vencimento;
    private Set<String> palavrasChave;

    public Campanha(String nome, Calendar vencimento, Set<String> palavrasChave) {
	this.nome = nome;
	this.vencimento = vencimento;
	this.palavrasChave = palavrasChave;
    }

    public String getNome() {
	return nome;
    }

    public Calendar getVencimento() {
	return vencimento;
    }

    public Set<String> getPalavrasChave() {
	return palavrasChave;
    }

    @Override
    public Campanha clone() {
	String nome = "Cópia da campanha: " + this.nome;
	Calendar vencimento = (Calendar) this.vencimento.clone();
	Set<String> palavrasChave = new HashSet<String>(this.palavrasChave);
	Campanha campanha = new Campanha(nome, vencimento, palavrasChave);
	return campanha;
    }

    @Override
    public String toString() {
	StringBuffer buffer = new StringBuffer();
	buffer.append("--------------");
	buffer.append("\n");
	buffer.append("Nome da Campanha: ");
	buffer.append(this.nome);
	buffer.append("\n");

	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
	String format = simpleDateFormat.format(this.vencimento.getTime());
	buffer.append("Vencimento: " + format);
	buffer.append("\n");

	buffer.append("Palavras-chave: \n");
	for (String palavraChaves : this.palavrasChave) {
	    buffer.append(" - " + palavraChaves);
	    buffer.append("\n");
	}

	buffer.append("--------------");
	buffer.append("\n");

	return buffer.toString();
    }

}
