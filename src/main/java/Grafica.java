import Matrices.MatrizForma2;
import Matrices.NodoDoble;
import Matrices.Tripleta;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Grafica extends javax.swing.JFrame {
    private ArrayList<JTextField> var = new ArrayList<JTextField>();
    private ArrayList<JTextField> mat = new ArrayList<JTextField>();
    private ArrayList<JTextField> matSol = new ArrayList<JTextField>();
    private MatrizForma2 aux = new MatrizForma2(3,4);
    private MatrizForma2 aux1 = new MatrizForma2(3,4);
    private MatrizForma2 aux2 = new MatrizForma2(3,4);
    private MatrizForma2 aux3 = new MatrizForma2(3,4);
    private MatrizForma2 sol = new MatrizForma2(3,4);
    
    public Grafica() {
        initComponents();
        setLocationRelativeTo(null);
        llenarArrayVar();
        llenarArrayMat();
        llenarArrayMatSol();
        getContentPane().setBackground(new Color(141,193,221));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jFrame1 = new javax.swing.JFrame();
        jButton1 = new javax.swing.JButton();
        lblTitulo1 = new javax.swing.JLabel();
        txtX1 = new javax.swing.JTextField();
        txtX3 = new javax.swing.JTextField();
        txtY1 = new javax.swing.JTextField();
        txtY3 = new javax.swing.JTextField();
        txtY2 = new javax.swing.JTextField();
        txtZ1 = new javax.swing.JTextField();
        txtZ3 = new javax.swing.JTextField();
        txtZ2 = new javax.swing.JTextField();
        txtX2 = new javax.swing.JTextField();
        txtD2 = new javax.swing.JTextField();
        txtD1 = new javax.swing.JTextField();
        txtD3 = new javax.swing.JTextField();
        lblX1 = new java.awt.Label();
        lblX3 = new java.awt.Label();
        lblX2 = new java.awt.Label();
        lblY1 = new java.awt.Label();
        lblY3 = new java.awt.Label();
        lblY2 = new java.awt.Label();
        lblZ2 = new java.awt.Label();
        lblZ1 = new java.awt.Label();
        lblZ3 = new java.awt.Label();
        lblTitulo2 = new javax.swing.JLabel();
        btnCrear = new javax.swing.JButton();
        pnlMatrizInicial = new javax.swing.JPanel();
        txtXa = new javax.swing.JTextField();
        txtXb = new javax.swing.JTextField();
        txtXc = new javax.swing.JTextField();
        txtYa = new javax.swing.JTextField();
        txtYb = new javax.swing.JTextField();
        txtYc = new javax.swing.JTextField();
        txtZa = new javax.swing.JTextField();
        txtZb = new javax.swing.JTextField();
        txtZc = new javax.swing.JTextField();
        txtDa = new javax.swing.JTextField();
        txtDb = new javax.swing.JTextField();
        txtDc = new javax.swing.JTextField();
        pnlMatrizSolucion = new javax.swing.JPanel();
        txtXX1 = new javax.swing.JTextField();
        txtXX2 = new javax.swing.JTextField();
        txtXX3 = new javax.swing.JTextField();
        txtYY1 = new javax.swing.JTextField();
        txtYY2 = new javax.swing.JTextField();
        txtYY3 = new javax.swing.JTextField();
        txtZZ1 = new javax.swing.JTextField();
        txtZZ2 = new javax.swing.JTextField();
        txtZZ3 = new javax.swing.JTextField();
        txtDD1 = new javax.swing.JTextField();
        txtDD2 = new javax.swing.JTextField();
        txtDD3 = new javax.swing.JTextField();
        btnGauss = new javax.swing.JButton();
        btnCramer = new javax.swing.JButton();
        lblTitulo3 = new javax.swing.JLabel();
        lblTitulo4 = new javax.swing.JLabel();
        lblTitulo5 = new javax.swing.JLabel();
        lblTitulo6 = new javax.swing.JLabel();
        lblXfinal = new java.awt.Label();
        lblYfinal = new java.awt.Label();
        lblZfinal = new java.awt.Label();
        lblMensaje = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSolucion = new javax.swing.JTextArea();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo1.setFont(new java.awt.Font("Monotype Corsiva", 1, 48)); // NOI18N
        lblTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo1.setText("Resolver Sistemas de Ecuaciones Lineales");

        lblX1.setBackground(new java.awt.Color(141, 193, 221));
        lblX1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblX1.setText("x +");

        lblX3.setBackground(new java.awt.Color(141, 193, 221));
        lblX3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblX3.setText("x +");

        lblX2.setBackground(new java.awt.Color(141, 193, 221));
        lblX2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblX2.setText("x +");

        lblY1.setBackground(new java.awt.Color(141, 193, 221));
        lblY1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblY1.setText("y +");

        lblY3.setBackground(new java.awt.Color(141, 193, 221));
        lblY3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblY3.setText("y +");

        lblY2.setBackground(new java.awt.Color(141, 193, 221));
        lblY2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblY2.setText("y +");

        lblZ2.setBackground(new java.awt.Color(141, 193, 221));
        lblZ2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblZ2.setText("z =");

        lblZ1.setBackground(new java.awt.Color(141, 193, 221));
        lblZ1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblZ1.setText("z =");

        lblZ3.setBackground(new java.awt.Color(141, 193, 221));
        lblZ3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblZ3.setText("z =");

        lblTitulo2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        lblTitulo2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitulo2.setText("Por favor, ingrese las ecuaciones:");

        btnCrear.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        btnCrear.setText("Crear Matriz");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        txtXa.setEditable(false);

        txtXb.setEditable(false);

        txtXc.setEditable(false);

        txtYa.setEditable(false);

        txtYb.setEditable(false);

        txtYc.setEditable(false);

        txtZa.setEditable(false);

        txtZb.setEditable(false);

        txtZc.setEditable(false);

        txtDa.setEditable(false);

        txtDb.setEditable(false);

        txtDc.setEditable(false);

        javax.swing.GroupLayout pnlMatrizInicialLayout = new javax.swing.GroupLayout(pnlMatrizInicial);
        pnlMatrizInicial.setLayout(pnlMatrizInicialLayout);
        pnlMatrizInicialLayout.setHorizontalGroup(
            pnlMatrizInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMatrizInicialLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMatrizInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtXc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtXa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtXb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMatrizInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtYc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtYa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtYb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMatrizInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtZc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtZa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtZb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlMatrizInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlMatrizInicialLayout.setVerticalGroup(
            pnlMatrizInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMatrizInicialLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMatrizInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMatrizInicialLayout.createSequentialGroup()
                        .addComponent(txtXa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtXb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtXc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMatrizInicialLayout.createSequentialGroup()
                        .addComponent(txtYa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtYb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtYc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMatrizInicialLayout.createSequentialGroup()
                        .addComponent(txtZa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtZb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtZc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMatrizInicialLayout.createSequentialGroup()
                        .addComponent(txtDa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtXX1.setEditable(false);

        txtXX2.setEditable(false);

        txtXX3.setEditable(false);

        txtYY1.setEditable(false);

        txtYY2.setEditable(false);

        txtYY3.setEditable(false);

        txtZZ1.setEditable(false);

        txtZZ2.setEditable(false);

        txtZZ3.setEditable(false);

        txtDD1.setEditable(false);

        txtDD2.setEditable(false);

        txtDD3.setEditable(false);

        javax.swing.GroupLayout pnlMatrizSolucionLayout = new javax.swing.GroupLayout(pnlMatrizSolucion);
        pnlMatrizSolucion.setLayout(pnlMatrizSolucionLayout);
        pnlMatrizSolucionLayout.setHorizontalGroup(
            pnlMatrizSolucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMatrizSolucionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMatrizSolucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtXX3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtXX1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtXX2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMatrizSolucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtYY3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtYY1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtYY2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMatrizSolucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtZZ3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtZZ1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtZZ2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlMatrizSolucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDD3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDD1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDD2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlMatrizSolucionLayout.setVerticalGroup(
            pnlMatrizSolucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMatrizSolucionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMatrizSolucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMatrizSolucionLayout.createSequentialGroup()
                        .addComponent(txtXX1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtXX2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtXX3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMatrizSolucionLayout.createSequentialGroup()
                        .addComponent(txtYY1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtYY2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtYY3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMatrizSolucionLayout.createSequentialGroup()
                        .addComponent(txtZZ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtZZ2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtZZ3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMatrizSolucionLayout.createSequentialGroup()
                        .addComponent(txtDD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDD2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDD3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnGauss.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        btnGauss.setText("Método Gauss-Jordan");
        btnGauss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGaussActionPerformed(evt);
            }
        });

        btnCramer.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        btnCramer.setText("Método Cramer");
        btnCramer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCramerActionPerformed(evt);
            }
        });

        lblTitulo3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        lblTitulo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo3.setText("Representación Matricial");

        lblTitulo4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        lblTitulo4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo4.setText("Resolver usando");

        lblTitulo5.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        lblTitulo5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo5.setText("Matriz Solución");

        lblTitulo6.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        lblTitulo6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo6.setText("Solución");

        lblXfinal.setBackground(new java.awt.Color(141, 193, 221));
        lblXfinal.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblXfinal.setText("X =");

        lblYfinal.setBackground(new java.awt.Color(141, 193, 221));
        lblYfinal.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblYfinal.setText("Y =");

        lblZfinal.setBackground(new java.awt.Color(141, 193, 221));
        lblZfinal.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblZfinal.setText("Z =");

        lblMensaje.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        lblMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMensaje.setText("Mensaje Alternativo");

        btnSalir.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        txtSolucion.setEditable(false);
        txtSolucion.setColumns(20);
        txtSolucion.setRows(5);
        jScrollPane1.setViewportView(txtSolucion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1086, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCramer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGauss, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTitulo4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTitulo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtX3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtX2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtX1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblX3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblX2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblX1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtY2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtY3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtY1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(1, 1, 1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblY3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblY2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblY1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(1, 1, 1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtZ2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtZ3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtZ1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(1, 1, 1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblZ2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblZ3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblZ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(2, 2, 2)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtD1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtD3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtD2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(btnCrear))
                                .addGap(8, 8, 8))
                            .addComponent(lblTitulo3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(pnlMatrizInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblZfinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblYfinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblXfinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(155, 155, 155))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlMatrizSolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addComponent(lblMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(lblTitulo5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTitulo6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lblTitulo2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(13, 13, 13)
                                        .addComponent(txtD2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(13, 13, 13)
                                        .addComponent(txtD3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblY1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(13, 13, 13)
                                            .addComponent(lblY2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblY3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(lblX1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(lblX2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(txtX1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(txtX2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addComponent(txtY1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(txtY2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtY3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtX3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblX3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(lblZ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(lblZ2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(txtZ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(txtZ2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtZ3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblZ3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCrear)
                                .addGap(18, 18, 18)
                                .addComponent(lblTitulo3)
                                .addGap(8, 8, 8)
                                .addComponent(pnlMatrizInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblTitulo4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnGauss)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCramer))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTitulo5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlMatrizSolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTitulo6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblXfinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblYfinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblZfinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        revisar();
        llenarMatrizInicial();
        // IMPORTANTE ==================================
        // Esta matriz representada en arrays solo es creada para facilitar la creacion de la
        // matriz en Forma 2, por lo tanto, no se usa para hacer operaciones ni para darle
        // solucion a los problemas, es solo la base para crear la MATRIZ FORMA 2
        double [][] a = new double[3][4];
        a[0][0] = Double.parseDouble(txtXa.getText());
        a[0][1] = Double.parseDouble(txtYa.getText());
        a[0][2] = Double.parseDouble(txtZa.getText());
        a[1][0] = Double.parseDouble(txtXb.getText());
        a[1][1] = Double.parseDouble(txtYb.getText());
        a[1][2] = Double.parseDouble(txtZb.getText());
        a[2][0] = Double.parseDouble(txtXc.getText());
        a[2][1] = Double.parseDouble(txtYc.getText());
        a[2][2] = Double.parseDouble(txtZc.getText());
        a[0][3] = Double.parseDouble(txtDa.getText());
        a[1][3] = Double.parseDouble(txtDb.getText());
        a[2][3] = Double.parseDouble(txtDc.getText());
        aux = crearMatriz(a); 
        aux1 = crearMatriz(a);
        aux2 = crearMatriz(a); 
        aux3 = crearMatriz(a); 
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        int i = 0;
        txtSolucion.setText(null);
        lblXfinal.setText("X = ");
        lblYfinal.setText("Y = ");
        lblZfinal.setText("Z = ");
        lblMensaje.setText("Mensaje Alternativo");
        while(i<var.size()){
            var.get(i).setText(null);
            mat.get(i).setText(null);
            matSol.get(i).setText(null);
            i++;
        }
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGaussActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGaussActionPerformed
        txtSolucion.setText(null);
        sol = resolverGauss(aux);
        llenarMatrizSolucionGauss(sol);
        llenarSolucionGauss(sol);
    }//GEN-LAST:event_btnGaussActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCramerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCramerActionPerformed
        int i = 0;
        txtSolucion.setText(null);
        while(i < var.size()){
            matSol.get(i).setText(null);
            i++;
        }
        resolverCramer();
    }//GEN-LAST:event_btnCramerActionPerformed

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
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grafica().setVisible(true);
            }
        });
    }
    
    public void llenarArrayVar(){ // Método encargado de llenar un Array con todos los JTextField para facilitar su manejo mas adelante
        var.clear();
        var.add(txtX1);
        var.add(txtX2);
        var.add(txtX3);
        var.add(txtY1);
        var.add(txtY2);
        var.add(txtY3);
        var.add(txtZ1);
        var.add(txtZ2);
        var.add(txtZ3);
        var.add(txtD1);
        var.add(txtD2);
        var.add(txtD3);
    }
    
    public void llenarArrayMat(){
        mat.clear();
        mat.add(txtXa);
        mat.add(txtXb);
        mat.add(txtXc);
        mat.add(txtYa);
        mat.add(txtYb);
        mat.add(txtYc);
        mat.add(txtZa);
        mat.add(txtZb);
        mat.add(txtZc);
        mat.add(txtDa);
        mat.add(txtDb);
        mat.add(txtDc);
    }
    
    public void llenarArrayMatSol(){
        matSol.clear();
        matSol.add(txtXX1);
        matSol.add(txtYY1);
        matSol.add(txtZZ1);
        matSol.add(txtDD1);
        matSol.add(txtXX2);
        matSol.add(txtYY2);
        matSol.add(txtZZ2);
        matSol.add(txtDD2);
        matSol.add(txtXX3);
        matSol.add(txtYY3);
        matSol.add(txtZZ3);
        matSol.add(txtDD3);
    }
    
    public void llenarMatrizInicial(){
        for(int i = 0; i < mat.size(); i++){
            mat.get(i).setText(Double.toString(Double.parseDouble(var.get(i).getText())));
        }
    }
    
    public void revisar(){ // Método encargado de revisar que los datos ingresados sean numericos, y las casillas vacias se interpretan como ceros
        for(int i = 0; i < var.size(); i++){
            if(var.get(i).getText().isEmpty()){
                var.get(i).setText("0");
            }
            try{
                Double.parseDouble(var.get(i).getText());
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Los datos ingresados no son numericos, intentelo de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
                while(i<var.size()){
                    var.get(i).setText(null);
                    i++;
                }
                break;
            }
        }
    }
    
    public MatrizForma2 crearMatriz(double[][] a){
        MatrizForma2 A = new MatrizForma2(3,4);
        for(int i = 1; i < 4; i++){
            for(int j = 1; j < 5; j++){
                Tripleta t = new Tripleta(i, j, a[i-1][j-1]);
                NodoDoble nodo = new NodoDoble(t);
                A.conectar(nodo);
            }
        }
        return A;
    }

    // PARA GAUSS JORDAN TENEMOS LOS SIGUIENTES METODOS
    
    public MatrizForma2 resolverGauss(MatrizForma2 A){
        int i, j, k;
        for(i = 1; i < 4; i++){
            double c, d, e = 0;
            Tripleta a, b;
            a = A.buscar(i, i);
            d = a.getDato();
            if(d != 0){
                txtSolucion.append("1/" + d + " * fila" + i + "\n");
                for(j = 1; j < 5; j++){
                    a = A.buscar(i,j);
                    e = a.getDato()/d;
                    if(e == -0){
                        A.ingresar(i, j, 0);
                    }else{
                        A.ingresar(i, j, e);
                    }
                }
                for(j = 1; j < 4; j++) {
                    for (k = 1; k < 5; k++) {
                        a = A.buscar(j, k);
                        if(k == 4){
                            txtSolucion.append("|\t" + a.getDato() + "\n");
                        }else{
                            txtSolucion.append(a.getDato() + "\t");
                        }
                    }
                }
                txtSolucion.append("\n\n");
                for (int x = 1; x < 4; x++) {
                    if (i != x) {
                        a = A.buscar(x,i);
                        c = a.getDato();
                        if(c != 0){
                           txtSolucion.append("-" + c + " * fila" + i + "+ fila" + x + "\n");
                        for (int y = 1; y < 5; y++) {
                            a = A.buscar(x, y);
                            b = A.buscar(i, y);
                            e = a.getDato()-c*b.getDato();
                            if(e == -0){
                                A.ingresar(x, y, 0);
                            }else{
                                A.ingresar(x, y, e);
                            } 
                        }   
                        for(j = 1; j < 4; j++) {
                            for (k = 1; k < 5; k++) {
                                a = A.buscar(j, k);
                                if(k == 4){
                                    txtSolucion.append("|\t" + a.getDato() + "\n");
                                }else{
                                    txtSolucion.append(a.getDato() + "\t");
                                }
                            }
                        }                           
                        txtSolucion.append("\n\n"); 
                        }
                    }
                }
            }
        }
        return A;
    }
    
    public void llenarMatrizSolucionGauss(MatrizForma2 S){
        int z = 0;
        NodoDoble puntero = (NodoDoble) S.getNodoCabeza().getLigaDerecha();
        Tripleta t;
        while(z < matSol.size()){
            t = (Tripleta) puntero.getValor();
            matSol.get(z).setText(Double.toString(t.getDato()));
            puntero = (NodoDoble) puntero.getLigaDerecha();
            z++;
        } 
    }
    
    public void llenarSolucionGauss(MatrizForma2 S){
        lblXfinal.setText("X = " + txtDD1.getText());
        lblYfinal.setText("Y = " + txtDD2.getText());
        lblZfinal.setText("Z = " + txtDD3.getText());
        // No tiene solucion si:
        lblMensaje.setText("Única solución");
        double a, b, contador = 0;
        int i, j, k;
        for(i = 1; i < 4; i++){
            a = S.buscar(i, 4).getDato();
            for(j = 1; j < 4; j++){
                b = S.buscar(i, j).getDato();
                if(b == 0.0){
                    contador+= 1;
                }
                if((contador == 3) && (a == 0.0)){
                    lblMensaje.setText("Infinitas soluciones");
                }
                if((contador == 3) && (a != 0.0)){
                    lblMensaje.setText("Sin solución");
                }
            }
            contador = 0;
        }
        
    }
    
    // PARA CRAMER TENEMOS LOS SIGUIENTES METODOS
    
    public void resolverCramer(){
        MatrizForma2 X = aux1;
        MatrizForma2 Y = aux2;
        MatrizForma2 Z = aux3;
        double x, y, z, det, detX, detY, detZ;
        txtSolucion.append("Primero, hallamos el determinante de la matriz Inicial\n");
        det = determinante(aux);
        txtSolucion.append("Ahora, hallamos el de las subMatrices\n");
        for(int i = 1; i < 4; i++){
            Tripleta a = X.buscar(i, 4);
            Double b = a.getDato();
            X.ingresar(i, 1, b);
        }
        for(int i = 1; i < 4; i++){
            Tripleta a = Y.buscar(i, 4);
            Double b = a.getDato();
            Y.ingresar(i, 2, b);
        }
        for(int i = 1; i < 4; i++){
            Tripleta a = Z.buscar(i, 4);
            Double b = a.getDato();
            Z.ingresar(i, 3, b);
        }
        txtSolucion.append("Para la SubMatriz X: \n");
        detX = determinante(X);
        txtSolucion.append("Para la SubMatriz Y: \n");
        detY = determinante(Y);
        txtSolucion.append("Para la SubMatriz Z: \n");
        detZ = determinante(Z);
        txtSolucion.append("\nPor ultimo, encontramos las variables: \n");
        txtSolucion.append("X = " + detX + "/" + det + "\n");
        x = detX/det;
        txtSolucion.append("X = " + x + "\n\n");
        txtSolucion.append("Y = " + detY + "/" + det + "\n");
        y = detY/det;
        txtSolucion.append("Y = " + y + "\n\n");
        txtSolucion.append("Z = " + detZ + "/" + det + "\n");
        z = detZ/det;
        txtSolucion.append("Z = " + z + "\n\n");
        lblXfinal.setText("X = " + x);
        lblYfinal.setText("Y = " + y);
        lblZfinal.setText("Z = " + z);
        lblMensaje.setText(null);
    }
    
    public double determinante(MatrizForma2 A){
        // Primero vamos a hallar el determinante de la matriz con la regla de Sarrus
        String sa, sb, sc, sd, se, sf;
        double a, b, c, d, e, f, det;
        sa = A.buscar(1, 1).getDato() + " * " + (A.buscar(2, 2).getDato()) + " * " + (A.buscar(3, 3).getDato());
        sb = A.buscar(1, 2).getDato() + " * " + (A.buscar(2, 3).getDato()) + " * " + (A.buscar(3, 1).getDato());
        sc = A.buscar(1, 3).getDato() + " * " + (A.buscar(2, 1).getDato()) + " * " + (A.buscar(3, 2).getDato());
        sd = A.buscar(1, 3).getDato() + " * " + (A.buscar(2, 2).getDato()) + " * " + (A.buscar(3, 1).getDato());
        se = A.buscar(1, 1).getDato() + " * " + (A.buscar(2, 3).getDato()) + " * " + (A.buscar(3, 2).getDato());
        sf = A.buscar(1, 2).getDato() + " * " + (A.buscar(2, 1).getDato()) + " * " + (A.buscar(3, 3).getDato());
        txtSolucion.append(" > (" + sa + ") \n");
        txtSolucion.append("  + (" + sb + ") \n");
        txtSolucion.append("  + (" + sc + ") \n");
        txtSolucion.append("  - (" + sd + ") \n");
        txtSolucion.append("  - (" + se + ") \n");
        txtSolucion.append("  - (" + sf + ") \n");
        a = (A.buscar(1, 1).getDato()*(A.buscar(2, 2).getDato())*(A.buscar(3, 3).getDato()));
        b = (A.buscar(1, 2).getDato()*(A.buscar(2, 3).getDato())*(A.buscar(3, 1).getDato()));
        c = (A.buscar(1, 3).getDato()*(A.buscar(2, 1).getDato())*(A.buscar(3, 2).getDato()));
        d = (A.buscar(1, 3).getDato()*(A.buscar(2, 2).getDato())*(A.buscar(3, 1).getDato()));
        e = (A.buscar(1, 1).getDato()*(A.buscar(2, 3).getDato())*(A.buscar(3, 2).getDato()));
        f = (A.buscar(1, 2).getDato()*(A.buscar(2, 1).getDato())*(A.buscar(3, 3).getDato()));
        det = a + b + c - d - e - f;
        txtSolucion.append("Determinante es: " + Double.toString(det) + "\n\n");
        return det;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCramer;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnGauss;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JLabel lblTitulo2;
    private javax.swing.JLabel lblTitulo3;
    private javax.swing.JLabel lblTitulo4;
    private javax.swing.JLabel lblTitulo5;
    private javax.swing.JLabel lblTitulo6;
    private java.awt.Label lblX1;
    private java.awt.Label lblX2;
    private java.awt.Label lblX3;
    private java.awt.Label lblXfinal;
    private java.awt.Label lblY1;
    private java.awt.Label lblY2;
    private java.awt.Label lblY3;
    private java.awt.Label lblYfinal;
    private java.awt.Label lblZ1;
    private java.awt.Label lblZ2;
    private java.awt.Label lblZ3;
    private java.awt.Label lblZfinal;
    private javax.swing.JPanel pnlMatrizInicial;
    private javax.swing.JPanel pnlMatrizSolucion;
    private javax.swing.JTextField txtD1;
    private javax.swing.JTextField txtD2;
    private javax.swing.JTextField txtD3;
    private javax.swing.JTextField txtDD1;
    private javax.swing.JTextField txtDD2;
    private javax.swing.JTextField txtDD3;
    private javax.swing.JTextField txtDa;
    private javax.swing.JTextField txtDb;
    private javax.swing.JTextField txtDc;
    private javax.swing.JTextArea txtSolucion;
    private javax.swing.JTextField txtX1;
    private javax.swing.JTextField txtX2;
    private javax.swing.JTextField txtX3;
    private javax.swing.JTextField txtXX1;
    private javax.swing.JTextField txtXX2;
    private javax.swing.JTextField txtXX3;
    private javax.swing.JTextField txtXa;
    private javax.swing.JTextField txtXb;
    private javax.swing.JTextField txtXc;
    private javax.swing.JTextField txtY1;
    private javax.swing.JTextField txtY2;
    private javax.swing.JTextField txtY3;
    private javax.swing.JTextField txtYY1;
    private javax.swing.JTextField txtYY2;
    private javax.swing.JTextField txtYY3;
    private javax.swing.JTextField txtYa;
    private javax.swing.JTextField txtYb;
    private javax.swing.JTextField txtYc;
    private javax.swing.JTextField txtZ1;
    private javax.swing.JTextField txtZ2;
    private javax.swing.JTextField txtZ3;
    private javax.swing.JTextField txtZZ1;
    private javax.swing.JTextField txtZZ2;
    private javax.swing.JTextField txtZZ3;
    private javax.swing.JTextField txtZa;
    private javax.swing.JTextField txtZb;
    private javax.swing.JTextField txtZc;
    // End of variables declaration//GEN-END:variables
}
