package aula2a;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Janela extends javax.swing.JFrame {

    ArrayList<Aluno> chamada = new ArrayList<>();

    public Janela() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoNome = new javax.swing.JTextField();
        campoIdade = new javax.swing.JTextField();
        campoCpf = new javax.swing.JTextField();
        campoMatricula = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        botaoCadastra = new javax.swing.JButton();
        botaoLista = new javax.swing.JButton();
        botaoRemove = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cadastro de Aluno");

        jLabel2.setText("Nome:");

        jLabel3.setText("CPF:");

        jLabel4.setText("Idade:");

        jLabel5.setText("Matrícula:");

        botaoCadastra.setText("Cadastra");
        botaoCadastra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastraActionPerformed(evt);
            }
        });

        botaoLista.setText("Listar");
        botaoLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoListaActionPerformed(evt);
            }
        });

        botaoRemove.setText("Remover");
        botaoRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRemoveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132))
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campoMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(campoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaoCadastra)
                                .addGap(18, 18, 18)
                                .addComponent(botaoLista, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botaoRemove)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(campoIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCadastra)
                    .addComponent(botaoLista)
                    .addComponent(botaoRemove))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCadastraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastraActionPerformed
        if (verificaInfos()) {
        String nome = campoNome.getText();
        String cpf = campoCpf.getText();
        String matricula = campoMatricula.getText();
        int idade = Integer.parseInt(campoIdade.getText());
        Aluno a = new Aluno(matricula);
        a.setNome(nome);
        a.setIdade(idade);
        a.setCpf(cpf);
        chamada.add(a);
        campoNome.setText(null);
        campoCpf.setText(null);
        campoMatricula.setText(null);
        campoIdade.setText(null);
        JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!");
        }
        else JOptionPane.showMessageDialog(null, "Digite as informações corretamente");
    }//GEN-LAST:event_botaoCadastraActionPerformed
    public boolean verificaInfos(){
        if(campoNome.getText().equals("") || campoCpf.getText().equals("") ||
    campoMatricula.getText().equals("") || campoIdade.getText().equals("")){
            return false;
        }
        try{
            Integer.parseInt(campoIdade.getText());
        }
        catch(Exception e){
            return false;
        }
        return true;
    }
    private void botaoListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoListaActionPerformed
        String mensagem = "Alunos\n";
        for (Aluno a : chamada) {
            mensagem += "Nome: " + a.getNome() + "\n";
            mensagem += "Idade: " + a.getIdade() + "\n";
            mensagem += "CPF: " + a.getCpf() + "\n";
            mensagem += "Matrícula: " + a.getMatricula() + "\n";
            mensagem += "----------------------------------\n";
        }
        JOptionPane.showMessageDialog(null, mensagem);
    }//GEN-LAST:event_botaoListaActionPerformed

    private void botaoRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRemoveActionPerformed
        String cpf = JOptionPane.showInputDialog("Digite o CPF que deseja remover.");
        String mensagem = "CPF não encontrado.";
        for (Aluno a : chamada) {
            if (cpf.equals(a.getCpf())) {
                chamada.remove(a);
                mensagem = "Aluno "+a.getNome()+" foi removido com sucesso.";
                break;
            }
        }
        JOptionPane.showMessageDialog(this, mensagem);
    }//GEN-LAST:event_botaoRemoveActionPerformed

    

    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Janela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastra;
    private javax.swing.JButton botaoLista;
    private javax.swing.JButton botaoRemove;
    private javax.swing.JTextField campoCpf;
    private javax.swing.JTextField campoIdade;
    private javax.swing.JTextField campoMatricula;
    private javax.swing.JTextField campoNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
