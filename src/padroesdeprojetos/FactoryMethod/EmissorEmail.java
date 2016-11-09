package padroesdeprojetos.FactoryMethod;

public class EmissorEmail implements Emissor {

	@Override
	public void enviamensagem(String mensagem) {
		System.out.println("Enviando por email a mensagem: ");
		System.out.println(mensagem);
	}

}
