package padroesdeprojetos.abstractfactory;

public class EmissorVisa implements Emissor {

    @Override
    public void enviaMensagem(String mensagem) {
	System.out.println("Enviando a seguinte mensagem para a VISA: ");
	System.out.println(mensagem);
    }

}
