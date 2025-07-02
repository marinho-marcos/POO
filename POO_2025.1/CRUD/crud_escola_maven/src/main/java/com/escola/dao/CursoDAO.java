package dao;

import model.Curso;
import util.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;

public class CursoDAO {

    public void inserir(String nome){
        String sql = "INSERT INTO curso (nome) VALUES (?)";

        try(
            Connection conexao = ConexaoBD.conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql);
        ){
            stmt.setString(1, nome);

            int linhasAfetadas = stmt.executeUpdate();
            System.out.println("Curso adicionado com sucesso!");
            
        } catch (Exception e){
            System.out.println("Erro ao adicionar: " + e.getMessage());
        }
    }

    public List<Curso> listarTudo(){
        List<Curso> cursos = new ArrayList<>();
        String sql = "SELECT * FROM curso";

        try(
            Connection conexao = ConexaoBD.conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet resultado = stmt.executeQuery();
        ){

            while(resultado.next()){
                int id = resultado.getInt("id_curso");
                String nome = resultado.getString("nome");

                cursos.add(new Curso(id, nome));

            }
            
        } catch(Exception e){
            System.out.println("Erro ao buscar os cursos: " + e.getMessage());
        }

        return cursos;
    }

    public void buscarPorId(int id){
        String sql = "SELECT * FROM curso WHERE id_aluno = ?";

        try(
            Connection conexao = ConexaoBD.conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql);
        ){
            stmt.setInt(1, id);
            ResultSet resultado = stmt.executeQuery();

            if(resultado.next()){
                String nome = resultado.getString("nome");

                System.out.println("CURSO BUSCADO:");
                System.out.println("----------------------------------------------------");
                System.out.printf("ID: %d | Nome: %sn", id, nome);
            } else {
                System.out.println("Nao foi encontrado curso com o ID " + id);
            }
        } catch(Exception e){
            System.out.println("Erro ao buscar curso: " + e.getMessage());
        }
    }

    public void atualizar(int id, String novoNome){
        String sql = "UPDATE curso SET nome = ? WHERE id_curso = ?";

        try(
            Connection conexao = ConexaoBD.conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql);
        ){
            stmt.setString(1, novoNome);
            stmt.setInt(2, id);

            int linhasAfetadas = stmt.executeUpdate();

            if(linhasAfetadas != 0){
                System.out.println("Curso atualizado com sucesso!");
            } else {
                System.out.println("Nao foi encontrado curso com o ID " + id); 
            }
        } catch(Exception e){
            System.out.println("Erro ao atualizar curso: " + e.getMessage());
        }
    }

    public void deletar(int id){
        String sql = "DELETE FROM curso WHERE id_curso = ?";

        try(
            Connection conexao = ConexaoBD.conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql);
        ){
            stmt.setInt(1, id);
            int linhasAfetadas = stmt.executeUpdate();

            if(linhasAfetadas != 0){
                System.out.println("curso deletado com sucesso!");
            } else {
                System.out.println("Nao foi encontrado curso com o ID " + id);
            }
        } catch(Exception e){
            System.out.println("Erro ao deletar curso: " + e.getMessage());
        }
    }
}
