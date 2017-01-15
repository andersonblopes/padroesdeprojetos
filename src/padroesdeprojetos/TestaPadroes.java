package padroesdeprojetos;

import padroesdeprojetos.FactoryMethod.TestaEmissores;
import padroesdeprojetos.abstractfactory.TestaVisaComunicadorFactory;
import padroesdeprojetos.builder.TestaGeradorDeBoleto;

public class TestaPadroes {

    private static TestaEmissores testaEmissores;
    private static TestaVisaComunicadorFactory testaVisaComunicadorFactory;
    private static TestaGeradorDeBoleto testaGeradorDeBoleto;

    public static void main(String[] args) {
	iniciaTestes();
	testaEmissores.testeFactoryMethod();
	testaVisaComunicadorFactory.abstractFactory();
	testaGeradorDeBoleto.builder();
    }

    private static void iniciaTestes() {
	testaEmissores = new TestaEmissores();
	testaGeradorDeBoleto = new TestaGeradorDeBoleto();
	testaVisaComunicadorFactory = new TestaVisaComunicadorFactory();
    }

}
