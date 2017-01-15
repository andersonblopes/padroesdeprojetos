package padroesdeprojetos.abstractfactory;

public class TestaVisaComunicadorFactory {

    public void abstractFactory() {
	System.out.println("\n=== PADRÃO ABSTRACT FACTORY ===");
	testaFabricaVisa();
	testaFabricaMastercard();
    }

    public void testaFabricaVisa() {
	System.out.println("FÁBRICA VISA");
	ComunicadorFactory comunicadorFactory = new VisaComunicadorFactory();
	String transacao = " Valor =560; Senha =123 ";
	Emissor emissor = comunicadorFactory.createEmissor();
	emissor.enviaMensagem(transacao);
	Receptor receptor = comunicadorFactory.createReceptor();
	String mensagem = receptor.recebeMensagem();
	System.out.println(mensagem);
    }

    public void testaFabricaMastercard() {
	System.out.println("FÁBRICA MASTERCARD");
	ComunicadorFactory comunicadorFactory = new MastercardComunicadorFactory();
	String transacao = " Valor = 1000; Senha = 456 ";
	Emissor emissor = comunicadorFactory.createEmissor();
	emissor.enviaMensagem(transacao);
	Receptor receptor = comunicadorFactory.createReceptor();
	String mensagem = receptor.recebeMensagem();
	System.out.println(mensagem);
    }

}
