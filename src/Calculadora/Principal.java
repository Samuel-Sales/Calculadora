package Calculadora;

public class Principal {

	public static void main(String[] args) {
		Secundaria teste = new Secundaria();
		
		while (true) {
			teste.menu();
			teste.menu2();
			teste.resultado();
			
			if (teste.escolha == 0) {
				System.out.println("Encerrando o programa....");
				break;
			}else {
				continue;
			}
		}
	}
}
