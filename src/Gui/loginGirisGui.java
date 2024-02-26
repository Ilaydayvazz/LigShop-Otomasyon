/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Gui;

import Classlar.EmailAtma;
import VeriTabani.MusteriVeritabani;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ilayd
 */
public class loginGirisGui extends javax.swing.JFrame {

    public loginGirisGui() {
        initComponents();
        setTitle("LigShop : SÜPER LİG ÜRÜNLERİ");

        jLabelAnaGorsel();
        // jButtonGiris1.setBackground(new java.awt.Color(0, 0, 0, 0));

    }

    public void jLabelAnaGorsel() {
        // jLabel1 üzerindeki ikonu al
        Icon i = jLabelLoginGorsel.getIcon();
        // Görüntüyü ImageIcon olarak al
        ImageIcon icon = (ImageIcon) i;

        // Ekran boyutunu al
        Dimension ekranBoyutu = Toolkit.getDefaultToolkit().getScreenSize();
        int ekranGenisligi = (int) ekranBoyutu.getWidth();
        int ekranYuksekligi = (int) ekranBoyutu.getHeight();

        // ImageIcon içindeki ikonu ekran boyutuna göre ayarla
        Image image = icon.getImage().getScaledInstance(ekranGenisligi, ekranYuksekligi, Image.SCALE_SMOOTH);
        // jLabel1'e yeni ikonu ekle
        jLabelLoginGorsel.setIcon(new ImageIcon(image));

        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setResizable(false);

        setVisible(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelEposta = new javax.swing.JLabel();
        jLabelParola = new javax.swing.JLabel();
        jLabelKarsilamaMesaji = new javax.swing.JLabel();
        jTextFieldEposta = new javax.swing.JTextField();
        jPasswordFieldSifre = new javax.swing.JPasswordField();
        jCheckBoxSifreyiGoster = new javax.swing.JCheckBox();
        jButtonGiris = new javax.swing.JButton();
        jButtonSifremiUnuttum = new javax.swing.JButton();
        jButtonGeri = new javax.swing.JButton();
        jLabelLoginGorsel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(2000, 1000));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0,0,0,80));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabelEposta.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabelEposta.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEposta.setText("E-POSTA ADRESİ:");

        jLabelParola.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabelParola.setForeground(new java.awt.Color(255, 255, 255));
        jLabelParola.setText("PAROLA:");

        jLabelKarsilamaMesaji.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        jLabelKarsilamaMesaji.setForeground(new java.awt.Color(255, 255, 255));
        jLabelKarsilamaMesaji.setText("ÜYE GİRİŞİ");

        jTextFieldEposta.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jTextFieldEposta.setPreferredSize(new java.awt.Dimension(70, 42));
        jTextFieldEposta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEpostaActionPerformed(evt);
            }
        });

        jPasswordFieldSifre.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N

        jCheckBoxSifreyiGoster.setBackground(new java.awt.Color(0, 0, 0));
        jCheckBoxSifreyiGoster.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jCheckBoxSifreyiGoster.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxSifreyiGoster.setText("Şifreyi Göster");
        jCheckBoxSifreyiGoster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxSifreyiGosterActionPerformed(evt);
            }
        });

        jButtonGiris.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jButtonGiris.setText("GİRİŞ");
        jButtonGiris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGirisActionPerformed(evt);
            }
        });

        jButtonSifremiUnuttum.setFont(new java.awt.Font("Segoe UI Black", 0, 8)); // NOI18N
        jButtonSifremiUnuttum.setText("ŞİFREMİ UNUTTUM");
        jButtonSifremiUnuttum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSifremiUnuttumActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabelParola, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelEposta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldEposta, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPasswordFieldSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonSifremiUnuttum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonGiris, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                        .addComponent(jCheckBoxSifreyiGoster, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabelKarsilamaMesaji, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabelKarsilamaMesaji, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEposta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEposta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelParola, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordFieldSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBoxSifreyiGoster)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSifremiUnuttum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonGiris, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 650, 300));

        jButtonGeri.setFont(new java.awt.Font("Snap ITC", 1, 14)); // NOI18N
        jButtonGeri.setText("GERİ");
        jButtonGeri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGeriActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGeri, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 30));

        jLabelLoginGorsel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageLogin/login.jpg"))); // NOI18N
        getContentPane().add(jLabelLoginGorsel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1750, 870));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldEpostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEpostaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEpostaActionPerformed

    private void jCheckBoxSifreyiGosterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxSifreyiGosterActionPerformed
        if (jCheckBoxSifreyiGoster.isSelected()) {//sifreyiGoster secili ise
            jPasswordFieldSifre.setEchoChar((char) 0); //secili oldugu an butun karakterleri ac
        } else { //eger secili degil ise
            jPasswordFieldSifre.setEchoChar('*'); //kullanici secmeyi birakinca sifreyi kapa

        }

    }//GEN-LAST:event_jCheckBoxSifreyiGosterActionPerformed

    private void jButtonGirisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGirisActionPerformed
        //empty metnin icine bakar
        if ((jTextFieldEposta == null || jTextFieldEposta.getText().isEmpty()) && (jPasswordFieldSifre == null || jPasswordFieldSifre.getText().isEmpty())) {
            JOptionPane.showMessageDialog(loginGirisGui.this, "Giriş Başarısız");
        } else if (MusteriVeritabani.kontrol(jTextFieldEposta.getText(), jPasswordFieldSifre.getText())) {
            JOptionPane.showMessageDialog(loginGirisGui.this, "Giriş Başarılı");
            TümTakimlarGui giris = new TümTakimlarGui();
            giris.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(loginGirisGui.this, "Giriş Başarısız");
        }
    }//GEN-LAST:event_jButtonGirisActionPerformed

    private void jButtonSifremiUnuttumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSifremiUnuttumActionPerformed
        // Kullanıcının girdiği e-posta adresini al
        String eposta = jTextFieldEposta.getText();

        // Eğer e-posta alanı boşsa kullanıcıya uyarı ver ve işlemi sonlandır
        if (eposta.isEmpty()) {
            JOptionPane.showMessageDialog(loginGirisGui.this, "E-posta adresi boş olamaz.");
            return;
        }

        // Veritabanından şifreyi çek
        String sifre = MusteriVeritabani.sifreGetir(eposta);

        // Eğer şifre bulunamazsa kullanıcıya uyarı ver
        if (sifre == null || sifre.isEmpty()) {
            JOptionPane.showMessageDialog(loginGirisGui.this, "Bu e-posta adresi ile ilişkilendirilmiş bir hesap bulunamadı.");
        } else {
            // Eğer şifre bulunursa, e-posta gönder
            String konu = "Şifre Hatırlatma";
            String mesaj = "Merhaba, şifreniz:" + sifre;

            // E-postayı gönder
            List<String> mailList = new ArrayList<>();
            mailList.add(eposta);

            EmailAtma.mail(konu, mesaj, mailList, eposta);

            JOptionPane.showMessageDialog(loginGirisGui.this, "Şifre e-posta olarak gönderildi. Lütfen e-posta adresinizi kontrol edin.");
        }
    }//GEN-LAST:event_jButtonSifremiUnuttumActionPerformed

    private void jButtonGeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGeriActionPerformed
        loginGui giris = new loginGui();
            giris.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jButtonGeriActionPerformed

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
            java.util.logging.Logger.getLogger(loginGirisGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginGirisGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginGirisGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginGirisGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginGirisGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGeri;
    private javax.swing.JButton jButtonGiris;
    private javax.swing.JButton jButtonSifremiUnuttum;
    private javax.swing.JCheckBox jCheckBoxSifreyiGoster;
    private javax.swing.JLabel jLabelEposta;
    private javax.swing.JLabel jLabelKarsilamaMesaji;
    private javax.swing.JLabel jLabelLoginGorsel;
    private javax.swing.JLabel jLabelParola;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldSifre;
    private javax.swing.JTextField jTextFieldEposta;
    // End of variables declaration//GEN-END:variables
}
