package model.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.vo.AluguelServicosVO;
import model.dao.Conexao;
import javax.swing.JOptionPane;

import view.AluguelServico;
public class AluguelServicosDAO {
	private Connection conexao;
	public AluguelServicosDAO() {
		this.conexao = conexao;
	}
	// Inserir um novo serviço no banco de dados
	public void inserirServico(AluguelServicosVO servico) throws SQLException {
		String sql = "INSERT INTO tbaluguelservicos (codigo, nome, quantidade, valorUnit) VALUES (?, ?, ?, ?)";
		try (PreparedStatement ps = conexao.prepareStatement(sql)) {
			ps.setInt(1, servico.getCodigo());
			ps.setString(2, servico.getNome());
			ps.setInt(3, servico.getQuantidade());
			ps.setFloat(4, servico.getValorUnit());
			ps.executeUpdate();
		}
	}
	// Atualizar um serviço no banco de dados
	public void atualizarServico(AluguelServicosVO servico) throws SQLException {
		String sql = "UPDATE servicos SET nome = ?, quantidade = ?, valorUnit = ? WHERE codigo = ?";
		try (PreparedStatement ps = conexao.prepareStatement(sql)) {
			ps.setString(1, servico.getNome());
			ps.setInt(2, servico.getQuantidade());
			ps.setDouble(3, servico.getValorUnit());
			ps.setInt(4, servico.getCodigo());
			ps.executeUpdate();
		}
	}
	// Consultar um serviço pelo código
	public AluguelServico consultarServicoPorCodigo(int codigo) throws SQLException {
		String sql = "SELECT codigo, nome, quantidade, valorUnit FROM servicos WHERE codigo = ?";
		try (PreparedStatement ps = conexao.prepareStatement(sql)) {
			ps.setInt(1, codigo);
			try (ResultSet rs = ps.executeQuery()) {
				if (rs.next()) {
					String nome = rs.getString("nome");
					float valorUnitario = rs.getFloat("valorUnit");
					int quantidade = rs.getInt("quantidade");
					return new AluguelServico();
				}
			}
		}
		return null; // Retorna null se o serviço não for encontrado
	}
	// Consultar todos os serviços
	public List<AluguelServico> consultarTodosServicos() throws SQLException {
		List<AluguelServico> servicos = new ArrayList<>();
		String sql = "SELECT codigo, nome, quantidade, valor_unitario FROM tbaluguelservicos";
		try (PreparedStatement ps = conexao.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
			while (rs.next()) {
				int codigo = rs.getInt("codigo");
				String nome = rs.getString("nome");
				int quantidade = rs.getInt("quantidade");
				float valorUnitario = rs.getFloat("valorUnit");
				servicos.add(new AluguelServico());
			}
		}
		return servicos;
	}
	// metodo das vendas listar
	public List<AluguelServico> listaAluguelServicos(int venda_id) {
		try {
			// 1- criar a lista
			List<AluguelServico> lista = new ArrayList<>();
			// 2- Criar o comando mysql, organizar e executar
			String sql = "select i.id, p.descricao, i.qtd, p.preco, i.subtotal from tb_itensvendas as i "
					+ " inner join tb_produtos as p on (i.produto_id = p.id) where i.venda_id = ?";
			PreparedStatement ps = conexao.prepareStatement(sql);
			int codigo = '?';
			ps.setInt(1, codigo);
			ResultSet rs = ps.executeQuery();// sempre criar esse objeto e ele reccebe essa execução (sql)
			while (rs.next()) {
				AluguelServicosVO item = new AluguelServicosVO();
				AluguelServico servicos = new AluguelServico();
				item.setCodigo(rs.getInt("codigo"));
				item.setNome(rs.getString("nome"));
				item.setQuantidade(rs.getInt("quantidade"));
				item.setValorUnit(rs.getFloat("valorUnit"));
			}
			return lista;
		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null, "Erro" + erro);
			return null;
		}
	}
	public AluguelServicosVO BuscaPorCodigo(int parseInt) {
		// TODO Auto-generated method stub
		return null;
	}
	public AluguelServicosVO BuscarServicos(int parseInt) {
		// TODO Auto-generated method stub
		return null;
	}
}

