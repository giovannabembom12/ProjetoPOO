package model.dao;

import model.dao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
public class AdicionarConsumo extends javax.swing.JFrame {
public AdicionarConsumo() {
initComponents();
}
private void initComponents() {
jpnPainelAzulExterno = new javax.swing.JPanel();
jpnPainelBrancoInterno = new javax.swing.JPanel();
lblConsumo = new javax.swing.JLabel();
txtPesquisaDeEvento = new javax.swing.JTextField();
rdbComida = new javax.swing.JRadioButton();
rdbSobremesa = new javax.swing.JRadioButton();
rdbBebida = new javax.swing.JRadioButton();
btnBotaoDeAdicionar = new javax.swing.JButton();
txtQuantidadeComida = new javax.swing.JTextField();
lblQuantidadeComida = new javax.swing.JLabel();
lblQuantidadeSobremesa = new javax.swing.JLabel();
lblQuantidadeBebida = new javax.swing.JLabel();
txtQuantidadeSobremesa = new javax.swing.JTextField();
txtQuantidadeBebida = new javax.swing.JTextField();
lblValorUnitarioComida = new javax.swing.JLabel();
lblValorUnitarioSobremesa = new javax.swing.JLabel();
lblValorUnitarioBebida = new javax.swing.JLabel();
lblValorDaSobremesa = new javax.swing.JLabel();
lblValorDaComida = new javax.swing.JLabel();
lblValorDaBebida = new javax.swing.JLabel();
setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
setTitle("Consumo");
jpnPainelAzulExterno.setBackground(new java.awt.Color(22, 43, 64));
jpnPainelAzulExterno.setPreferredSize(new java.awt.Dimension(800, 500));
jpnPainelAzulExterno.setLayout(null);
jpnPainelBrancoInterno.setBackground(new java.awt.Color(255, 255, 255));
lblConsumo.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
lblConsumo.setForeground(new java.awt.Color(0, 0, 0));
lblConsumo.setText("Consumo:");
txtPesquisaDeEvento.setBackground(new java.awt.Color(255, 255, 255));
txtPesquisaDeEvento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
txtPesquisaDeEvento.setForeground(new java.awt.Color(0, 0, 0));
rdbComida.setBackground(new java.awt.Color(255, 255, 255));
rdbComida.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
rdbComida.setForeground(new java.awt.Color(0, 0, 0));
rdbComida.setText("Comida");
rdbSobremesa.setBackground(new java.awt.Color(255, 255, 255));
rdbSobremesa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
rdbSobremesa.setForeground(new java.awt.Color(0, 0, 0));
rdbSobremesa.setText("Sobremesa");
rdbBebida.setBackground(new java.awt.Color(255, 255, 255));
rdbBebida.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
rdbBebida.setForeground(new java.awt.Color(0, 0, 0));
rdbBebida.setText("Bebida");
btnBotaoDeAdicionar.setBackground(new java.awt.Color(22, 43, 64));
btnBotaoDeAdicionar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
btnBotaoDeAdicionar.setForeground(new java.awt.Color(255, 255, 255));
btnBotaoDeAdicionar.setText("Adicionar");
btnBotaoDeAdicionar.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
btnBotaoDeAdicionarActionPerformed(evt);
}
});
txtQuantidadeComida.setBackground(new java.awt.Color(255, 255, 255));
txtQuantidadeComida.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
txtQuantidadeComida.setForeground(new java.awt.Color(0, 0, 0));
lblQuantidadeComida.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
lblQuantidadeComida.setForeground(new java.awt.Color(0, 0, 0));
lblQuantidadeComida.setText("Quantidade:");
lblQuantidadeSobremesa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
lblQuantidadeSobremesa.setForeground(new java.awt.Color(0, 0, 0));
lblQuantidadeSobremesa.setText("Quantidade:");
lblQuantidadeBebida.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
lblQuantidadeBebida.setForeground(new java.awt.Color(0, 0, 0));
lblQuantidadeBebida.setText("Quantidade:");
txtQuantidadeSobremesa.setBackground(new java.awt.Color(255, 255, 255));
txtQuantidadeSobremesa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
txtQuantidadeSobremesa.setForeground(new java.awt.Color(0, 0, 0));
txtQuantidadeSobremesa.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
txtQuantidadeSobremesaActionPerformed(evt);
}
});
txtQuantidadeBebida.setBackground(new java.awt.Color(255, 255, 255));
txtQuantidadeBebida.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
txtQuantidadeBebida.setForeground(new java.awt.Color(0, 0, 0));
txtQuantidadeBebida.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
txtQuantidadeBebidaActionPerformed(evt);
}
});
lblValorUnitarioComida.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
lblValorUnitarioComida.setForeground(new java.awt.Color(0, 0, 0));
lblValorUnitarioComida.setText("Valor unitário:");
lblValorUnitarioSobremesa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
lblValorUnitarioSobremesa.setForeground(new java.awt.Color(0, 0, 0));
lblValorUnitarioSobremesa.setText("Valor unitário:");
lblValorUnitarioBebida.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
lblValorUnitarioBebida.setForeground(new java.awt.Color(0, 0, 0));
lblValorUnitarioBebida.setText("Valor unitário:");
lblValorDaSobremesa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
lblValorDaSobremesa.setForeground(new java.awt.Color(0, 0, 0));
lblValorDaSobremesa.setText("R$ 20,00");
lblValorDaComida.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
lblValorDaComida.setForeground(new java.awt.Color(0, 0, 0));
lblValorDaComida.setText("R$ 50,00");
lblValorDaBebida.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
lblValorDaBebida.setForeground(new java.awt.Color(0, 0, 0));
lblValorDaBebida.setText("R$ 15,00");
javax.swing.GroupLayout jpnPainelBrancoInternoLayout = new javax.swing.GroupLayout(jpnPainelBrancoInterno);
jpnPainelBrancoInterno.setLayout(jpnPainelBrancoInternoLayout);
jpnPainelBrancoInternoLayout.setHorizontalGroup(
jpnPainelBrancoInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jpnPainelBrancoInternoLayout.createSequentialGroup()
.addGap(19, 19, 19)
.addGroup(jpnPainelBrancoInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
.addComponent(btnBotaoDeAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(lblConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnPainelBrancoInternoLayout.createSequentialGroup()
.addGroup(jpnPainelBrancoInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
.addGroup(jpnPainelBrancoInternoLayout.createSequentialGroup()
.addComponent(lblQuantidadeComida)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addComponent(txtQuantidadeComida, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpnPainelBrancoInternoLayout.createSequentialGroup()
.addGroup(jpnPainelBrancoInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(rdbSobremesa, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(rdbComida)
.addComponent(rdbBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(25, 25, 25)
.addGroup(jpnPainelBrancoInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
.addGroup(jpnPainelBrancoInternoLayout.createSequentialGroup()
.addComponent(lblQuantidadeSobremesa)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addComponent(txtQuantidadeSobremesa, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGroup(jpnPainelBrancoInternoLayout.createSequentialGroup()
.addComponent(lblQuantidadeBebida)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addComponent(txtQuantidadeBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))))
.addGap(34, 34, 34)
.addGroup(jpnPainelBrancoInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jpnPainelBrancoInternoLayout.createSequentialGroup()
.addComponent(lblValorUnitarioBebida)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addComponent(lblValorDaBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGroup(jpnPainelBrancoInternoLayout.createSequentialGroup()
.addComponent(lblValorUnitarioSobremesa)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addComponent(lblValorDaSobremesa, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGroup(jpnPainelBrancoInternoLayout.createSequentialGroup()
.addComponent(lblValorUnitarioComida)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addComponent(lblValorDaComida, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
.addGap(76, 76, 76))
.addComponent(txtPesquisaDeEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE))
.addContainerGap(150, Short.MAX_VALUE))
);
jpnPainelBrancoInternoLayout.setVerticalGroup(
jpnPainelBrancoInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jpnPainelBrancoInternoLayout.createSequentialGroup()
.addGap(15, 15, 15)
.addComponent(lblConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addComponent(txtPesquisaDeEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(18, 18, 18)
.addGroup(jpnPainelBrancoInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(rdbComida, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(txtQuantidadeComida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(lblQuantidadeComida)
.addComponent(lblValorUnitarioComida)
.addComponent(lblValorDaComida))
.addGap(18, 18, 18)
.addGroup(jpnPainelBrancoInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(rdbSobremesa, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(lblQuantidadeSobremesa)
.addComponent(txtQuantidadeSobremesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(lblValorUnitarioSobremesa)
.addComponent(lblValorDaSobremesa))
.addGap(18, 18, 18)
.addGroup(jpnPainelBrancoInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(rdbBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(lblQuantidadeBebida)
.addComponent(txtQuantidadeBebida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(lblValorUnitarioBebida)
.addComponent(lblValorDaBebida))
.addGap(38, 38, 38)
.addComponent(btnBotaoDeAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
.addGap(31, 31, 31))
);
jpnPainelAzulExterno.add(jpnPainelBrancoInterno);
jpnPainelBrancoInterno.setBounds(30, 30, 720, 400);
javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
getContentPane().setLayout(layout);
layout.setHorizontalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jpnPainelAzulExterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
);
layout.setVerticalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jpnPainelAzulExterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
);
pack();
}
private void btnBotaoDeAdicionarActionPerformed(java.awt.event.ActionEvent evt) {
    String nomeEvento = txtPesquisaDeEvento.getText();
    
    if (rdbComida.isSelected() || rdbSobremesa.isSelected() || rdbBebida.isSelected()) {
        Connection conn = new Conexao().conectaBD();
        String consultaEventoSQL = "SELECT cod FROM tbEvento WHERE nome = ?";
        int idEvento = -1;

        try {
            PreparedStatement psConsultaEvento = conn.prepareStatement(consultaEventoSQL);
            psConsultaEvento.setString(1, nomeEvento);
            ResultSet rs = psConsultaEvento.executeQuery();

            if (rs.next()) {
                idEvento = rs.getInt("cod");
            } else {
                JOptionPane.showMessageDialog(null, "Evento não encontrado.");
                return;
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar o evento: " + erro);
            return;
        }

        int quantidade = 0;
        int valorUnitario = 0;

        if (rdbComida.isSelected()) {
            int quantidadeComida = Integer.parseInt(txtQuantidadeComida.getText());
            int valorUnitarioComida = 50; // Valor unitário pra comida
            int valorTotalComida = quantidadeComida * valorUnitarioComida;
            inserirItemEvento(idEvento, "Comida", quantidadeComida, valorUnitarioComida, valorTotalComida);
        }
        if (rdbSobremesa.isSelected()) {
            int quantidadeSobremesa = Integer.parseInt(txtQuantidadeSobremesa.getText());
            int valorUnitarioSobremesa = 20; // Valor unitário pra sobremesa
            int valorTotalSobremesa = quantidadeSobremesa * valorUnitarioSobremesa;
            inserirItemEvento(idEvento, "Sobremesa", quantidadeSobremesa, valorUnitarioSobremesa, valorTotalSobremesa);
        }
        if (rdbBebida.isSelected()) {
            int quantidadeBebida = Integer.parseInt(txtQuantidadeBebida.getText());
            int valorUnitarioBebida = 15; // Valor unitário pra bebida
            int valorTotalBebida = quantidadeBebida * valorUnitarioBebida;
            inserirItemEvento(idEvento, "Bebida", quantidadeBebida, valorUnitarioBebida, valorTotalBebida);
        }

        // Calcula o valor total
        int valorTotal = quantidade * valorUnitario;

        inserirItemEvento(idEvento, rdbComida.isSelected() ? "Comida" : (rdbSobremesa.isSelected() ? "Sobremesa" : "Bebida"), quantidade, valorUnitario, valorTotal);

        try {
            conn.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão: " + erro);
        }

        JOptionPane.showMessageDialog(null, "Itens adicionados com sucesso!");
    } else {
        JOptionPane.showMessageDialog(null, "Selecione pelo menos um item para adicionar.");
    }
}

private void inserirItemEvento(int idEvento, String itemNome, int quantidade, int valorUnitario, int valorTotal) {
    String sql = "INSERT INTO tbItensEvento (idEvento, itemNome, quantidade, valor_unitario, valor_total) VALUES (?, ?, ?, ?, ?)";
    Connection conn = new Conexao().conectaBD();
    try {
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, idEvento);
        pstm.setString(2, itemNome);
        pstm.setInt(3, quantidade);
        pstm.setInt(4, valorUnitario);
        pstm.setInt(5, valorTotal);
        pstm.executeUpdate();
        pstm.close();
    } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null, "Erro ao adicionar item: " + erro);
    }
}


private void txtQuantidadeSobremesaActionPerformed(java.awt.event.ActionEvent evt) {
}
private void txtQuantidadeBebidaActionPerformed(java.awt.event.ActionEvent evt) {
}
public static void main(String args[]) {
java.awt.EventQueue.invokeLater(new Runnable() {
public void run() {
new AdicionarConsumo().setVisible(true);
}
});
}
private javax.swing.JButton btnBotaoDeAdicionar;
private javax.swing.JPanel jpnPainelAzulExterno;
private javax.swing.JPanel jpnPainelBrancoInterno;
private javax.swing.JLabel lblConsumo;
private javax.swing.JLabel lblQuantidadeBebida;
private javax.swing.JLabel lblQuantidadeComida;
private javax.swing.JLabel lblQuantidadeSobremesa;
private javax.swing.JLabel lblValorDaBebida;
private javax.swing.JLabel lblValorDaComida;
private javax.swing.JLabel lblValorDaSobremesa;
private javax.swing.JLabel lblValorUnitarioBebida;
private javax.swing.JLabel lblValorUnitarioComida;
private javax.swing.JLabel lblValorUnitarioSobremesa;
private javax.swing.JRadioButton rdbBebida;
private javax.swing.JRadioButton rdbComida;
private javax.swing.JRadioButton rdbSobremesa;
private javax.swing.JTextField txtPesquisaDeEvento;
private javax.swing.JTextField txtQuantidadeBebida;
private javax.swing.JTextField txtQuantidadeComida;
private javax.swing.JTextField txtQuantidadeSobremesa;
}
