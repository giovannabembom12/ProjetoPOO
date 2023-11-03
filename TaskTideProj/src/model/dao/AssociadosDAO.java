package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.vo.AssociadosVO;
import view.Associados;
	public class AssociadosDAO {
	 private static final String URL = "jdbc:mysql://localhost/tasktide";
	 private static final String USUARIO = "root";
	 private static final String SENHA = "250207gioVanna";
	 public List<Associados> buscarTodos() {
	 List<Associados> associados = new ArrayList<>();
	 try (Connection conexão = DriverManager.getConnection(URL, USUARIO, SENHA)) {
	 String sql = "SELECT id, nome, segmento, contato FROM tbassociado";
	 Statement statement = conexão.createStatement();
	 ResultSet resultSet = statement.executeQuery(sql);
	 while (resultSet.next()) {
	 int id = resultSet.getInt("id");
	 String nome = resultSet.getString("nome");
	 String segmento = resultSet.getString("segmento");
	 String contato = resultSet.getString("contato");
	 Associados associado = new Associados(id, nome, segmento, contato);
	 associado.add(associado);
	 }
	 } catch (SQLException e) {
	 e.printStackTrace();
	 }
	 return associados;
	 }
	 public List<Associados> buscarPorNome(String nomeParaBuscar) {
	 List<Associados> associados = new ArrayList<>();
	 try (Connection conexão = DriverManager.getConnection(URL, USUARIO, SENHA)) {
	 String sql = "SELECT id, nome, segmento, contato FROM tbassociado WHERE nome LIKE ?";
	 PreparedStatement preparedStatement = conexão.prepareStatement(sql);
	 preparedStatement.setString(1, "%" + nomeParaBuscar + "%");
	 ResultSet resultSet = preparedStatement.executeQuery();
	 while (resultSet.next()) {
	 int id = resultSet.getInt("id");
	 String nome = resultSet.getString("nome");
	 String segmento = resultSet.getString("segmento");
	 String contato = resultSet.getString("contato");
	 Associados associado = new Associados(id, nome, segmento, contato);
	 associados.add(associado);
	 }
	 } catch (SQLException e) {
	 e.printStackTrace();
	 }
	 return associados;
	 } 
	}
