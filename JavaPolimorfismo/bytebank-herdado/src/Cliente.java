
public class Cliente implements FuncionarioAutenticavel{

	private AutenticavelUtil util;
	
	
	public int getSenha() {
		return this.util.getSenha();
	}

	
	public void setSenha(int senha) {
		this.util.setSenha(senha);
	}


	public boolean autentica(int senha) {
		return this.autentica(senha);
	}
	
}
