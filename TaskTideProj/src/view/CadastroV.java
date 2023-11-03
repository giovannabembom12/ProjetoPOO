package view;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import model.dao.AdmDAO;
import model.dao.FuncDAO;
import model.vo.AdmVO;
import model.vo.FuncVO;

public class CadastroV extends javax.swing.JFrame {
   
    public CadastroV() {
        initComponents();
    }

    private void initComponents() {

        pnlOndinhas = new javax.swing.JPanel();
        pnlBranco = new javax.swing.JPanel();
        lblCadastro = new javax.swing.JLabel();
        lblNomeComp = new javax.swing.JLabel();
        lblAst1 = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblAst2 = new javax.swing.JLabel();
        txtNomeComp = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblCPF = new javax.swing.JLabel();
        lblAst3 = new javax.swing.JLabel();
        txtCPF = new javax.swing.JTextField();
        lblFone = new javax.swing.JLabel();
        txtFone = new javax.swing.JTextField();
        lblAst4 = new javax.swing.JLabel();
        lblDtNasc = new javax.swing.JLabel();
        lblAst5 = new javax.swing.JLabel();
        txtDtNasc = new javax.swing.JFormattedTextField();
        lblSenha = new javax.swing.JLabel();
        lblAst6 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        rdbAdm = new javax.swing.JRadioButton();
        lblUsuario = new javax.swing.JLabel();
        rdbFunc = new javax.swing.JRadioButton();
        lblAst7 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(rdbAdm);
        buttonGroup.add(rdbFunc);
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);
        setMinimumSize(new java.awt.Dimension(800, 600));

        pnlOndinhas.setBackground(new java.awt.Color(22, 43, 64));

        pnlBranco.setBackground(new java.awt.Color(255, 255, 255));

        lblCadastro.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        lblCadastro.setForeground(new java.awt.Color(0, 0, 0));
        lblCadastro.setText("Cadastro");

        lblNomeComp.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblNomeComp.setForeground(new java.awt.Color(0, 0, 0));
        lblNomeComp.setText("Nome Completo");

        lblAst1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblAst1.setForeground(new java.awt.Color(255, 0, 0));
        lblAst1.setText("*");

        lblEmail.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(0, 0, 0));
        lblEmail.setText("E-mail");

        lblAst2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblAst2.setForeground(new java.awt.Color(255, 0, 0));
        lblAst2.setText("*");

        txtNomeComp.setBackground(new java.awt.Color(204, 204, 204));
        txtNomeComp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNomeComp.setForeground(new java.awt.Color(0, 0, 0));
        txtNomeComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeCompActionPerformed(evt);
            }
        });

        txtEmail.setBackground(new java.awt.Color(204, 204, 204));
        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(0, 0, 0));

        lblCPF.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblCPF.setForeground(new java.awt.Color(0, 0, 0));
        lblCPF.setText("CPF");

        lblAst3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblAst3.setForeground(new java.awt.Color(255, 0, 0));
        lblAst3.setText("*");

        txtCPF.setBackground(new java.awt.Color(204, 204, 204));
        txtCPF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCPF.setForeground(new java.awt.Color(0, 0, 0));

        lblFone.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblFone.setForeground(new java.awt.Color(0, 0, 0));
        lblFone.setText("Telefone");

        txtFone.setBackground(new java.awt.Color(204, 204, 204));
        txtFone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFone.setForeground(new java.awt.Color(0, 0, 0));

        lblAst4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblAst4.setForeground(new java.awt.Color(255, 0, 0));
        lblAst4.setText("*");

        lblDtNasc.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblDtNasc.setForeground(new java.awt.Color(0, 0, 0));
        lblDtNasc.setText("Data de Nascimento");

        lblAst5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblAst5.setForeground(new java.awt.Color(255, 0, 0));
        lblAst5.setText("*");

        txtDtNasc.setBackground(new java.awt.Color(204, 204, 204));
        txtDtNasc.setForeground(new java.awt.Color(0, 0, 0));
        txtDtNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        txtDtNasc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblSenha.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(0, 0, 0));
        lblSenha.setText("Senha");

        lblAst6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblAst6.setForeground(new java.awt.Color(255, 0, 0));
        lblAst6.setText("*");

        txtSenha.setBackground(new java.awt.Color(204, 204, 204));
        txtSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSenha.setForeground(new java.awt.Color(0, 0, 0));

        rdbAdm.setBackground(new java.awt.Color(255, 255, 255));
        rdbAdm.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        rdbAdm.setForeground(new java.awt.Color(0, 0, 0));
        rdbAdm.setText("Administrador(a)");

        lblUsuario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(0, 0, 0));
        lblUsuario.setText("Tipo de usuário");

        rdbFunc.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        rdbFunc.setForeground(new java.awt.Color(0, 0, 0));
        rdbFunc.setText("Funcionário");

        lblAst7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblAst7.setForeground(new java.awt.Color(255, 0, 0));
        lblAst7.setText("*");

        btnVoltar.setBackground(new java.awt.Color(0, 51, 204));
        btnVoltar.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnCadastrar.setBackground(new java.awt.Color(0, 51, 204));
        btnCadastrar.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBrancoLayout = new javax.swing.GroupLayout(pnlBranco);
        pnlBranco.setLayout(pnlBrancoLayout);
        pnlBrancoLayout.setHorizontalGroup(
            pnlBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBrancoLayout.createSequentialGroup()
                .addGroup(pnlBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBrancoLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(pnlBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCadastro)
                            .addGroup(pnlBrancoLayout.createSequentialGroup()
                                .addComponent(lblNomeComp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblAst1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNomeComp, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlBrancoLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(pnlBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBrancoLayout.createSequentialGroup()
                                .addGroup(pnlBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnlBrancoLayout.createSequentialGroup()
                                        .addComponent(lblCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblAst3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(lblEmail))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblAst2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 877, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlBrancoLayout.createSequentialGroup()
                                        .addGroup(pnlBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pnlBrancoLayout.createSequentialGroup()
                                                .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(lblFone)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBrancoLayout.createSequentialGroup()
                                                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(93, 93, 93)))
                                        .addGroup(pnlBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pnlBrancoLayout.createSequentialGroup()
                                                .addComponent(lblAst4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(pnlBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtSenha)
                                                    .addComponent(txtFone)))
                                            .addGroup(pnlBrancoLayout.createSequentialGroup()
                                                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))))))
                            .addGroup(pnlBrancoLayout.createSequentialGroup()
                                .addGroup(pnlBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnlBrancoLayout.createSequentialGroup()
                                        .addComponent(lblDtNasc)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblAst5))
                                    .addGroup(pnlBrancoLayout.createSequentialGroup()
                                        .addComponent(lblUsuario)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblAst7, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25)))
                                .addGap(18, 18, 18)
                                .addGroup(pnlBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlBrancoLayout.createSequentialGroup()
                                        .addComponent(txtDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblSenha)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblAst6))
                                    .addGroup(pnlBrancoLayout.createSequentialGroup()
                                        .addComponent(rdbAdm)
                                        .addGap(67, 67, 67)
                                        .addComponent(rdbFunc)))))))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        pnlBrancoLayout.setVerticalGroup(
            pnlBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBrancoLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(lblCadastro)
                .addGroup(pnlBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBrancoLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(pnlBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNomeComp)
                            .addComponent(lblAst1)
                            .addComponent(txtNomeComp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(pnlBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmail)
                            .addComponent(lblAst2)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(pnlBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCPF)
                            .addComponent(lblAst3)
                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFone)
                            .addComponent(txtFone, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAst4))
                        .addGap(30, 30, 30)
                        .addGroup(pnlBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDtNasc)
                            .addComponent(lblAst5)
                            .addComponent(txtDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSenha)
                            .addComponent(lblAst6)
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(pnlBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdbAdm)
                            .addComponent(lblUsuario)
                            .addComponent(rdbFunc)
                            .addComponent(lblAst7))
                        .addContainerGap(151, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBrancoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(77, 77, 77))))
        );

        javax.swing.GroupLayout pnlOndinhasLayout = new javax.swing.GroupLayout(pnlOndinhas);
        pnlOndinhas.setLayout(pnlOndinhasLayout);
        pnlOndinhasLayout.setHorizontalGroup(
            pnlOndinhasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOndinhasLayout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(pnlBranco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(544, Short.MAX_VALUE))
        );
        pnlOndinhasLayout.setVerticalGroup(
            pnlOndinhasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOndinhasLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(pnlBranco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(372, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlOndinhas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlOndinhas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1934, 1087));
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void txtNomeCompActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {                                          
    	TelaIncialAd obj = new TelaIncialAd();
    	obj.setVisible(true);
    	dispose();
    }                                         

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {                                             
    	String nomeCompleto = txtNomeComp.getText();
		String dataNascimento = txtDtNasc.getText();
		String email = txtEmail.getText();
		String cpf  = txtCPF.getText();
		String senha = new String(txtSenha.getPassword());
		String fone = txtFone.getText();
		
		if (!dataNascimento.matches("\\d{2}/\\d{2}/\\d{4}")) {
   		    JOptionPane.showMessageDialog(this, "Data de nascimento inválida (use o formato dd/mm/aaaa).", "Erro", JOptionPane.ERROR_MESSAGE); return; }
		if (nomeCompleto.isEmpty() || !nomeCompleto.matches("[a-zA-Z\\s]+")) {
			JOptionPane.showMessageDialog(this, "O nome completo deve conter somente letras.", "Erro", JOptionPane.ERROR_MESSAGE);
			return;}
		if (fone.isEmpty() ||!fone.matches("\\d{10,11}")) { 
			JOptionPane.showMessageDialog(this, "Telefone inválido.", "Erro", JOptionPane.ERROR_MESSAGE); 
			return; } 
		if(senha.length() >= 8) { 
			JOptionPane.showMessageDialog(null,"Cadastro realizado com sucesso"); } 
		else{
				JOptionPane.showMessageDialog(null, "A senha deve obter no minimo 8 dígitos"); } 
		
		if (nomeCompleto.isEmpty() || dataNascimento.isEmpty() || fone.isEmpty() || senha.isEmpty()) { 
			JOptionPane.showMessageDialog(this, "Todos os campos devem ser preenchidos.", "Erro", JOptionPane.ERROR_MESSAGE);
		 }
		
		
		if(rdbFunc.isSelected()) {
			FuncVO obj = new FuncVO();
			obj.setNome_comp(nomeCompleto);
			obj.setData_nasc(dataNascimento);
			obj.setEmail(email);
			obj.setSenha_us(senha);
			obj.setFone(fone);
			obj.setCpf(cpf);
			
			FuncDAO obje = new FuncDAO();
				obje.cadastrarUsuario(obj);
		}
		if(rdbAdm.isSelected()) {
			AdmVO obj = new AdmVO();
			obj.setNome_comp(nomeCompleto);
			obj.setData_nasc(dataNascimento);
			obj.setEmail(email);
			obj.setSenha_us(senha);
			obj.setFone(fone);
			obj.setCpf(cpf);
			
			AdmDAO obje = new AdmDAO();
				obje.cadastrarUsuario(obj);
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
            java.util.logging.Logger.getLogger(CadastroV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel lblAst1;
    private javax.swing.JLabel lblAst2;
    private javax.swing.JLabel lblAst3;
    private javax.swing.JLabel lblAst4;
    private javax.swing.JLabel lblAst5;
    private javax.swing.JLabel lblAst6;
    private javax.swing.JLabel lblAst7;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCadastro;
    private javax.swing.JLabel lblDtNasc;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFone;
    private javax.swing.JLabel lblNomeComp;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlBranco;
    private javax.swing.JPanel pnlOndinhas;
    private javax.swing.JRadioButton rdbAdm;
    private javax.swing.JRadioButton rdbFunc;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JFormattedTextField txtDtNasc;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFone;
    private javax.swing.JTextField txtNomeComp;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration                   
}
