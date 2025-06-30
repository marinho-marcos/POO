package dao;

import model.Aluno;
import util.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;

public class AlunoDAO {

    public void inserir(String nome, String sobrenome, int idade){
        String sql = "INSERT INTO aluno (nome, sobrenome, idade) VALUES (?, ?, ?)";

        try(
            Connection conexao = ConexaoBD.conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql);
        ){
            stmt.setString(1, nome);
            stmt.setString(2, sobrenome);
            stmt.setInt(3, idade);

            int linhasAfetadas = stmt.executeUpdate();
            System.out.println("Aluno adicionado com sucesso!");
            
        } catch (Exception e){
            System.out.println("Erro ao adicionar: " + e.getMessage());
        }
    }

    public List<Aluno> listarTudo(){
        List<Aluno> alunos = new ArrayList<>();
        String sql = "SELECT * FROM aluno";

        try(
            Connection conexao = ConexaoBD.conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet resultado = stmt.executeQuery();
        ){
            while(resultado.next()){
                int id = resultado.getInt("id_aluno");
                String nome = resultado.getString("nome");
                String sobrenome = resultado.getString("sobrenome");
                int idade = resultado.getInt("idade");

                alunos.add(new Aluno(id, nome, sobrenome, idade));
            }
        } catch(Exception e){
            System.out.println("Erro ao buscar os alunos: " + e.getMessage());
        }

        return alunos;
    }

    public void buscarPorId(int id){
        String sql = "SELECT * FROM aluno WHERE id_aluno = ?";

        try(
            Connection conexao = ConexaoBD.conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql);
        ){
            stmt.setInt(1, id);
            ResultSet resultado = stmt.executeQuery();

            if(resultado.next()){
                String nome = resultado.getString("nome");
                String sobrenome = resultado.getString("sobrenome");
                int idade = resultado.getInt("idade");

                System.out.println("ALUNO BUSCADO:");
                System.out.println("----------------------------------------------------");
                System.out.printf("ID: %d | Nome: %s | Sobrenome: %s | Idade: %d%n", id, nome, sobrenome, idade);
            } else {
                System.out.println("Nao foi encontrado aluno com o ID " + id);
            }
        } catch(Exception e){
            System.out.println("Erro ao buscar aluno: " + e.getMessage());
        }
    }

    public void atualizar(int id, String novoNome, String novoSobrenome, int novaIdade){
        String sql = "UPDATE aluno SET nome = ?, sobrenome = ?, idade = ? WHERE id_aluno = ?";

        try(
            Connection conexao = ConexaoBD.conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql);
        ){
            stmt.setString(1, novoNome);
            stmt.setString(2, novoSobrenome);
            stmt.setInt(3, novaIdade);
            stmt.setInt(4, id);

            int linhasAfetadas = stmt.executeUpdate();

            if(linhasAfetadas != 0){
                System.out.println("Aluno atualizado com sucesso!");
            } else {
                System.out.println("Nao foi encontrado aluno com o ID " + id); 
            }
        } catch(Exception e){
            System.out.println("Erro ao atualizar aluno: " + e.getMessage());
        }
    }

    public void deletar(int id){
        String sql = "DELETE FROM aluno WHERE id_aluno = ?";

        try(
            Connection conexao = ConexaoBD.conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql);
        ){
            stmt.setInt(1, id);
            int linhasAfetadas = stmt.executeUpdate();

            if(linhasAfetadas != 0){
                System.out.println("Aluno deletado com sucesso!");
            } else {
                System.out.println("Nao foi encontrado aluno com o ID " + id);
            }
        } catch(Exception e){
            System.out.println("Erro ao deletar aluno: " + e.getMessage());
        }
    }

    
}