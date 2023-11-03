package view;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import model.dao.AdicionarConsumo;
import model.dao.EventoDAO;
import model.vo.EventoVO;

public class TelaInicialV extends javax.swing.JFrame {

	EventoDAO dao;

    public TelaInicialV() {
        initComponents();
        listarEventos();
        try {
        	dao = new EventoDAO();
        }catch(Exception e) {
        	
        }
    }                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlAzul = new javax.swing.JPanel();
        pnlIdentificador = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnCalendario = new javax.swing.JButton();
        btnAssociados = new javax.swing.JButton();
        btnFinancas = new javax.swing.JButton();
        btnRelatorio = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnAdicionar = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        txtPesquisa = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEventos = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();
        btnSobreNos = new javax.swing.JButton();
        btnConf = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal");
        setExtendedState(6);
        setMinimumSize(new java.awt.Dimension(800, 600));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");

        pnlAzul.setBackground(new java.awt.Color(22, 43, 64));

        pnlIdentificador.setBackground(new java.awt.Color(255, 255, 255));
        pnlIdentificador.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Lilian Almeida");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Funcionário");

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\giova\\Downloads\\oie_653138c6toFnTN.png")); // NOI18N
        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout pnlIdentificadorLayout = new javax.swing.GroupLayout(pnlIdentificador);
        pnlIdentificador.setLayout(pnlIdentificadorLayout);
        pnlIdentificadorLayout.setHorizontalGroup(
            pnlIdentificadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIdentificadorLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlIdentificadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlIdentificadorLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1))
                    .addGroup(pnlIdentificadorLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel2)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        pnlIdentificadorLayout.setVerticalGroup(
            pnlIdentificadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIdentificadorLayout.createSequentialGroup()
                .addGroup(pnlIdentificadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlIdentificadorLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2))
                    .addGroup(pnlIdentificadorLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel3)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btnCalendario.setBackground(new java.awt.Color(22, 43, 64));
        btnCalendario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnCalendario.setForeground(new java.awt.Color(255, 255, 255));
        btnCalendario.setText("Calendário");
        btnCalendario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalendarioActionPerformed(evt);
            }
        });

        btnAssociados.setBackground(new java.awt.Color(22, 43, 64));
        btnAssociados.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnAssociados.setForeground(new java.awt.Color(255, 255, 255));
        btnAssociados.setText("Associados");
        btnAssociados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssociadosActionPerformed(evt);
            }
        });

        btnFinancas.setBackground(new java.awt.Color(22, 43, 64));
        btnFinancas.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnFinancas.setForeground(new java.awt.Color(255, 255, 255));
        btnFinancas.setText("Finanças");
        btnFinancas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinancasActionPerformed(evt);
            }
        });

        btnRelatorio.setBackground(new java.awt.Color(22, 43, 64));
        btnRelatorio.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnRelatorio.setForeground(new java.awt.Color(255, 255, 255));
        btnRelatorio.setText("Relatórios");
        btnRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioActionPerformed(evt);
            }
        });

        btnClientes.setBackground(new java.awt.Color(22, 43, 64));
        btnClientes.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnClientes.setText("Consumo");
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCalendario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAssociados, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                    .addComponent(btnFinancas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btnCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnAssociados, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnFinancas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(btnRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        btnAdicionar.setBackground(new java.awt.Color(255, 255, 255));
        btnAdicionar.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        btnAdicionar.setForeground(new java.awt.Color(0, 0, 0));
        btnAdicionar.setIcon(new javax.swing.ImageIcon("C:\\Users\\giova\\Downloads\\oie_655020Ns1RJCQ.png")); // NOI18N
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btneditar.setBackground(new java.awt.Color(255, 255, 255));
        btneditar.setIcon(new javax.swing.ImageIcon("C:\\Users\\giova\\Downloads\\oie_655133EDo1VnTB.png")); // NOI18N
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });

        txtPesquisa.setBackground(new java.awt.Color(204, 204, 204));
        txtPesquisa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPesquisa.setForeground(new java.awt.Color(0, 0, 0));
        txtPesquisa.setSelectionColor(new java.awt.Color(102, 102, 255));

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					btnBuscarActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        tblEventos.setBackground(new java.awt.Color(204, 204, 204));
        tblEventos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tblEventos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Data", "Local"
            }
        ));
        jScrollPane1.setViewportView(tblEventos);

        btnExcluir.setBackground(new java.awt.Color(255, 255, 255));
        btnExcluir.setIcon(new javax.swing.ImageIcon("C:\\Users\\giova\\Downloads\\oie_6830263EHdAUSf.png")); // NOI18N
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAzulLayout = new javax.swing.GroupLayout(pnlAzul);
        pnlAzul.setLayout(pnlAzulLayout);
        pnlAzulLayout.setHorizontalGroup(
            pnlAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAzulLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(pnlAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlIdentificador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(130, 130, 130)
                .addGroup(pnlAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btneditar, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(74, 74, 74)
                .addGroup(pnlAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(454, Short.MAX_VALUE))
        );
        pnlAzulLayout.setVerticalGroup(
            pnlAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAzulLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(pnlAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAzulLayout.createSequentialGroup()
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(pnlIdentificador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(pnlAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAzulLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlAzulLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btneditar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlAzulLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        btnSobreNos.setBackground(new java.awt.Color(255, 255, 255));
        btnSobreNos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSobreNos.setForeground(new java.awt.Color(0, 0, 0));
        btnSobreNos.setText("SOBRE NÓS");
        btnSobreNos.setBorder(null);

        btnConf.setBackground(new java.awt.Color(255, 255, 255));
        btnConf.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnConf.setForeground(new java.awt.Color(0, 0, 0));
        btnConf.setText("CONFIGURAÇÕES E SUPORTE");
        btnConf.setBorder(null);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\giova\\Downloads\\oie_655537wZLQTQAZ (1).png")); // NOI18N

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("TaskTide");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAzul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(193, 193, 193)
                .addComponent(btnSobreNos, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConf, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSobreNos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel4))
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 292, Short.MAX_VALUE)
                .addComponent(pnlAzul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1934, 1087));
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void btnCalendarioActionPerformed(java.awt.event.ActionEvent evt) {                                              
		/*
		 * CalendarioView login = new CalendarioView(); login.setVisible(true);
		 */   
    	    }                                             

    private void btnAssociadosActionPerformed(java.awt.event.ActionEvent evt) {                                              
    	 Associados login = new Associados();
    	    login.setVisible(true);    
    	    }                                             

    private void btnFinancasActionPerformed(java.awt.event.ActionEvent evt) {                                            
    	 Tabela login = new Tabela();
    	    login.setVisible(true);    }                                           

    private void btnRelatorioActionPerformed(java.awt.event.ActionEvent evt) {                                             
		/*
		 * Relatorio login = new Relatorio(); login.setVisible(true);
		 */   }                                            

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {                                             
		/*
		 * CadastroEventoV login = new CadastroEventoV(); login.setVisible(true);
		 */    
    	    }                                            

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {                                          
		/*
		 * EditarEvento login = new EditarEvento(); login.setVisible(true);
		 */
    }  
    
    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {                                          
	AdicionarConsumo login = new AdicionarConsumo(); 
	login.setVisible(true);
		 
    }                                         


    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {
    		pesquisarEventos(txtPesquisa.getText());
    	}
                                      

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {                                           
    	int selectedRow = tblEventos.getSelectedRow();
        if (selectedRow != -1) { // Verifique se uma linha foi selecionada
            int cod = (int) tblEventos.getValueAt(selectedRow, 0); // Supondo que a coluna 0 contenha o código do evento
            EventoDAO obje = new EventoDAO();
            boolean excluiuComSucesso = obje.excluirEventos(cod);

            if (excluiuComSucesso) {
                ((DefaultTableModel) tblEventos.getModel()).removeRow(selectedRow);
                JOptionPane.showMessageDialog(this, "Evento excluído com sucesso!");
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao excluir o evento!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um evento para excluir!");
        }
    
    }                                          

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaInicialV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicialV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicialV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicialV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicialV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnAssociados;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCalendario;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnConf;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFinancas;
    private javax.swing.JButton btnRelatorio;
    private javax.swing.JButton btnSobreNos;
    private javax.swing.JButton btneditar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlAzul;
    private javax.swing.JPanel pnlIdentificador;
    private javax.swing.JTable tblEventos;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration                   
 private void listarEventos() {
    	EventoDAO obje = new EventoDAO();
		DefaultTableModel model = (DefaultTableModel) tblEventos.getModel();
		model.setNumRows(0);
		
		ArrayList<EventoVO> lista = obje.listarEvento();
		
		for(int i=0; i<lista.size();i++) {
			model.addRow(new Object[] {
					lista.get(i).getId_event(),
					lista.get(i).getNome_e(),
					lista.get(i).getDt_event(),
					lista.get(i).getLocal()
			});
		}}
		
		private void pesquisarEventos(String nome) throws SQLException {
	    	EventoDAO obje = new EventoDAO();
			DefaultTableModel model = (DefaultTableModel) tblEventos.getModel();
			model.setNumRows(0);
			
			for(EventoVO novo : obje.pesquisarEventos(nome)) {
				model.addRow(new Object[] {
						novo.getId_event(),
						novo.getNome_e(),
						novo.getDt_event(),
						novo.getLocal()
				});
			}
}}