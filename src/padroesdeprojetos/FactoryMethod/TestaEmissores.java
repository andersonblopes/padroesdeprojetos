package padroesdeprojetos.FactoryMethod;

public class TestaEmissores {

    public void testeFactoryMethod() {
	System.out.println("\n=== PADRÃO FACTORY METHOD ===");

	Emissor emissor1 = new EmissorSMS();
	emissor1.enviaMensagem("K19 treinamentos!");

	Emissor emissor2 = new EmissorEmail();
	emissor2.enviaMensagem("K19 treinamentos!");

	Emissor emissor3 = new EmissorJMS();
	emissor3.enviaMensagem("K19 treinamentos!");

	/* UTILIZANDO A CLASSE DE CRIAÇÃO DOS EMISSORES */
	System.out.println("\nUTILIZANDO A CLASSE DE CRIAÇÃO DE EMISSORES\n");
	EmissorCreator creator = new EmissorCreator();

	// SMS
	Emissor emissor4 = creator.create(EmissorCreator.SMS);
	emissor4.enviaMensagem("K19 Treinamentos");

	// EMAIL
	Emissor emissor5 = creator.create(EmissorCreator.EMAIL);
	emissor5.enviaMensagem("K19 Treinamentos");

	// JMS
	Emissor emissor6 = creator.create(EmissorCreator.JMS);
	emissor6.enviaMensagem("K19 Treinamentos");
    }

}
