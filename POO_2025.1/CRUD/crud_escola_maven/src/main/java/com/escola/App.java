package com.escola;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import dao.AlunoDAO;
import model.Aluno;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        AlunoDAO alunoDao = new AlunoDAO();

        int opcao;

        do{
            System.out.println("\n===== MENU CRUD =====");
            System.out.println("(1) - inserir aluno");
            System.out.println("(2) - atualizar aluno");
            System.out.println("(3) - listar todos os alunos");
            System.out.println("(4) - buscar aluno por ID");
            System.out.println("(5) - deletar aluno");
            System.out.println("(0) - SAIR");

            System.out.println("Escolha uma opcao: ");
            opcao = entrada.nextInt();
            entrada.nextLine(); //limpeza buffer

            switch (opcao){
                case 1:
                    System.out.println("Informe o nome do aluno: ");
                    String nome = entrada.nextLine();

                    System.out.println("Informe o sobrenome do aluno: ");
                    String sobrenome = entrada.nextLine();

                    System.out.println("Informe a idade do aluno: ");
                    int idade = entrada.nextInt();
                    entrada.nextLine(); //limpeza buffer

                    alunoDao.inserir(nome, sobrenome, idade);
                    break;

                case 2:
                    System.out.println("Informe o ID do aluno que deseja atualizar: ");
                    int id = entrada.nextInt();
                    entrada.nextLine(); //limpeza buffer

                    System.out.println("Informe o novo nome do aluno: ");
                    String novoNome = entrada.nextLine();

                    System.out.println("Informe o novo sobrenome do aluno: ");
                    String novoSobrenome = entrada.nextLine();

                    System.out.println("Informe a nova idade do aluno: ");
                    int novaIdade = entrada.nextInt();

                    alunoDao.atualizar(id, novoNome, novoSobrenome, novaIdade);
                    break;

                case 3:
                    List<Aluno> alunos = alunoDao.listarTudo();

                    System.out.println("LISTA DE ALUNOS CADASTRADOS");
                    for(Aluno a : alunos){
                        System.out.print(a.toString());
                        System.out.println("-----------------------------------------------------------");
                    }

                    break;

                case 4:
                    System.out.println("Informe o ID do aluno que deseja buscar: ");
                    int idBuscar = entrada.nextInt();
                    entrada.nextLine(); //limpeza buffer
            
                    alunoDao.buscarPorId(idBuscar);
                    break;

                case 5:
                    System.out.println("Informe o ID do aluno que deseja deletar: ");
                    int idDeletar = entrada.nextInt();
                    entrada.nextLine(); //limpeza buffer 
            
                    alunoDao.deletar(idDeletar);
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
