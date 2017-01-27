package padroesdeprojetos.objectpool;

public class TestaFuncionarioPool {

    public void objectPool() {
	System.out.println("\n=== PADRÃO OBJECTPOOL ===");
	Pool<Funcionario> funcionarioPool = new FuncionarioPool();
	Funcionario funcionario = funcionarioPool.acquire();
	while (funcionario != null) {
	    System.out.println(funcionario.getNome());
	    funcionario = funcionarioPool.acquire();
	}
    }

}
