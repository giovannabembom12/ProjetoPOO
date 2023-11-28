package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

import model.dao.Conexao;

import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class OrcamentoEventoView extends javax.swing.JFrame {
	
	private int quantidadeAdultos;
	private int quantidadeCriancas;
	private double total = 0.0;
    private boolean modoEdicao = false;

    public OrcamentoEventoView() {
        initComponents();
        preencherComboBoxNomesEventos();
        obterQuantidadesConvidadosDoBanco();
        preencherCategoriasNoComboBox();

        jcbComAsCategorias.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jcbComAsCategoriasActionPerformed(evt);
            } });
      
    }

    private void initComponents() {

        jpnAzulExterno = new javax.swing.JPanel();
        jpnMenuBranco = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        lblTaskTide = new javax.swing.JLabel();
        btnManualDoUsuario = new javax.swing.JButton();
        btnSobreNos = new javax.swing.JButton();
        btnConfiguracoesESuporte = new javax.swing.JButton();
        jpnBrancoOrcamentoEvento = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbTabelaDosProdutosAdicionados = new javax.swing.JTable();
        jpnAzulTotal = new javax.swing.JPanel();
        lblTotal = new javax.swing.JLabel();
        jpnPainelQueMostraOValorTotal = new javax.swing.JPanel();
        lblMostraOValorTotal = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();
        lblOrcamentoDoEvento = new javax.swing.JLabel();
        jpnAdicionarProdutos = new javax.swing.JPanel();
        lblAdicionarProdutos = new javax.swing.JLabel();
        lblQuantCrianças = new javax.swing.JLabel();
        jcbComAsCategorias = new javax.swing.JComboBox<>();
        lblSelecioneOEvento = new javax.swing.JLabel();
        jcbComNomesDosEventos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbTabelaDeProdutos = new javax.swing.JTable();
        btnVoltar = new javax.swing.JButton();
        lblEscolhaACategoria1 = new javax.swing.JLabel();
        lblQuantAdultos = new javax.swing.JLabel();
        txtQuantidadeCriancas = new javax.swing.JTextField();
        txtQuantidadeAdultos = new javax.swing.JTextField();
        btnAdicionar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Orçamento de evento");

        jpnAzulExterno.setBackground(new java.awt.Color(22, 43, 64));
        jpnAzulExterno.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jpnAzulExterno.setLayout(null);

        jpnMenuBranco.setBackground(new java.awt.Color(255, 255, 255));
        jpnMenuBranco.setLayout(null);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Sobre nós");
        jButton2.setBorder(null);
        jpnMenuBranco.add(jButton2);
        jButton2.setBounds(440, 96, 67, 27);

        lblTaskTide.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblTaskTide.setForeground(new java.awt.Color(0, 0, 0));
        lblTaskTide.setText("TaskTide");
        jpnMenuBranco.add(lblTaskTide);
        lblTaskTide.setBounds(130, 30, 110, 30);

        btnManualDoUsuario.setBackground(new java.awt.Color(255, 255, 255));
        btnManualDoUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnManualDoUsuario.setForeground(new java.awt.Color(0, 0, 0));
        btnManualDoUsuario.setText("Manual do Usuário");
        btnManualDoUsuario.setBorder(null);
        btnManualDoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManualDoUsuarioActionPerformed(evt);
            }
        });
        jpnMenuBranco.add(btnManualDoUsuario);
        btnManualDoUsuario.setBounds(980, 30, 180, 30);

        btnSobreNos.setBackground(new java.awt.Color(255, 255, 255));
        btnSobreNos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSobreNos.setForeground(new java.awt.Color(0, 0, 0));
        btnSobreNos.setText("Sobre nós");
        btnSobreNos.setBorder(null);
        jpnMenuBranco.add(btnSobreNos);
        btnSobreNos.setBounds(410, 30, 80, 30);

        btnConfiguracoesESuporte.setBackground(new java.awt.Color(255, 255, 255));
        btnConfiguracoesESuporte.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnConfiguracoesESuporte.setForeground(new java.awt.Color(0, 0, 0));
        btnConfiguracoesESuporte.setText("Configurações e suporte");
        btnConfiguracoesESuporte.setBorder(null);
        btnConfiguracoesESuporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfiguracoesESuporteActionPerformed(evt);
            }
        });
        jpnMenuBranco.add(btnConfiguracoesESuporte);
        btnConfiguracoesESuporte.setBounds(660, 30, 180, 30);

        jpnAzulExterno.add(jpnMenuBranco);
        jpnMenuBranco.setBounds(0, 0, 1920, 90);

        jpnBrancoOrcamentoEvento.setBackground(new java.awt.Color(255, 255, 255));
        jpnBrancoOrcamentoEvento.setLayout(null);

        jtbTabelaDosProdutosAdicionados.setBackground(new java.awt.Color(255, 255, 255));
        jtbTabelaDosProdutosAdicionados.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtbTabelaDosProdutosAdicionados.setForeground(new java.awt.Color(0, 0, 0));
        jtbTabelaDosProdutosAdicionados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Fornecedor", "Categoria", "Quantidade", "Valor Unit."
            }
        ));
        jtbTabelaDosProdutosAdicionados.setShowGrid(false);
        jtbTabelaDosProdutosAdicionados.setShowHorizontalLines(true);
        jtbTabelaDosProdutosAdicionados.setShowVerticalLines(true);
        jScrollPane2.setViewportView(jtbTabelaDosProdutosAdicionados);

        jpnBrancoOrcamentoEvento.add(jScrollPane2);
        jScrollPane2.setBounds(20, 50, 580, 470);

        jpnAzulTotal.setBackground(new java.awt.Color(22, 43, 64));

        lblTotal.setBackground(new java.awt.Color(255, 255, 255));
        lblTotal.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(255, 255, 255));
        lblTotal.setText("Total");

        javax.swing.GroupLayout jpnAzulTotalLayout = new javax.swing.GroupLayout(jpnAzulTotal);
        jpnAzulTotal.setLayout(jpnAzulTotalLayout);
        jpnAzulTotalLayout.setHorizontalGroup(
            jpnAzulTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnAzulTotalLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jpnAzulTotalLayout.setVerticalGroup(
            jpnAzulTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnAzulTotalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTotal)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jpnBrancoOrcamentoEvento.add(jpnAzulTotal);
        jpnAzulTotal.setBounds(20, 540, 100, 40);

        jpnPainelQueMostraOValorTotal.setBackground(new java.awt.Color(255, 255, 255));
        jpnPainelQueMostraOValorTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpnPainelQueMostraOValorTotal.setForeground(new java.awt.Color(0, 0, 0));

        lblMostraOValorTotal.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblMostraOValorTotal.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jpnPainelQueMostraOValorTotalLayout = new javax.swing.GroupLayout(jpnPainelQueMostraOValorTotal);
        jpnPainelQueMostraOValorTotal.setLayout(jpnPainelQueMostraOValorTotalLayout);
        jpnPainelQueMostraOValorTotalLayout.setHorizontalGroup(
            jpnPainelQueMostraOValorTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnPainelQueMostraOValorTotalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMostraOValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpnPainelQueMostraOValorTotalLayout.setVerticalGroup(
            jpnPainelQueMostraOValorTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMostraOValorTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        jpnBrancoOrcamentoEvento.add(jpnPainelQueMostraOValorTotal);
        jpnPainelQueMostraOValorTotal.setBounds(120, 540, 108, 40);

        btnExcluir.setBackground(new java.awt.Color(22, 43, 64));
        btnExcluir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        jpnBrancoOrcamentoEvento.add(btnExcluir);
        btnExcluir.setBounds(510, 550, 90, 30);

        lblOrcamentoDoEvento.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblOrcamentoDoEvento.setForeground(new java.awt.Color(0, 0, 0));
        lblOrcamentoDoEvento.setText("Orçamento do Evento");
        jpnBrancoOrcamentoEvento.add(lblOrcamentoDoEvento);
        lblOrcamentoDoEvento.setBounds(20, 10, 190, 25);

        jpnAzulExterno.add(jpnBrancoOrcamentoEvento);
        jpnBrancoOrcamentoEvento.setBounds(830, 150, 620, 600);

        jpnAdicionarProdutos.setBackground(new java.awt.Color(255, 255, 255));
        jpnAdicionarProdutos.setLayout(null);

        lblAdicionarProdutos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAdicionarProdutos.setForeground(new java.awt.Color(0, 0, 0));
        lblAdicionarProdutos.setText("Adicionar Produtos");
        jpnAdicionarProdutos.add(lblAdicionarProdutos);
        lblAdicionarProdutos.setBounds(20, 10, 190, 25);

        lblQuantCrianças.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblQuantCrianças.setForeground(new java.awt.Color(0, 0, 0));
        lblQuantCrianças.setText("Quant. Crianças:");
        jpnAdicionarProdutos.add(lblQuantCrianças);
        lblQuantCrianças.setBounds(430, 130, 120, 20);

        jcbComAsCategorias.setBackground(new java.awt.Color(255, 255, 255));
        jcbComAsCategorias.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jcbComAsCategorias.setForeground(new java.awt.Color(0, 0, 0));
        jcbComAsCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbComAsCategoriasActionPerformed(evt);
            }

        });
        jpnAdicionarProdutos.add(jcbComAsCategorias);
        jcbComAsCategorias.setBounds(20, 160, 170, 30);

        lblSelecioneOEvento.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblSelecioneOEvento.setForeground(new java.awt.Color(0, 0, 0));
        lblSelecioneOEvento.setText("Selecione o evento:");
        jpnAdicionarProdutos.add(lblSelecioneOEvento);
        lblSelecioneOEvento.setBounds(20, 50, 160, 20);

        jcbComNomesDosEventos.setBackground(new java.awt.Color(255, 255, 255));
        jcbComNomesDosEventos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jcbComNomesDosEventos.setForeground(new java.awt.Color(0, 0, 0));
        jcbComNomesDosEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbComNomesDosEventosActionPerformed(evt);
            }

			private void jcbComNomesDosEventosActionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				
			}
        });
        jpnAdicionarProdutos.add(jcbComNomesDosEventos);
        jcbComNomesDosEventos.setBounds(20, 80, 550, 40);

        jtbTabelaDeProdutos.setBackground(new java.awt.Color(255, 255, 255));
        jtbTabelaDeProdutos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtbTabelaDeProdutos.setForeground(new java.awt.Color(0, 0, 0));
        jtbTabelaDeProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Fornecedor", "Categoria", "Valor Unit."
            }
        ));
        jtbTabelaDeProdutos.setShowGrid(false);
        jtbTabelaDeProdutos.setShowHorizontalLines(true);
        jtbTabelaDeProdutos.setShowVerticalLines(true);
        jScrollPane1.setViewportView(jtbTabelaDeProdutos);

        jpnAdicionarProdutos.add(jScrollPane1);
        jScrollPane1.setBounds(20, 210, 550, 310);

        btnVoltar.setBackground(new java.awt.Color(22, 43, 64));
        btnVoltar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        jpnAdicionarProdutos.add(btnVoltar);
        btnVoltar.setBounds(20, 550, 110, 30);

        lblEscolhaACategoria1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblEscolhaACategoria1.setForeground(new java.awt.Color(0, 0, 0));
        lblEscolhaACategoria1.setText("Escolha a categoria:");
        jpnAdicionarProdutos.add(lblEscolhaACategoria1);
        lblEscolhaACategoria1.setBounds(20, 130, 160, 20);

        lblQuantAdultos.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblQuantAdultos.setForeground(new java.awt.Color(0, 0, 0));
        lblQuantAdultos.setText("Quant. Adultos:");
        jpnAdicionarProdutos.add(lblQuantAdultos);
        lblQuantAdultos.setBounds(240, 130, 110, 20);

        txtQuantidadeCriancas.setBackground(new java.awt.Color(255, 255, 255));
        txtQuantidadeCriancas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtQuantidadeCriancas.setForeground(new java.awt.Color(0, 0, 0));
        jpnAdicionarProdutos.add(txtQuantidadeCriancas);
        txtQuantidadeCriancas.setBounds(430, 160, 140, 30);

        txtQuantidadeAdultos.setBackground(new java.awt.Color(255, 255, 255));
        txtQuantidadeAdultos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtQuantidadeAdultos.setForeground(new java.awt.Color(0, 0, 0));
        jpnAdicionarProdutos.add(txtQuantidadeAdultos);
        txtQuantidadeAdultos.setBounds(240, 160, 130, 30);

        btnAdicionar.setBackground(new java.awt.Color(22, 43, 64));
        btnAdicionar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAdicionar.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });
        jpnAdicionarProdutos.add(btnAdicionar);
        btnAdicionar.setBounds(460, 550, 110, 30);

        btnEditar.setBackground(new java.awt.Color(22, 43, 64));
        btnEditar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jpnAdicionarProdutos.add(btnEditar);
        btnEditar.setBounds(340, 550, 100, 30);

        jpnAzulExterno.add(jpnAdicionarProdutos);
        jpnAdicionarProdutos.setBounds(80, 150, 620, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnAzulExterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnAzulExterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
       
        btnAdicionar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String quantidadeAdultosText = txtQuantidadeAdultos.getText().trim();
                String quantidadeCriancasText = txtQuantidadeCriancas.getText().trim();

                if (quantidadeAdultosText.isEmpty() && quantidadeCriancasText.isEmpty()) {
                    JOptionPane.showMessageDialog(OrcamentoEventoView.this, "Por favor, informe pelo menos uma quantidade (adultos ou crianças).");
                    return; 
                }

                DefaultTableModel modelProdutos = (DefaultTableModel) jtbTabelaDeProdutos.getModel();
                DefaultTableModel modelProdutosAdicionados = (DefaultTableModel) jtbTabelaDosProdutosAdicionados.getModel();

                int[] selectedRows = jtbTabelaDeProdutos.getSelectedRows();

                for (int row : selectedRows) {
                    String nome = modelProdutos.getValueAt(row, 0).toString();
                    String fornecedor = modelProdutos.getValueAt(row, 1).toString();
                    String categoria = modelProdutos.getValueAt(row, 2).toString();
                    double valorUnit = (Double) modelProdutos.getValueAt(row, 3);

                    double quantidade = (quantidadeCriancas + quantidadeAdultos) * 5;
                    modelProdutosAdicionados.addRow(new Object[]{nome, fornecedor, categoria, quantidade, valorUnit});
                }

                txtQuantidadeAdultos.setEditable(false);
                txtQuantidadeCriancas.setEditable(false);

                
                atualizarTotal();

                int quantidadeAdultos = 0;
                int quantidadeCriancas = 0;

                if (!quantidadeAdultosText.isEmpty()) {
                    quantidadeAdultos = Integer.parseInt(quantidadeAdultosText);
                }

                if (!quantidadeCriancasText.isEmpty()) {
                    quantidadeCriancas = Integer.parseInt(quantidadeCriancasText);
                }

                Connection conn = null;
                PreparedStatement stmt = null;

                try {
                    conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/tasktide?user=root&password=250207gioVanna");

                    String sql = "INSERT INTO tbQuantConvidados (quantidade_criancas, quantidade_adultos) VALUES (?, ?)";
                    stmt = conn.prepareStatement(sql);
                    stmt.setInt(1, quantidadeCriancas);
                    stmt.setInt(2, quantidadeAdultos);

                    int rowsInserted = stmt.executeUpdate();
                
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(OrcamentoEventoView.this, "Erro: " + ex.getMessage());
                } finally {
                    try {
                        if (stmt != null) {
                            stmt.close();
                        }
                        if (conn != null) {
                            conn.close();
                        }
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }}}});
      
        //C A T E G O R I A S

        btnExcluir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int[] selectedRows = jtbTabelaDosProdutosAdicionados.getSelectedRows();
                DefaultTableModel modelDosProdutosAdicionados = (DefaultTableModel) jtbTabelaDosProdutosAdicionados.getModel();
                for (int i = selectedRows.length - 1; i >= 0; i--) {
                    modelDosProdutosAdicionados.removeRow(selectedRows[i]);
                } atualizarTotal();
 }     
        });    }

    private void jcbComAsCategoriasActionPerformed(ActionEvent evt) {
        String categoriaSelecionada = jcbComAsCategorias.getSelectedItem().toString();
        if (categoriaSelecionada.equals(" ")) {
            atualizarTabelaProdutos();
        } else {
            filtrarProdutosPorCategoria(categoriaSelecionada);
        } }
    
    private void atualizarTabelaProdutos() {
        DefaultTableModel model = (DefaultTableModel) jtbTabelaDeProdutos.getModel();
        model.setRowCount(0);

        Conexao conexao = new Conexao();
        Connection conn = conexao.conectaBD();

        if (conn != null) {
            try {
                String query = "SELECT * FROM tbproduto";
                PreparedStatement ps = conn.prepareStatement(query);

                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    String nome = rs.getString("nome");
                    String fornecedor = rs.getString("fornecedor");
                    String categoria = rs.getString("categoria");
                    double valorUnit = rs.getDouble("valorUnit");

                    model.addRow(new Object[]{nome, fornecedor, categoria, valorUnit});
                }
                rs.close();
                ps.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao buscar produtos: " + e.getMessage());
            } finally {
                try {
                    conn.close();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão: " + e.getMessage());
                } } }
    }
    private void preencherCategoriasNoComboBox() {
        Conexao conexao = new Conexao();
        Connection conn = conexao.conectaBD();

        try {
            String query = "SELECT DISTINCT categoria FROM tbproduto";
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                String categoria = rs.getString("categoria");
                jcbComAsCategorias.addItem(categoria);
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher o JComboBox: " + e.getMessage());
        }
    }

    private void filtrarProdutosPorCategoria(String categoriaSelecionada) {
        DefaultTableModel model = (DefaultTableModel) jtbTabelaDeProdutos.getModel();
        model.setRowCount(0);

        Conexao conexao = new Conexao();
        Connection conn = conexao.conectaBD();

        if (conn != null) {
            try {
                String query;
                PreparedStatement ps;

                if (categoriaSelecionada.equals("Todas as categorias")) {
                    query = "SELECT * FROM tbproduto";
                    ps = conn.prepareStatement(query);
                } else {
                    query = "SELECT * FROM tbproduto WHERE categoria = ?";
                    ps = conn.prepareStatement(query);
                    ps.setString(1, categoriaSelecionada);
                }

                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    String nome = rs.getString("nome");
                    String fornecedor = rs.getString("fornecedor");
                    double valorUnit = rs.getDouble("valorUnit");

                    if (categoriaSelecionada.equals("Todas as categorias")) {
                        categoriaSelecionada = rs.getString("categoria");
                    }

                    model.addRow(new Object[]{nome, fornecedor, categoriaSelecionada, valorUnit});
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
           }
        }
    }

    //i can see you, come back for more, come back for more 
    
    public void atualizarTotal() {
        DefaultTableModel modelProdutosAdicionados = (DefaultTableModel) jtbTabelaDosProdutosAdicionados.getModel();
        double valorTotal = 0.0;

        for (int row = 0; row < modelProdutosAdicionados.getRowCount(); row++) {
            double quantidade = Double.parseDouble(modelProdutosAdicionados.getValueAt(row, 3).toString()); 
            double valorUnitario = Double.parseDouble(modelProdutosAdicionados.getValueAt(row, 4).toString()); 

            valorTotal += quantidade * valorUnitario;
        }

        lblMostraOValorTotal.setText("R$" + String.format("%.2f", valorTotal));
    }
  
    
    private void preencherComboBoxNomesEventos() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/tasktide?user=root&password=250207gioVanna");

            String sql = "SELECT nome FROM tbEvento";
            stmt = conn.prepareStatement(sql);

            rs = stmt.executeQuery();

            jcbComNomesDosEventos.removeAllItems();

            jcbComNomesDosEventos.addItem("");// talvez eu tire, nhê nhêworkc

            while (rs.next()) {
                String nomeEvento = rs.getString("nome");
                jcbComNomesDosEventos.addItem(nomeEvento);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private void obterQuantidadesConvidadosDoBanco() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/TaskTide?user=root&password=250207gioVanna");

            String sql = "SELECT quantidade_criancas, quantidade_adultos FROM tbQuantConvidados";
            stmt = conn.prepareStatement(sql);

            rs = stmt.executeQuery();

            if (rs.next()) {
                quantidadeCriancas = rs.getInt("quantidade_criancas");
                quantidadeAdultos = rs.getInt("quantidade_adultos");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao obter quantidades de convidados do banco: " + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {                                          
    }                                         

        private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {
            if (!modoEdicao) {
                txtQuantidadeAdultos.setEditable(false);
                txtQuantidadeCriancas.setEditable(false);
            } else {
                String quantidadeAdultosText = txtQuantidadeAdultos.getText().trim();
                String quantidadeCriancasText = txtQuantidadeCriancas.getText().trim();

                txtQuantidadeAdultos.setEditable(false);
                txtQuantidadeCriancas.setEditable(false);
            }
        }
        
        public void calcularValorTotal() {
            DefaultTableModel modelProdutosAdicionados = (DefaultTableModel) jtbTabelaDosProdutosAdicionados.getModel();
            double valorTotal = 0.0;

            for (int row = 0; row < modelProdutosAdicionados.getRowCount(); row++) {
                double quantidade = Double.parseDouble(modelProdutosAdicionados.getValueAt(row, 3).toString());
                double valorUnitario = Double.parseDouble(modelProdutosAdicionados.getValueAt(row, 4).toString());

                valorTotal += quantidade * valorUnitario;
            }

            atualizarTotal(valorTotal);
        }



        public void atualizarTotal(double valorTotal) {
            lblMostraOValorTotal.setText("R$" + String.format("%.2f", valorTotal));
        }


        private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {
            modoEdicao = !modoEdicao;

            if (modoEdicao) {
                txtQuantidadeAdultos.setEditable(true);
                txtQuantidadeCriancas.setEditable(true);
            } else {
                btnAdicionarActionPerformed(evt);
            }
        }               
        
    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {                                           
    }                                          

    private void btnManualDoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {                                                   
    }                                                  

    private void btnConfiguracoesESuporteActionPerformed(java.awt.event.ActionEvent evt) {                                                         
    }                                                        

    private void txtQuantidadeAdultosActionPerformed(java.awt.event.ActionEvent evt) {                                                     
    }                                                    

    private void txtQuantidadeCriancasActionPerformed(java.awt.event.ActionEvent evt) {                                                      
    }                                                     
    
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrcamentoEventoView().setVisible(true);
                
            }
        });
}
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnConfiguracoesESuporte;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnManualDoUsuario;
    private javax.swing.JButton btnSobreNos;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> jcbComAsCategorias;
    private javax.swing.JComboBox<String> jcbComNomesDosEventos;
    private javax.swing.JPanel jpnAdicionarProdutos;
    private javax.swing.JPanel jpnAzulExterno;
    private javax.swing.JPanel jpnAzulTotal;
    private javax.swing.JPanel jpnBrancoOrcamentoEvento;
    private javax.swing.JPanel jpnMenuBranco;
    private javax.swing.JPanel jpnPainelQueMostraOValorTotal;
    private javax.swing.JTable jtbTabelaDeProdutos;
    private javax.swing.JTable jtbTabelaDosProdutosAdicionados;
    private javax.swing.JLabel lblAdicionarProdutos;
    private javax.swing.JLabel lblEscolhaACategoria1;
    private javax.swing.JLabel lblMostraOValorTotal;
    private javax.swing.JLabel lblOrcamentoDoEvento;
    private javax.swing.JLabel lblQuantAdultos;
    private javax.swing.JLabel lblQuantCrianças;
    private javax.swing.JLabel lblSelecioneOEvento;
    private javax.swing.JLabel lblTaskTide;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTextField txtQuantidadeAdultos;
    private javax.swing.JTextField txtQuantidadeCriancas;
}