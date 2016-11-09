package padroesdeprojetos.FactoryMethod;

public class TestaEmissores {

	public static void main(String[] args) {

		Emissor emissor1 = new EmissorSMS();
		emissor1.enviamensagem("K19 treinamentos!");

		Emissor emissor2 = new EmissorEmail();
		emissor2.enviamensagem("K19 treinamentos!");

		Emissor emissor3 = new EmissorJMS();
		emissor3.enviamensagem("K19 treinamentos!");

		/* UTILIZANDO A CLASSE DE CRIAÇÃO DOS EMISSORES */
		System.out.println("\n\nUTILIZANDO A CLASSE DE CRIAÇÃO DOS EMISSORES\n\n ");
		EmissorCreator creator = new EmissorCreator();

		// SMS
		Emissor emissor4 = creator.create(EmissorCreator.SMS);
		emissor4.enviamensagem("K19 Treinamentos");

		// EMAIL
		Emissor emissor5 = creator.create(EmissorCreator.EMAIL);
		emissor5.enviamensagem("K19 Treinamentos");

		// JMS
		Emissor emissor6 = creator.create(EmissorCreator.JMS);
		emissor6.enviamensagem("K19 Treinamentos");
	}

}
