/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uv.es.ligaajedrez;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import uv.es.ligaajedrez.modelo.Club;
import uv.es.ligaajedrez.modelo.DatosLigaAjedrez;
import uv.es.ligaajedrez.modelo.usuarios.Gerente;

/** 
 * @author Adrian Cozma
 */
public class GerenteJFrame extends javax.swing.JFrame {

    private DatosLigaAjedrez commonData;    
    private Gerente gerenteAActualizar;
    
    private DefaultListModel jList1Model = new DefaultListModel();  // JLIST    
    private DefaultListModel jList2Model = new DefaultListModel();  // JLIST
    private DefaultListModel jList3Model = new DefaultListModel();  // JLIST
        
    
    /**
     * Creates new form Gerente
     */
    public GerenteJFrame() {
        initComponents();
    }
    
    public GerenteJFrame(Gerente gerente) {
        initComponents();
                
        jList1.setModel(jList1Model);         
        jList2.setModel(jList2Model); 
        jList3.setModel(jList3Model); 
        
        commonData = DatosLigaAjedrez.getSingletonInstance();                                
        
        nombreGerenteTextField.setText(gerente.getNombre());
        apellidosGerenteTextField.setText(gerente.getApellidos());
        nominaTextField.setText(String.valueOf(gerente.getNomina()));
        IRPFTextField.setText(String.valueOf(gerente.getIRPF()));
        
        if (gerente.getFechaNacimiento() != null) {
            DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");                                                
            fechaNacGerenteTextField.setText(gerente.getFechaNacimiento().format(df).toString());
        }   
                                    
        Club[] clubArray = new Club[commonData.getClubesParticipantes().size()];
        clubArray = commonData.getClubesParticipantes().toArray(clubArray);        
        jComboBoxClubes.setModel(new DefaultComboBoxModel(clubArray));  
        jComboBoxClubes.setSelectedItem(gerente.getClubActual());
                
        gerenteAActualizar = gerente;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jf_historicoClubsG = new javax.swing.JFrame();
        jp_reserva2 = new javax.swing.JPanel();
        jl_rSede3 = new javax.swing.JLabel();
        jb_cancel5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jf_historicoG = new javax.swing.JFrame();
        jp_reserva3 = new javax.swing.JPanel();
        jl_rSede4 = new javax.swing.JLabel();
        jb_cancel6 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        apellidosGerenteTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnGuardarGerente = new javax.swing.JButton();
        nominaTextField = new javax.swing.JTextField();
        btnVolverLogin = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        fechaNacGerenteTextField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        IRPFTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        nombreGerenteTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBoxClubes = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();

        jf_historicoClubsG.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jp_reserva2.setBackground(new java.awt.Color(255, 51, 51));
        jp_reserva2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jl_rSede3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jl_rSede3.setForeground(new java.awt.Color(255, 255, 255));
        jl_rSede3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_rSede3.setText("Histórico de clubes del gerente");
        jl_rSede3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jp_reserva2Layout = new javax.swing.GroupLayout(jp_reserva2);
        jp_reserva2.setLayout(jp_reserva2Layout);
        jp_reserva2Layout.setHorizontalGroup(
            jp_reserva2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_reserva2Layout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addComponent(jl_rSede3, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );
        jp_reserva2Layout.setVerticalGroup(
            jp_reserva2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_reserva2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jl_rSede3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jb_cancel5.setBackground(new java.awt.Color(0, 153, 255));
        jb_cancel5.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jb_cancel5.setForeground(new java.awt.Color(255, 255, 255));
        jb_cancel5.setText("Volver");
        jb_cancel5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cancel5ActionPerformed(evt);
            }
        });

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout jf_historicoClubsGLayout = new javax.swing.GroupLayout(jf_historicoClubsG.getContentPane());
        jf_historicoClubsG.getContentPane().setLayout(jf_historicoClubsGLayout);
        jf_historicoClubsGLayout.setHorizontalGroup(
            jf_historicoClubsGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_reserva2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jf_historicoClubsGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jb_cancel5, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jf_historicoClubsGLayout.setVerticalGroup(
            jf_historicoClubsGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jf_historicoClubsGLayout.createSequentialGroup()
                .addComponent(jp_reserva2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jb_cancel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 31, Short.MAX_VALUE))
        );

        jf_historicoG.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jp_reserva3.setBackground(new java.awt.Color(255, 51, 51));
        jp_reserva3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jl_rSede4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jl_rSede4.setForeground(new java.awt.Color(255, 255, 255));
        jl_rSede4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_rSede4.setText("Histórico de nómina e IRPF del gerente");
        jl_rSede4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jp_reserva3Layout = new javax.swing.GroupLayout(jp_reserva3);
        jp_reserva3.setLayout(jp_reserva3Layout);
        jp_reserva3Layout.setHorizontalGroup(
            jp_reserva3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_reserva3Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jl_rSede4, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jp_reserva3Layout.setVerticalGroup(
            jp_reserva3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_reserva3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jl_rSede4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jb_cancel6.setBackground(new java.awt.Color(0, 153, 255));
        jb_cancel6.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jb_cancel6.setForeground(new java.awt.Color(255, 255, 255));
        jb_cancel6.setText("Volver");
        jb_cancel6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cancel6ActionPerformed(evt);
            }
        });

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        jList3.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList3);

        jLabel9.setText("Nómina:");

        jLabel10.setText("IRPF:");

        javax.swing.GroupLayout jf_historicoGLayout = new javax.swing.GroupLayout(jf_historicoG.getContentPane());
        jf_historicoG.getContentPane().setLayout(jf_historicoGLayout);
        jf_historicoGLayout.setHorizontalGroup(
            jf_historicoGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jf_historicoGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jp_reserva3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jf_historicoGLayout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addGroup(jf_historicoGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_cancel6, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jf_historicoGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jf_historicoGLayout.setVerticalGroup(
            jf_historicoGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jf_historicoGLayout.createSequentialGroup()
                .addComponent(jp_reserva3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jf_historicoGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(6, 6, 6)
                .addGroup(jf_historicoGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jb_cancel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setText("Nómina:");

        btnGuardarGerente.setBackground(new java.awt.Color(0, 153, 255));
        btnGuardarGerente.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnGuardarGerente.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarGerente.setText("Guardar");
        btnGuardarGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarGerenteActionPerformed(evt);
            }
        });

        nominaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nominaTextFieldActionPerformed(evt);
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

        jLabel5.setText("Fecha de nacimiento:");

        jPanel2.setBackground(new java.awt.Color(0, 204, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Gerente");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jLabel6.setText("IRPF:");

        IRPFTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IRPFTextFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre:");

        nombreGerenteTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreGerenteTextFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Apellidos:");

        jLabel7.setText("Club:");

        jLabel8.setText("€");

        jButton1.setText("Histórico");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Histórico");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBoxClubes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel11.setText("%");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(apellidosGerenteTextField))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(16, 16, 16))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(18, 18, 18)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nominaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(IRPFTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton1))
                                            .addComponent(jLabel11)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(nombreGerenteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fechaNacGerenteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxClubes, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnGuardarGerente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnVolverLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nombreGerenteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(fechaNacGerenteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(apellidosGerenteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nominaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(IRPFTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jButton2)
                    .addComponent(jComboBoxClubes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolverLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardarGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarGerenteActionPerformed
        
        String nombre, apellidos;
        float nomina, irpf;
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNac = LocalDate.parse(fechaNacGerenteTextField.getText(), df);        
        
        nombre = nombreGerenteTextField.getText();
        apellidos = apellidosGerenteTextField.getText();
        
        nomina = Float.parseFloat(nominaTextField.getText());
        irpf = Float.parseFloat(IRPFTextField.getText());
        
        Club clubCambiado = (Club) jComboBoxClubes.getSelectedItem();        
                
        gerenteAActualizar.setNombre(nombre);
        gerenteAActualizar.setApellidos(apellidos);
        gerenteAActualizar.setFechaNacimiento(fechaNac);
        gerenteAActualizar.setNomina(nomina);
        gerenteAActualizar.setIRPF(irpf);
        gerenteAActualizar.setClubActual(clubCambiado);
        
        commonData.getGerentes().put(gerenteAActualizar.getLogin(), gerenteAActualizar);
        commonData.getUsuarios().put(gerenteAActualizar.getLogin(), gerenteAActualizar);
        
        JOptionPane.showMessageDialog(this, "¡Gerente actualizado con exito!", "Success", 
                JOptionPane.OK_OPTION);
                        
        // TODO: faltaria actualizar los historicos de clubes, irpfs y nominas
        jList1Model.addElement(clubCambiado.getNombre());          
        jList2Model.addElement(nomina + "€");               
        jList3Model.addElement(irpf + "%");                 
        
        
    }//GEN-LAST:event_btnGuardarGerenteActionPerformed

    private void btnVolverLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverLoginActionPerformed
        
        dispose();
        Login login = new Login();
        login.setVisible(true);

    }//GEN-LAST:event_btnVolverLoginActionPerformed

    private void nombreGerenteTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreGerenteTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreGerenteTextFieldActionPerformed

    private void IRPFTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IRPFTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IRPFTextFieldActionPerformed

    private void nominaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nominaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nominaTextFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jf_historicoG.setSize(700, 600);
        jf_historicoG.setLocationRelativeTo(null);       
        jf_historicoG.setVisible(true);
        
        jScrollPane2.repaint(); 
        jScrollPane3.repaint(); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jb_cancel5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cancel5ActionPerformed
        jf_historicoClubsG.setVisible(false);
        this.setVisible(true);
        
    }//GEN-LAST:event_jb_cancel5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jf_historicoClubsG.setSize(700, 450);
        jf_historicoClubsG.setLocationRelativeTo(null);       
        jf_historicoClubsG.setVisible(true);
        
        jScrollPane1.repaint(); // JLIST
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jb_cancel6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cancel6ActionPerformed
        jf_historicoG.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_jb_cancel6ActionPerformed
    
    
    private void exitMenu() {
        // Navegamos al menu de la aplicación
        dispose();
        Login login = new Login();
        login.setVisible(true);         
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IRPFTextField;
    private javax.swing.JTextField apellidosGerenteTextField;
    private javax.swing.JButton btnGuardarGerente;
    private javax.swing.JButton btnVolverLogin;
    private javax.swing.JTextField fechaNacGerenteTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBoxClubes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jb_cancel5;
    private javax.swing.JButton jb_cancel6;
    private javax.swing.JFrame jf_historicoClubsG;
    private javax.swing.JFrame jf_historicoG;
    private javax.swing.JLabel jl_rSede3;
    private javax.swing.JLabel jl_rSede4;
    private javax.swing.JPanel jp_reserva2;
    private javax.swing.JPanel jp_reserva3;
    private javax.swing.JTextField nombreGerenteTextField;
    private javax.swing.JTextField nominaTextField;
    // End of variables declaration//GEN-END:variables
}
