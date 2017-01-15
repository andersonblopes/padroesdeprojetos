package padroesdeprojetos.abstractfactory;

public class ReceptorVisa implements Receptor {

    @Override
    public String recebeMensagem() {
	System.out.println("Recebendo mensagem da VISA.");
	String mensagem = "Mensagem da VISA";
	return mensagem;
    }

}
