package padroesdeprojetos;

import padroesdeprojetos.FactoryMethod.TestaEmissores;
import padroesdeprojetos.abstractfactory.TestaVisaComunicadorFactory;
import padroesdeprojetos.builder.TestaGeradorDeBoleto;
import padroesdeprojetos.multiton.TestaTema;
import padroesdeprojetos.objectpool.TestaFuncionarioPool;
import padroesdeprojetos.prototype.TestaPrototype;
import padroesdeprojetos.singleton.TestaSingleton;

public class TestaPadroes {

    private static TestaEmissores testaEmissores;
    private static TestaVisaComunicadorFactory testaVisaComunicadorFactory;
    private static TestaGeradorDeBoleto testaGeradorDeBoleto;
    private static TestaPrototype testaPrototype;
    private static TestaSingleton testaSingleton;
    private static TestaTema testaMultiton;
    private static TestaFuncionarioPool testaObjectPool;

    public static void main(String[] args) {
	iniciaTestes();
	testaEmissores.testeFactoryMethod();
	testaVisaComunicadorFactory.abstractFactory();
	testaGeradorDeBoleto.builder();
	testaPrototype.prototype();
	testaSingleton.singleton();
	testaMultiton.multiton();
	testaObjectPool.objectPool();
    }

    private static void iniciaTestes() {
	testaEmissores = new TestaEmissores();
	testaGeradorDeBoleto = new TestaGeradorDeBoleto();
	testaVisaComunicadorFactory = new TestaVisaComunicadorFactory();
	testaPrototype = new TestaPrototype();
	testaSingleton = new TestaSingleton();
	testaMultiton = new TestaTema();
	testaObjectPool = new TestaFuncionarioPool();
    }

}
