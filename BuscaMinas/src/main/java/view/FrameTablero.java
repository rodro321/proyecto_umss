/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author win
 */
public class FrameTablero extends javax.swing.JFrame {

    /**
     * Creates new form FrameTablero
     */
    int nroFilas;
    int nroColumnas;

    JButton[][] botones;

    public FrameTablero(int filas, int columnas) {
        nroFilas = filas;
        nroColumnas = columnas;
        botones = new JButton[nroFilas][nroColumnas];
        initComponents();
        if(filas == 8 && columnas ==10){
            setSize(500,400);
            inicializandoBotones(40,40);
        }
        if(filas == 15 && columnas ==18){
            setSize(690, 600);
            inicializandoBotones(35,35);
        }
        if(filas == 20 && columnas ==24){
            setSize(870,689);
            inicializandoBotones(30,30);
        }
        getContentPane().setBackground(new Color(230, 230, 230));
        //inicializandoBotones();

        setLocationRelativeTo(null);
    }

    private void inicializandoBotones(int ancho, int alto) {
        ImageIcon originalIcon = new ImageIcon(getClass().getResource("/celdas1.png"));
        Image resizedImage = originalIcon.getImage().getScaledInstance(ancho+15, alto+15, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImage);
        int XReferencia = 20;
        int yReferencia = 20;
        int anchoControl = ancho;
        int altoControl = alto;
        for (int i = 0; i < nroFilas; i++) {
            for (int j = 0; j < nroColumnas; j++) {
                botones[i][j] = new JButton();
                botones[i][j].setName(i + "," + j);
                botones[i][j].setBorder(null);
                botones[i][j].setIcon(resizedIcon);
                if (i == 0 && j == 0) {
                    botones[i][j].setBounds(XReferencia, yReferencia, anchoControl, altoControl);
                } else {
                    if (i == 0 && j != 0) {
                        botones[i][j].setBounds(botones[i][j - 1].getX() + botones[i][j - 1].getWidth(), yReferencia, anchoControl, altoControl);
                    } else {
                        botones[i][j].setBounds(botones[i - 1][j].getX(), botones[i - 1][j].getY() + botones[i - 1][j].getHeight(), anchoControl, altoControl);
                    }
                }
                botones[i][j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        btnClick(e);
                    }
                });
                getContentPane().add(botones[i][j]);
            }

        }
}
    
public void btnClick(ActionEvent e){
    JButton btn = (JButton) e.getSource();
    String[] coordenada = btn.getName().split(",");
    int posFila = Integer.parseInt(coordenada[0]);
    int posColumna = Integer.parseInt(coordenada[1]);


    JOptionPane.showMessageDialog(rootPane, posFila + "," + posColumna);
    cambiarImagen(btn);
}

    private void cambiarImagen(JButton btn) {
        ImageIcon original = new ImageIcon(getClass().getResource("/celda02.png"));
        Image resized = original.getImage().getScaledInstance(btn.getWidth() + 15, btn.getHeight() + 15, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resized);
        btn.setIcon(resizedIcon);

    }
    
   public JPanel getTablero(){
       JPanel panel = (JPanel) getContentPane();
       return panel;
   }
/**
 * This method is called from within the constructor to initialize the form.
 * WARNING: Do NOT modify this code. The content of this method is always
 * regenerated by the Form Editor.
 */
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2303, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 996, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FrameTablero.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameTablero.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameTablero.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameTablero.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
public void run() {
                new FrameTablero(8, 10).setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}