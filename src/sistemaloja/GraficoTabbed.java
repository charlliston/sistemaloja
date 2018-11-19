/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaloja;

import java.awt.Component;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JTextField;

public class GraficoTabbed extends javax.swing.JFrame {

    /**
     * Creates new form GraficoTabbed
     */
    public GraficoTabbed() {
        initComponents();
        setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        codFuncionario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nomeFuncionario = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        cargoFuncionario = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        salFuncionario = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        civilFuncionario = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        sexoFuncionario = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        nascFuncionario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cpfFuncionario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        rgFuncionario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        rgufFuncionario = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        endFuncionario = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        numFuncionario = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        compFuncionario = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cidFuncionario = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        estadoFuncionario = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        bairroFuncionario = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cepFuncionario = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        telFuncionario = new javax.swing.JFormattedTextField();
        cadastrarFuncionario = new javax.swing.JButton();
        cancelFuncionario = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        emailFuncionario = new javax.swing.JFormattedTextField();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jLabel20 = new javax.swing.JLabel();
        cnpjFornecedor = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        empresaFornecedor = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        nomeFornecedor = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        compFornecedor = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        numFornecedor = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        endFornecedor = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        cidadeFornecedor = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        estadoFornecedor = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        bairroFornecedor = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        cepFornecedor = new javax.swing.JTextField();
        emailFornecedor = new javax.swing.JFormattedTextField();
        jLabel37 = new javax.swing.JLabel();
        telFornecedor = new javax.swing.JFormattedTextField();
        jLabel38 = new javax.swing.JLabel();
        cadastrarFornecedor = new javax.swing.JButton();
        cancelarFornecedor = new javax.swing.JButton();
        catFornecedor = new javax.swing.JComboBox<>();
        prazoFornecedor = new javax.swing.JComboBox<>();
        jInternalFrame5 = new javax.swing.JInternalFrame();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        atualizarFuncionario = new javax.swing.JButton();
        excluirFuncionario = new javax.swing.JButton();
        jInternalFrame6 = new javax.swing.JInternalFrame();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        atualizarFornecedor = new javax.swing.JButton();
        excluirFornecedor = new javax.swing.JButton();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jInternalFrame3 = new javax.swing.JInternalFrame();
        jLabel22 = new javax.swing.JLabel();
        codProduto = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        nomeProduto = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        precoProduto = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        diaValidade = new javax.swing.JComboBox<>();
        mesValidade = new javax.swing.JComboBox<>();
        anoValidade = new javax.swing.JComboBox<>();
        marcaProduto = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        qtdProduto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        descProduto = new javax.swing.JTextArea();
        cadastrarProduto = new javax.swing.JButton();
        cancelProduto = new javax.swing.JButton();
        jInternalFrame4 = new javax.swing.JInternalFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel41 = new javax.swing.JLabel();
        codEstoque = new javax.swing.JTextField();
        nomeEstoque = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        marcaEstoque = new javax.swing.JTextField();
        qtdEstoque = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        precoEstoque = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        saidaEstoque = new javax.swing.JTextField();
        saveEstoque = new javax.swing.JButton();
        cancelarEstoque = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setVisible(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Código:");

        codFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codFuncionarioActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Nome:");

        nomeFuncionario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nomeFuncionariojLabel2FocusGained(evt);
            }
        });
        nomeFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeFuncionarioActionPerformed(evt);
            }
        });
        nomeFuncionario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nomeFuncionariojLabel2KeyPressed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("Cargo:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("Salário:");

        salFuncionario.setText("R$ ");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Estado Civil:");

        civilFuncionario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro(a)", "Casado(a)" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Sexo:");

        sexoFuncionario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Feminino", "Masculino" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Data de Nascimento:");

        nascFuncionario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nascFuncionario.setText("DD/MM/AAAA");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("CPF:");

        cpfFuncionario.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("RG:");

        rgFuncionario.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("UF/RG:");

        rgufFuncionario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Endereço:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Número:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Comp.:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Cidade:");

        cidFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidFuncionarioActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("UF:");

        estadoFuncionario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Bairro:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("CEP:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Telefone:");

        cadastrarFuncionario.setText("Cadastrar");

        cancelFuncionario.setText("Cancelar");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("E-mail:");

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(endFuncionario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(compFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nascFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cpfFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rgFuncionario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rgufFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(telFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(emailFuncionario))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(cidFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(estadoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(bairroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jInternalFrame1Layout.createSequentialGroup()
                                .addGap(199, 199, 199)
                                .addComponent(cadastrarFuncionario)
                                .addGap(48, 48, 48)
                                .addComponent(cancelFuncionario)))
                        .addGap(13, 13, 13)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cepFuncionario))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(codFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cargoFuncionario))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sexoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(civilFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(salFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(48, 48, 48))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(codFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(cargoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(salFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))))
                .addGap(13, 13, 13)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(civilFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(sexoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nascFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cpfFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(rgFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(rgufFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(endFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(numFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(compFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(cidFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(estadoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(bairroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(cepFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(telFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(emailFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrarFuncionario)
                    .addComponent(cancelFuncionario))
                .addGap(41, 41, 41))
        );

        jTabbedPane1.addTab("Cadastro de Funcionários", jInternalFrame1);

        jInternalFrame2.setVisible(true);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setText("CNPJ:");

        cnpjFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnpjFornecedorActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setText("Empresa:");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setText("Nome:");

        nomeFornecedor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nomeFornecedorjLabel2FocusGained(evt);
            }
        });
        nomeFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeFornecedorActionPerformed(evt);
            }
        });
        nomeFornecedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nomeFornecedorjLabel2KeyPressed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel25.setText("Categoria de Produto Vendido:");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel26.setText("Prazo Médio de Entrega (dias):");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel27.setText("Endereço:");

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel31.setText("Comp.:");

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel32.setText("Número:");

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel33.setText("Cidade:");

        cidadeFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidadeFornecedorActionPerformed(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel34.setText("UF:");

        estadoFornecedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel35.setText("Bairro:");

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel36.setText("CEP:");

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel37.setText("E-mail:");

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel38.setText("Telefone:");

        cadastrarFornecedor.setText("Cadastrar");

        cancelarFornecedor.setText("Cancelar");
        cancelarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarFornecedorActionPerformed(evt);
            }
        });

        catFornecedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bebidas", "Enlatados", "Grãos", "Massas" }));

        prazoFornecedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "30+" }));

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame2Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(endFornecedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(compFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                                .addComponent(jLabel38)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(telFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel37)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(emailFornecedor))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jInternalFrame2Layout.createSequentialGroup()
                                .addComponent(jLabel33)
                                .addGap(18, 18, 18)
                                .addComponent(cidadeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(estadoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel35)
                                .addGap(18, 18, 18)
                                .addComponent(bairroFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jInternalFrame2Layout.createSequentialGroup()
                                .addGap(199, 199, 199)
                                .addComponent(cadastrarFornecedor)
                                .addGap(48, 48, 48)
                                .addComponent(cancelarFornecedor)))
                        .addGap(13, 13, 13)
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cepFornecedor))
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(catFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3))
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(prazoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(18, 18, 18)
                        .addComponent(cnpjFornecedor)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(empresaFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48))
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(cnpjFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(empresaFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel23)
                    .addComponent(catFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(prazoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(endFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32)
                    .addComponent(numFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31)
                    .addComponent(compFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(cidadeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34)
                    .addComponent(estadoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35)
                    .addComponent(bairroFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36)
                    .addComponent(cepFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(telFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37)
                    .addComponent(emailFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrarFornecedor)
                    .addComponent(cancelarFornecedor))
                .addGap(41, 41, 41))
        );

        jTabbedPane1.addTab("Cadastro de Fornecedores", jInternalFrame2);

        jInternalFrame5.setVisible(true);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Telefone", "Cargo", "Salário"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(3).setResizable(false);
            jTable2.getColumnModel().getColumn(4).setResizable(false);
        }

        atualizarFuncionario.setText("Atualizar");
        atualizarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarFuncionarioActionPerformed(evt);
            }
        });

        excluirFuncionario.setText("Excluir");

        javax.swing.GroupLayout jInternalFrame5Layout = new javax.swing.GroupLayout(jInternalFrame5.getContentPane());
        jInternalFrame5.getContentPane().setLayout(jInternalFrame5Layout);
        jInternalFrame5Layout.setHorizontalGroup(
            jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addGroup(jInternalFrame5Layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(atualizarFuncionario)
                .addGap(48, 48, 48)
                .addComponent(excluirFuncionario)
                .addContainerGap(249, Short.MAX_VALUE))
        );
        jInternalFrame5Layout.setVerticalGroup(
            jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame5Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(atualizarFuncionario)
                    .addComponent(excluirFuncionario))
                .addGap(15, 15, 15))
        );

        jTabbedPane1.addTab("Gerenciar Funcionários", jInternalFrame5);

        jInternalFrame6.setVisible(true);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "CNPJ", "Empresa", "Nome", "Categoria", "E-mail", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setResizable(false);
            jTable3.getColumnModel().getColumn(1).setResizable(false);
            jTable3.getColumnModel().getColumn(2).setResizable(false);
            jTable3.getColumnModel().getColumn(3).setResizable(false);
            jTable3.getColumnModel().getColumn(4).setResizable(false);
            jTable3.getColumnModel().getColumn(5).setResizable(false);
        }

        atualizarFornecedor.setText("Atualizar");

        excluirFornecedor.setText("Excluir");

        javax.swing.GroupLayout jInternalFrame6Layout = new javax.swing.GroupLayout(jInternalFrame6.getContentPane());
        jInternalFrame6.getContentPane().setLayout(jInternalFrame6Layout);
        jInternalFrame6Layout.setHorizontalGroup(
            jInternalFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE)
            .addGroup(jInternalFrame6Layout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addComponent(atualizarFornecedor)
                .addGap(48, 48, 48)
                .addComponent(excluirFornecedor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jInternalFrame6Layout.setVerticalGroup(
            jInternalFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame6Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jInternalFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(atualizarFornecedor)
                    .addComponent(excluirFornecedor))
                .addGap(19, 19, 19))
        );

        jTabbedPane1.addTab("Gerenciar Fornecedores", jInternalFrame6);

        jTabbedPane2.addTab("Cadastro", jTabbedPane1);

        jInternalFrame3.setVisible(true);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setText("Código:");

        codProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codProdutoActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel24.setText("Nome:");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel28.setText("Preço Unitário:");

        precoProduto.setText("R$ ");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel29.setText("Data de Validade:");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel30.setText("Marca:");

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel39.setText("Descrição:");

        diaValidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "30", "31" }));

        mesValidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        anoValidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025" }));

        marcaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcaProdutoActionPerformed(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel40.setText("Quantidade:");

        qtdProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtdProdutoActionPerformed(evt);
            }
        });

        descProduto.setColumns(20);
        descProduto.setRows(5);
        jScrollPane1.setViewportView(descProduto);

        cadastrarProduto.setText("Cadastrar");

        cancelProduto.setText("Cancelar");
        cancelProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame3Layout = new javax.swing.GroupLayout(jInternalFrame3.getContentPane());
        jInternalFrame3.getContentPane().setLayout(jInternalFrame3Layout);
        jInternalFrame3Layout.setHorizontalGroup(
            jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame3Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jInternalFrame3Layout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addGap(28, 28, 28)
                                .addComponent(marcaProduto))
                            .addGroup(jInternalFrame3Layout.createSequentialGroup()
                                .addComponent(jLabel40)
                                .addGap(1, 1, 1)
                                .addComponent(qtdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(precoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jInternalFrame3Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(diaValidade, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mesValidade, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(anoValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jInternalFrame3Layout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)))
                .addGap(48, 48, 48))
            .addGroup(jInternalFrame3Layout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addComponent(cadastrarProduto)
                .addGap(53, 53, 53)
                .addComponent(cancelProduto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jInternalFrame3Layout.setVerticalGroup(
            jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel22)
                        .addComponent(codProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel24)
                        .addComponent(nomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(precoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel28)
                        .addComponent(qtdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(marcaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(diaValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anoValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel39)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrarProduto)
                    .addComponent(cancelProduto))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Cadastrar Produto", jInternalFrame3);

        jInternalFrame4.setVisible(true);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Marca", "Preço", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel41.setText("Código:");

        codEstoque.setEditable(false);
        codEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codEstoqueActionPerformed(evt);
            }
        });

        nomeEstoque.setEditable(false);

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel42.setText("Nome:");

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel43.setText("Marca:");

        marcaEstoque.setEditable(false);
        marcaEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcaEstoqueActionPerformed(evt);
            }
        });

        qtdEstoque.setEditable(false);
        qtdEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtdEstoqueActionPerformed(evt);
            }
        });

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel44.setText("Preço Unitário:");

        precoEstoque.setEditable(false);
        precoEstoque.setText("R$ ");

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel45.setText("Quantidade:");

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel46.setText("Saída:");

        saveEstoque.setText("Salvar");

        cancelarEstoque.setText("Cancelar");
        cancelarEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarEstoqueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame4Layout = new javax.swing.GroupLayout(jInternalFrame4.getContentPane());
        jInternalFrame4.getContentPane().setLayout(jInternalFrame4Layout);
        jInternalFrame4Layout.setHorizontalGroup(
            jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jInternalFrame4Layout.createSequentialGroup()
                        .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jInternalFrame4Layout.createSequentialGroup()
                                .addComponent(jLabel41)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(codEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jInternalFrame4Layout.createSequentialGroup()
                                .addComponent(jLabel45)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(qtdEstoque)))
                        .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame4Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel42)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nomeEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel43)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(marcaEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))
                            .addGroup(jInternalFrame4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel44)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jInternalFrame4Layout.createSequentialGroup()
                                        .addComponent(saveEstoque)
                                        .addGap(53, 53, 53)
                                        .addComponent(cancelarEstoque))
                                    .addGroup(jInternalFrame4Layout.createSequentialGroup()
                                        .addComponent(precoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel46)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(saidaEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jInternalFrame4Layout.setVerticalGroup(
            jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame4Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(codEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42)
                    .addComponent(nomeEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43)
                    .addComponent(marcaEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(qtdEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44)
                    .addComponent(precoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46)
                    .addComponent(saidaEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveEstoque)
                    .addComponent(cancelarEstoque))
                .addGap(18, 18, 18))
        );

        jTabbedPane3.addTab("Controle de Estoque", jInternalFrame4);

        jTabbedPane2.addTab("Estoque", jTabbedPane3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cidFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cidFuncionarioActionPerformed

    private void nomeFuncionariojLabel2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeFuncionariojLabel2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeFuncionariojLabel2KeyPressed

    private void nomeFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeFuncionarioActionPerformed

    private void nomeFuncionariojLabel2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nomeFuncionariojLabel2FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeFuncionariojLabel2FocusGained

    private void codFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codFuncionarioActionPerformed

    }//GEN-LAST:event_codFuncionarioActionPerformed

    private void cidadeFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidadeFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cidadeFornecedorActionPerformed

    private void nomeFornecedorjLabel2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeFornecedorjLabel2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeFornecedorjLabel2KeyPressed

    private void nomeFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeFornecedorActionPerformed

    private void nomeFornecedorjLabel2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nomeFornecedorjLabel2FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeFornecedorjLabel2FocusGained

    private void cnpjFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnpjFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnpjFornecedorActionPerformed

    private void cancelarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarFornecedorActionPerformed
        limparDados(jInternalFrame2);
    }//GEN-LAST:event_cancelarFornecedorActionPerformed

    private void codProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codProdutoActionPerformed

    private void marcaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcaProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marcaProdutoActionPerformed

    private void qtdProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtdProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtdProdutoActionPerformed

    private void cancelProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelProdutoActionPerformed

    private void codEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codEstoqueActionPerformed

    private void marcaEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcaEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marcaEstoqueActionPerformed

    private void qtdEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtdEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtdEstoqueActionPerformed

    private void cancelarEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelarEstoqueActionPerformed

    private void atualizarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_atualizarFuncionarioActionPerformed

    public void limparDados(JInternalFrame Frame) { 
        JComboBox box = new JComboBox();
        //box.removeAllItems();
        
        for (int i=0; i < Frame.getContentPane().getComponentCount(); i++) {        
            Component c = Frame.getContentPane().getComponent(i);     
            if (c instanceof JTextField) {                           
                JTextField field = (JTextField) c;   
                field.setText(null);
            }
        }   
    }
    
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
            java.util.logging.Logger.getLogger(GraficoTabbed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GraficoTabbed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GraficoTabbed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GraficoTabbed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GraficoTabbed().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> anoValidade;
    private javax.swing.JButton atualizarFornecedor;
    private javax.swing.JButton atualizarFuncionario;
    private javax.swing.JTextField bairroFornecedor;
    private javax.swing.JTextField bairroFuncionario;
    private javax.swing.JButton cadastrarFornecedor;
    private javax.swing.JButton cadastrarFuncionario;
    private javax.swing.JButton cadastrarProduto;
    private javax.swing.JButton cancelFuncionario;
    private javax.swing.JButton cancelProduto;
    private javax.swing.JButton cancelarEstoque;
    private javax.swing.JButton cancelarFornecedor;
    private javax.swing.JTextField cargoFuncionario;
    private javax.swing.JComboBox<String> catFornecedor;
    private javax.swing.JTextField cepFornecedor;
    private javax.swing.JTextField cepFuncionario;
    private javax.swing.JTextField cidFuncionario;
    private javax.swing.JTextField cidadeFornecedor;
    private javax.swing.JComboBox<String> civilFuncionario;
    private javax.swing.JTextField cnpjFornecedor;
    private javax.swing.JTextField codEstoque;
    private javax.swing.JTextField codFuncionario;
    private javax.swing.JTextField codProduto;
    private javax.swing.JTextField compFornecedor;
    private javax.swing.JTextField compFuncionario;
    private javax.swing.JTextField cpfFuncionario;
    private javax.swing.JTextArea descProduto;
    private javax.swing.JComboBox<String> diaValidade;
    private javax.swing.JFormattedTextField emailFornecedor;
    private javax.swing.JFormattedTextField emailFuncionario;
    private javax.swing.JTextField empresaFornecedor;
    private javax.swing.JTextField endFornecedor;
    private javax.swing.JTextField endFuncionario;
    private javax.swing.JComboBox<String> estadoFornecedor;
    private javax.swing.JComboBox<String> estadoFuncionario;
    private javax.swing.JButton excluirFornecedor;
    private javax.swing.JButton excluirFuncionario;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JInternalFrame jInternalFrame3;
    private javax.swing.JInternalFrame jInternalFrame4;
    private javax.swing.JInternalFrame jInternalFrame5;
    private javax.swing.JInternalFrame jInternalFrame6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField marcaEstoque;
    private javax.swing.JTextField marcaProduto;
    private javax.swing.JComboBox<String> mesValidade;
    private javax.swing.JTextField nascFuncionario;
    private javax.swing.JTextField nomeEstoque;
    private javax.swing.JTextField nomeFornecedor;
    private javax.swing.JTextField nomeFuncionario;
    private javax.swing.JTextField nomeProduto;
    private javax.swing.JTextField numFornecedor;
    private javax.swing.JTextField numFuncionario;
    private javax.swing.JComboBox<String> prazoFornecedor;
    private javax.swing.JTextField precoEstoque;
    private javax.swing.JTextField precoProduto;
    private javax.swing.JTextField qtdEstoque;
    private javax.swing.JTextField qtdProduto;
    private javax.swing.JTextField rgFuncionario;
    private javax.swing.JComboBox<String> rgufFuncionario;
    private javax.swing.JTextField saidaEstoque;
    private javax.swing.JTextField salFuncionario;
    private javax.swing.JButton saveEstoque;
    private javax.swing.JComboBox<String> sexoFuncionario;
    private javax.swing.JFormattedTextField telFornecedor;
    private javax.swing.JFormattedTextField telFuncionario;
    // End of variables declaration//GEN-END:variables
    
    
    String codigoFun = codFuncionario.getText();
    String cargoFunc = cargoFuncionario.getText();
    double salarioFunc = Double.parseDouble(salFuncionario.getText());
    String nomeFunc = nomeFuncionario.getText();
    String sexoFunc= (String) sexoFuncionario.getSelectedItem();
    String estadoCivilFunc = (String) civilFuncionario.getSelectedItem();
    String nascFunc = nascFuncionario.getText();
    String cpfFunc = cpfFuncionario.getText();
    String rgFunc = rgFuncionario.getText();
    String rgUfFunc = (String) rgufFuncionario.getSelectedItem();
    String ruaFunc = endFuncionario.getText();
    String numFunc = numFuncionario.getText();
    String complementoFunc = compFuncionario.getText();
    String cidadeFunc = cidFuncionario.getText();
    String estadoFunc = (String) estadoFuncionario.getSelectedItem();
    String bairroFunc = bairroFuncionario.getText();
    String cepFunc = cepFuncionario.getText();
    String telefoneFunc = telFuncionario.getText();
    String emailFunc = emailFuncionario.getText();

    
    Endereco enderecoFunc = new Endereco(ruaFunc, bairroFunc, complementoFunc, cidadeFunc, estadoFunc, numFunc); 
    Funcionarios Func = new Funcionarios(codigoFun, cargoFunc, salarioFunc, rgFunc, cpfFunc, enderecoFunc, 
    		telefoneFunc, sexoFunc, estadoCivilFunc, nascFunc,emailFunc 		);
}
