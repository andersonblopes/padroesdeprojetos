package padroesdeprojetos.abstractfactory;

public class TestaVisaComunicadorFactory {

    public void abstractFactory() {
	System.out.println("\n=== PADRÃO ABSTRACT FACTORY ===");

	ComunicadorFactory comunicadorFactory = new VisaComunicadorFactory();

	String transacao = " Valor =560; Senha =123 ";
	Emissor emissor = comunicadorFactory.createEmissor();
	emissor.enviaMensagem(transacao);

	Receptor receptor = comunicadorFactory.createReceptor();
	String mensagem = receptor.recebeMensagem();
	System.out.println(mensagem);

    }

}
