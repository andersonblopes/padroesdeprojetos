package padroesdeprojetos.FactoryMethod;

public class EmissorSMS implements Emissor {

	@Override
	public void enviamensagem(String mensagem) {
		System.out.println("Enviando por SMS a mensagem: ");
		System.out.println(mensagem);
	}

}
