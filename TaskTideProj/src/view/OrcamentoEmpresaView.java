package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.dao.Conexao;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import java.util.HashMap;
import java.util.Map;

public class OrcamentoEmpresaView extends javax.swing.JFrame {
	
    public OrcamentoEmpresaView() {
        initComponents();
        carregarDespesasNaTabela();
    }

    private void initComponents() {

        jpnPainelAzulExterno = new javax.swing.JPanel();
        jpnPainelBrancoInterno1 = new javax.swing.JPanel();
        lblOrcamentoDaEmpresa = new javax.swing.JLabel();
        jpnPainelAzulDoValorTotal1 = new javax.swing.JPanel();
        lblTotal1 = new javax.swing.JLabel();
        lblTaskTide = new javax.swing.JLabel();
        jpnPainelBrancoDoCalculo = new javax.swing.JPanel();
        lblMostrarCalculoTotal = new javax.swing.JLabel();
        jbnBotaoVoltar1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabelaDoOrcamentoDaEmpresa = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Orçamento da Empresa");
        setPreferredSize(new java.awt.Dimension(1920, 1080));

        jpnPainelAzulExterno.setBackground(new java.awt.Color(22, 43, 64));
        jpnPainelAzulExterno.setPreferredSize(new java.awt.Dimension(800, 500));

        jpnPainelBrancoInterno1.setBackground(new java.awt.Color(255, 255, 255));
        jpnPainelBrancoInterno1.setLayout(null);

        lblOrcamentoDaEmpresa.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        lblOrcamentoDaEmpresa.setForeground(new java.awt.Color(0, 0, 0));
        lblOrcamentoDaEmpresa.setText("Orçamento da Empresa");
        jpnPainelBrancoInterno1.add(lblOrcamentoDaEmpresa);
        lblOrcamentoDaEmpresa.setBounds(520, 40, 310, 41);

        jpnPainelAzulDoValorTotal1.setBackground(new java.awt.Color(22, 43, 64));

        lblTotal1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTotal1.setForeground(new java.awt.Color(255, 255, 255));
        lblTotal1.setText("Total:");

        javax.swing.GroupLayout jpnPainelAzulDoValorTotal1Layout = new javax.swing.GroupLayout(jpnPainelAzulDoValorTotal1);
        jpnPainelAzulDoValorTotal1.setLayout(jpnPainelAzulDoValorTotal1Layout);
        jpnPainelAzulDoValorTotal1Layout.setHorizontalGroup(
            jpnPainelAzulDoValorTotal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnPainelAzulDoValorTotal1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jpnPainelAzulDoValorTotal1Layout.setVerticalGroup(
            jpnPainelAzulDoValorTotal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnPainelAzulDoValorTotal1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTotal1)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jpnPainelBrancoInterno1.add(jpnPainelAzulDoValorTotal1);
        jpnPainelAzulDoValorTotal1.setBounds(100, 570, 140, 50);

        lblTaskTide.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTaskTide.setForeground(new java.awt.Color(0, 0, 0));
        lblTaskTide.setText("TaskTide");
        jpnPainelBrancoInterno1.add(lblTaskTide);
        lblTaskTide.setBounds(100, 40, 118, 32);

        jpnPainelBrancoDoCalculo.setBackground(new java.awt.Color(255, 255, 255));
        jpnPainelBrancoDoCalculo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpnPainelBrancoDoCalculo.setForeground(new java.awt.Color(0, 0, 0));

        lblMostrarCalculoTotal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblMostrarCalculoTotal.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jpnPainelBrancoDoCalculoLayout = new javax.swing.GroupLayout(jpnPainelBrancoDoCalculo);
        jpnPainelBrancoDoCalculo.setLayout(jpnPainelBrancoDoCalculoLayout);
        jpnPainelBrancoDoCalculoLayout.setHorizontalGroup(
            jpnPainelBrancoDoCalculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnPainelBrancoDoCalculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMostrarCalculoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jpnPainelBrancoDoCalculoLayout.setVerticalGroup(
            jpnPainelBrancoDoCalculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnPainelBrancoDoCalculoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMostrarCalculoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jpnPainelBrancoInterno1.add(jpnPainelBrancoDoCalculo);
        jpnPainelBrancoDoCalculo.setBounds(240, 570, 150, 50);

        jbnBotaoVoltar1.setBackground(new java.awt.Color(22, 43, 64));
        jbnBotaoVoltar1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbnBotaoVoltar1.setForeground(new java.awt.Color(255, 255, 255));
        jbnBotaoVoltar1.setText("Voltar");
        jbnBotaoVoltar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnBotaoVoltar1ActionPerformed(evt);
            }
        });
        jpnPainelBrancoInterno1.add(jbnBotaoVoltar1);
        jbnBotaoVoltar1.setBounds(1090, 570, 160, 50);

        tblTabelaDoOrcamentoDaEmpresa.setBackground(new java.awt.Color(255, 255, 255));
        tblTabelaDoOrcamentoDaEmpresa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblTabelaDoOrcamentoDaEmpresa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Despesa", "Fornecedor"
            }
        ));
        tblTabelaDoOrcamentoDaEmpresa.setShowHorizontalLines(true);
        tblTabelaDoOrcamentoDaEmpresa.setShowVerticalLines(true);
        jScrollPane1.setViewportView(tblTabelaDoOrcamentoDaEmpresa);

        jpnPainelBrancoInterno1.add(jScrollPane1);
        jScrollPane1.setBounds(100, 110, 1150, 420);

        javax.swing.GroupLayout jpnPainelAzulExternoLayout = new javax.swing.GroupLayout(jpnPainelAzulExterno);
        jpnPainelAzulExterno.setLayout(jpnPainelAzulExternoLayout);
        jpnPainelAzulExternoLayout.setHorizontalGroup(
            jpnPainelAzulExternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnPainelAzulExternoLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jpnPainelBrancoInterno1, javax.swing.GroupLayout.PREFERRED_SIZE, 1354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jpnPainelAzulExternoLayout.setVerticalGroup(
            jpnPainelAzulExternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnPainelAzulExternoLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jpnPainelBrancoInterno1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnPainelAzulExterno, javax.swing.GroupLayout.DEFAULT_SIZE, 1520, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnPainelAzulExterno, javax.swing.GroupLayout.DEFAULT_SIZE, 918, Short.MAX_VALUE)
        );

        pack();
    }
    
    private void carregarDespesasNaTabela() {
        model.dao.Conexao conexao = new model.dao.Conexao();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = conexao.conectaBD();

            //vsf
            String sql = "SELECT despesa, SUM(valor) AS valor FROM (" +
                    "SELECT a.segmento AS despesa, a.valor FROM tbassociado a " +
                    "UNION " +
                    "SELECT o.despesa AS despesa, o.valor * o.quantidade AS valor FROM tbOrcamentoEmpresa o) combined " +
                    "GROUP BY despesa";


            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            DefaultTableModel model = (DefaultTableModel) tblTabelaDoOrcamentoDaEmpresa.getModel();

            // Essa linha corrigiu o erro de linhas em branco,ein ein ein
            model.setRowCount(0);

            double totalValor = 0.0; 

            while (rs.next()) {
                String despesa = rs.getString("despesa");
                double valor = rs.getDouble("valor");

                totalValor += valor; 

                model.addRow(new Object[]{despesa, Double.valueOf(valor)});
            }

            lblMostrarCalculoTotal.setText("R$" + totalValor);
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar despesas: " + erro);
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void jbnBotaoVoltar1ActionPerformed(java.awt.event.ActionEvent evt) {
		this.dispose();
		new TelaInicialView2().setVisible(true); // Voltar para a tela de Menu
	}                  
    
    public static void main(String args[]) {
    	 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrcamentoEmpresaView().setVisible(true);
            }
        });
    }

    private javax.swing.JLabel lblLogo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbnBotaoVoltar1;
    private javax.swing.JPanel jpnPainelAzulDoValorTotal1;
    private javax.swing.JPanel jpnPainelAzulExterno;
    private javax.swing.JPanel jpnPainelBrancoDoCalculo;
    private javax.swing.JPanel jpnPainelBrancoInterno1;
    private javax.swing.JLabel lblMostrarCalculoTotal;
    private javax.swing.JLabel lblOrcamentoDaEmpresa;
    private javax.swing.JLabel lblTaskTide;
    private javax.swing.JLabel lblTotal1;
    private javax.swing.JTable tblTabelaDoOrcamentoDaEmpresa;
} 
