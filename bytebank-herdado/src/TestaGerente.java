
public class TestaGerente {
	
	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Clebson");
		g1.setCpf("063.663.064-19");
		g1.setSalario(5000);
		g1.setSenha(1234);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		
		boolean autentica = g1.autentica(1234);
		
		System.out.println(autentica);
		
		

	}		
		
			

}
