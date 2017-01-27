package padroesdeprojetos.objectpool;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioPool implements Pool<Funcionario> {

    private List<Funcionario> funcionarios;

    public FuncionarioPool() {
	this.funcionarios = new ArrayList<Funcionario>();
	this.funcionarios.add(new Funcionario("Elaine Lopes"));
	this.funcionarios.add(new Funcionario("Helena Lopes"));
	this.funcionarios.add(new Funcionario("Anderson Lopes"));

    }

    @Override
    public Funcionario acquire() {
	if (this.funcionarios.size() > 0) {
	    return this.funcionarios.remove(0);
	}
	return null;
    }

    @Override
    public void release(Funcionario funcionario) {
	this.funcionarios.add(funcionario);

    }

}
