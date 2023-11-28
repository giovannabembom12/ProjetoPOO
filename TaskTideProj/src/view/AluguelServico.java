package view;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class AluguelServico extends javax.swing.JFrame {
	public double total, valorUtilitario, subTotal;
	int quantidade;
	DefaultTableModel carrinho;
	
	public AluguelServico() {
		initComponents();
	}
	@SuppressWarnings("unchecked")
	private void initComponents() {
		jScrollPane1 = new javax.swing.JScrollPane();
		tblServicos = new javax.swing.JTable();
		jPanel1 = new javax.swing.JPanel();
		jPanel2 = new javax.swing.JPanel();
		lblLogo = new javax.swing.JLabel();
		btnSalvar = new javax.swing.JButton();
		btnSobreNos = new javax.swing.JButton();
		btnConfiguracoesSuporte = new javax.swing.JButton();
		btnManualUsuario = new javax.swing.JButton();
		jPanel4 = new javax.swing.JPanel();
		jSeparator4 = new javax.swing.JSeparator();
		btnExcluir = new javax.swing.JButton();
		btnEditar = new javax.swing.JButton();
		jScrollPane2 = new javax.swing.JScrollPane();
		tblServicos1 = new javax.swing.JTable();
		txtTotal = new javax.swing.JTextField();
		lblTotal = new javax.swing.JLabel();
		lblRSTotal = new javax.swing.JLabel();
		jPanel5 = new javax.swing.JPanel();
		lblDadosEvento = new javax.swing.JLabel();
		lblAluguelServicos = new javax.swing.JLabel();
		lblCodigoEvento = new javax.swing.JLabel();
		lblNomeEvento = new javax.swing.JLabel();
		jSeparator5 = new javax.swing.JSeparator();
		jSeparator6 = new javax.swing.JSeparator();
		txtCodigoEvento = new javax.swing.JTextField();
		txtNomeEvento = new javax.swing.JTextField();
		btnBuscarEvento = new javax.swing.JButton();
		txtCodigoServico = new javax.swing.JTextField();
		txtQuantidadeServico = new javax.swing.JTextField();
		btnBuscarServico = new javax.swing.JButton();
		lblDadosServico = new javax.swing.JLabel();
		lblCodigoServico = new javax.swing.JLabel();
		lblQuantidadeServico = new javax.swing.JLabel();
		jSeparator7 = new javax.swing.JSeparator();
		jSeparator8 = new javax.swing.JSeparator();
		btnAddItem = new javax.swing.JButton();
		txtNomeServico = new javax.swing.JTextField();
		lblNomeServico = new javax.swing.JLabel();
		lblValorServico = new javax.swing.JLabel();
		btnVoltar = new javax.swing.JButton();
		txtValorServico = new javax.swing.JFormattedTextField();
		tblServicos.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {
		}, new String[] { "Código", "Nome", "Quantidade", "Preço" }) {
			boolean[] canEdit = new boolean[] { false, false, true, true };
			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		jScrollPane1.setViewportView(tblServicos);
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setExtendedState(6);
		setMaximumSize(new java.awt.Dimension(1024, 768));
		setMinimumSize(new java.awt.Dimension(800, 600));
		setPreferredSize(new java.awt.Dimension(800, 600));
		jPanel1.setBackground(new java.awt.Color(22, 43, 64));
		jPanel1.setMaximumSize(new java.awt.Dimension(1920, 1080));
		jPanel1.setMinimumSize(new java.awt.Dimension(1920, 1080));
		jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
		jPanel2.setBackground(new java.awt.Color(255, 255, 255));
		lblLogo.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Downloads\\LogoComFonte.png")); // NOI18N
		btnSobreNos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
		btnSobreNos.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Downloads\\IconeSobreNos.png")); // NOI18N
		btnSobreNos.setText(" Sobre Nós");
		btnSobreNos.setBorder(null);
		btnSobreNos.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnSobreNosActionPerformed(evt);
			}
		});
		btnConfiguracoesSuporte.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
		btnConfiguracoesSuporte.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Downloads\\IconeEngrenagem.png")); // NOI18N
		btnConfiguracoesSuporte.setText(" Configurações e Suporte");
		btnConfiguracoesSuporte.setBorder(null);
		btnConfiguracoesSuporte.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnConfiguracoesSuporteActionPerformed(evt);
			}
		});
		btnManualUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
		btnManualUsuario.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Downloads\\IconeManualUsuario.png")); // NOI18N
		btnManualUsuario.setText(" Manual do Usuário");
		btnManualUsuario.setBorder(null);
		btnManualUsuario.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnManualUsuarioActionPerformed(evt);
			}
		});
		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addGap(30, 30, 30).addComponent(lblLogo)
						.addGap(309, 309, 309).addComponent(btnSobreNos).addGap(120, 120, 120)
						.addComponent(btnConfiguracoesSuporte).addGap(120, 120, 120).addComponent(btnManualUsuario)
						.addContainerGap(450, Short.MAX_VALUE)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addGap(42, 42, 42)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(btnSobreNos).addComponent(btnConfiguracoesSuporte)
								.addComponent(btnManualUsuario))
						.addGap(0, 0, Short.MAX_VALUE))
				.addComponent(lblLogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE,
						100, Short.MAX_VALUE));
		jPanel4.setBackground(new java.awt.Color(255, 255, 255));
		jPanel4.setPreferredSize(new java.awt.Dimension(524, 500));
		jSeparator4.setForeground(new java.awt.Color(153, 153, 153));
		btnExcluir.setBackground(new java.awt.Color(22, 43, 64));
		btnExcluir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
		btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
		btnExcluir.setIcon(new javax.swing.JLabel() {
			public javax.swing.Icon getIcon() {
				try {
					return new javax.swing.ImageIcon(new java.net.URL("file:/C:/Users/PC/Downloads/IconeExcluir.png"));
				} catch (java.net.MalformedURLException e) {
				}
				return null;
			}
		}.getIcon());
		btnExcluir.setText(" Excluir");
		btnExcluir.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnExcluirActionPerformed(evt);
			}
		});
		btnEditar.setBackground(new java.awt.Color(22, 43, 64));
		btnEditar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
		btnEditar.setForeground(new java.awt.Color(255, 255, 255));
		btnEditar.setIcon(new javax.swing.JLabel() {
			public javax.swing.Icon getIcon() {
				try {
					return new javax.swing.ImageIcon(new java.net.URL("file:/C:/Users/PC/Downloads/IconeEditar.png"));
				} catch (java.net.MalformedURLException e) {
				}
				return null;
			}
		}.getIcon());
		btnEditar.setText("Editar");
		btnEditar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnEditarActionPerformed(evt);
			}
		});
		tblServicos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
		tblServicos.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {
		}, new String[] { "Código", "Nome", "Quantidade", "Preço" }) {
			boolean[] canEdit = new boolean[] { false, false, false, false };
			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		jScrollPane2.setViewportView(tblServicos);
		txtTotal.setBorder(null);
		txtTotal.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtTotalActionPerformed(evt);
			}
		});
		lblTotal.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
		lblTotal.setText("Total:");
		lblRSTotal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
		lblRSTotal.setText("R$");
		
		btnSalvar.setBackground(new java.awt.Color(22, 43, 64));
btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
btnSalvar.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Downloads\\IconeSalvar.png")); // NOI18N
btnSalvar.setText(" Salvar");
btnSalvar.setMaximumSize(new java.awt.Dimension(89, 27));
btnSalvar.setMinimumSize(new java.awt.Dimension(89, 27));
btnSalvar.setPreferredSize(new java.awt.Dimension(89, 27));
btnSalvar.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
btnSalvarActionPerformed(evt);
}
});
		 javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
jPanel4.setLayout(jPanel4Layout);
jPanel4Layout.setHorizontalGroup(
jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel4Layout.createSequentialGroup()
.addContainerGap(52, Short.MAX_VALUE)
.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(42, 42, 42))
.addGroup(jPanel4Layout.createSequentialGroup()
.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
.addGroup(jPanel4Layout.createSequentialGroup()
.addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(54, 54, 54)
.addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
.addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
.addContainerGap()))
.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
.addComponent(lblTotal)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addComponent(lblRSTotal)
.addGap(30, 30, 30)
.addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(100, 100, 100))))
);
jPanel4Layout.setVerticalGroup(
jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel4Layout.createSequentialGroup()
.addGap(43, 43, 43)
.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
.addGap(0, 0, Short.MAX_VALUE)
.addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
.addComponent(lblRSTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(18, 18, 18)
.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(29, 29, 29))
);
jPanel5.setBackground(new java.awt.Color(255, 255, 255));
lblDadosEvento.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
lblDadosEvento.setText("Dados do Evento");
lblAluguelServicos.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
lblAluguelServicos.setText("Aluguel de Serviços");
lblCodigoEvento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
lblCodigoEvento.setText("Código:");
lblNomeEvento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
lblNomeEvento.setText("Nome:");
jSeparator5.setForeground(new java.awt.Color(153, 153, 153));
jSeparator6.setForeground(new java.awt.Color(153, 153, 153));
txtCodigoEvento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
txtCodigoEvento.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
txtCodigoEventoActionPerformed(evt);
}
});
txtNomeEvento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
txtNomeEvento.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
txtNomeEventoActionPerformed(evt);
}
});
btnBuscarEvento.setBackground(new java.awt.Color(22, 43, 64));
btnBuscarEvento.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
btnBuscarEvento.setForeground(new java.awt.Color(255, 255, 255));
btnBuscarEvento.setText("Buscar");
btnBuscarEvento.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
btnBuscarEventoActionPerformed(evt);
}
});
txtCodigoServico.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
txtCodigoServico.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
txtCodigoServicoActionPerformed(evt);
}
});
txtQuantidadeServico.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
txtQuantidadeServico.setPreferredSize(new java.awt.Dimension(65, 30));
txtQuantidadeServico.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
txtQuantidadeServicoActionPerformed(evt);
}
});
btnBuscarServico.setBackground(new java.awt.Color(22, 43, 64));
		btnBuscarServico.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
		btnBuscarServico.setForeground(new java.awt.Color(255, 255, 255));
		btnBuscarServico.setText("Buscar");
		btnBuscarServico.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnBuscarServicoActionPerformed(evt);
			}
		});
lblDadosServico.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
lblDadosServico.setText("Dados do Serviço");
lblCodigoServico.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
lblCodigoServico.setText("Código:");
lblQuantidadeServico.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
lblQuantidadeServico.setText("Quantidade:");
jSeparator7.setForeground(new java.awt.Color(153, 153, 153));
jSeparator8.setForeground(new java.awt.Color(153, 153, 153));
btnAddItem.setBackground(new java.awt.Color(22, 43, 64));
btnAddItem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
btnAddItem.setForeground(new java.awt.Color(255, 255, 255));
btnAddItem.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Downloads\\IconeSalvar.png")); // NOI18N
btnAddItem.setText(" Adicionar Item");
btnAddItem.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
btnAddItemActionPerformed(evt);
}
});
txtNomeServico.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
lblNomeServico.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
lblNomeServico.setText("Nome:");
lblValorServico.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
lblValorServico.setText("Valor Unitário: ");
btnVoltar.setBackground(new java.awt.Color(22, 43, 64));
btnVoltar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
btnVoltar.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Downloads\\IconeVoltar.png")); // NOI18N
btnVoltar.setText(" Voltar");
btnVoltar.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
btnVoltarActionPerformed(evt);
}
});
txtValorServico.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
txtValorServico.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
txtValorServico.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
txtValorServicoActionPerformed(evt);
}
});
javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
jPanel5.setLayout(jPanel5Layout);
jPanel5Layout.setHorizontalGroup(
jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel5Layout.createSequentialGroup()
.addContainerGap(55, Short.MAX_VALUE)
.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
.addGap(0, 0, Short.MAX_VALUE)
.addComponent(lblAluguelServicos)
.addGap(146, 146, 146))
.addGroup(jPanel5Layout.createSequentialGroup()
.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGroup(jPanel5Layout.createSequentialGroup()
.addComponent(lblDadosEvento)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGroup(jPanel5Layout.createSequentialGroup()
.addComponent(lblDadosServico)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
.addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
.addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addComponent(btnAddItem))
.addComponent(jSeparator8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGroup(jPanel5Layout.createSequentialGroup()
.addGap(14, 14, 14)
.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel5Layout.createSequentialGroup()
.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(lblCodigoEvento)
.addComponent(lblNomeEvento))
.addGap(18, 18, 18)
.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
.addGroup(jPanel5Layout.createSequentialGroup()
.addComponent(txtCodigoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(18, 18, 18)
.addComponent(btnBuscarEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
.addComponent(txtNomeEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
.addGroup(jPanel5Layout.createSequentialGroup()
.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(lblQuantidadeServico)
.addComponent(lblNomeServico)
.addComponent(lblCodigoServico))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
.addGroup(jPanel5Layout.createSequentialGroup()
.addComponent(txtCodigoServico, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(18, 18, 18)
.addComponent(btnBuscarServico, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
.addComponent(txtNomeServico, javax.swing.GroupLayout.Alignment.TRAILING)
.addGroup(jPanel5Layout.createSequentialGroup()
.addComponent(txtQuantidadeServico, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(32, 32, 32)
.addComponent(lblValorServico)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addComponent(txtValorServico)))))))
.addContainerGap(46, Short.MAX_VALUE))))
);
jPanel5Layout.setVerticalGroup(
jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel5Layout.createSequentialGroup()
.addGap(31, 31, 31)
.addComponent(lblAluguelServicos)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
.addGroup(jPanel5Layout.createSequentialGroup()
.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
.addComponent(lblDadosEvento)
.addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(38, 38, 38))
.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(txtCodigoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(btnBuscarEvento)
.addComponent(lblCodigoEvento)))
.addGap(14, 14, 14)
.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(txtNomeEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(lblNomeEvento))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
.addComponent(lblDadosServico)
.addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(txtCodigoServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(btnBuscarServico)
.addComponent(lblCodigoServico))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(lblNomeServico)
.addComponent(txtNomeServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(lblQuantidadeServico)
.addComponent(txtQuantidadeServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(lblValorServico)
.addComponent(txtValorServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(18, 18, 18)
.addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(38, 38, 38)
.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(btnAddItem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(29, 29, 29))
);
javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
jPanel1.setLayout(jPanel1Layout);
jPanel1Layout.setHorizontalGroup(
jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel1Layout.createSequentialGroup()
.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(0, 284, Short.MAX_VALUE))
.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(647, 647, 647))
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel1Layout.createSequentialGroup()
.addGap(93, 93, 93)
.addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addContainerGap(1303, Short.MAX_VALUE)))
);
jPanel1Layout.setVerticalGroup(
jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel1Layout.createSequentialGroup()
.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(55, 55, 55)
.addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
.addContainerGap())
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel1Layout.createSequentialGroup()
.addGap(152, 152, 152)
.addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addContainerGap(428, Short.MAX_VALUE)))
);
javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
getContentPane().setLayout(layout);
layout.setHorizontalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1920, Short.MAX_VALUE)
);
layout.setVerticalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 768, Short.MAX_VALUE)
);
}// </editor-fold>
	private void btnConfiguracoesSuporteActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}
	private void btnManualUsuarioActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}
	private void btnSobreNosActionPerformed(java.awt.event.ActionEvent evt) {
		SobreNos sobrenos = new SobreNos();
		sobrenos.setVisible(true);
		this.dispose();
	}
	private void txtCodigoEventoActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}
	private void txtNomeEventoActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}
	private void btnBuscarEventoActionPerformed(java.awt.event.ActionEvent evt) {
		String codigoEvento = txtCodigoEvento.getText();
		if (!codigoEvento.isEmpty()) {
			String nomeEvento = buscarNomeDoEventoNoBanco(codigoEvento);
			if (nomeEvento != null) {
				txtNomeEvento.setText(nomeEvento);
			} else {
				JOptionPane.showMessageDialog(this, "Evento não encontrado no banco de dados", "Erro",
						JOptionPane.ERROR_MESSAGE);
			}
		} else {
			JOptionPane.showMessageDialog(this, "Campo Código do Evento está vazio", "Erro", JOptionPane.ERROR_MESSAGE);
		}
	}
	private String buscarNomeDoEventoNoBanco(String codigoEvento) {
		String nomeEvento = null;
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/tasktide", "root", "250207gioVanna");
			String sql = "SELECT nome_evento FROM tbEvento WHERE idevent = ?";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, codigoEvento);
			rs = stmt.executeQuery();
			if (rs.next()) {
				nomeEvento = rs.getString("nome_evento");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
		}
		return nomeEvento;
	}
	private void txtCodigoServicoActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}
	private void txtQuantidadeServicoActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}
	private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {
		quantidade = Integer.parseInt(txtQuantidadeServico.getText());
		valorUtilitario = Double.parseDouble(txtValorServico.getText());
		subTotal = quantidade * valorUtilitario;
		total += subTotal;
		txtTotal.setText(String.valueOf(total));
		// Obtém o modelo da tabela (DefaultTableModel)
		DefaultTableModel carrinho = (DefaultTableModel) tblServicos.getModel();
		// Adiciona a nova linha ao modelo da tabela
		carrinho.addRow(new Object[] { txtCodigoServico.getText(), txtNomeServico.getText(), txtQuantidadeServico.getText(),
				txtValorServico.getText(), subTotal });
	}
	private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {
		TelaInicialView menu = new TelaInicialView();
		menu.setVisible(true);
		this.dispose();
	}
	private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}
	private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {
		 // Obtém o modelo da tabela
		 DefaultTableModel model = (DefaultTableModel) tblServicos.getModel();
		 // Verifica se uma linha está selecionada
		 int selectedRow = tblServicos.getSelectedRow();
		 if (selectedRow == -1) {
		 // Nenhuma linha selecionada, exibe uma mensagem de erro
		 JOptionPane.showMessageDialog(this, "Selecione uma linha para editar.", "Erro", JOptionPane.ERROR_MESSAGE);
		 return;
		 }
	}
	private void btnBuscarServicoActionPerformed(java.awt.event.ActionEvent evt) {
		String codigoServico = txtCodigoServico.getText();
		if (!codigoServico.isEmpty()) {
			Servico servico = buscarServicoNoBanco(codigoServico);
			if (servico != null) {
				txtNomeServico.setText(servico.getNomeServico());
				txtValorServico.setText(Double.toString(servico.getValorUnit()));
			} else {
				JOptionPane.showMessageDialog(this, "Serviço não encontrado no banco de dados", "Erro",
						JOptionPane.ERROR_MESSAGE);
			}
		} else {
			JOptionPane.showMessageDialog(this, "Campo Código do Serviço está vazio", "Erro",
					JOptionPane.ERROR_MESSAGE);
		}
	}
	class Servico {
		private String nomeServico;
		private double valorUnit;
		public Servico(String nomeServico, double valorUnit) {
			this.nomeServico = nomeServico;
			this.valorUnit = valorUnit;
		}
		public String getNomeServico() {
			return nomeServico;
		}
		public double getValorUnit() {
			return valorUnit;
		}
	}
	private Servico buscarServicoNoBanco(String codigoServico) {
		Servico servico = null;
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/tasktide", "root", "250207gioVanna");
			String sql = "SELECT nome, valorUnit FROM tbproduto WHERE codigo = ?";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, codigoServico);
			rs = stmt.executeQuery();
			if (rs.next()) {
				String nomeServico = rs.getString("nome");
				double valorUnit = rs.getDouble("valorUnit");
				servico = new Servico(nomeServico, valorUnit);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
		}
		return servico;
	}
	private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {
	 // Obtém o modelo da tabela
	 DefaultTableModel model = (DefaultTableModel) tblServicos.getModel();
	 // Verifica se uma linha está selecionada
	 int selectedRow = tblServicos.getSelectedRow();
	 if (selectedRow == -1) {
	 // Nenhuma linha selecionada, exibe uma mensagem de erro
	 JOptionPane.showMessageDialog(this, "Selecione uma linha para excluir.", "Erro", JOptionPane.ERROR_MESSAGE);
	 return;
	 }
	 // Confirmação antes de excluir
	 int choice = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir esta linha?", "Confirmação", JOptionPane.YES_NO_OPTION);
	
	 if (choice == JOptionPane.YES_OPTION) {
	 // Remove a linha selecionada do modelo da tabela
	 model.removeRow(selectedRow);
	 }
	}
	private void txtValorServicoActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}
	
	private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {
		 JOptionPane.showMessageDialog(this, "Dados inseridos com sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
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
			java.util.logging.Logger.getLogger(AluguelServico.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(AluguelServico.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(AluguelServico.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(AluguelServico.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new AluguelServico().setVisible(true);
			}
		});
	}
	// Variables declaration - do not modify
	private javax.swing.JButton btnAddItem;
	private javax.swing.JButton btnBuscarEvento;
	private javax.swing.JButton btnBuscarServico;
	private javax.swing.JButton btnConfiguracoesSuporte;
	private javax.swing.JButton btnEditar;
	private javax.swing.JButton btnExcluir;
	private javax.swing.JButton btnManualUsuario;
	private javax.swing.JButton btnSalvar;
	private javax.swing.JButton btnSobreNos;
	private javax.swing.JButton btnVoltar;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JSeparator jSeparator4;
	private javax.swing.JSeparator jSeparator5;
	private javax.swing.JSeparator jSeparator6;
	private javax.swing.JSeparator jSeparator7;
	private javax.swing.JSeparator jSeparator8;
	private javax.swing.JLabel lblAluguelServicos;
	private javax.swing.JLabel lblCodigoEvento;
	private javax.swing.JLabel lblCodigoServico;
	private javax.swing.JLabel lblDadosEvento;
	private javax.swing.JLabel lblDadosServico;
	private javax.swing.JLabel lblLogo;
	private javax.swing.JLabel lblNomeEvento;
	private javax.swing.JLabel lblNomeServico;
	private javax.swing.JLabel lblQuantidadeServico;
	private javax.swing.JLabel lblRSTotal;
	private javax.swing.JLabel lblTotal;
	private javax.swing.JLabel lblValorServico;
	private javax.swing.JTable tblServicos;
	private javax.swing.JTable tblServicos1;
	private javax.swing.JTextField txtCodigoEvento;
	private javax.swing.JTextField txtCodigoServico;
	private javax.swing.JTextField txtNomeEvento;
	private javax.swing.JTextField txtNomeServico;
	private javax.swing.JTextField txtQuantidadeServico;
	private javax.swing.JTextField txtTotal;
	private javax.swing.JFormattedTextField txtValorServico;
	// End of variables declaration
}