/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uv.es.ligaajedrez;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Vector;
import lombok.extern.slf4j.Slf4j;
import uv.es.ligaajedrez.modelo.DatosLigaAjedrez;
import uv.es.ligaajedrez.modelo.usuarios.Jugador;
import uv.es.ligaajedrez.modelo.usuarios.Usuario;

/**
 * @author vmarzal
 */
@Slf4j
public class RegistroJFrame extends javax.swing.JFrame {

    private DatosLigaAjedrez commonData;    
    private Map<String, Usuario> loadedUsers;
            
    /**
     * Creates new form Registro
     */
    public RegistroJFrame() {
        initComponents();
             
        commonData = DatosLigaAjedrez.getSingletonInstance();                        
        loadedUsers = commonData.getLoadedUsersList();        
        loadedUsers.values().stream().forEach(System.out::println);        
       
        /**
        jCB_tipoJugador.removeAllItems();
       
        for (String tipoJugador: tipoJugadors){
            jCB_tipoJugador.addItem(tipoJugador);
        }        
        jList_clubesTrabajo.setListData(clubesTrabajo);
        **/        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jL_nom = new javax.swing.JLabel();
        jT_nom = new javax.swing.JTextField();
        jL_apellido = new javax.swing.JLabel();
        jT_apellido = new javax.swing.JTextField();
        jL_direc = new javax.swing.JLabel();
        jT_direc = new javax.swing.JTextField();
        jL_fNaci = new javax.swing.JLabel();
        jT_fNaci = new javax.swing.JTextField();
        jS_datosPersonales = new javax.swing.JSeparator();
        jL_user = new javax.swing.JLabel();
        jT_user = new javax.swing.JTextField();
        jL_pw = new javax.swing.JLabel();
        jL_pw2 = new javax.swing.JLabel();
        jP_pw = new javax.swing.JPasswordField();
        jP_pw2 = new javax.swing.JPasswordField();
        btnRegistrar = new javax.swing.JButton();
        btnVolverLogin = new javax.swing.JButton();
        jS_userPw = new javax.swing.JSeparator();
        jL_clubJugador = new javax.swing.JLabel();
        jT_clubJugador = new javax.swing.JTextField();
        jL_tipoJugador = new javax.swing.JLabel();
        jT_elo = new javax.swing.JTextField();
        jL_elo = new javax.swing.JLabel();
        jSP_clubesTrabajo = new javax.swing.JScrollPane();
        jList_clubesTrabajo = new javax.swing.JList<>();
        jL_clubesTrabajo = new javax.swing.JLabel();
        jB_borrar = new javax.swing.JButton();
        jCB_tipoJugador = new javax.swing.JComboBox<>();
        jL_dni = new javax.swing.JLabel();
        jT_dni = new javax.swing.JTextField();
        jT_email = new javax.swing.JTextField();
        jL_email = new javax.swing.JLabel();
        jT_tele = new javax.swing.JTextField();
        jL_telef = new javax.swing.JLabel();
        jS_userPw1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(767, 770));
        setSize(new java.awt.Dimension(0, 0));

        jPanel2.setBackground(new java.awt.Color(204, 102, 0));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Registro de nuevo jugador");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jL_nom.setText("Nombre:");

        jT_nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_nomActionPerformed(evt);
            }
        });

        jL_apellido.setText("Apellidos:");

        jL_direc.setText("Dirección:");

        jL_fNaci.setText("Fecha de Nac:");

        jT_fNaci.setText("10/05/2009");

        jL_user.setText("Username:");

        jL_pw.setText("Password:");

        jL_pw2.setText("Repita password:");

        jP_pw.setText("jPasswordField1");

        jP_pw2.setText("jPasswordField2");

        btnRegistrar.setBackground(new java.awt.Color(0, 153, 255));
        btnRegistrar.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnVolverLogin.setBackground(new java.awt.Color(0, 153, 255));
        btnVolverLogin.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnVolverLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnVolverLogin.setText("Volver");
        btnVolverLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverLoginActionPerformed(evt);
            }
        });

        jL_clubJugador.setText("Club");
        jL_clubJugador.setOpaque(true);

        jT_clubJugador.setText("Nombre del club");
        jT_clubJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_clubJugadorActionPerformed(evt);
            }
        });

        jL_tipoJugador.setText("Tipo jugador");
        jL_tipoJugador.setOpaque(true);

        jT_elo.setText("2");
        jT_elo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_eloActionPerformed(evt);
            }
        });

        jL_elo.setText("ELO");
        jL_elo.setOpaque(true);

        jList_clubesTrabajo.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jSP_clubesTrabajo.setViewportView(jList_clubesTrabajo);

        jL_clubesTrabajo.setText("Clubes donde trabaja");
        jL_clubesTrabajo.setOpaque(true);

        jB_borrar.setText("Borrar");
        jB_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_borrarActionPerformed(evt);
            }
        });

        jCB_tipoJugador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jL_dni.setText("DNI");

        jT_dni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_dniActionPerformed(evt);
            }
        });

        jT_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_emailActionPerformed(evt);
            }
        });

        jL_email.setText("Email:");

        jT_tele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_teleActionPerformed(evt);
            }
        });

        jL_telef.setText("Telefono:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jL_clubJugador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jT_clubJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jL_tipoJugador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCB_tipoJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jL_elo)
                        .addGap(18, 18, 18)
                        .addComponent(jT_elo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jL_clubesTrabajo)
                            .addComponent(jB_borrar))
                        .addGap(18, 18, 18)
                        .addComponent(jSP_clubesTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnVolverLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(147, 147, 147))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jS_userPw1, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jS_userPw)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jS_datosPersonales, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jL_telef)
                                        .addGap(18, 18, 18)
                                        .addComponent(jT_tele, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(46, 46, 46)
                                        .addComponent(jL_email)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jT_email, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jL_nom)
                                            .addGap(22, 22, 22)
                                            .addComponent(jT_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(26, 26, 26)
                                            .addComponent(jL_dni)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jT_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jL_apellido)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jT_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jL_fNaci)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jT_fNaci)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jL_direc)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jT_direc, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jL_user)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jT_user, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jL_pw)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jP_pw, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jL_pw2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jP_pw2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_user)
                    .addComponent(jT_user, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_pw)
                    .addComponent(jP_pw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_pw2)
                    .addComponent(jP_pw2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jS_datosPersonales, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jL_dni)
                        .addComponent(jT_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jL_nom)
                        .addComponent(jT_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jL_fNaci)
                        .addComponent(jT_fNaci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jL_apellido)
                        .addComponent(jT_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_direc)
                    .addComponent(jT_direc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_telef)
                    .addComponent(jT_tele, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_email)
                    .addComponent(jT_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jS_userPw1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jT_clubJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_clubJugador)
                    .addComponent(jL_tipoJugador)
                    .addComponent(jL_elo)
                    .addComponent(jCB_tipoJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jT_elo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jL_clubesTrabajo)
                        .addGap(18, 18, 18)
                        .addComponent(jB_borrar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSP_clubesTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addComponent(jS_userPw, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistrar)
                    .addComponent(btnVolverLogin))
                .addGap(24, 24, 24))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jT_nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_nomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_nomActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        log.info("Persistimos el registro del nuevo usuario...");
        
        // TODO: variables para las 9 propiedades obligatorias de un Usuario
        // TODO: tlfno y dirección podrían ser opcionales
        String login, password, passwordRepetido;
        String DNI, nombre, apellidos, email, telefono, direccion;
        String fechaNacimiento;                
               
        // TODO: validaciones de fecha        
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
     
        // TODO: validacion del password doble
        login = jT_user.getText();
        password = new String(jP_pw.getPassword());
        passwordRepetido = new String(jP_pw2.getPassword());
                
        nombre = jT_nom.getText();
        apellidos= jT_apellido.getText();
        DNI = jT_dni.getText();
        email = jT_email.getText();
        telefono = jT_tele.getText();
        direccion = jT_direc.getText();        
                
        log.info("> " + jT_fNaci.getText());
        LocalDate fechaNac = LocalDate.parse(jT_fNaci.getText(), df);
               
        Jugador jugador = Jugador.builder().login(login).password(password)
                .nombre(nombre).apellidos(apellidos).DNI(DNI).email(email)
                .telefono(telefono).direccion(direccion).fechaNacimiento(fechaNac)
                .build();                            
        
        loadedUsers.put(jugador.getLogin(), jugador);        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnVolverLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverLoginActionPerformed
        log.info("Volvemos al login");
        dispose();
        
        
        Login login = new Login();
        login.setVisible(true);
                
    }//GEN-LAST:event_btnVolverLoginActionPerformed

    private void jT_eloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_eloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_eloActionPerformed

    private void jT_clubJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_clubJugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_clubJugadorActionPerformed

    private void jB_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_borrarActionPerformed
        // TODO add your handling code here:
        int i= jList_clubesTrabajo.getSelectedIndex();
        clubesTrabajo.remove(i);
        jList_clubesTrabajo.setListData(clubesTrabajo);
        
    }//GEN-LAST:event_jB_borrarActionPerformed

    private void jT_dniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_dniActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jT_dniActionPerformed

    private void jT_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_emailActionPerformed

    private void jT_teleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_teleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_teleActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVolverLogin;
    private javax.swing.JButton jB_borrar;
    private javax.swing.JComboBox<String> jCB_tipoJugador;
    private javax.swing.JLabel jL_apellido;
    private javax.swing.JLabel jL_clubJugador;
    private javax.swing.JLabel jL_clubesTrabajo;
    private javax.swing.JLabel jL_direc;
    private javax.swing.JLabel jL_dni;
    private javax.swing.JLabel jL_elo;
    private javax.swing.JLabel jL_email;
    private javax.swing.JLabel jL_fNaci;
    private javax.swing.JLabel jL_nom;
    private javax.swing.JLabel jL_pw;
    private javax.swing.JLabel jL_pw2;
    private javax.swing.JLabel jL_telef;
    private javax.swing.JLabel jL_tipoJugador;
    private javax.swing.JLabel jL_user;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList_clubesTrabajo;
    private javax.swing.JPasswordField jP_pw;
    private javax.swing.JPasswordField jP_pw2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jSP_clubesTrabajo;
    private javax.swing.JSeparator jS_datosPersonales;
    private javax.swing.JSeparator jS_userPw;
    private javax.swing.JSeparator jS_userPw1;
    private javax.swing.JTextField jT_apellido;
    private javax.swing.JTextField jT_clubJugador;
    private javax.swing.JTextField jT_direc;
    private javax.swing.JTextField jT_dni;
    private javax.swing.JTextField jT_elo;
    private javax.swing.JTextField jT_email;
    private javax.swing.JTextField jT_fNaci;
    private javax.swing.JTextField jT_nom;
    private javax.swing.JTextField jT_tele;
    private javax.swing.JTextField jT_user;
    // End of variables declaration//GEN-END:variables
    
    private String [] tipoJugadors = {"Infantil", "Junior", "Senior"};
    private Vector<String> clubesTrabajo = new Vector<>();
}
