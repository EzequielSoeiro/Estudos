
public class Administrador extends Funcionario implements FuncionarioAutenticavel{

	private util util;
	
	public Administrador() {
		this.util = new util();
	}
	
	@Override
	public double getBonificacao() {
		
		return super.getSalario() * 0.1;
	}

	@Override
	public int getSenha() {		
		return this.util.getSenha();
	}

	@Override
	public void setSenha(int senha) {
		this.util.setSenha(senha);
		;
		
	}

	@Override
	public boolean autentica(int senha) {
		return this.util.autentica(senha);
	}


}
