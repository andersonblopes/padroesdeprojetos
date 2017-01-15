package padroesdeprojetos.abstractfactory;

public class EmissorMastercard implements Emissor {

    @Override
    public void enviaMensagem(String mensagem) {
	System.out.println("Enviando a seguinte mensagem para a MASTERCARD: ");
	System.out.println(mensagem);
    }

}
