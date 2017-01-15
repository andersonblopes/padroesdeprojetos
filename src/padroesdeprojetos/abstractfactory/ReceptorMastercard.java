package padroesdeprojetos.abstractfactory;

public class ReceptorMastercard implements Receptor {

    @Override
    public String recebeMensagem() {
	System.out.println("Recebendo mensagem da MASTERCARD.");
	String mensagem = "Mensagem da MASTERCARD";
	return mensagem;
    }

}
