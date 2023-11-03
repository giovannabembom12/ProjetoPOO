package view;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import model.dao.Conexao;

public class OrcamentoEvento extends javax.swing.JFrame {

    public OrcamentoEvento() {
        initComponents();
       
    }
    private void initComponents() {

        jpbPainelAzulExterno = new javax.swing.JPanel();
        jpnPainelBrancoInterno = new javax.swing.JPanel();
        lblOrcamentoDeEvento = new javax.swing.JLabel();
        txtDigitarEvento = new javax.swing.JTextField();
        jpnPainelAzulDoValorTotal = new javax.swing.JPanel();
        lblTotal = new javax.swing.JLabel();
        lblTaskTide1 = new javax.swing.JLabel();
        jpnPainelBrancoDoCalculoTotal = new javax.swing.JPanel();
        lblMostraCalculoTotal = new javax.swing.JLabel();
        btnBotaoDeAdicionar = new javax.swing.JButton();
        rdbBebidas = new javax.swing.JRadioButton();
        rdbEquipamentoTecnico = new javax.swing.JRadioButton();
        rdbAlimentacao = new javax.swing.JRadioButton();
        rdbPublicidade = new javax.swing.JRadioButton();
        rdbTransporte = new javax.swing.JRadioButton();
        rdbDecoracao = new javax.swing.JRadioButton();
        jbnBotaoVoltar1 = new javax.swing.JButton();
       jbnBotaoVoltar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnBotaoVoltar1ActionPerformed(evt);
            }
        });
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbTabelaDoOrcamentoDoEvento = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Orçamento de Evento");
        setPreferredSize(new java.awt.Dimension(1920, 1080));

        jpbPainelAzulExterno.setBackground(new java.awt.Color(22, 43, 64));
        jpbPainelAzulExterno.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jpbPainelAzulExterno.setLayout(null);

        jpnPainelBrancoInterno.setBackground(new java.awt.Color(255, 255, 255));
        jpnPainelBrancoInterno.setLayout(null);

        lblOrcamentoDeEvento.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblOrcamentoDeEvento.setForeground(new java.awt.Color(0, 0, 0));
        lblOrcamentoDeEvento.setText("Orçamento do Evento");
        jpnPainelBrancoInterno.add(lblOrcamentoDeEvento);
        lblOrcamentoDeEvento.setBounds(901, 18, 286, 41);

        txtDigitarEvento.setBackground(new java.awt.Color(255, 255, 255));
        txtDigitarEvento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDigitarEvento.setForeground(new java.awt.Color(0, 0, 0));
        txtDigitarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDigitarEventoActionPerformed(evt);
            }
        });
        jpnPainelBrancoInterno.add(txtDigitarEvento);
        txtDigitarEvento.setBounds(28, 109, 520, 56);

        jpnPainelAzulDoValorTotal.setBackground(new java.awt.Color(22, 43, 64));

        lblTotal.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(255, 255, 255));
        lblTotal.setText("Total:");

        javax.swing.GroupLayout jpnPainelAzulDoValorTotalLayout = new javax.swing.GroupLayout(jpnPainelAzulDoValorTotal);
        jpnPainelAzulDoValorTotal.setLayout(jpnPainelAzulDoValorTotalLayout);
        jpnPainelAzulDoValorTotalLayout.setHorizontalGroup(
            jpnPainelAzulDoValorTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnPainelAzulDoValorTotalLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jpnPainelAzulDoValorTotalLayout.setVerticalGroup(
            jpnPainelAzulDoValorTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnPainelAzulDoValorTotalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTotal)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jpnPainelBrancoInterno.add(jpnPainelAzulDoValorTotal);
        jpnPainelAzulDoValorTotal.setBounds(660, 590, 140, 50);

        lblTaskTide1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTaskTide1.setForeground(new java.awt.Color(0, 0, 0));
        lblTaskTide1.setText("TaskTide");
        jpnPainelBrancoInterno.add(lblTaskTide1);
        lblTaskTide1.setBounds(120, 20, 118, 32);

        jpnPainelBrancoDoCalculoTotal.setBackground(new java.awt.Color(255, 255, 255));
        jpnPainelBrancoDoCalculoTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpnPainelBrancoDoCalculoTotal.setForeground(new java.awt.Color(0, 0, 0));

        lblMostraCalculoTotal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblMostraCalculoTotal.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jpnPainelBrancoDoCalculoTotalLayout = new javax.swing.GroupLayout(jpnPainelBrancoDoCalculoTotal);
        jpnPainelBrancoDoCalculoTotal.setLayout(jpnPainelBrancoDoCalculoTotalLayout);
        jpnPainelBrancoDoCalculoTotalLayout.setHorizontalGroup(
            jpnPainelBrancoDoCalculoTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnPainelBrancoDoCalculoTotalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMostraCalculoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpnPainelBrancoDoCalculoTotalLayout.setVerticalGroup(
            jpnPainelBrancoDoCalculoTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnPainelBrancoDoCalculoTotalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMostraCalculoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpnPainelBrancoInterno.add(jpnPainelBrancoDoCalculoTotal);
        jpnPainelBrancoDoCalculoTotal.setBounds(800, 590, 150, 50);

        btnBotaoDeAdicionar.setBackground(new java.awt.Color(22, 43, 64));
        btnBotaoDeAdicionar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnBotaoDeAdicionar.setForeground(new java.awt.Color(255, 255, 255));
        btnBotaoDeAdicionar.setText("Registrar");
        btnBotaoDeAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBotaoDeAdicionarActionPerformed(evt);
            }
        });
        jpnPainelBrancoInterno.add(btnBotaoDeAdicionar);
        btnBotaoDeAdicionar.setBounds(30, 580, 160, 50);

        rdbBebidas.setBackground(new java.awt.Color(255, 255, 255));
        rdbBebidas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rdbBebidas.setForeground(new java.awt.Color(0, 0, 0));
        rdbBebidas.setText("Bebidas");
        rdbBebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbBebidasActionPerformed(evt);
            }
        });
        jpnPainelBrancoInterno.add(rdbBebidas);
        rdbBebidas.setBounds(30, 500, 100, 40);

        rdbEquipamentoTecnico.setBackground(new java.awt.Color(255, 255, 255));
        rdbEquipamentoTecnico.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rdbEquipamentoTecnico.setForeground(new java.awt.Color(0, 0, 0));
        rdbEquipamentoTecnico.setText("Equipamento Técnico");
        rdbEquipamentoTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbTransporteTecnicoActionPerformed(evt);
            }
        });
        jpnPainelBrancoInterno.add(rdbEquipamentoTecnico);
        rdbEquipamentoTecnico.setBounds(30, 200, 330, 40);

        rdbAlimentacao.setBackground(new java.awt.Color(255, 255, 255));
        rdbAlimentacao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rdbAlimentacao.setForeground(new java.awt.Color(0, 0, 0));
        rdbAlimentacao.setText("Alimentação");
        rdbAlimentacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbAlimentacaoActionPerformed(evt);
            }
        });
        jpnPainelBrancoInterno.add(rdbAlimentacao);
        rdbAlimentacao.setBounds(30, 260, 130, 40);

        rdbPublicidade.setBackground(new java.awt.Color(255, 255, 255));
        rdbPublicidade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rdbPublicidade.setForeground(new java.awt.Color(0, 0, 0));
        rdbPublicidade.setText("Publicidade");
        rdbPublicidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbPublicidadeActionPerformed(evt);
            }
        });
        jpnPainelBrancoInterno.add(rdbPublicidade);
        rdbPublicidade.setBounds(30, 320, 130, 40);

        rdbTransporte.setBackground(new java.awt.Color(255, 255, 255));
        rdbTransporte.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rdbTransporte.setForeground(new java.awt.Color(0, 0, 0));
        rdbTransporte.setText("Transporte");
        rdbTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbTransporteActionPerformed(evt);
            }
        });
        jpnPainelBrancoInterno.add(rdbTransporte);
        rdbTransporte.setBounds(30, 380, 120, 40);

        rdbDecoracao.setBackground(new java.awt.Color(255, 255, 255));
        rdbDecoracao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rdbDecoracao.setForeground(new java.awt.Color(0, 0, 0));
        rdbDecoracao.setText("Decoração");
        rdbDecoracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbDecoracaoActionPerformed(evt);
            }
        });
        jpnPainelBrancoInterno.add(rdbDecoracao);
        rdbDecoracao.setBounds(30, 440, 120, 40);

        jbnBotaoVoltar1.setBackground(new java.awt.Color(22, 43, 64));
        jbnBotaoVoltar1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbnBotaoVoltar1.setForeground(new java.awt.Color(255, 255, 255));
        jbnBotaoVoltar1.setText("Voltar");
        jpnPainelBrancoInterno.add(jbnBotaoVoltar1);
        jbnBotaoVoltar1.setBounds(1200, 590, 160, 50);

        jtbTabelaDoOrcamentoDoEvento.setBackground(new java.awt.Color(255, 255, 255));
        jtbTabelaDoOrcamentoDoEvento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtbTabelaDoOrcamentoDoEvento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Despesa", "Fornecedor", "Valor Unitário"
            }
        ));
        jtbTabelaDoOrcamentoDoEvento.setShowHorizontalLines(true);
        jtbTabelaDoOrcamentoDoEvento.setShowVerticalLines(true);
        jScrollPane1.setViewportView(jtbTabelaDoOrcamentoDoEvento);

        jpnPainelBrancoInterno.add(jScrollPane1);
        jScrollPane1.setBounds(660, 101, 698, 460);

        jpbPainelAzulExterno.add(jpnPainelBrancoInterno);
        jpnPainelBrancoInterno.setBounds(70, 50, 1380, 660);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpbPainelAzulExterno, javax.swing.GroupLayout.PREFERRED_SIZE, 1651, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpbPainelAzulExterno, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }                      
    private void inserirItemEvento(int idEvento, String itemNome, double valorUnitario) {
        String sql = "INSERT INTO tbItensEvento (idEvento, itemNome, valor_unitario) VALUES (?, ?, ?)";
        Connection conn = new Conexao().conectaBD();
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, idEvento);
            pstm.setString(2, itemNome);
            pstm.setDouble(3, valorUnitario);
            pstm.executeUpdate();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao adicionar item: " + erro);
        }
    }

    private void jbnBotaoVoltar1ActionPerformed(java.awt.event.ActionEvent evt) {
 		this.dispose();
 		new TelaInicialView().setVisible(true); // Voltar para a tela de Menu
 	}                  
     
    
    private void rdbBebidasActionPerformed(java.awt.event.ActionEvent evt) {                                           
    }                                          

    private void rdbTransporteTecnicoActionPerformed(java.awt.event.ActionEvent evt) {                                                     
    }                                                    

    private void rdbAlimentacaoActionPerformed(java.awt.event.ActionEvent evt) {                                               
    }                                              

    private void rdbPublicidadeActionPerformed(java.awt.event.ActionEvent evt) {                                               
    }                                              

    private void rdbTransporteActionPerformed(java.awt.event.ActionEvent evt) {                                              
    }                                             

    private void rdbDecoracaoActionPerformed(java.awt.event.ActionEvent evt) {                                             
    }                                            

    private void txtDigitarEventoActionPerformed(java.awt.event.ActionEvent evt) {                                                 
    }                                                

    private void btnBotaoDeAdicionarActionPerformed(java.awt.event.ActionEvent evt) {
        String nomeEvento = txtDigitarEvento.getText();

        if (rdbAlimentacao.isSelected() || rdbBebidas.isSelected() || rdbDecoracao.isSelected() || rdbPublicidade.isSelected() || rdbTransporte.isSelected() || rdbEquipamentoTecnico.isSelected()) {
            Connection conn = new Conexao().conectaBD();
            String consultaEventoSQL = "SELECT cod FROM tbEvento WHERE nome = ? ";

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

            String descricaoItem = "";

            if (rdbAlimentacao.isSelected()) {
                inserirItemEvento(idEvento, "Alimentação", 20000.0);
                descricaoItem = buscarNomeEmpresa("Alimentação");
            }
            if (rdbBebidas.isSelected()) {
                inserirItemEvento(idEvento, "Bebidas", 10000.0);
                descricaoItem = buscarNomeEmpresa("Bebidas");
            }
            if (rdbDecoracao.isSelected()) {
                inserirItemEvento(idEvento, "Decoração", 1000.0);
                descricaoItem = buscarNomeEmpresa("Decoração");
            }
            if (rdbPublicidade.isSelected()) {
                inserirItemEvento(idEvento, "Publicidade", 5000.0);
                descricaoItem = buscarNomeEmpresa("Publicidade");
            }
            if (rdbTransporte.isSelected()) {
                inserirItemEvento(idEvento, "Transporte", 5000.0);
                descricaoItem = buscarNomeEmpresa("Transporte");
            }
            if (rdbEquipamentoTecnico.isSelected()) {
                inserirItemEvento(idEvento, "Equipamento Técnico", 25000.0);
                descricaoItem = buscarNomeEmpresa("Equipamento Técnico");
            }

            try {
                atualizarDescricaoEmpresa(idEvento, descricaoItem, rdbAlimentacao.isSelected(), rdbBebidas.isSelected(), rdbDecoracao.isSelected(), rdbPublicidade.isSelected(), rdbTransporte.isSelected(), rdbEquipamentoTecnico.isSelected());
                conn.close();
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão: " + erro);
            }

            JOptionPane.showMessageDialog(null, "Itens adicionados com sucesso!");
        }/* else {
            JOptionPane.showMessageDialog(null, "Selecione pelo menos um item para adicionar.");
        }*/
        
        calcularValorTotalDoEvento();
        preencherTabelaComDadosDoEvento();

        
    }

    private void atualizarDescricaoEmpresa(int idEvento, String descricaoItem, boolean alimentacao, boolean bebidas, boolean decoracao, boolean publicidade, boolean transporte, boolean equipamentoTecnico) {
        String sql = "UPDATE tbItensEvento SET itemDescricao = ? WHERE idEvento = ? AND itemNome = ?";
        Connection conn = new Conexao().conectaBD();
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            if (alimentacao) {
                pstm.setString(1, descricaoItem);
                pstm.setInt(2, idEvento);
                pstm.setString(3, "Alimentação");
                pstm.executeUpdate();
            }
            if (bebidas) {
                pstm.setString(1, descricaoItem);
                pstm.setInt(2, idEvento);
                pstm.setString(3, "Bebidas");
                pstm.executeUpdate();
            }
            if (decoracao) {
                pstm.setString(1, descricaoItem);
                pstm.setInt(2, idEvento);
                pstm.setString(3, "Decoração");
                pstm.executeUpdate();
            }
            if (publicidade) {
                pstm.setString(1, descricaoItem);
                pstm.setInt(2, idEvento);
                pstm.setString(3, "Publicidade");
                pstm.executeUpdate();
            }
            if (transporte) {
                pstm.setString(1, descricaoItem);
                pstm.setInt(2, idEvento);
                pstm.setString(3, "Transporte");
                pstm.executeUpdate();
            }
            if (equipamentoTecnico) {
                pstm.setString(1, descricaoItem);
                pstm.setInt(2, idEvento);
                pstm.setString(3, "Equipamento Técnico");
                pstm.executeUpdate();
            }
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar a descrição da empresa: " + erro);
        }
    }
    
    private String buscarNomeEmpresa(String segmento) {
        String nomeEmpresa = "";
        Connection conn = new Conexao().conectaBD();
        String consultaEmpresaSQL = "SELECT nome FROM tbassociado WHERE segmento = ?";

        try {
            PreparedStatement psConsultaEmpresa = conn.prepareStatement(consultaEmpresaSQL);
            psConsultaEmpresa.setString(1, segmento);
            ResultSet rs = psConsultaEmpresa.executeQuery();

            if (rs.next()) {
                nomeEmpresa = rs.getString("nome");
            }

            psConsultaEmpresa.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar a empresa: " + erro);
        }

        return nomeEmpresa;
    }
    
    private void calcularValorTotalDoEvento() {
        String nomeEvento = txtDigitarEvento.getText();
        if (nomeEvento.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite um nome de evento válido.");
            return;
        }

        Connection conn = new Conexao().conectaBD();
        String consultaValorTotalSQL = "SELECT SUM(valor_unitario) AS valor_total FROM tbItensEvento " +
                "WHERE idEvento = (SELECT cod FROM tbEvento WHERE nome = ?)";

        try {
            PreparedStatement psConsultaValorTotal = conn.prepareStatement(consultaValorTotalSQL);
            psConsultaValorTotal.setString(1, nomeEvento);
            ResultSet rs = psConsultaValorTotal.executeQuery();

            if (rs.next()) {
                double valorTotal = rs.getDouble("valor_total");
                lblMostraCalculoTotal.setText("R$" + valorTotal);
            } else {
                lblMostraCalculoTotal.setText("R$0.00");
            }

            psConsultaValorTotal.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao calcular o valor total: " + erro);
        }
    }

    private void preencherTabelaComDadosDoEvento() {
        String nomeEvento = txtDigitarEvento.getText();
        if (nomeEvento.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite um nome de evento válido.");
            return;
        }

        DefaultTableModel modeloTabela = (DefaultTableModel) jtbTabelaDoOrcamentoDoEvento.getModel();
        modeloTabela.setRowCount(0); 

        Connection conn = new Conexao().conectaBD();
        String consultaDadosEventoSQL = "SELECT itemNome, itemDescricao, valor_unitario FROM tbItensEvento " +
                "WHERE idEvento = (SELECT cod FROM tbEvento WHERE nome = ?)";

        try {
            PreparedStatement psConsultaDadosEvento = conn.prepareStatement(consultaDadosEventoSQL);
            psConsultaDadosEvento.setString(1, nomeEvento);
            ResultSet rs = psConsultaDadosEvento.executeQuery();

            while (rs.next()) {
                String itemNome = rs.getString("itemNome");
                String itemDescricao = rs.getString("itemDescricao");
                double valorUnitario = rs.getDouble("valor_unitario");

                modeloTabela.addRow(new Object[]{itemNome, itemDescricao, Double.valueOf(valorUnitario)});
            }

            psConsultaDadosEvento.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar dados do evento: " + erro);
        }
    }

 
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrcamentoEvento().setVisible(true);
            }
        });
    }
    private javax.swing.JButton btnBotaoDeAdicionar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbnBotaoVoltar1;
    private javax.swing.JPanel jpbPainelAzulExterno;
    private javax.swing.JPanel jpnPainelAzulDoValorTotal;
    private javax.swing.JPanel jpnPainelBrancoDoCalculoTotal;
    private javax.swing.JPanel jpnPainelBrancoInterno;
    private javax.swing.JTable jtbTabelaDoOrcamentoDoEvento;
    private javax.swing.JLabel lblMostraCalculoTotal;
    private javax.swing.JLabel lblOrcamentoDeEvento;
    private javax.swing.JLabel lblTaskTide1;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JRadioButton rdbAlimentacao;
    private javax.swing.JRadioButton rdbBebidas;
    private javax.swing.JRadioButton rdbDecoracao;
    private javax.swing.JRadioButton rdbPublicidade;
    private javax.swing.JRadioButton rdbTransporte;
    private javax.swing.JRadioButton rdbEquipamentoTecnico;
    private javax.swing.JTextField txtDigitarEvento;
}