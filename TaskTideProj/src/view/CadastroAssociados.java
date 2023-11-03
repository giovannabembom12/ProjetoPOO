package view;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
public class CadastroAssociados extends JFrame {
	private JTable tabela;
	private DefaultTableModel modelo;
	private JTextField campoBusca;
	private JButton botaoBuscar;
	public CadastroAssociados() {
		setTitle("TaskTide");
		setSize(800, 400);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setBackground(new Color(22, 43, 64));
		modelo = new DefaultTableModel();
		modelo.addColumn("ID");
		modelo.addColumn("Nome");
		modelo.addColumn("Segmento");
		modelo.addColumn("Contato");
		tabela = new JTable(modelo);
		JScrollPane scrollPane = new JScrollPane(tabela);
		add(scrollPane);
		campoBusca = new JTextField(20);
		botaoBuscar = new JButton("Buscar");
		JPanel painelBusca = new JPanel();
		painelBusca.setBackground(new Color(22, 43, 64));
		campoBusca.setBackground(Color.WHITE);
		botaoBuscar.setBackground(new Color(0, 102, 204));
		botaoBuscar.setForeground(Color.WHITE);
		painelBusca.add(campoBusca);
		painelBusca.add(botaoBuscar);
		add(painelBusca, BorderLayout.NORTH);
		botaoBuscar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				buscarPorNome();
			}
		});
		popularTabela();
	}
	public CadastroAssociados(int id, String nome, String segmento, String contato) {
	}
	private void popularTabela() {
		String url = "jdbc:mysql://localhost/tasktide";
		String usuario = "root";
		String senha = "root";
		try (Connection conexão = DriverManager.getConnection(url, usuario, senha)) {
			String sql = "SELECT id, nome, segmento, contato FROM tbassociado";
			Statement statement = conexão.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String nome = resultSet.getString("nome");
				String segmento = resultSet.getString("segmento");
				String contato = resultSet.getString("contato");
				modelo.addRow(new Object[] { id, nome, segmento, contato });
			}
		} catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(this, "Erro ao conectar ao banco de dados.");
		}
	}
	private void buscarPorNome() {
		String nomeParaBuscar = campoBusca.getText().trim();
		modelo.setRowCount(0);
		String url = "jdbc:mysql://localhost/tasktide";
		String usuario = "root";
		String senha = "root";
		try (Connection conexão = DriverManager.getConnection(url, usuario, senha)) {
			String sql = "SELECT id, nome, segmento, contato FROM tbassociado WHERE nome LIKE ?";
			PreparedStatement preparedStatement = conexão.prepareStatement(sql);
			preparedStatement.setString(1, "%" + nomeParaBuscar + "%");
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String nome = resultSet.getString("nome");
				String segmento = resultSet.getString("segmento");
				String contato = resultSet.getString("contato");
				modelo.addRow(new Object[] { id, nome, segmento, contato });
			}
		} catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(this, "Erro ao buscar no banco de dados.");
		}
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				Associados janela = new Associados();
				janela.setVisible(true);
			}
		});
	}
}

