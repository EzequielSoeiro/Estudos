
public class TestaSistemaInterno {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setSenha(222222);
		
		
		SistemaInterno sistema = new SistemaInterno();
		sistema.autentica(gerente);
	}
}
