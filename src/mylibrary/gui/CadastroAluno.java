/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mylibrary.gui;

import java.io.IOException;
import java.util.Iterator;
import javax.swing.JOptionPane;
import mylibrary.bean.Aluno;
import mylibrary.bean.Endereco;
import mylibrary.dao.AlunoDao;

/**
 *
 * @author Michelle
 */
public class CadastroAluno extends javax.swing.JFrame {
    private AlunoDao dao;
        private Aluno aluno;
    
    public CadastroAluno() throws IOException {
        initComponents();
        setLocationRelativeTo(null);
        this.dao = new AlunoDao();
        this.aluno = null;
//        a = new Aluno(cpf.getText(), nome.getText(), tel.getText(), email.getText(),
//                        new Endereco(rua.getText(), bairro.getText(), cidade.getText(),
//                                estado.getSelectedItem().toString(),numero.getText()), 
//                        curso.getSelectedItem().toString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbNome = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        lbCpf = new javax.swing.JLabel();
        lbTel = new javax.swing.JLabel();
        tel = new javax.swing.JFormattedTextField();
        lbEmail = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        lbRua = new javax.swing.JLabel();
        rua = new javax.swing.JTextField();
        lbBairro = new javax.swing.JLabel();
        bairro = new javax.swing.JTextField();
        lbCidade = new javax.swing.JLabel();
        cidade = new javax.swing.JTextField();
        lbEstado = new javax.swing.JLabel();
        estado = new javax.swing.JComboBox();
        lbCurso = new javax.swing.JLabel();
        curso = new javax.swing.JComboBox();
        remover = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        salvar = new javax.swing.JButton();
        lbNumero = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        numero = new javax.swing.JFormattedTextField();
        pesquisa = new javax.swing.JLabel();
        img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(450, 450));
        setResizable(false);
        getContentPane().setLayout(null);

        lbNome.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        lbNome.setForeground(new java.awt.Color(0, 51, 51));
        lbNome.setText("Nome:");
        getContentPane().add(lbNome);
        lbNome.setBounds(20, 80, 60, 20);

        nome.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        nome.setForeground(new java.awt.Color(0, 51, 51));
        getContentPane().add(nome);
        nome.setBounds(80, 70, 350, 30);

        lbCpf.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        lbCpf.setForeground(new java.awt.Color(0, 51, 51));
        lbCpf.setText("CPF:");
        getContentPane().add(lbCpf);
        lbCpf.setBounds(30, 120, 40, 20);

        try {
            cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cpf.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cpf.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        getContentPane().add(cpf);
        cpf.setBounds(80, 110, 130, 30);

        lbTel.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        lbTel.setForeground(new java.awt.Color(0, 51, 51));
        lbTel.setText("Celular:");
        getContentPane().add(lbTel);
        lbTel.setBounds(220, 120, 70, 20);

        try {
            tel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        getContentPane().add(tel);
        tel.setBounds(300, 110, 130, 30);

        lbEmail.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        lbEmail.setForeground(new java.awt.Color(0, 51, 51));
        lbEmail.setText("Email:");
        getContentPane().add(lbEmail);
        lbEmail.setBounds(20, 160, 60, 20);

        email.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        email.setForeground(new java.awt.Color(0, 51, 51));
        getContentPane().add(email);
        email.setBounds(80, 150, 350, 30);

        lbRua.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        lbRua.setForeground(new java.awt.Color(0, 51, 51));
        lbRua.setText("Rua:");
        getContentPane().add(lbRua);
        lbRua.setBounds(30, 200, 40, 20);

        rua.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        rua.setForeground(new java.awt.Color(0, 51, 51));
        getContentPane().add(rua);
        rua.setBounds(80, 190, 270, 30);

        lbBairro.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        lbBairro.setForeground(new java.awt.Color(0, 51, 51));
        lbBairro.setText("Bairro:");
        getContentPane().add(lbBairro);
        lbBairro.setBounds(20, 240, 60, 20);

        bairro.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        bairro.setForeground(new java.awt.Color(0, 51, 51));
        getContentPane().add(bairro);
        bairro.setBounds(80, 230, 130, 30);

        lbCidade.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        lbCidade.setForeground(new java.awt.Color(0, 51, 51));
        lbCidade.setText("Cidade:");
        getContentPane().add(lbCidade);
        lbCidade.setBounds(220, 240, 70, 20);

        cidade.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        cidade.setForeground(new java.awt.Color(0, 51, 51));
        getContentPane().add(cidade);
        cidade.setBounds(300, 230, 130, 30);

        lbEstado.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        lbEstado.setForeground(new java.awt.Color(0, 51, 51));
        lbEstado.setText("UF:");
        getContentPane().add(lbEstado);
        lbEstado.setBounds(40, 280, 30, 20);

        estado.setBackground(new java.awt.Color(204, 255, 255));
        estado.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        estado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Paraíba" }));
        getContentPane().add(estado);
        estado.setBounds(80, 270, 350, 30);

        lbCurso.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        lbCurso.setForeground(new java.awt.Color(0, 51, 51));
        lbCurso.setText("Curso:");
        getContentPane().add(lbCurso);
        lbCurso.setBounds(20, 320, 60, 20);

        curso.setBackground(new java.awt.Color(204, 255, 255));
        curso.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        curso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Análise e Desenvolvimento de Sistemas", "Automação Industrial", "Matemática" }));
        getContentPane().add(curso);
        curso.setBounds(80, 310, 350, 30);

        remover.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        remover.setForeground(new java.awt.Color(255, 0, 0));
        remover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mylibrary/gui/image/9iRadXL6T.png"))); // NOI18N
        remover.setText("Remover");
        remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerActionPerformed(evt);
            }
        });
        getContentPane().add(remover);
        remover.setBounds(300, 370, 130, 40);

        edit.setFont(new java.awt.Font("Bauhaus 93", 1, 18)); // NOI18N
        edit.setForeground(new java.awt.Color(51, 153, 255));
        edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mylibrary/gui/image/edit.png"))); // NOI18N
        edit.setText("Editar");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        getContentPane().add(edit);
        edit.setBounds(160, 370, 130, 40);

        salvar.setFont(new java.awt.Font("Bauhaus 93", 1, 18)); // NOI18N
        salvar.setForeground(new java.awt.Color(51, 204, 0));
        salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mylibrary/gui/image/ok.png"))); // NOI18N
        salvar.setText("Salvar");
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });
        getContentPane().add(salvar);
        salvar.setBounds(20, 370, 130, 40);

        lbNumero.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        lbNumero.setForeground(new java.awt.Color(0, 51, 51));
        lbNumero.setText("Nº:");
        getContentPane().add(lbNumero);
        lbNumero.setBounds(360, 190, 30, 22);

        title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mylibrary/gui/image/cadAluno.png"))); // NOI18N
        getContentPane().add(title);
        title.setBounds(90, 10, 280, 50);

        numero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat(""))));
        numero.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        getContentPane().add(numero);
        numero.setBounds(390, 190, 40, 30);

        pesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mylibrary/gui/image/pesquisa.png"))); // NOI18N
        pesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pesquisaMouseClicked(evt);
            }
        });
        getContentPane().add(pesquisa);
        pesquisa.setBounds(380, 20, 30, 30);

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mylibrary/gui/image/lih.jpg"))); // NOI18N
        getContentPane().add(img);
        img.setBounds(0, 0, 450, 440);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        aluno = new Aluno(cpf.getText(), nome.getText(), tel.getText(), email.getText(),
                        new Endereco(rua.getText(), bairro.getText(), cidade.getText(),
                                estado.getSelectedItem().toString(),numero.getText()), 
                        curso.getSelectedItem().toString());
        
        if (!(cpf.getText().isEmpty() || nome.getText().isEmpty() || 
                rua.getText().isEmpty() || numero.getText().isEmpty() || 
                bairro.getText().isEmpty() || cidade.getText().isEmpty())){
            try {
                dao.add(new Aluno(cpf.getText(), nome.getText(), tel.getText(), email.getText(),
                        new Endereco(rua.getText(), bairro.getText(), cidade.getText(),
                                estado.getSelectedItem().toString(),numero.getText()), 
                        curso.getSelectedItem().toString()));
                    JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!");
                    dispose();
            } catch (IOException | ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Erro em salvar o cadastro!");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Preencha os campos obrigatórios!");
        }
    }//GEN-LAST:event_salvarActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        aluno = new Aluno(cpf.getText(), nome.getText(), tel.getText(), email.getText(),
                        new Endereco(rua.getText(), bairro.getText(), cidade.getText(),
                                estado.getSelectedItem().toString(),numero.getText()), 
                        curso.getSelectedItem().toString());
        try {
            if (dao.edit(aluno)){
                JOptionPane.showMessageDialog(null, "Cadastro atualizado com sucesso!");
                dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Cadastro não existe!");  
            }
        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar atualizar o cadastro!");
        }
    }//GEN-LAST:event_editActionPerformed

    private void pesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pesquisaMouseClicked
        
        String str = JOptionPane.showInputDialog("Digite o CPF sem esqucer os pontos e o traço:");

        try {
            
            if (dao.get().isEmpty()){
                JOptionPane.showMessageDialog(null, "Não há nenhum aluno cadastro!");
            }
            
            Iterator<Aluno> itAlunos = dao.get().iterator();
            
            while(itAlunos.hasNext()){
                Aluno al = itAlunos.next();
                if(al.getCpf().equals(str)){
                   nome.setText(al.getNome());
                   cpf.setText(al.getCpf());
                   tel.setText(al.getTelefone());
                   email.setText(al.getEmail());
                   bairro.setText(al.getEndereco().getBairro());
                   rua.setText(al.getEndereco().getRua());
                   numero.setText(al.getEndereco().getNumero());
                   cidade.setText(al.getEndereco().getCidade());
                   estado.setSelectedItem(estado.getSelectedItem().toString().equals(al.getEndereco().getUf()));
                break;
                }
            }
        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }//GEN-LAST:event_pesquisaMouseClicked

    private void removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerActionPerformed
        aluno = new Aluno(cpf.getText(), nome.getText(), tel.getText(), email.getText(),
                        new Endereco(rua.getText(), bairro.getText(), cidade.getText(),
                                estado.getSelectedItem().toString(),numero.getText()), 
                        curso.getSelectedItem().toString());
        
        if (!(cpf.getText().trim().equals("") || nome.getText().trim().equals("") || 
                rua.getText().trim().equals("") || numero.getText().trim().equals("") || 
                bairro.getText().trim().equals("") || cidade.getText().trim().equals(""))){
            try {
                dao.remove(new Aluno(cpf.getText(), nome.getText(), tel.getText(), email.getText(),
                        new Endereco(rua.getText(), bairro.getText(), cidade.getText(),
                                estado.getSelectedItem().toString(),numero.getText()), 
                        curso.getSelectedItem().toString()));
                    JOptionPane.showMessageDialog(null, "Aluno removido com sucesso!");
                    dispose();
            } catch (IOException | ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Erro em salvar o cadastro!");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Não existe nenhum aluno válido selecionado!");
        }
    }//GEN-LAST:event_removerActionPerformed


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CadastroAluno().setVisible(true);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao cadastrar!");
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bairro;
    private javax.swing.JTextField cidade;
    private final javax.swing.JFormattedTextField cpf = new javax.swing.JFormattedTextField();
    private javax.swing.JComboBox curso;
    private javax.swing.JButton edit;
    private javax.swing.JTextField email;
    private javax.swing.JComboBox estado;
    private javax.swing.JLabel img;
    private javax.swing.JLabel lbBairro;
    private javax.swing.JLabel lbCidade;
    private javax.swing.JLabel lbCpf;
    private javax.swing.JLabel lbCurso;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbEstado;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbNumero;
    private javax.swing.JLabel lbRua;
    private javax.swing.JLabel lbTel;
    private javax.swing.JTextField nome;
    private javax.swing.JFormattedTextField numero;
    private javax.swing.JLabel pesquisa;
    private javax.swing.JButton remover;
    private javax.swing.JTextField rua;
    private javax.swing.JButton salvar;
    private javax.swing.JFormattedTextField tel;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

}
