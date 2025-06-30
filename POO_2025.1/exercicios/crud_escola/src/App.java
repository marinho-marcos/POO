import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import dao.AlunoDAO;
import dao.CursoDAO;
import model.Curso;
import model.Aluno;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        AlunoDAO alunoDao = new AlunoDAO();

        //aluno.inserir("maria", "silva", 28);

        List<Aluno> alunos = alunoDao.listarTudo();

        System.out.println("LISTA DE ALUNOS CADASTRADOS");
        for(Aluno a : alunos){
            System.out.print(a.toString());
            System.out.println("-----------------------------------------------------------");
        }

        //aluno.atualizar(2, "Jose", "Oliveira", 29);

        /* 
        System.out.println("Informe o ID do aluno que deseja deletar: ");
        int idDeletar = entrada.nextInt();
        entrada.nextLine(); //limpeza buffer 

        aluno.deletar(idDeletar);
        */

        //BUSCAR POR ID
        /* 
        System.out.println("Informe o ID do aluno que deseja buscar: ");
        int idBuscar = entrada.nextInt();
        entrada.nextLine(); //limpeza buffer

        aluno.buscarPorId(idBuscar);
        */




        //CRUD CURSO
        CursoDAO curso = new CursoDAO();

        //curso.inserir("Gestao comercial");

        //curso.atualizar(2, "Ciencias da computaria");

        //curso.deletar(3);

        List<Curso> cursos = curso.listarTudo();

        System.out.println("LISTA DE CURSOS CADASTRADOS");
        for(Curso c : cursos){
            System.out.print(c.toString());
            System.out.println("--------------------------------------------");
        }

    }
}
