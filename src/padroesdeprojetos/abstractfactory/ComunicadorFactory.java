package padroesdeprojetos.abstractfactory;

public interface ComunicadorFactory {
    Emissor createEmissor();

    Receptor createReceptor();
}
