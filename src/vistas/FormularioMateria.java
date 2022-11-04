
package vistas;

import dataopersistencia.Conexion;
import dataopersistencia.MateriaData;
import java.sql.Connection;
import javax.swing.JOptionPane;
import universidadgrupo1.modelo.Materia;


public class FormularioMateria extends javax.swing.JInternalFrame {
    private MateriaData mat;
    private Connection conn;
    Materia materia;
    public FormularioMateria() {
        initComponents();
        this.conn = Conexion.getConexion();
        this.mat = new MateriaData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jBotonGuardar = new javax.swing.JButton();
        jBotonActualizar = new javax.swing.JButton();
        jBotonBorrar = new javax.swing.JButton();
        jftCodigoMateria = new javax.swing.JTextField();
        jBotonLimpiar = new javax.swing.JButton();
        jBotonBuscar = new javax.swing.JButton();
        jftNombre = new javax.swing.JTextField();
        jftAnio = new javax.swing.JTextField();
        jcbActiva = new javax.swing.JCheckBox();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Materia");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Codigo");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Añio");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Activa");

        jBotonGuardar.setText("Guardar");
        jBotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardar(evt);
            }
        });

        jBotonActualizar.setText("Actualizar");
        jBotonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizar(evt);
            }
        });

        jBotonBorrar.setText("Borrar");
        jBotonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrar(evt);
            }
        });

        jBotonLimpiar.setText("Limpiar");
        jBotonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiar(evt);
            }
        });

        jBotonBuscar.setText("Buscar");
        jBotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscar(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBotonGuardar)
                        .addGap(14, 14, 14)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jftNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jftAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jftCodigoMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(59, 59, 59)
                                .addComponent(jBotonBuscar))
                            .addComponent(jcbActiva)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jBotonBorrar)
                        .addGap(18, 18, 18)
                        .addComponent(jBotonActualizar)
                        .addGap(18, 18, 18)
                        .addComponent(jBotonLimpiar)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jftCodigoMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBotonBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jftNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jftAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbActiva)
                    .addComponent(jLabel5))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBotonGuardar)
                    .addComponent(jBotonBorrar)
                    .addComponent(jBotonLimpiar)
                    .addComponent(jBotonActualizar))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonGuardar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardar
        materia = new Materia();
        mat = new MateriaData();
        materia.setNombre(jftNombre.getText());
        boolean flag = false;
        try {
            materia.setAnio(Integer.parseInt(jftAnio.getText()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: Ingrese numero");
        }
        if (!jcbActiva.isSelected()) {
            JOptionPane.showMessageDialog(this, "Tilde 'Activa' para poder finalizar");
        }
        flag = true;
        materia.setActiva(flag);
        mat.guardarMateria(materia);
    }//GEN-LAST:event_botonGuardar

    private void botonLimpiar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiar
        jftNombre.setText("");
        jftAnio.setText("");
        jftCodigoMateria.setText("");
        //para destildar el checkbox
        jcbActiva.setSelected(false);
    }//GEN-LAST:event_botonLimpiar

    private void botonBorrar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrar
        try {
            int idMateria = Integer.parseInt(jftCodigoMateria.getText());
            if (idMateria==0) {
            mat.borrarMateria(idMateria);
        }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ingrese codigo!");
        }
    }//GEN-LAST:event_botonBorrar

    private void botonActualizar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizar
        try {
        materia.setAnio(Integer.parseInt(jftAnio.getText()));
        materia.setNombre(jftNombre.getText());
        boolean flag = false;
        if (jcbActiva.isSelected()) {
            flag = true;
        }
        materia.setIdMateria(Integer.parseInt(jftCodigoMateria.getText()));
        materia.setActiva(flag);
        mat.actualizaMateria(materia);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Llene los campos");
        }
       
    }//GEN-LAST:event_botonActualizar

    private void botonBuscar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscar
        int id = Integer.parseInt(jftCodigoMateria.getText());
        Materia materia  = mat.obtenerMateriaPorId(id);
        if (materia.getIdMateria()>0) {
            try{
                jftNombre.setText(materia.getNombre());
                jftAnio.setText((materia.getAnio()+""));
                jcbActiva.setSelected(materia.isActiva());
            }catch (NumberFormatException ex ){
            JOptionPane.showMessageDialog(this,"ustd debe ingresar solo numeros");
            jftCodigoMateria.setText("");
            jftCodigoMateria.requestFocus();
            }
        }else{
            JOptionPane.showMessageDialog(this, "No se encontro materia");
        }
    }//GEN-LAST:event_botonBuscar


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBotonActualizar;
    private javax.swing.JButton jBotonBorrar;
    private javax.swing.JButton jBotonBuscar;
    private javax.swing.JButton jBotonGuardar;
    private javax.swing.JButton jBotonLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JCheckBox jcbActiva;
    private javax.swing.JTextField jftAnio;
    private javax.swing.JTextField jftCodigoMateria;
    private javax.swing.JTextField jftNombre;
    // End of variables declaration//GEN-END:variables
}
