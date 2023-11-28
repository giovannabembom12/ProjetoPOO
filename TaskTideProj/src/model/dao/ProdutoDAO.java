package model.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.vo.AluguelServicosVO;
import model.vo.ProdutoVO;
import model.dao.Conexao;
import javax.swing.JOptionPane;
import view.CadastroProdutoServico;
public class ProdutoDAO {
	private Connection conexao;
	public ProdutoDAO() {
		this.conexao = conexao;
	}
	// Inserir um novo serviço no banco de dados
	public void inserirProduto(ProdutoVO produto) throws SQLException {
		String sql = "INSERT INTO tbProduto (codigo, nome, fornecedor, categoria, valorUnit) VALUES (?, ?, ?, ?, ?)";
		try (PreparedStatement ps = conexao.prepareStatement(sql)) {
			ps.setInt(1, produto.getCodigo());
			ps.setString(2, produto.getNome());
			ps.setString(3, produto.getFornecedor());
			ps.setString(4, produto.getCategoria());
			ps.setDouble(5, produto.getValorUnit());
			ps.executeUpdate();
		}
	}
}
