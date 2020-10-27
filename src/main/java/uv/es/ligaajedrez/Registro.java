/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uv.es.ligaajedrez;
import java.util.Vector;
import lombok.extern.slf4j.Slf4j;

/**
 * @author vmarzal
 */
@Slf4j
public class Registro extends javax.swing.JFrame {

    /**
     * Creates new form Registro
     */
    public Registro() {
        initComponents();
        
        
        
        jCB_tipoJugador.removeAllItems();
        jCB_tipoUser.removeAllItems();
        
        for (String tipoUser: tipoUsers){
            jCB_tipoUser.addItem(tipoUser);
        }
        for (String tipoJugador: tipoJugadors){
            jCB_tipoJugador.addItem(tipoJugador);
        }
        
        jList_clubesTrabajo.setListData(clubesTrabajo);
        
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
        jL_nombre = new javax.swing.JLabel();
        jL_tipoUser = new javax.swing.JLabel();
        jCB_tipoUser = new javax.swing.JComboBox<>();
        jL_clubJugador = new javax.swing.JLabel();
        jT_clubJugador = new javax.swing.JTextField();
        jL_tipoJugador = new javax.swing.JLabel();
        jT_elo = new javax.swing.JTextField();
        jL_elo = new javax.swing.JLabel();
        jT_clubEntrenador = new javax.swing.JTextField();
        jL_clubEntrenador = new javax.swing.JLabel();
        jB_anadir = new javax.swing.JButton();
        jSP_clubesTrabajo = new javax.swing.JScrollPane();
        jList_clubesTrabajo = new javax.swing.JList<>();
        jL_clubesTrabajo = new javax.swing.JLabel();
        jB_borrar = new javax.swing.JButton();
        jL_clubGerente = new javax.swing.JLabel();
        jT_clubGerente = new javax.swing.JTextField();
        jT_nomina = new javax.swing.JTextField();
        jL_nomina = new javax.swing.JLabel();
        jT_irpf = new javax.swing.JTextField();
        jL_irpf = new javax.swing.JLabel();
        jL_porcentaje = new javax.swing.JLabel();
        jCB_tipoJugador = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 102, 0));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Registro de nuevo usuario");
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
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jL_nom.setText("Nombre:");

        jT_nom.setText("Lorena ");
        jT_nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_nomActionPerformed(evt);
            }
        });

        jL_apellido.setText("Apellidos:");

        jT_apellido.setText("Iborra López");

        jL_direc.setText("Dirección:");

        jT_direc.setText("Avda Primado Reig, 29, 6ºC");

        jL_fNaci.setText("Fecha de nacimiento:");

        jT_fNaci.setText("10/05/2009");

        jL_user.setText("Username:");

        jT_user.setText("liborra");

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

        jL_nombre.setText("Datos personales");

        jL_tipoUser.setText("Tipo usuario");

        jCB_tipoUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCB_tipoUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_tipoUserActionPerformed(evt);
            }
        });

        jL_clubJugador.setText("Club");
        jL_clubJugador.setOpaque(true);

        jT_clubJugador.setText("liborra");
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

        jT_clubEntrenador.setText("liborra");

        jL_clubEntrenador.setText("Club");
        jL_clubEntrenador.setOpaque(true);

        jB_anadir.setText("Añadir");
        jB_anadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_anadirActionPerformed(evt);
            }
        });

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

        jL_clubGerente.setText("Club");
        jL_clubGerente.setOpaque(true);

        jT_clubGerente.setText("liborra");

        jT_nomina.setText("2000");
        jT_nomina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_nominaActionPerformed(evt);
            }
        });

        jL_nomina.setText("Nomina");
        jL_nomina.setOpaque(true);

        jT_irpf.setText("15");
        jT_irpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_irpfActionPerformed(evt);
            }
        });

        jL_irpf.setText("IRPF");
        jL_irpf.setOpaque(true);

        jL_porcentaje.setText("%");
        jL_porcentaje.setOpaque(true);

        jCB_tipoJugador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jL_nombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jS_datosPersonales, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jL_clubJugador)
                                    .addComponent(jL_clubEntrenador))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jT_clubEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jB_anadir))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jT_clubJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jL_tipoJugador)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCB_tipoJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(136, 136, 136)
                                        .addComponent(jL_elo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jT_elo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 274, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jL_clubesTrabajo, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jB_borrar, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSP_clubesTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jL_clubGerente)
                                .addGap(28, 28, 28)
                                .addComponent(jT_clubGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(jL_nomina)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jT_nomina, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jL_irpf)
                                .addGap(18, 18, 18)
                                .addComponent(jT_irpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jL_porcentaje)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(46, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jL_pw)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jP_pw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jL_pw2)
                                .addGap(18, 18, 18)
                                .addComponent(jP_pw2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jL_nom)
                                .addGap(18, 18, 18)
                                .addComponent(jT_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jL_fNaci)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jT_fNaci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jL_direc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jT_direc, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jL_apellido)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jT_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jL_user)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jT_user, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jS_userPw, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jL_tipoUser)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCB_tipoUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnVolverLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jS_datosPersonales, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jL_nombre)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_nom)
                    .addComponent(jT_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_fNaci)
                    .addComponent(jT_fNaci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_apellido)
                    .addComponent(jT_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_direc)
                    .addComponent(jT_direc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_tipoUser)
                    .addComponent(jCB_tipoUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jT_clubJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_clubJugador)
                    .addComponent(jL_tipoJugador)
                    .addComponent(jL_elo)
                    .addComponent(jT_elo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCB_tipoJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jL_clubEntrenador)
                            .addComponent(jT_clubEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jB_anadir)
                            .addComponent(jL_clubesTrabajo))
                        .addGap(7, 7, 7)
                        .addComponent(jB_borrar))
                    .addComponent(jSP_clubesTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jT_clubGerente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_clubGerente)
                    .addComponent(jL_nomina)
                    .addComponent(jT_nomina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_irpf)
                    .addComponent(jT_irpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_porcentaje))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jS_userPw, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_user)
                    .addComponent(jT_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jL_pw)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jP_pw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jL_pw2)
                        .addComponent(jP_pw2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolverLogin)
                    .addComponent(btnRegistrar)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jT_nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_nomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_nomActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
//        log.info("Persistimos el registro del nuevo usuario...");
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

    private void jT_irpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_irpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_irpfActionPerformed

    private void jT_nominaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_nominaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_nominaActionPerformed

    private void jCB_tipoUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB_tipoUserActionPerformed
        // TODO add your handling code here:
        
        int i = jCB_tipoUser.getSelectedIndex();
        String s = jCB_tipoUser.getItemAt(i);
        
        if (s == "Jugador")
        {
            jL_clubJugador.setVisible(true);
            jT_clubJugador.setVisible(true);
            jL_elo.setVisible(true);
            jT_elo.setVisible(true);
            jL_tipoJugador.setVisible(true);
            jCB_tipoJugador.setVisible(true);
            
            jL_clubEntrenador.setVisible(false);
            jT_clubEntrenador.setVisible(false);
            jB_anadir.setVisible(false);
            jL_clubesTrabajo.setVisible(false);
            jSP_clubesTrabajo.setVisible(false);
            jB_borrar.setVisible(false);
            
            
            jL_clubGerente.setVisible(false);
            jT_clubGerente.setVisible(false);
            jL_nomina.setVisible(false);
            jT_nomina.setVisible(false);
            jL_irpf.setVisible(false);
            jT_irpf.setVisible(false);
            jL_porcentaje.setVisible(false);
        }
        else if(s == "Entrenador"){
            jL_clubJugador.setVisible(false);
            jT_clubJugador.setVisible(false);
            jL_elo.setVisible(false);
            jT_elo.setVisible(false);
            jL_tipoJugador.setVisible(false);
            jCB_tipoJugador.setVisible(false);
            
            
            jL_clubEntrenador.setVisible(true);
            jT_clubEntrenador.setVisible(true);
            jB_anadir.setVisible(true);
            jL_clubesTrabajo.setVisible(true);
            jSP_clubesTrabajo.setVisible(true);
            jB_borrar.setVisible(true);
            
            
            jL_clubGerente.setVisible(false);
            jT_clubGerente.setVisible(false);
            jL_nomina.setVisible(false);
            jT_nomina.setVisible(false);
            jL_irpf.setVisible(false);
            jT_irpf.setVisible(false);
            jL_porcentaje.setVisible(false);

            
        }
        else
        {
            jL_clubJugador.setVisible(false);
            jT_clubJugador.setVisible(false);
            jL_elo.setVisible(false);
            jT_elo.setVisible(false);
            jL_tipoJugador.setVisible(false);
            jCB_tipoJugador.setVisible(false);
            
            jL_clubEntrenador.setVisible(false);
            jT_clubEntrenador.setVisible(false);
            jB_anadir.setVisible(false);
            jL_clubesTrabajo.setVisible(false);
            jSP_clubesTrabajo.setVisible(false);
            jB_borrar.setVisible(false);
            
            jL_clubGerente.setVisible(true);
            jT_clubGerente.setVisible(true);
            jL_nomina.setVisible(true);
            jT_nomina.setVisible(true);
            jL_irpf.setVisible(true);
            jT_irpf.setVisible(true);
            jL_porcentaje.setVisible(true);
        }
        
        
        
    }//GEN-LAST:event_jCB_tipoUserActionPerformed

    private void jT_clubJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_clubJugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_clubJugadorActionPerformed

    private void jB_anadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_anadirActionPerformed
        // TODO add your handling code here:
        String s = jT_clubEntrenador.getText();
        clubesTrabajo.add(s);
        jList_clubesTrabajo.setListData(clubesTrabajo);
          
    }//GEN-LAST:event_jB_anadirActionPerformed

    private void jB_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_borrarActionPerformed
        // TODO add your handling code here:
        int i= jList_clubesTrabajo.getSelectedIndex();
        clubesTrabajo.remove(i);
        jList_clubesTrabajo.setListData(clubesTrabajo);
        
    }//GEN-LAST:event_jB_borrarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVolverLogin;
    private javax.swing.JButton jB_anadir;
    private javax.swing.JButton jB_borrar;
    private javax.swing.JComboBox<String> jCB_tipoJugador;
    private javax.swing.JComboBox<String> jCB_tipoUser;
    private javax.swing.JLabel jL_apellido;
    private javax.swing.JLabel jL_clubEntrenador;
    private javax.swing.JLabel jL_clubGerente;
    private javax.swing.JLabel jL_clubJugador;
    private javax.swing.JLabel jL_clubesTrabajo;
    private javax.swing.JLabel jL_direc;
    private javax.swing.JLabel jL_elo;
    private javax.swing.JLabel jL_fNaci;
    private javax.swing.JLabel jL_irpf;
    private javax.swing.JLabel jL_nom;
    private javax.swing.JLabel jL_nombre;
    private javax.swing.JLabel jL_nomina;
    private javax.swing.JLabel jL_porcentaje;
    private javax.swing.JLabel jL_pw;
    private javax.swing.JLabel jL_pw2;
    private javax.swing.JLabel jL_tipoJugador;
    private javax.swing.JLabel jL_tipoUser;
    private javax.swing.JLabel jL_user;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList_clubesTrabajo;
    private javax.swing.JPasswordField jP_pw;
    private javax.swing.JPasswordField jP_pw2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jSP_clubesTrabajo;
    private javax.swing.JSeparator jS_datosPersonales;
    private javax.swing.JSeparator jS_userPw;
    private javax.swing.JTextField jT_apellido;
    private javax.swing.JTextField jT_clubEntrenador;
    private javax.swing.JTextField jT_clubGerente;
    private javax.swing.JTextField jT_clubJugador;
    private javax.swing.JTextField jT_direc;
    private javax.swing.JTextField jT_elo;
    private javax.swing.JTextField jT_fNaci;
    private javax.swing.JTextField jT_irpf;
    private javax.swing.JTextField jT_nom;
    private javax.swing.JTextField jT_nomina;
    private javax.swing.JTextField jT_user;
    // End of variables declaration//GEN-END:variables
    private String [] tipoUsers = {"Jugador", "Entrenador", "Gerente"};
    private String [] tipoJugadors = {"Infantil", "Junior", "Senior"};
    private Vector<String> clubesTrabajo = new Vector<>();
}
