
public class SistemaInterno {
	
	private int senha = 2222;
	
	
	public void autentica (FuncionarioAutenticavel g) {
		
		boolean igual = g.autentica(this.senha);
		
		if (igual) {
			System.out.println("Seja bem vindo ao sistema!");
		}else {
			System.out.println("Com essa senha você não tem autorização para entrar no sistema interno!");
		}
	}
}
