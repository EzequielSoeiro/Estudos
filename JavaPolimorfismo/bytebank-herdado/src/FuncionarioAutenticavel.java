
public abstract interface  FuncionarioAutenticavel  {

	public int getSenha();
	
	public abstract  void setSenha(int senha);
	
	public abstract boolean autentica(int senha);

}
