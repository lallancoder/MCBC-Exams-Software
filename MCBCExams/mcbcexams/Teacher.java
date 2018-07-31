/*     */ package mcbcexams;
/*     */ 
/*     */ import javax.swing.JLabel;
/*     */ 
/*     */ public class Teacher extends javax.swing.JFrame { public String TID;
/*     */   public String name;
/*     */   private javax.swing.JButton jButton1;
/*     */   private javax.swing.JButton jButton2;
/*     */   private javax.swing.JButton jButton3;
/*     */   private javax.swing.JButton jButton4;
/*     */   private javax.swing.JButton jButton5;
/*     */   private javax.swing.JButton jButton6;
/*     */   private javax.swing.JButton jButton7;
/*     */   
/*  15 */   public Teacher() { initComponents();
/*  16 */     this.jLayeredPane2.setVisible(false);
/*  17 */     this.jLayeredPane1.setVisible(true);
/*  18 */     this.jLayeredPane3.setVisible(false); }
/*     */   
/*     */   private javax.swing.JComboBox<String> jComboBox1;
/*     */   private javax.swing.JComboBox<String> jComboBox2;
/*     */   
/*  23 */   public Teacher(String TID, String string0, String string1) { initComponents();
/*  24 */     this.jLayeredPane2.setVisible(false);
/*  25 */     this.jLayeredPane1.setVisible(true);
/*  26 */     this.jLayeredPane3.setVisible(false);
/*  27 */     this.TID = TID;
/*  28 */     this.name = (string0 + " " + string1);
/*  29 */     this.jLabel2.setText(this.name.toUpperCase());
/*     */   }
/*     */   
/*     */   private javax.swing.JComboBox<String> jComboBox3;
/*     */   private JLabel jLabel1;
/*     */   
/*     */   private void initComponents() {
/*  36 */     this.jPanel1 = new javax.swing.JPanel();
/*  37 */     this.jButton1 = new javax.swing.JButton();
/*  38 */     this.jButton2 = new javax.swing.JButton();
/*  39 */     this.jButton3 = new javax.swing.JButton();
/*  40 */     this.jButton6 = new javax.swing.JButton();
/*  41 */     this.jLabel2 = new JLabel();
/*  42 */     this.jLabel1 = new JLabel();
/*  43 */     this.jPanel4 = new javax.swing.JPanel();
/*  44 */     this.jLayeredPane1 = new javax.swing.JLayeredPane();
/*  45 */     this.jLabel6 = new JLabel();
/*  46 */     this.jLabel5 = new JLabel();
/*  47 */     this.jLabel7 = new JLabel();
/*  48 */     this.jTextField1 = new javax.swing.JTextField();
/*  49 */     this.jComboBox1 = new javax.swing.JComboBox();
/*  50 */     this.jLabel8 = new JLabel();
/*  51 */     this.jScrollPane1 = new javax.swing.JScrollPane();
/*  52 */     this.jTextArea1 = new javax.swing.JTextArea();
/*  53 */     this.jLabel9 = new JLabel();
/*  54 */     this.jComboBox2 = new javax.swing.JComboBox();
/*  55 */     this.jLabel10 = new JLabel();
/*  56 */     this.jLabel11 = new JLabel();
/*  57 */     this.jComboBox3 = new javax.swing.JComboBox();
/*  58 */     this.jLabel12 = new JLabel();
/*  59 */     this.jTextField2 = new javax.swing.JTextField();
/*  60 */     this.jButton4 = new javax.swing.JButton();
/*  61 */     this.jButton5 = new javax.swing.JButton();
/*  62 */     this.jLayeredPane2 = new javax.swing.JLayeredPane();
/*  63 */     this.jLabel13 = new JLabel();
/*  64 */     this.jScrollPane2 = new javax.swing.JScrollPane();
/*  65 */     this.jTable1 = new javax.swing.JTable();
/*  66 */     this.jButton7 = new javax.swing.JButton();
/*  67 */     this.jLayeredPane3 = new javax.swing.JLayeredPane();
/*  68 */     this.jScrollPane3 = new javax.swing.JScrollPane();
/*  69 */     this.jTable2 = new javax.swing.JTable();
/*     */     
/*  71 */     setDefaultCloseOperation(3);
/*  72 */     setTitle("Teacher Dashboard");
/*  73 */     setBounds(new java.awt.Rectangle(0, 0, 1216, 693));
/*  74 */     setMaximizedBounds(new java.awt.Rectangle(0, 0, 1216, 693));
/*  75 */     setMinimumSize(new java.awt.Dimension(1216, 693));
/*  76 */     setResizable(false);
/*  77 */     getContentPane().setLayout(null);
/*     */     
/*  79 */     this.jButton1.setBackground(new java.awt.Color(0, 153, 255));
/*  80 */     this.jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18));
/*  81 */     this.jButton1.setForeground(new java.awt.Color(255, 255, 255));
/*  82 */     this.jButton1.setText("Add a Test");
/*  83 */     this.jButton1.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  85 */         Teacher.this.jButton1ActionPerformed(evt);
/*     */       }
/*     */       
/*  88 */     });
/*  89 */     this.jButton2.setBackground(new java.awt.Color(0, 153, 255));
/*  90 */     this.jButton2.setFont(new java.awt.Font("Times New Roman", 0, 18));
/*  91 */     this.jButton2.setForeground(new java.awt.Color(255, 255, 255));
/*  92 */     this.jButton2.setText("Delete a Test");
/*  93 */     this.jButton2.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  95 */         Teacher.this.jButton2ActionPerformed(evt);
/*     */       }
/*     */       
/*  98 */     });
/*  99 */     this.jButton3.setBackground(new java.awt.Color(0, 153, 255));
/* 100 */     this.jButton3.setFont(new java.awt.Font("Times New Roman", 0, 18));
/* 101 */     this.jButton3.setForeground(new java.awt.Color(255, 255, 255));
/* 102 */     this.jButton3.setText("View Results");
/* 103 */     this.jButton3.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/* 105 */         Teacher.this.jButton3ActionPerformed(evt);
/*     */       }
/*     */       
/* 108 */     });
/* 109 */     this.jButton6.setBackground(new java.awt.Color(0, 153, 255));
/* 110 */     this.jButton6.setFont(new java.awt.Font("Times New Roman", 0, 18));
/* 111 */     this.jButton6.setForeground(new java.awt.Color(255, 255, 255));
/* 112 */     this.jButton6.setText("LOGOUT");
/* 113 */     this.jButton6.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/* 115 */         Teacher.this.jButton6ActionPerformed(evt);
/*     */       }
/*     */       
/* 118 */     });
/* 119 */     javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(this.jPanel1);
/* 120 */     this.jPanel1.setLayout(jPanel1Layout);
/* 121 */     jPanel1Layout.setHorizontalGroup(jPanel1Layout
/* 122 */       .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
/* 123 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 124 */       .addGap(24, 24, 24)
/* 125 */       .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
/* 126 */       .addComponent(this.jButton1, -2, 205, -2)
/* 127 */       .addComponent(this.jButton2, -2, 205, -2)
/* 128 */       .addComponent(this.jButton3, -2, 205, -2)
/* 129 */       .addComponent(this.jButton6, -2, 205, -2))
/* 130 */       .addContainerGap(31, 32767)));
/*     */     
/* 132 */     jPanel1Layout.setVerticalGroup(jPanel1Layout
/* 133 */       .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
/* 134 */       .addGroup(jPanel1Layout.createSequentialGroup()
/* 135 */       .addGap(23, 23, 23)
/* 136 */       .addComponent(this.jButton1, -2, 43, -2)
/* 137 */       .addGap(23, 23, 23)
/* 138 */       .addComponent(this.jButton2, -2, 43, -2)
/* 139 */       .addGap(23, 23, 23)
/* 140 */       .addComponent(this.jButton3, -2, 43, -2)
/* 141 */       .addGap(23, 23, 23)
/* 142 */       .addComponent(this.jButton6, -2, 43, -2)
/* 143 */       .addContainerGap(206, 32767)));
/*     */     
/*     */ 
/* 146 */     getContentPane().add(this.jPanel1);
/* 147 */     this.jPanel1.setBounds(0, 220, 260, 470);
/*     */     
/* 149 */     this.jLabel2.setBackground(new java.awt.Color(0, 0, 0));
/* 150 */     this.jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24));
/* 151 */     this.jLabel2.setForeground(new java.awt.Color(255, 255, 255));
/* 152 */     this.jLabel2.setHorizontalAlignment(0);
/* 153 */     this.jLabel2.setText("AMRIT KHARBANDA");
/* 154 */     this.jLabel2.setOpaque(true);
/* 155 */     getContentPane().add(this.jLabel2);
/* 156 */     this.jLabel2.setBounds(450, 140, 340, 60);
/*     */     
/* 158 */     this.jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/ministyle56.jpg")));
/* 159 */     getContentPane().add(this.jLabel1);
/* 160 */     this.jLabel1.setBounds(0, 0, 1200, 200);
/*     */     
/* 162 */     this.jPanel4.setBackground(new java.awt.Color(255, 255, 255));
/* 163 */     this.jPanel4.setLayout(null);
/*     */     
/* 165 */     this.jLayeredPane1.setOpaque(true);
/*     */     
/* 167 */     this.jLabel6.setFont(new java.awt.Font("Tahoma", 0, 28));
/* 168 */     this.jLabel6.setText("Add a new test");
/* 169 */     this.jLayeredPane1.add(this.jLabel6);
/* 170 */     this.jLabel6.setBounds(40, 10, 390, 50);
/*     */     
/* 172 */     this.jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18));
/* 173 */     this.jLabel5.setText("Title");
/* 174 */     this.jLayeredPane1.add(this.jLabel5);
/* 175 */     this.jLabel5.setBounds(50, 80, 260, 30);
/*     */     
/* 177 */     this.jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18));
/* 178 */     this.jLabel7.setText("Subject");
/* 179 */     this.jLayeredPane1.add(this.jLabel7);
/* 180 */     this.jLabel7.setBounds(520, 70, 270, 30);
/*     */     
/* 182 */     this.jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 18));
/* 183 */     this.jLayeredPane1.add(this.jTextField1);
/* 184 */     this.jTextField1.setBounds(50, 120, 260, 30);
/*     */     
/* 186 */     this.jComboBox1.setFont(new java.awt.Font("Times New Roman", 0, 18));
/* 187 */     this.jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mathematics", "Chemistry", "Biology", "Computers", "Others" }));
/* 188 */     this.jComboBox1.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/* 190 */         Teacher.this.jComboBox1ActionPerformed(evt);
/*     */       }
/* 192 */     });
/* 193 */     this.jLayeredPane1.add(this.jComboBox1);
/* 194 */     this.jComboBox1.setBounds(520, 120, 270, 30);
/*     */     
/* 196 */     this.jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18));
/* 197 */     this.jLabel8.setText("Description");
/* 198 */     this.jLayeredPane1.add(this.jLabel8);
/* 199 */     this.jLabel8.setBounds(50, 170, 260, 30);
/*     */     
/* 201 */     this.jTextArea1.setColumns(20);
/* 202 */     this.jTextArea1.setFont(new java.awt.Font("Times New Roman", 0, 18));
/* 203 */     this.jTextArea1.setRows(5);
/* 204 */     this.jScrollPane1.setViewportView(this.jTextArea1);
/*     */     
/* 206 */     this.jLayeredPane1.add(this.jScrollPane1);
/* 207 */     this.jScrollPane1.setBounds(50, 210, 260, 110);
/*     */     
/* 209 */     this.jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18));
/* 210 */     this.jLabel9.setText("Duration ");
/* 211 */     this.jLayeredPane1.add(this.jLabel9);
/* 212 */     this.jLabel9.setBounds(520, 180, 270, 22);
/*     */     
/* 214 */     this.jComboBox2.setFont(new java.awt.Font("Times New Roman", 0, 18));
/* 215 */     this.jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "24" }));
/* 216 */     this.jLayeredPane1.add(this.jComboBox2);
/* 217 */     this.jComboBox2.setBounds(520, 210, 50, 30);
/*     */     
/* 219 */     this.jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18));
/* 220 */     this.jLabel10.setText("Hrs ");
/* 221 */     this.jLayeredPane1.add(this.jLabel10);
/* 222 */     this.jLabel10.setBounds(580, 210, 40, 30);
/*     */     
/* 224 */     this.jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18));
/* 225 */     this.jLabel11.setText("Min");
/* 226 */     this.jLayeredPane1.add(this.jLabel11);
/* 227 */     this.jLabel11.setBounds(710, 210, 29, 30);
/*     */     
/* 229 */     this.jComboBox3.setFont(new java.awt.Font("Times New Roman", 0, 18));
/* 230 */     this.jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60" }));
/* 231 */     this.jComboBox3.setSelectedIndex(30);
/* 232 */     this.jComboBox3.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/* 234 */         Teacher.this.jComboBox3ActionPerformed(evt);
/*     */       }
/* 236 */     });
/* 237 */     this.jLayeredPane1.add(this.jComboBox3);
/* 238 */     this.jComboBox3.setBounds(650, 210, 51, 30);
/*     */     
/* 240 */     this.jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18));
/* 241 */     this.jLabel12.setText("Add a test file");
/* 242 */     this.jLayeredPane1.add(this.jLabel12);
/* 243 */     this.jLabel12.setBounds(150, 350, 130, 30);
/*     */     
/* 245 */     this.jTextField2.setFont(new java.awt.Font("Times New Roman", 0, 18));
/* 246 */     this.jLayeredPane1.add(this.jTextField2);
/* 247 */     this.jTextField2.setBounds(290, 350, 330, 30);
/*     */     
/* 249 */     this.jButton4.setFont(new java.awt.Font("Times New Roman", 0, 18));
/* 250 */     this.jButton4.setText("Browse");
/* 251 */     this.jButton4.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/* 253 */         Teacher.this.jButton4ActionPerformed(evt);
/*     */       }
/* 255 */     });
/* 256 */     this.jLayeredPane1.add(this.jButton4);
/* 257 */     this.jButton4.setBounds(650, 350, 90, 30);
/*     */     
/* 259 */     this.jButton5.setFont(new java.awt.Font("Times New Roman", 1, 18));
/* 260 */     this.jButton5.setText("UPLOAD");
/* 261 */     this.jButton5.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/* 263 */         Teacher.this.jButton5ActionPerformed(evt);
/*     */       }
/* 265 */     });
/* 266 */     this.jLayeredPane1.add(this.jButton5);
/* 267 */     this.jButton5.setBounds(370, 410, 130, 30);
/*     */     
/* 269 */     this.jPanel4.add(this.jLayeredPane1);
/* 270 */     this.jLayeredPane1.setBounds(-10, 0, 930, 460);
/*     */     
/* 272 */     this.jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 28));
/* 273 */     this.jLabel13.setText("Delete a test");
/* 274 */     this.jLayeredPane2.add(this.jLabel13);
/* 275 */     this.jLabel13.setBounds(30, 20, 310, 50);
/*     */     
/* 277 */     this.jTable1.setModel(new javax.swing.table.DefaultTableModel(new Object[0][], new String[] { "EID", "Title ", "Subject", "Total Marks" })
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 285 */       Class[] types = { String.class, String.class, String.class, String.class };
/*     */       
/*     */ 
/* 288 */       boolean[] canEdit = { false, false, false, false };
/*     */       
/*     */ 
/*     */       public Class getColumnClass(int columnIndex)
/*     */       {
/* 293 */         return this.types[columnIndex];
/*     */       }
/*     */       
/*     */       public boolean isCellEditable(int rowIndex, int columnIndex) {
/* 297 */         return this.canEdit[columnIndex];
/*     */       }
/* 299 */     });
/* 300 */     this.jScrollPane2.setViewportView(this.jTable1);
/* 301 */     if (this.jTable1.getColumnModel().getColumnCount() > 0) {
/* 302 */       this.jTable1.getColumnModel().getColumn(0).setResizable(false);
/* 303 */       this.jTable1.getColumnModel().getColumn(1).setResizable(false);
/* 304 */       this.jTable1.getColumnModel().getColumn(2).setResizable(false);
/* 305 */       this.jTable1.getColumnModel().getColumn(3).setResizable(false);
/*     */     }
/*     */     
/* 308 */     this.jLayeredPane2.add(this.jScrollPane2);
/* 309 */     this.jScrollPane2.setBounds(120, 130, 750, 250);
/*     */     
/* 311 */     this.jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/delete.png")));
/* 312 */     this.jButton7.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/* 314 */         Teacher.this.jButton7ActionPerformed(evt);
/*     */       }
/* 316 */     });
/* 317 */     this.jLayeredPane2.add(this.jButton7);
/* 318 */     this.jButton7.setBounds(450, 390, 60, 60);
/*     */     
/* 320 */     this.jPanel4.add(this.jLayeredPane2);
/* 321 */     this.jLayeredPane2.setBounds(5, 0, 920, 460);
/*     */     
/* 323 */     this.jTable2.setModel(new javax.swing.table.DefaultTableModel(new Object[0][], new String[] { "EID", "Title", "SID", "First", "Score", "Submitted_On" })
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 331 */       Class[] types = { String.class, String.class, String.class, String.class, String.class, String.class };
/*     */       
/*     */ 
/* 334 */       boolean[] canEdit = { false, false, false, false, false, false };
/*     */       
/*     */ 
/*     */       public Class getColumnClass(int columnIndex)
/*     */       {
/* 339 */         return this.types[columnIndex];
/*     */       }
/*     */       
/*     */       public boolean isCellEditable(int rowIndex, int columnIndex) {
/* 343 */         return this.canEdit[columnIndex];
/*     */       }
/* 345 */     });
/* 346 */     this.jScrollPane3.setViewportView(this.jTable2);
/* 347 */     if (this.jTable2.getColumnModel().getColumnCount() > 0) {
/* 348 */       this.jTable2.getColumnModel().getColumn(0).setResizable(false);
/* 349 */       this.jTable2.getColumnModel().getColumn(1).setResizable(false);
/* 350 */       this.jTable2.getColumnModel().getColumn(2).setResizable(false);
/* 351 */       this.jTable2.getColumnModel().getColumn(3).setResizable(false);
/* 352 */       this.jTable2.getColumnModel().getColumn(4).setResizable(false);
/* 353 */       this.jTable2.getColumnModel().getColumn(5).setResizable(false);
/*     */     }
/*     */     
/* 356 */     this.jLayeredPane3.add(this.jScrollPane3);
/* 357 */     this.jScrollPane3.setBounds(30, 30, 860, 402);
/*     */     
/* 359 */     this.jPanel4.add(this.jLayeredPane3);
/* 360 */     this.jLayeredPane3.setBounds(10, 0, 920, 460);
/*     */     
/* 362 */     getContentPane().add(this.jPanel4);
/* 363 */     this.jPanel4.setBounds(270, 220, 930, 460);
/*     */     
/* 365 */     pack(); }
/*     */   
/*     */   private JLabel jLabel10;
/*     */   
/* 369 */   private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) { this.jLayeredPane2.setVisible(true);
/* 370 */     this.jLayeredPane1.setVisible(false);
/* 371 */     this.jLayeredPane3.setVisible(false);
/* 372 */     javax.swing.table.DefaultTableModel dtm = new javax.swing.table.DefaultTableModel(0, 0);
/* 373 */     String[] header = { "EID", "Title", "Subject", "Total Marks" };
/* 374 */     dtm.setColumnIdentifiers(header);
/* 375 */     this.jTable1.setModel(dtm);
/*     */     try
/*     */     {
/* 378 */       Class.forName("oracle.jdbc.driver.OracleDriver");
/* 379 */       java.sql.Connection conn = java.sql.DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "password");
/* 380 */       String SQL = "Select * from exam where tid=?";
/* 381 */       java.sql.PreparedStatement st = conn.prepareStatement(SQL);
/* 382 */       st.setString(1, this.TID);
/* 383 */       java.sql.ResultSet rs = st.executeQuery();
/* 384 */       while (rs.next())
/*     */       {
/* 386 */         dtm.addRow(new Object[] { rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(7) });
/*     */       }
/*     */       
/*     */     }
/*     */     catch (Exception e)
/*     */     {
/* 392 */       System.out.println(e.getMessage()); } }
/*     */   
/*     */   private JLabel jLabel11;
/*     */   private JLabel jLabel12;
/*     */   private JLabel jLabel13;
/*     */   
/* 398 */   private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) { this.jLayeredPane1.setVisible(true);
/* 399 */     this.jLayeredPane2.setVisible(false);
/* 400 */     this.jLayeredPane3.setVisible(false);
/*     */   }
/*     */   
/*     */   private JLabel jLabel2;
/*     */   private JLabel jLabel5;
/*     */   private JLabel jLabel6;
/*     */   
/*     */   private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {}
/*     */   
/*     */   private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {}
/*     */   
/*     */   private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
/* 412 */     javax.swing.JFileChooser f = new javax.swing.JFileChooser();
/* 413 */     f.setFileSelectionMode(0);
/* 414 */     f.setAcceptAllFileFilterUsed(false);
/* 415 */     int rval = f.showOpenDialog(null);
/* 416 */     if (rval == 0)
/* 417 */       this.jTextField2.setText(f.getSelectedFile().toString());
/*     */   }
/*     */   
/*     */   private JLabel jLabel7;
/*     */   private JLabel jLabel8;
/*     */   private JLabel jLabel9;
/*     */   
/* 424 */   private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) { try { java.util.Scanner fr = new java.util.Scanner(new java.io.File(this.jTextField2.getText()));
/*     */       
/* 426 */       String url = "C:\\Users\\Prashant\\Documents\\NetBeansProjects\\MCBCExams\\Papers\\" + this.jComboBox1.getSelectedItem().toString() + "\\" + this.jTextField1.getText() + ".txt";
/* 427 */       java.io.File f = new java.io.File(url);
/* 428 */       java.io.FileWriter fw = new java.io.FileWriter(f, true);
/*     */       
/* 430 */       Question q = new Question();
/* 431 */       int count = 0;
/*     */       
/*     */ 
/*     */ 
/*     */       do
/*     */       {
/* 437 */         fr.useDelimiter("A.");
/* 438 */         q.ques = fr.next();
/* 439 */         q.ques = q.ques.replace("Q.", "").trim();
/* 440 */         fr.useDelimiter("B.");
/* 441 */         q.option1 = fr.next();
/* 442 */         q.option1 = q.option1.replace("A.", "\n").trim();
/* 443 */         fr.useDelimiter("C.");
/* 444 */         q.option2 = fr.next();
/* 445 */         q.option2 = q.option2.replace("B.", "\n").trim();
/* 446 */         fr.useDelimiter("D.");
/* 447 */         q.option3 = fr.next();
/* 448 */         q.option3 = q.option3.replace("C.", "\n").trim();
/* 449 */         fr.useDelimiter("Ans");
/* 450 */         q.option4 = fr.next();
/* 451 */         q.option4 = q.option4.replace("D.", "\n").trim();
/* 452 */         fr.useDelimiter("Q. | \n");
/* 453 */         q.answer = fr.next();
/* 454 */         q.answer = q.answer.replace("Ans", "\n").trim();
/* 455 */         q.display();
/* 456 */         fw.append(q.ques);
/* 457 */         fw.append("\r\n");
/* 458 */         fw.append(q.option1);
/* 459 */         fw.append("\r\n");
/* 460 */         fw.append(q.option2);
/* 461 */         fw.append("\r\n");
/* 462 */         fw.append(q.option3);
/* 463 */         fw.append("\r\n");
/* 464 */         fw.append(q.option4);
/* 465 */         fw.append("\r\n");
/* 466 */         fw.append(q.answer);
/* 467 */         fw.append("\r\n");
/* 468 */         count++;
/* 469 */       } while (fr.hasNext());
/* 470 */       fr.close();
/* 471 */       fw.close();
/* 472 */       System.out.println(count);
/* 473 */       int Duration = Integer.parseInt(this.jComboBox2.getSelectedItem().toString()) * 3600 + Integer.parseInt(this.jComboBox3.getSelectedItem().toString()) * 60;
/* 474 */       Class.forName("oracle.jdbc.driver.OracleDriver");
/* 475 */       java.sql.Connection conn = java.sql.DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "password");
/* 476 */       String SQL = "Insert into exam values('',?,?,?,?,?,?,?)";
/* 477 */       java.sql.PreparedStatement st = conn.prepareStatement(SQL);
/* 478 */       st.setString(1, this.jTextField1.getText());
/* 479 */       st.setString(2, this.jComboBox1.getSelectedItem().toString());
/* 480 */       st.setString(3, this.jTextArea1.getText());
/* 481 */       st.setInt(4, Duration);
/* 482 */       st.setString(5, this.TID);
/* 483 */       st.setInt(6, count);
/* 484 */       st.setString(7, url);
/* 485 */       st.executeQuery();
/* 486 */       java.awt.Component frame = null;
/* 487 */       javax.swing.JOptionPane.showMessageDialog(frame, " Successfully Uploaded ");
/*     */     }
/*     */     catch (Exception e) {
/* 490 */       System.out.println(e.getMessage()); } }
/*     */   
/*     */   private javax.swing.JLayeredPane jLayeredPane1;
/*     */   private javax.swing.JLayeredPane jLayeredPane2;
/*     */   
/* 495 */   private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) { dispose();
/* 496 */     new Home().setVisible(true); }
/*     */   
/*     */   private javax.swing.JLayeredPane jLayeredPane3;
/*     */   private javax.swing.JPanel jPanel1;
/* 500 */   private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) { javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)this.jTable1.getModel();
/* 501 */     int row = this.jTable1.getSelectedRow();
/* 502 */     String eid = (String)this.jTable1.getValueAt(row, 0);
/*     */     try
/*     */     {
/* 505 */       Class.forName("oracle.jdbc.driver.OracleDriver");
/* 506 */       java.sql.Connection conn = java.sql.DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "password");
/* 507 */       String SQL = "Delete from exam where eid=? ";
/* 508 */       java.sql.PreparedStatement st = conn.prepareStatement(SQL);
/* 509 */       st.setString(1, eid);
/* 510 */       st.executeUpdate();
/*     */     }
/*     */     catch (Exception e)
/*     */     {
/* 514 */       System.out.println(e.getMessage());
/*     */     }
/*     */     
/* 517 */     dtm.removeRow(row);
/*     */   }
/*     */   
/*     */   private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
/* 521 */     this.jLayeredPane3.setVisible(true);
/* 522 */     this.jLayeredPane1.setVisible(false);
/* 523 */     this.jLayeredPane2.setVisible(false);
/* 524 */     javax.swing.table.DefaultTableModel dtm = new javax.swing.table.DefaultTableModel(0, 0);
/* 525 */     String[] header = { "EID", "Title", "SID", "FIRST", "Score", "Submitted_on" };
/* 526 */     dtm.setColumnIdentifiers(header);
/* 527 */     this.jTable2.setModel(dtm);
/*     */     try
/*     */     {
/* 530 */       Class.forName("oracle.jdbc.driver.OracleDriver");
/* 531 */       java.sql.Connection conn = java.sql.DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "password");
/* 532 */       String SQL = "Select s.EID,e.TITLE,s.SID,r.first,s.SCORE,s.SUBMITTED_ON from student s, exam e, register r where e.tid=? and s.eid=e.eid and s.sid=r.id";
/* 533 */       java.sql.PreparedStatement st = conn.prepareStatement(SQL);
/* 534 */       st.setString(1, this.TID);
/* 535 */       java.sql.ResultSet rs = st.executeQuery();
/* 536 */       while (rs.next())
/*     */       {
/* 538 */         dtm.addRow(new Object[] { rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), Integer.valueOf(rs.getInt(5)), rs.getString(6) });
/*     */       }
/*     */     } catch (Exception e) {
/* 541 */       System.out.println(e.getMessage());
/*     */     }
/*     */   }
/*     */   
/*     */   private javax.swing.JPanel jPanel4;
/*     */   private javax.swing.JScrollPane jScrollPane1;
/*     */   private javax.swing.JScrollPane jScrollPane2;
/*     */   private javax.swing.JScrollPane jScrollPane3;
/*     */   
/*     */   public static void main(String[] args) {
/* 551 */     try { for (javax.swing.UIManager.LookAndFeelInfo info : ) {
/* 552 */         if ("Nimbus".equals(info.getName())) {
/* 553 */           javax.swing.UIManager.setLookAndFeel(info.getClassName());
/* 554 */           break;
/*     */         }
/*     */       }
/*     */     } catch (ClassNotFoundException ex) {
/* 558 */       java.util.logging.Logger.getLogger(Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (InstantiationException ex) {
/* 560 */       java.util.logging.Logger.getLogger(Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (IllegalAccessException ex) {
/* 562 */       java.util.logging.Logger.getLogger(Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
/* 564 */       java.util.logging.Logger.getLogger(Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 569 */     java.awt.EventQueue.invokeLater(new Runnable() {
/*     */       public void run() {
/* 571 */         new Teacher().setVisible(true);
/*     */       }
/*     */     });
/*     */   }
/*     */   
/*     */   private javax.swing.JTable jTable1;
/*     */   private javax.swing.JTable jTable2;
/*     */   private javax.swing.JTextArea jTextArea1;
/*     */   private javax.swing.JTextField jTextField1;
/*     */   private javax.swing.JTextField jTextField2;
/*     */ }


/* Location:              C:\Users\Prash\Downloads\Compressed\dist\MCBCExams.jar!\mcbcexams\Teacher.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */