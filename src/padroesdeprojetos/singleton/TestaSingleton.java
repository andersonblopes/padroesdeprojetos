package padroesdeprojetos.singleton;

public class TestaSingleton {

    public void singleton() {
	System.out.println("\n=== PADRÃO SINGLETON ===");
	Configuracao configuracao = Configuracao.getInstance();
	System.out.println(configuracao.getPropriedades("time-zone"));
	System.out.println(configuracao.getPropriedades("currency-code"));
    }

}
