package com.estoque;

import dao.ProdutoDAO;
import model.Produto;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner entrada = new Scanner(System.in);
        ProdutoDAO produtoDao = new ProdutoDAO();

        int opcao;

        do{
            System.out.println("\n===== MENU ESTOQUE =====");
            System.out.println("(1) - inserir produto");
            System.out.println("(2) - atualizar produto");
            System.out.println("(3) - listar todos os produtos");
            System.out.println("(4) - deletar poduto");
            System.out.println("(0) - SAIR");

            System.out.println("Escolha uma opcao: ");
            opcao = entrada.nextInt();
            entrada.nextLine(); //limpeza buffer

            switch (opcao){
                case 1:
                    System.out.println("Informe o nome do produto: ");
                    String nome = entrada.nextLine();

                    System.out.println("Informe o preco do produto: ");
                    double preco = entrada.nextDouble();
                    entrada.nextLine(); //limpeza buffer

                    System.out.println("Informe a categoria do produto: ");
                    String categoria = entrada.nextLine();

                    produtoDao.inserir(nome, preco, categoria);
                    break;

                case 2:
                    System.out.println("Informe o ID do produto que deseja atualizar: ");
                    int id = entrada.nextInt();
                    entrada.nextLine(); //limpeza buffer

                    System.out.println("Informe o novo nome do produto: ");
                    String novoNome = entrada.nextLine();

                    System.out.println("Informe o novo preco do produto: ");
                    double novoPreco = entrada.nextDouble();
                    entrada.nextLine(); //limpeza buffer

                    System.out.println("Informe a nova categoria do produto: ");
                    String novaCategoria = entrada.nextLine();

                    produtoDao.atualizar(id, novoNome, novoPreco, novaCategoria);
                    break;

                case 3:
                    List<Produto> produtos = produtoDao.listarTudo();

                    System.out.println("LISTA DE PRODUTOS CADASTRADOS");
                    for(Produto p : produtos){
                        System.out.print(p.toString());
                        System.out.println("-----------------------------------------------------------");
                    }

                    break;

                case 4:
                    System.out.println("Informe o ID do produto que deseja deletar: ");
                    int idDeletar = entrada.nextInt();
                    entrada.nextLine(); //limpeza buffer 
            
                    produtoDao.deletar(idDeletar);
                    break;

                case 0:
                    opcao = 0;
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("\nOpcao invalida! Tente novamente.");
                    
            }
        } while(opcao != 0);

        entrada.close();

    }
}
