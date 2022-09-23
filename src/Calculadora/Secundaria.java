package Calculadora;
import java.util.Scanner;
public class Secundaria {
	double num1, num2, total = 0;
	public int escolha;
	Scanner entrada = new Scanner(System.in);
	
	public void menu() {
		System.out.println("---------------------------------");
		System.out.println("\tBem vindo");
		System.out.println("---------------------------------");
		System.out.println("1 - Soma\n"+ "2 - Subtração\n"+ "3 - Multiplicação\n"+ "4 - Divisão\n"+ "5 - Número elevado ao quadrado");
		System.out.print("Qual operação você deseja: ");
		escolha = entrada.nextInt();
	}
	
	public void menu2() {
		switch(escolha) {
		case 1:
			System.out.print("Informe o primeiro número: ");
			num1 = entrada.nextDouble();
			System.out.print("Informe o segundo número: ");
			num2 = entrada.nextDouble();
			total = num1 += num2;
		break;
		case 2:
			System.out.print("Informe o primeiro número: ");
			num1 = entrada.nextDouble();
			System.out.print("Informe o segundo número: ");
			num2 = entrada.nextDouble();
			total = num1 -= num2;
		break;
		case 3:
			System.out.print("Informe o primeiro número: ");
			num1 = entrada.nextDouble();
			System.out.print("Informe o segundo número: ");
			num2 = entrada.nextDouble();
			total = num1 *= num2;
		break;
		case 4:
			System.out.print("Informe o primeiro número: ");
			num1 = entrada.nextDouble();
			System.out.print("Informe o segundo número: ");
			num2 = entrada.nextDouble();
			total = num1 /= num2;
		break;
		case 5:
			System.out.print("Informe o número: ");
			num1 = entrada.nextDouble();
			total = (num1 * num1);
		break;
		default:
			System.out.println("Comando inválido!!");
		}
	}
	
	public void resultado() {
		System.out.printf("O total é: %.2f %n ", total);
		System.out.println("Deseja encerrar o programa? 0 - Sim / 1 - Não");
		escolha = entrada.nextInt();
	}
}
