/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import dataopersistencia.AlumnoData;
import dataopersistencia.Conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import universidadgrupo1.modelo.*;

/**
 *
 * @author Ana luz
 */
public class FormularioAlumno extends javax.swing.JInternalFrame {
    private AlumnoData alumnoData;
    private Connection con;
    /**
     * Creates new form Alumno
     */
    public FormularioAlumno() {
        initComponents();
        JfechaNacimiento.getDateEditor().setEnabled(false);
        this.con =Conexion.getConexion();
        this.alumnoData= new AlumnoData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDayChooser1 = new com.toedter.calendar.JDayChooser();
        jLocaleChooser1 = new com.toedter.components.JLocaleChooser();
        JfechaNac = new javax.swing.JTextField();
        Jactivo = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Jbuscar = new javax.swing.JButton();
        JGuardar = new javax.swing.JButton();
        Jactualizar = new javax.swing.JButton();
        Jlimpiar = new javax.swing.JButton();
        Jlegajos = new javax.swing.JTextField();
        Japellidos = new javax.swing.JTextField();
        Jnombres = new javax.swing.JTextField();
        Jdnis = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        JfechaNacimiento = new com.toedter.calendar.JDateChooser();
        Jtilde = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Jborrar = new javax.swing.JButton();

        JfechaNac.setText("Fecha Nacimiento");

        Jactivo.setText("Activo");

        jTextField1.setText("Alumnos");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel8.setText("jLabel8");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        Jbuscar.setText("Buscar");
        Jbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbuscarActionPerformed(evt);
            }
        });

        JGuardar.setText("Guardar");
        JGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JGuardarActionPerformed(evt);
            }
        });

        Jactualizar.setText("Actualizar");
        Jactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JactualizarActionPerformed(evt);
            }
        });

        Jlimpiar.setText("Limpiar");
        Jlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JlimpiarActionPerformed(evt);
            }
        });

        Jtilde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtildeActionPerformed(evt);
            }
        });

        jLabel1.setText("Legajo ");

        jLabel2.setText("DNI");

        jLabel3.setText("Apellido");

        jLabel4.setText("Nombre");

        jLabel5.setText("Fecha Nacimiento");

        jLabel6.setText("Activo");

        jLabel7.setText("Alumnos");

        Jborrar.setText("Borrar");
        Jborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JborrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Jlegajos, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(Jbuscar)
                .addGap(277, 277, 277))
            .addGroup(layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(JGuardar)
                        .addGap(207, 207, 207)
                        .addComponent(Jactualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Jborrar)
                        .addGap(19, 19, 19)
                        .addComponent(Jlimpiar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Jtilde))
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addComponent(JfechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Jnombres, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Jdnis, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Japellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jlegajos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jbuscar)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jdnis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Japellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jnombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JfechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Jtilde)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JGuardar)
                    .addComponent(Jactualizar)
                    .addComponent(Jlimpiar)
                    .addComponent(Jborrar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void JGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JGuardarActionPerformed
        // TODO add your handling code here:
        
        int Dni = Integer.parseInt(Jdnis.getText());
        String Apellido= Japellidos.getText();
        String Nombre= Jnombres.getText();
        boolean Activo = Jtilde.isEnabled();
        SimpleDateFormat formatofecha = new SimpleDateFormat("dd-MM-yyyy");
        String fecha=formatofecha.format(JfechaNacimiento.getDate());
        LocalDate FechaNac = LocalDate.parse(fecha,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        Alumno  alumno = new Alumno( Apellido, Nombre,FechaNac,Dni,Activo);
        alumnoData.guardarAlumno(alumno);
        Jlegajos.setText(alumno.getIdAlumno()+"");
        
        
    }//GEN-LAST:event_JGuardarActionPerformed

    private void JlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JlimpiarActionPerformed
     Jlegajos.setText("");
     Jdnis.setText("");
     Japellidos.setText("");
     Jnombres.setText("");
     JfechaNacimiento.setDate(Date.valueOf(LocalDate.now()));
     Jtilde.setEnabled(false);
     
    }//GEN-LAST:event_JlimpiarActionPerformed

    private void JbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbuscarActionPerformed
     int id = Integer.parseInt(Jlegajos.getText());
        Alumno alum=alumnoData.obtenerAlumnoPorId(id);
        if (alum.getDni()>0){
        try{
            Jdnis.setText(alum.getDni()+"");
            Japellidos.setText(alum.getApellido());
            Jnombres.setText(alum.getNombre());
            JfechaNacimiento.setDate(Date.valueOf(alum.getFechaNac()));
            System.out.println();
            Jtilde.setSelected(alum.isActivo());
        }catch (NumberFormatException e ){
            JOptionPane.showMessageDialog(this,"ustd debe ingresar solo numeros");
            Jlegajos.setText("");
            Jlegajos.requestFocus();
        }
         
     }else {
            JOptionPane.showMessageDialog(this,"Alumno no encontrado");
        }
    }//GEN-LAST:event_JbuscarActionPerformed

    private void JtildeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtildeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtildeActionPerformed

    private void JborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JborrarActionPerformed
        // TODO add your handling code here:
        int idAlumno=Integer.parseInt(Jlegajos.getText());
        alumnoData.borrarAlumno(idAlumno);
    }//GEN-LAST:event_JborrarActionPerformed

    private void JactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JactualizarActionPerformed
        int id = 1;
        try {
            id = Integer.parseInt(Jlegajos.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Usted Debe ingresar solo numero");
            Jlegajos.setText("");
            Jlegajos.requestFocus();
        }
        String Nombre = Jnombres.getText();
        String Apellido = Japellidos.getText();
        long Dni = -1;
        try {
            Dni = Long.parseLong(Jdnis.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Usted Debe ingresar solo numero");
            Jdnis.setText("");
            Jdnis.requestFocus();    
        }
        
        SimpleDateFormat formatoFecha = new SimpleDateFormat ("dd-MM-yyyy");
        String fecha = formatoFecha.format(JfechaNacimiento.getDate());
        LocalDate FechaNac = LocalDate.parse(fecha,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        boolean Activo = Jtilde.isSelected();
        Alumno alumno = new Alumno(id, Apellido, Nombre, FechaNac, Dni, Activo);
        alumnoData.actualizaAlumno(alumno) ;
        
    }//GEN-LAST:event_JactualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JGuardar;
    private javax.swing.JTextField Jactivo;
    private javax.swing.JButton Jactualizar;
    private javax.swing.JTextField Japellidos;
    private javax.swing.JButton Jborrar;
    private javax.swing.JButton Jbuscar;
    private javax.swing.JTextField Jdnis;
    private javax.swing.JTextField JfechaNac;
    private com.toedter.calendar.JDateChooser JfechaNacimiento;
    private javax.swing.JTextField Jlegajos;
    private javax.swing.JButton Jlimpiar;
    private javax.swing.JTextField Jnombres;
    private javax.swing.JCheckBox Jtilde;
    private com.toedter.calendar.JDayChooser jDayChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private com.toedter.components.JLocaleChooser jLocaleChooser1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
