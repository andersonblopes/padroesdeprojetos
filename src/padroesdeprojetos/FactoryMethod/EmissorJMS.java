package padroesdeprojetos.FactoryMethod;

public class EmissorJMS implements Emissor {

	@Override
	public void enviamensagem(String mensagem) {
		System.out.println("Enviando por JMS a mensagem: ");
		System.out.println(mensagem);
	}

}
