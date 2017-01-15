package padroesdeprojetos.prototype;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

public class TestaPrototype {

    public void prototype() {
	System.out.println("\n=== PADRÃO PROTOTYPE ===");
	String nome = "K19";

	Calendar vencimento = Calendar.getInstance();
	vencimento.add(Calendar.DATE, 30);
	Set<String> hashSet = new HashSet<String>();

	hashSet.add("Curso: ");
	hashSet.add("Java ");
	hashSet.add("K19");

	Campanha campanha = new Campanha(nome, vencimento, hashSet);
	System.out.println(campanha);

	Campanha clone = campanha.clone();
	System.out.println(clone);

    }

}
