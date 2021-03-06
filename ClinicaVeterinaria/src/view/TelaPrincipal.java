/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import java.util.ArrayList;
import javax.swing.table.TableModel;

import controller.Controller;
import model.Animal;
import model.AnimalDAO;
import model.Cliente;
import model.ClienteDAO;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTabbedPane;
import javax.swing.GroupLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
/**
 *
 * @author vilela
 */
public class TelaPrincipal extends javax.swing.JFrame {
	private JTable table_animais;
	private JTable table_clientes;

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
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
        
        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 521, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 351, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(14, Short.MAX_VALUE))
        );
        
        JPanel clientePanel = new JPanel();
        tabbedPane.addTab("Clientes", null, clientePanel, null);
        clientePanel.setLayout(null);
        
        JLabel lblClientes = new JLabel("Clientes");
        lblClientes.setBounds(12, 12, 70, 15);
        clientePanel.add(lblClientes);
        
        table_clientes = new JTable();
        table_clientes.setBounds(12, 110, 482, 108);
        table_clientes.setModel(new ClienteTableModel((ArrayList)Controller.getAllClientes()));
        clientePanel.add(table_clientes);
        
        JPanel animalPanel = new JPanel();
        tabbedPane.addTab("Animais", null, animalPanel, null);
        animalPanel.setLayout(null);
        
        JLabel lblAnimais = new JLabel("Animais");
        lblAnimais.setBounds(12, 12, 70, 15);
        animalPanel.add(lblAnimais);
        
        table_animais = new JTable();
        table_animais.setBounds(12, 110, 482, 108);
        table_animais.setModel(new AnimalTableModel((ArrayList)Controller.getAllAnimais()));
        animalPanel.add(table_animais);
        
        JButton btnAdicionarAnimal = new JButton("Adicionar Animal");
        btnAdicionarAnimal.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		int newId = Controller.addAnimal("", "", 0, 0);
                
                if (newId >= 0) {
                    Animal animal = Controller.getAnimalById(newId);
                    GenericTableModel tb = (GenericTableModel)table_animais.getModel();
                    tb.addItem(animal);
                }
        	}
        });
        btnAdicionarAnimal.setBounds(12, 40, 160, 25);
        animalPanel.add(btnAdicionarAnimal);
        getContentPane().setLayout(layout);

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }
}
