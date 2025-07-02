package dao;

import model.Produto;
import util.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;

public class ProdutoDAO {
    public void inserir(String nome, double preco, String categoria) {
        String sql = "INSERT INTO produto (nome, preco, categoria) VALUES (?, ?, ?)";

        try(
            Connection conexao = ConexaoBD.conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql);
        ){
            stmt.setString(1, nome);
            stmt.setDouble(2, preco);
            stmt.setString(3, categoria);

            int linhasAfetadas = stmt.executeUpdate();

            System.out.println("Produto adicionado com sucesso!\n");
        } catch(Exception e){
            System.out.println("Erro ao adicionar produto: " + e.getMessage());
        }
    }

    public List<Produto> listarTudo(){
        List<Produto> produtos = new ArrayList<>();
        String sql = "SELECT * FROM produto";

        try(
            Connection conexao = ConexaoBD.conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet resultado = stmt.executeQuery();
        ){
            while(resultado.next()){
                int id = resultado.getInt("id_produto");
                String nome = resultado.getString("nome");
                double preco = resultado.getDouble("preco");
                String categoria = resultado.getString("categoria");

                produtos.add(new Produto(id, nome, preco, categoria));
            }
        } catch(Exception e){
            System.out.println("\nErro ao listar produtos: " + e.getMessage());
        }

        return produtos;
    }

    public void atualizar(int id, String novoNome, double novoPreco, String novaCategoria){
        String sql = "UPDATE produto SET nome = ?, preco = ?, categoria = ? WHERE id_produto = ?";

        try(
            Connection conexao = ConexaoBD.conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql);
        ){
            stmt.setString(1, novoNome);
            stmt.setDouble(2, novoPreco);
            stmt.setString(3, novaCategoria);
            stmt.setInt(4, id);

            int linhasAfetadas = stmt.executeUpdate();

            if(linhasAfetadas != 0){
                System.out.println("Produto atualizado com sucesso!\n");
            } else {
                System.out.println("Produto com o ID " + id + " nao foi encontrado.\n");
            }
        } catch(Exception e){
            System.out.println("Erro ao atualizar produto: " + e.getMessage());
        }
    }

    public void deletar(int id){
        String sql = "DELETE FROM produto WHERE id_produto = ?";

        try(
            Connection conexao = ConexaoBD.conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql);
        ){
            stmt.setInt(1, id);

            int linhasAfetadas = stmt.executeUpdate();

            if(linhasAfetadas != 0){
                System.out.println("Produto removido com sucesso!\n");
            } else {
                System.out.println("Produto do ID " + id + " nao foi encontrado.");
            }
        } catch(Exception e){
            System.out.println("Erro ao remover produto: " + e.getMessage());
        }
    }
}