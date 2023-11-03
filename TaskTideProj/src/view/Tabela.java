package view;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class Tabela extends JFrame {
private JTable table;
private JLabel lblTotalDosValores;
private JTextField txtPesquisa;
private DefaultTableModel tableModel;
public Tabela() {
setTitle("Tabela de Itens de Evento");
setSize(800, 600);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
lblTotalDosValores = new JLabel();
getContentPane().add(lblTotalDosValores, BorderLayout.SOUTH);
JPanel panel = new JPanel();
getContentPane().add(panel, BorderLayout.NORTH);
txtPesquisa = new JTextField(20);
panel.add(txtPesquisa);
JButton btnBuscar = new JButton("Buscar");
panel.add(btnBuscar);
tableModel = new DefaultTableModel();
tableModel.addColumn("Nome do Item");
tableModel.addColumn("Quantidade");
tableModel.addColumn("Valor Unitário");
tableModel.addColumn("Valor Total");
table = new JTable(tableModel);
JScrollPane scrollPane = new JScrollPane(table);
getContentPane().add(scrollPane, BorderLayout.CENTER);
String jdbcURL = "jdbc:mysql://localhost:3306/TaskTide";
String username = "root";
String password = "250207gioVanna";
btnBuscar.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String pesquisa = txtPesquisa.getText();
pesquisarItens(pesquisa);
}
});
lblTotalDosValores.setText("R$");
tableModel.setRowCount(0);
}
private void pesquisarItens(String pesquisa) {
tableModel.setRowCount(0);
String jdbcURL = "jdbc:mysql://localhost:3306/TaskTide";
String username = "root";
String password = "250207gioVanna";
try {
Connection connection = DriverManager.getConnection(jdbcURL, username, password);
String verificaEventoQuery = "SELECT cod FROM tbEvento WHERE nome = ?";
PreparedStatement verificaEventoStmt = connection.prepareStatement(verificaEventoQuery);
verificaEventoStmt.setString(1, pesquisa);
ResultSet verificaEventoResult = verificaEventoStmt.executeQuery();
if (verificaEventoResult.next()) {
int idEvento = verificaEventoResult.getInt("cod");
String query = "SELECT itemNome, quantidade, valor_unitario FROM tbItensEvento WHERE idEvento = ?";
PreparedStatement preparedStatement = connection.prepareStatement(query);
preparedStatement.setInt(1, idEvento);
ResultSet resultSet = preparedStatement.executeQuery();
while (resultSet.next()) {
String itemNome = resultSet.getString("itemNome");
int quantidade = resultSet.getInt("quantidade");
int valor_unitario = resultSet.getInt("valor_unitario");
int valor_total = quantidade * valor_unitario;
tableModel.addRow(new Object[]{itemNome, Integer.valueOf(quantidade), Integer.valueOf(valor_unitario),Integer.valueOf (valor_total)}); }
} else {
JOptionPane.showMessageDialog(null, "Evento não encontrado.");
}
verificaEventoResult.close();
verificaEventoStmt.close();
connection.close();
} catch (Exception e) {
e.printStackTrace();
JOptionPane.showMessageDialog(null, "Erro ao pesquisar itens: " + e.getMessage());
}
calcularValorTotal();
}
private void calcularValorTotal() {
int rowCount = tableModel.getRowCount();
int total = 0;
for (int i = 0; i < rowCount; i++) {
	int valorTotal = Integer.parseInt(tableModel.getValueAt(i, 3).toString());
total += valorTotal;
}
lblTotalDosValores.setText("R$" + total);
}
public static void main(String[] args) {
Tabela tabelaGUI = new Tabela();
tabelaGUI.setVisible(true);
}
}
