
package view;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JMenuItem;


public class FrameTablero extends javax.swing.JFrame {




    private int nroFilas;
    private int nroColumnas;

    JButton[][] botones;
    JButton bandera;

    public FrameTablero(int filas, int columnas) {
        nroFilas = filas;
        nroColumnas = columnas;
        botones = new JButton[nroFilas][nroColumnas];
        initComponents();
        if(filas == 8 && columnas ==10){
            setSize(505,420);
            inicializandoBotones(40,40);
        }
        if(filas == 14 && columnas ==18){
            setSize(745, 600);
            inicializandoBotones(35,35);
        }
        if(filas == 20 && columnas ==24){
            setSize(850, 709);
            inicializandoBotones(30,30);
        }
        getContentPane().setBackground(new Color(230, 230, 230));
        //inicializandoBotones();

        setLocationRelativeTo(null);
        revalidate();
        repaint();
    }
    
    public void reset(int filas, int columnas) {
        nroFilas = filas;
        nroColumnas = columnas;
        botones = new JButton[nroFilas][nroColumnas];
        initComponents();
        if (filas == 8 && columnas == 10) {
            setSize(505,420);
            inicializandoBotones(40, 40);
        }
        if (filas == 14 && columnas == 18) {
            setSize(745, 600);
            inicializandoBotones(35, 35);
        }
        if (filas == 20 && columnas == 24) {
            setSize(850, 709);
            inicializandoBotones(30, 30);
        }
        getContentPane().setBackground(new Color(230, 230, 230));
        //inicializandoBotones();

        setLocationRelativeTo(null);
        revalidate();
        repaint();

    }

    public  JButton[][] getBotones() {
        return botones;
    }
    
    public JButton getboton(int x,int y){
        return botones[x][y];
    }

    public void inicializandoBotones(int ancho, int alto) {
        int XReferencia = 20;
        int yReferencia = 20;
        int anchoControl = ancho;
        int altoControl = alto;
        bandera = new JButton();
        for (int i = 0; i < nroFilas; i++) {
            for (int j = 0; j < nroColumnas; j++) {
                botones[i][j] = new JButton();
                botones[i][j].setName(i + "," + j);
                botones[i][j].setBorder(null);
                botones[i][j].setBackground(new Color(211, 211, 211));
                if (i == 0 && j == 0) {
                    botones[i][j].setBounds(XReferencia, yReferencia, anchoControl, altoControl);
                } else {
                    if (i == 0 && j != 0) {
                        botones[i][j].setBounds(botones[i][j - 1].getX() + botones[i][j - 1].getWidth(), yReferencia, anchoControl, altoControl);
                        bandera.setBounds(botones[i][j - 1].getX() + 100, yReferencia, anchoControl, altoControl);
                        bandera.setBorder(null);
                        bandera.setBackground(new Color(230, 230, 230));
                        ImageIcon originalIcon = new ImageIcon(getClass().getResource("/Bandera01.png"));
                        Image resizedImage = originalIcon.getImage().getScaledInstance(botones[0][0].getWidth(), botones[0][0].getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon resizedIcon = new ImageIcon(resizedImage);
                        bandera.setIcon(resizedIcon);
                        getContentPane().add(bandera);
                    } else {
                        botones[i][j].setBounds(botones[i - 1][j].getX(), botones[i - 1][j].getY() + botones[i - 1][j].getHeight(), anchoControl, altoControl);
                    }
                }
                
                getContentPane().add(botones[i][j]);
            }

        }

}
    


    public JMenuItem getnivelFacil() {
        return nivelFacil;
    }

    public JMenuItem getnivelMedio() {
        return nivelMedio;
    }

    public JMenuItem getnivelDificil() {
        return nivelDificil;
    }
    
    public void setNroFilas(int filas){
        nroFilas = filas;
    }
    
        public void setNroColumnas(int columnas){
        nroColumnas = columnas;
    }
        
    public JButton getBandera(){
        return bandera;
    }

/**
 * This method is called from within the constructor to initialize the form.
 * WARNING: Do NOT modify this code. The content of this method is always
 * regenerated by the Form Editor.
 */
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        Menu = new javax.swing.JMenu();
        nivelFacil = new javax.swing.JMenuItem();
        nivelMedio = new javax.swing.JMenuItem();
        nivelDificil = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 51));

        Menu.setText("Juego");

        nivelFacil.setText("Facil");
        Menu.add(nivelFacil);

        nivelMedio.setText("Medio");
        nivelMedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nivelMedioActionPerformed(evt);
            }
        });
        Menu.add(nivelMedio);

        nivelDificil.setText("Dificil");
        nivelDificil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nivelDificilActionPerformed(evt);
            }
        });
        Menu.add(nivelDificil);

        jMenuBar1.add(Menu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2303, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 973, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nivelMedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nivelMedioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nivelMedioActionPerformed

    private void nivelDificilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nivelDificilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nivelDificilActionPerformed

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
                //new FrameTablero(int fila, int columna).setVisible(true);

            }
        });
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Menu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem nivelDificil;
    private javax.swing.JMenuItem nivelFacil;
    private javax.swing.JMenuItem nivelMedio;
    // End of variables declaration//GEN-END:variables
}