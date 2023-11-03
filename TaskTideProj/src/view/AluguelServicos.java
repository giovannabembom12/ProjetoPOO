package view;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.dao.AluguelServicosDAO;
import model.dao.FuncDAO;
import model.vo.AluguelServicosVO;
import model.vo.FuncVO;
public class AluguelServicos extends javax.swing.JFrame {
	public double total, valorUtilitario, subTotal;
	int quantidade;
	DefaultTableModel carrinho;
	public AluguelServicos() {
		initComponents();
	}
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {
		jPanel1 = new javax.swing.JPanel();
		lblNome = new javax.swing.JLabel();
		lblCPF = new javax.swing.JLabel();
		lblCodigo = new javax.swing.JLabel();
		lblProduto = new javax.swing.JLabel();
		lblQuantidade = new javax.swing.JLabel();
		lblValorUnitario = new javax.swing.JLabel();
		btnPesquisarCliente = new javax.swing.JButton();
		btnPesquisarCodigo = new javax.swing.JButton();
		btnAdicionarItem = new javax.swing.JButton();
		txtNome = new javax.swing.JTextField();
		txtCodigoServico = new javax.swing.JTextField();
		txtProduto = new javax.swing.JTextField();
		txtQuantidade = new javax.swing.JTextField();
		txtValorUnitario = new javax.swing.JTextField();
		jScrollPane1 = new javax.swing.JScrollPane();
		tblServicos = new javax.swing.JTable();
		jPanel3 = new javax.swing.JPanel();
		lblTotal = new javax.swing.JLabel();
		txtTotal = new javax.swing.JTextField();
		lblRSTotal = new javax.swing.JLabel();
		lblDadosServico = new javax.swing.JLabel();
		separadorServicoC = new javax.swing.JSeparator();
		lblDadosCliente = new javax.swing.JLabel();
		separadorClienteC = new javax.swing.JSeparator();
		separadorClienteB = new javax.swing.JSeparator();
		separadorServicoB = new javax.swing.JSeparator();
		txtCodigoEvento = new javax.swing.JTextField();
		btnVoltar = new javax.swing.JButton();
		btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
		
		btnSalvar = new javax.swing.JButton();
		btnSalvar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					btnSalvarActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		lblAlguelServicos = new javax.swing.JLabel();
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setExtendedState(6);
		setMaximumSize(new java.awt.Dimension(310716, 310716));
		setMinimumSize(new java.awt.Dimension(1920, 1080));
		setPreferredSize(new java.awt.Dimension(800, 600));
		jPanel1.setBackground(new java.awt.Color(255, 255, 255));
		lblNome.setText("Nome:");
		lblCPF.setText("Código:");
		lblCodigo.setText("Código:");
		lblProduto.setText("Produto:");
		lblQuantidade.setText("Quantidade:");
		lblValorUnitario.setText("Valor Unitário:");
		btnPesquisarCliente.setBackground(new java.awt.Color(102, 102, 255));
		btnPesquisarCliente.setForeground(new java.awt.Color(255, 255, 255));
		btnPesquisarCliente.setText("Pesquisar");
		btnPesquisarCodigo.setBackground(new java.awt.Color(102, 102, 255));
		btnPesquisarCodigo.setForeground(new java.awt.Color(255, 255, 255));
		btnPesquisarCodigo.setText("Pesquisar");
		btnAdicionarItem.setBackground(new java.awt.Color(102, 102, 255));
		btnAdicionarItem.setForeground(new java.awt.Color(255, 255, 255));
		btnAdicionarItem.setText("Adicionar Item");
		btnAdicionarItem.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnAdicionarItemActionPerformed(evt);
			}
		});
		tblServicos.setModel(new javax.swing.table.DefaultTableModel(
	 new Object [][] {
	 },
	 new String [] {
	 "Código", "Nome", "Quantidade", "Preço"
	 }
	 ) {
	 boolean[] canEdit = new boolean [] {
	 false, false, true, true
	 };
	 public boolean isCellEditable(int rowIndex, int columnIndex) {
	 return canEdit [columnIndex];
	 }
	 });
	 jScrollPane1.setViewportView(tblServicos);
		lblTotal.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
		lblTotal.setText("Total:");
		txtTotal.setBackground(new java.awt.Color(242, 242, 242));
		txtTotal.setBorder(null);
		lblRSTotal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
		lblRSTotal.setText("R$");
		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup().addContainerGap(193, Short.MAX_VALUE)
						.addComponent(lblTotal).addGap(18, 18, 18).addComponent(lblRSTotal)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(txtTotal,
								javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(185, 185, 185)));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup().addGap(44, 44, 44).addGroup(jPanel3Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(txtTotal)
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lblRSTotal).addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addGap(33, 33, 33)));
		lblDadosServico.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
		lblDadosServico.setForeground(new java.awt.Color(102, 102, 102));
		lblDadosServico.setText("Dados do Serviço ");
		lblDadosCliente.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
		lblDadosCliente.setForeground(new java.awt.Color(102, 102, 102));
		lblDadosCliente.setText("Dados do Evento ");
		btnVoltar.setBackground(new java.awt.Color(102, 102, 255));
		btnVoltar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
		btnVoltar.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Downloads\\seta.png")); // NOI18N
		btnVoltar.setText("Voltar");
		btnSalvar.setBackground(new java.awt.Color(102, 102, 255));
		btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
		btnSalvar.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Downloads\\salve-.png")); // NOI18N
		btnSalvar.setText("Salvar");
		lblAlguelServicos.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
		lblAlguelServicos.setText("Aluguel de Serviços ");
		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(520, 520, 520)
								.addComponent(lblAlguelServicos))
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
								.addGroup(javax.swing.GroupLayout.Alignment.LEADING,
										jPanel1Layout.createSequentialGroup()
												.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 110,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(41, 41, 41).addComponent(btnSalvar,
														javax.swing.GroupLayout.PREFERRED_SIZE, 110,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(javax.swing.GroupLayout.Alignment.LEADING,
										jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(jPanel1Layout.createSequentialGroup().addGap(163, 163, 163)
														.addGroup(jPanel1Layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																.addGroup(jPanel1Layout.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.TRAILING)
																		.addGroup(jPanel1Layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING,
																				false)
																				.addGroup(jPanel1Layout
																						.createSequentialGroup()
																						.addComponent(lblCPF)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(txtCodigoEvento))
																				.addGroup(jPanel1Layout
																						.createSequentialGroup()
																						.addComponent(lblNome)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(txtNome,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								172,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																				.addComponent(separadorClienteB,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						214,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addGroup(jPanel1Layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING,
																				false)
																				.addGroup(jPanel1Layout
																						.createSequentialGroup()
																						.addComponent(lblDadosServico)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(separadorServicoC,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								120,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																				.addGroup(jPanel1Layout
																						.createSequentialGroup()
																						.addComponent(lblValorUnitario)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(txtValorUnitario))
																				.addGroup(jPanel1Layout
																						.createSequentialGroup()
																						.addComponent(lblQuantidade)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(txtQuantidade))
																				.addGroup(
																						javax.swing.GroupLayout.Alignment.TRAILING,
																						jPanel1Layout
																								.createSequentialGroup()
																								.addComponent(
																										lblProduto)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										txtProduto))
																				.addGroup(
																						javax.swing.GroupLayout.Alignment.TRAILING,
																						jPanel1Layout
																								.createSequentialGroup()
																								.addComponent(lblCodigo)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										txtCodigoServico,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										86,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										btnPesquisarCodigo)))
																		.addGroup(
																				javax.swing.GroupLayout.Alignment.LEADING,
																				jPanel1Layout.createSequentialGroup()
																						.addComponent(lblDadosCliente)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(separadorClienteC,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								121,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addComponent(separadorServicoB,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				220,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
																.addGroup(jPanel1Layout.createSequentialGroup()
																		.addGap(65, 65, 65)
																		.addComponent(btnAdicionarItem))))
												.addGroup(jPanel1Layout.createSequentialGroup().addGap(236, 236, 236)
														.addComponent(btnPesquisarCliente)))
												.addGap(124, 124, 124)
												.addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(jScrollPane1).addComponent(jPanel3,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)))))
						.addContainerGap(31, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(48, 48, 48).addComponent(lblAlguelServicos)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel1Layout.createSequentialGroup().addGap(71, 71, 71)
												.addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(lblDadosCliente).addComponent(separadorClienteC,
																javax.swing.GroupLayout.PREFERRED_SIZE, 10,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(lblNome).addComponent(txtNome,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGap(18, 18, 18)
												.addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(lblCPF).addComponent(txtCodigoEvento,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGap(18, 18, 18).addComponent(btnPesquisarCliente)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(separadorClienteB, javax.swing.GroupLayout.PREFERRED_SIZE,
														11, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(57, 57, 57)
												.addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(lblDadosServico).addComponent(separadorServicoC,
																javax.swing.GroupLayout.PREFERRED_SIZE, 10,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(lblCodigo).addComponent(btnPesquisarCodigo)
														.addComponent(txtCodigoServico,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGap(18, 18, 18)
												.addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(lblProduto).addComponent(txtProduto,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGap(18, 18, 18)
												.addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(lblQuantidade).addComponent(txtQuantidade,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGap(18, 18, 18)
												.addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(lblValorUnitario).addComponent(txtValorUnitario,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGap(18, 18, 18).addComponent(btnAdicionarItem)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(separadorServicoB, javax.swing.GroupLayout.PREFERRED_SIZE,
														11, javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel1Layout.createSequentialGroup().addGap(75, 75, 75)
												.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(18, 18, 18).addComponent(jPanel3,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(576, 576, 576)
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
														javax.swing.GroupLayout.PREFERRED_SIZE))))
						.addContainerGap(680, Short.MAX_VALUE)));
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		pack();
	}// </editor-fold>
	private void btnBuscarServicosActionPerformed(java.awt.event.ActionEvent evt) {
		AluguelServicosVO obj = new AluguelServicosVO();
		AluguelServicosDAO dao = new AluguelServicosDAO();
		obj = dao.BuscarServicos(Integer.parseInt(txtCodigoServico.getText()));
		txtNome.setText(obj.getNome());
		txtValorUnitario.setText(String.valueOf(obj.getValorUnit()));
	}
	private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {
		this.dispose();
		new TelaInicialView().setVisible(true); // Voltar para a tela de Menu
	}
	
	private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {
		this.dispose();
		new TelaInicialView().setVisible(true); // Voltar para a tela de Menu
	} 
	
	private void btnAdicionarItemActionPerformed(java.awt.event.ActionEvent evt) {
		quantidade = Integer.parseInt(txtQuantidade.getText());
		valorUtilitario = Double.parseDouble(txtValorUnitario.getText());
		subTotal = quantidade * valorUtilitario;
		total += subTotal;
		txtTotal.setText(String.valueOf(total));
		// Obtém o modelo da tabela (DefaultTableModel)
		DefaultTableModel carrinho = (DefaultTableModel) tblServicos.getModel();
		// Adiciona a nova linha ao modelo da tabela
		carrinho.addRow(new Object[] { txtCodigoServico.getText(), txtProduto.getText(), txtQuantidade.getText(),
				txtValorUnitario.getText(), subTotal });
	}
	private void txtCodigoKeyPressed(java.awt.event.KeyEvent evt) {
		AluguelServicosDAO dao = new AluguelServicosDAO();
		if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
			String codigoTexto = txtCodigoServico.getText();
			if (!codigoTexto.isEmpty()) {
				try {
					int codigo = Integer.parseInt(codigoTexto);
					AluguelServicosVO obj = dao.BuscaPorCodigo(codigo);
					if (obj != null) {
						txtNome.setText(obj.getNome());
						txtValorUnitario.setText(String.valueOf(obj.getValorUnit()));
					} else {
						// Lidar com o caso em que nenhum registro foi encontrado.
						txtNome.setText("Serviço não encontrado");
						txtValorUnitario.setText(""); // Limpar o campo de valor unitário
					}
				} catch (NumberFormatException e) {
					// Lidar com o caso em que o texto não pode ser convertido para um número.
					txtNome.setText("Código inválido");
					txtValorUnitario.setText(""); // Limpar o campo de valor unitário
				}
			} else {
				// Lidar com o caso em que o campo de código está vazio.
				txtNome.setText("Campo de código vazio");
				txtValorUnitario.setText(""); // Limpar o campo de valor unitário
			}
		}
	}
	
	private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {
		int codigo = Integer.parseInt (txtCodigoServico.getText());
		String nome = txtProduto.getText();
		int quant = Integer.parseInt (txtQuantidade.getText());
		float valor  = Float.parseFloat (txtValorUnitario.getText());		
		
		AluguelServicosVO obj = new AluguelServicosVO();
		obj.setCodigo(codigo);
		obj.setNome(nome);
		obj.setQuantidade(quant);
		obj.setValorUnit(valor);
		
		AluguelServicosDAO obje = new AluguelServicosDAO();
			obje.inserirServico(obj);
			JOptionPane.showMessageDialog(null, "Serviço incluído no evento com sucesso!");

	}
	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(AluguelServicos.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(AluguelServicos.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(AluguelServicos.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(AluguelServicos.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		}
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new AluguelServicos().setVisible(true);
			}
		});
	}
	// Variables declaration - do not modify
	private javax.swing.JButton btnAdicionarItem;
	private javax.swing.JButton btnPesquisarCliente;
	private javax.swing.JButton btnPesquisarCodigo;
	private javax.swing.JButton btnSalvar;
	private javax.swing.JButton btnVoltar;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JLabel lblAlguelServicos;
	private javax.swing.JLabel lblCPF;
	private javax.swing.JLabel lblCodigo;
	private javax.swing.JLabel lblDadosCliente;
	private javax.swing.JLabel lblDadosServico;
	private javax.swing.JLabel lblNome;
	private javax.swing.JLabel lblProduto;
	private javax.swing.JLabel lblQuantidade;
	private javax.swing.JLabel lblRSTotal;
	private javax.swing.JLabel lblTotal;
	private javax.swing.JLabel lblValorUnitario;
	private javax.swing.JSeparator separadorClienteB;
	private javax.swing.JSeparator separadorClienteC;
	private javax.swing.JSeparator separadorServicoB;
	private javax.swing.JSeparator separadorServicoC;
	private javax.swing.JTable tblServicos;
	private javax.swing.JTextField txtCodigoEvento;
	private javax.swing.JTextField txtCodigoServico;
	private javax.swing.JTextField txtNome;
	private javax.swing.JTextField txtProduto;
	private javax.swing.JTextField txtQuantidade;
	private javax.swing.JTextField txtTotal;
	private javax.swing.JTextField txtValorUnitario;
	// End of variables declaration
}
