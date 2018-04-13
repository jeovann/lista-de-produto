package modelo;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class MenuProdutos {
	static Integer valorMenu = 0;
	static Scanner entrada = new Scanner(System.in);
	static List<Produto> produto = new ArrayList<Produto>();

	public static void main(String[] args) {
		while (valorMenu !=6) {
			if (valorMenu == 1) {
				informarValores();
				InformeProduto();
				chamarMenu();
			} 
			
			 else if (valorMenu == 5) {
				System.err.println(produtos.getResultados());
				chamarMenu();
			} else if (valorMenu == 6) {
				System.exit(0);
			} else {
				chamarMenu();
			}
		}
	}

	private static void InformeProduto() {
		// TODO Auto-generated method stub
		
	}

	private static void informarValores() {
//		System.err.println("Informe o nome do produto");
//		String nome = entrada.nextLine();
//		System.err.println("Informe o valor do produto");
//		Float valor = entrada.nextFloat();
//		System.err.println("Informe a quantidade do produto");
//		Integer quantidade = entrada.nextInt();
//		
//		produtos.setNome(nome);
//		produtos.setQuantidade(quantidade);
//		produtos.setValor(valor);

		System.err.println("Informe o nome do produto:");
		produtos.setNome(entrada.nextLine());
		System.err.println("Informe o valor do produto:");
		Float valor = entrada.nextFloat();
		System.err.println("Informe a quantidade do produto:");
		Integer quantidade = entrada.nextInt();
		
		
		produtos.setQuantidade(quantidade);
		produtos.setValor(valor);
	
	}

	private static void chamarMenu() {
		System.err.println("#########################");
		System.err.println("MENU");
		System.err.println("1:PRODUTO");
		System.err.println("5:IMPRIMIR");
		System.err.println("6:SAIR");
		try {
			valorMenu = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do Menu"));
		} catch (java.lang.NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Informe um valor válido!");
			chamarMenu();
		}
	}
}
