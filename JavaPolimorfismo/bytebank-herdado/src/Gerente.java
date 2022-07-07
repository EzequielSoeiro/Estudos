public class Gerente extends Funcionario implements FuncionarioAutenticavel	 {

	private AutenticavelUtil util;
	
	
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
	}

	@Override
	public boolean autentica(int senha) {
		return this.autentica(senha);
	}
	
}