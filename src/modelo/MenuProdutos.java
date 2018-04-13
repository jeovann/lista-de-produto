package modelo;

import java.util.ArrayList;
import java.util.List;	
import java.util.Scanner;

public class MenuProdutos {
	static Integer valorMenu = 0;
	static Scanner entrada = new Scanner(System.in);
	static List<Produto> produtos = new ArrayList<>();

	public static void main(String[] args) {
		while (valorMenu !=3) {
			if (valorMenu == 1) {
				informarValor();
				chamarMenu();
			}else if(valorMenu==2) {
				imprimir();
				chamarMenu();
			}else if (valorMenu==3) {
				System.exit(0);
			} else {
				chamarMenu();
			}
		}
	}
			private static void imprimir() {
				for (Produto produto : produtos) {
					System.err.println(produto);
					
		}
	}

			private static void informarValor() {
				System.err.println("Nome do Produto");
				String nome = entrada.next();
				System.err.println("Quantidade de Produto");
				Integer quantidade = entrada.nextInt();
				System.err.println("Valor do Produto");
				Float valor = entrada.nextFloat();
				
				Produto novoProduto = new Produto(nome, quantidade, valor);
				produtos.add(novoProduto);
				
			}		
			
			private static void chamarMenu() {
				System.err.println("\n++++++++++++++++++++");
				System.err.println("MENU");
				System.err.println("1:CADASTRAR PRODUTO");
				System.err.println("2:IMPRIMIR");
				System.err.println("3:SAIR");
				
				valorMenu = entrada.nextInt();
			
			}
		}