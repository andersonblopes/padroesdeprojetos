package padroesdeprojetos.multiton;

public class TestaTema {

    public void multiton() {
	System.out.println("\n=== PADRÃO MULTITON ===");
	Tema temaFire = Tema.getInstance(Tema.FIRE);
	System.out.println("Tema: " + temaFire.getNome());
	System.out.println("Cor da fonte: " + temaFire.getCorDaFonte());
	System.out.println("Cor do fundo: " + temaFire.getCorDoFundo());

	Tema temaFire2 = Tema.getInstance(Tema.FIRE);

	System.out.println("--------------");
	System.out.println("COMPARANDO AS REFERENCIAS...");
	System.out.println(temaFire == temaFire2);

    }

}
