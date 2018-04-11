package main;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;

public class Main extends javax.swing.JFrame {

    private static int circulos = 0;
    
    public Main() {
        initComponents();
        
        btnDibuxa.addActionListener((ActionEvent e) -> {
            
            circulos = Integer.parseInt(lbCirculos.getText());
            Main.this.repaint();
        });
        
        btnLimpa.addActionListener((ActionEvent e) -> {
            
            circulos = 0;
            Main.this.repaint();
        });
    }

    @Override public void paint(Graphics g){
        super.paint(g); 
        
        for (int i = 0; i < circulos; i++) {
                
            Graphics2D circulo = (Graphics2D)g;
            circulo.setStroke(new BasicStroke(10.f));
            circulo.setPaint(Color.RED);
            float diametro = 5 * 2;
            circulo.drawOval(getRandomPosition(0, 390), getRandomPosition(100, 390), (int) diametro, (int) diametro);
        }     
    }
    
    public int getRandomPosition(int min, int max) {
        
        return (int) (Math.random() * (max - min) + min);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDibuxa = new javax.swing.JButton();
        btnLimpa = new javax.swing.JButton();
        lbCirculos = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 400));

        btnDibuxa.setText("Dibuxa");

        btnLimpa.setText("Limpa");

        lbCirculos.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lbCirculos, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDibuxa)
                .addGap(18, 18, 18)
                .addComponent(btnLimpa))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCirculos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDibuxa)
                    .addComponent(btnLimpa)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDibuxa;
    private javax.swing.JButton btnLimpa;
    private javax.swing.JTextField lbCirculos;
    // End of variables declaration//GEN-END:variables
}
