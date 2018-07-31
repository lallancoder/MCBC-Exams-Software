/*     */ package mcbcexams;
/*     */ 
/*     */ import java.awt.Color;
/*     */ import java.awt.Font;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.sql.Connection;
/*     */ import java.sql.PreparedStatement;
/*     */ import java.sql.ResultSet;
/*     */ import java.util.logging.Logger;
/*     */ import javax.swing.GroupLayout;
/*     */ import javax.swing.GroupLayout.Alignment;
/*     */ import javax.swing.GroupLayout.ParallelGroup;
/*     */ import javax.swing.GroupLayout.SequentialGroup;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JComboBox;
/*     */ import javax.swing.JDialog;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JLayeredPane;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JTable;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.table.DefaultTableModel;
/*     */ import javax.swing.table.TableColumn;
/*     */ import javax.swing.table.TableColumnModel;
/*     */ 
/*     */ public class Student extends javax.swing.JFrame
/*     */ {
/*  28 */   DefaultTableModel dtm = new DefaultTableModel(0, 0);
/*  29 */   String[] header = { "EID", "Title", "Subject", "Duration", "Uploaded By", "Total_Marks" };
/*     */   String sid;
/*     */   private JButton jButton1;
/*     */   private JButton jButton2; private JButton jButton3; private JButton jButton4;
/*  33 */   public Student(String ID, String firstname, String lastname) { this.sid = ID;
/*  34 */     initComponents();
/*     */     
/*  36 */     this.jLabel2.setText("  " + firstname.charAt(0));
/*  37 */     this.jLabel3.setText(firstname + " " + lastname);
/*     */     
/*  39 */     Font font = this.jLabel8.getFont();
/*  40 */     java.util.Map attributes = font.getAttributes();
/*  41 */     attributes.put(java.awt.font.TextAttribute.UNDERLINE, java.awt.font.TextAttribute.UNDERLINE_ON);
/*  42 */     this.jLabel8.setFont(font.deriveFont(attributes));
/*     */     try
/*     */     {
/*  45 */       Class.forName("oracle.jdbc.driver.OracleDriver");
/*  46 */       Connection conn = java.sql.DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "password");
/*  47 */       String SQL = "Select * from exam";
/*  48 */       java.sql.Statement st = conn.createStatement();
/*  49 */       java.sql.Statement st1 = conn.createStatement();
/*     */       
/*  51 */       ResultSet rs1 = st.executeQuery("Select DISTINCT TID from exam");
/*  52 */       while (rs1.next())
/*     */       {
/*  54 */         this.jComboBox1.addItem(rs1.getString(1).toString());
/*     */       }
/*  56 */       this.dtm.setColumnIdentifiers(this.header);
/*  57 */       this.jTable1.setModel(this.dtm);
/*     */     }
/*     */     catch (Exception e)
/*     */     {
/*  61 */       System.out.println(e.getMessage()); } }
/*     */   
/*     */   private JComboBox<String> jComboBox1;
/*     */   private JComboBox<String> jComboBox2;
/*     */   
/*  66 */   private Student() { throw new UnsupportedOperationException("Not supported yet."); }
/*     */   
/*     */   private JDialog jDialog1;
/*     */   private JLabel jLabel1;
/*     */   private JLabel jLabel2;
/*     */   private JLabel jLabel3;
/*     */   private JLabel jLabel4;
/*     */   private JLabel jLabel5;
/*     */   
/*  75 */   private void initComponents() { this.jDialog1 = new JDialog();
/*  76 */     this.jLabel7 = new JLabel();
/*  77 */     this.jButton3 = new JButton();
/*  78 */     this.jButton4 = new JButton();
/*  79 */     this.jPanel1 = new JPanel();
/*  80 */     this.jLabel2 = new JLabel();
/*  81 */     this.jLabel3 = new JLabel();
/*  82 */     this.jLabel8 = new JLabel();
/*  83 */     this.jLabel1 = new JLabel();
/*  84 */     this.jLayeredPane1 = new JLayeredPane();
/*  85 */     this.jScrollPane1 = new javax.swing.JScrollPane();
/*  86 */     this.jTable1 = new JTable();
/*  87 */     this.jButton2 = new JButton();
/*  88 */     this.jPanel3 = new JPanel();
/*  89 */     this.jLabel9 = new JLabel();
/*  90 */     this.jLabel4 = new JLabel();
/*  91 */     this.jComboBox1 = new JComboBox();
/*  92 */     this.jLabel5 = new JLabel();
/*  93 */     this.jComboBox2 = new JComboBox();
/*  94 */     this.jLabel6 = new JLabel();
/*  95 */     this.jTextField1 = new JTextField();
/*  96 */     this.jButton1 = new JButton();
/*     */     
/*  98 */     this.jDialog1.setTitle("Message");
/*  99 */     this.jDialog1.setBounds(new java.awt.Rectangle(0, 0, 321, 186));
/* 100 */     this.jDialog1.setLocation(new java.awt.Point(50, 50));
/* 101 */     this.jDialog1.setMinimumSize(new java.awt.Dimension(321, 186));
/* 102 */     this.jDialog1.setResizable(false);
/* 103 */     this.jDialog1.setSize(new java.awt.Dimension(321, 186));
/*     */     
/* 105 */     this.jLabel7.setFont(new Font("Calibri", 0, 14));
/* 106 */     this.jLabel7.setHorizontalAlignment(0);
/* 107 */     this.jLabel7.setText("Press START to take test else press Cancel....");
/*     */     
/* 109 */     this.jButton3.setText("START");
/* 110 */     this.jButton3.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 112 */         Student.this.jButton3ActionPerformed(evt);
/*     */       }
/*     */       
/* 115 */     });
/* 116 */     this.jButton4.setText("CANCEL");
/*     */     
/* 118 */     GroupLayout jDialog1Layout = new GroupLayout(this.jDialog1.getContentPane());
/* 119 */     this.jDialog1.getContentPane().setLayout(jDialog1Layout);
/* 120 */     jDialog1Layout.setHorizontalGroup(jDialog1Layout
/* 121 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 122 */       .addGroup(jDialog1Layout.createSequentialGroup()
/* 123 */       .addGap(35, 35, 35)
/* 124 */       .addComponent(this.jButton3, -2, 73, -2)
/* 125 */       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
/* 126 */       .addComponent(this.jButton4)
/* 127 */       .addGap(50, 50, 50))
/* 128 */       .addGroup(jDialog1Layout.createSequentialGroup()
/* 129 */       .addContainerGap()
/* 130 */       .addComponent(this.jLabel7, -1, 301, 32767)
/* 131 */       .addContainerGap()));
/*     */     
/* 133 */     jDialog1Layout.setVerticalGroup(jDialog1Layout
/* 134 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 135 */       .addGroup(jDialog1Layout.createSequentialGroup()
/* 136 */       .addGap(26, 26, 26)
/* 137 */       .addComponent(this.jLabel7, -2, 69, -2)
/* 138 */       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, 32767)
/* 139 */       .addGroup(jDialog1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 140 */       .addComponent(this.jButton3)
/* 141 */       .addComponent(this.jButton4))
/* 142 */       .addGap(28, 28, 28)));
/*     */     
/*     */ 
/* 145 */     setDefaultCloseOperation(3);
/* 146 */     setBounds(new java.awt.Rectangle(0, 0, 1216, 693));
/* 147 */     setMaximizedBounds(new java.awt.Rectangle(0, 0, 1216, 693));
/* 148 */     setMinimumSize(new java.awt.Dimension(1216, 693));
/* 149 */     setResizable(false);
/* 150 */     setSize(new java.awt.Dimension(1216, 694));
/*     */     
/* 152 */     this.jPanel1.setLayout(null);
/*     */     
/* 154 */     this.jLabel2.setBackground(new Color(0, 102, 153));
/* 155 */     this.jLabel2.setFont(new Font("Trebuchet MS", 0, 64));
/* 156 */     this.jLabel2.setForeground(new Color(255, 255, 255));
/* 157 */     this.jLabel2.setText("  P");
/* 158 */     this.jLabel2.setBorder(new javax.swing.border.LineBorder(new Color(255, 255, 255), 3, true));
/* 159 */     this.jLabel2.setOpaque(true);
/* 160 */     this.jPanel1.add(this.jLabel2);
/* 161 */     this.jLabel2.setBounds(30, 90, 110, 110);
/*     */     
/* 163 */     this.jLabel3.setFont(new Font("Tahoma", 1, 24));
/* 164 */     this.jLabel3.setForeground(new Color(255, 255, 255));
/* 165 */     this.jLabel3.setText("Prashant Upadhyay");
/* 166 */     this.jPanel1.add(this.jLabel3);
/* 167 */     this.jLabel3.setBounds(160, 120, 240, 60);
/*     */     
/* 169 */     this.jLabel8.setFont(new Font("Tahoma", 3, 16));
/* 170 */     this.jLabel8.setForeground(new Color(0, 255, 255));
/* 171 */     this.jLabel8.setText("LOGOUT");
/* 172 */     this.jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
/*     */       public void mouseClicked(java.awt.event.MouseEvent evt) {
/* 174 */         Student.this.jLabel8MouseClicked(evt);
/*     */       }
/* 176 */     });
/* 177 */     this.jPanel1.add(this.jLabel8);
/* 178 */     this.jLabel8.setBounds(410, 140, 90, 40);
/*     */     
/* 180 */     this.jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/book21.jpg")));
/* 181 */     this.jPanel1.add(this.jLabel1);
/* 182 */     this.jLabel1.setBounds(0, 0, 1216, 180);
/*     */     
/* 184 */     this.jLayeredPane1.setBackground(new Color(255, 255, 255));
/* 185 */     this.jLayeredPane1.setOpaque(true);
/*     */     
/* 187 */     this.jTable1.setModel(new DefaultTableModel(new Object[0][], new String[] { "EID", "TITLE", "SUBJECT", "DURATION", "UPLOADED BY", "TOTAL MARKS" })
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 195 */       boolean[] canEdit = { false, false, false, false, false, false };
/*     */       
/*     */ 
/*     */       public boolean isCellEditable(int rowIndex, int columnIndex)
/*     */       {
/* 200 */         return this.canEdit[columnIndex];
/*     */       }
/* 202 */     });
/* 203 */     this.jTable1.getTableHeader().setReorderingAllowed(false);
/* 204 */     this.jScrollPane1.setViewportView(this.jTable1);
/* 205 */     if (this.jTable1.getColumnModel().getColumnCount() > 0) {
/* 206 */       this.jTable1.getColumnModel().getColumn(0).setResizable(false);
/* 207 */       this.jTable1.getColumnModel().getColumn(1).setResizable(false);
/* 208 */       this.jTable1.getColumnModel().getColumn(2).setResizable(false);
/* 209 */       this.jTable1.getColumnModel().getColumn(3).setResizable(false);
/* 210 */       this.jTable1.getColumnModel().getColumn(4).setResizable(false);
/* 211 */       this.jTable1.getColumnModel().getColumn(5).setResizable(false);
/*     */     }
/*     */     
/* 214 */     this.jButton2.setBackground(new Color(0, 153, 255));
/* 215 */     this.jButton2.setFont(new Font("Comic Sans MS", 0, 14));
/* 216 */     this.jButton2.setText("TAKE TEST");
/* 217 */     this.jButton2.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 219 */         Student.this.jButton2ActionPerformed(evt);
/*     */       }
/*     */       
/* 222 */     });
/* 223 */     this.jLayeredPane1.setLayer(this.jScrollPane1, JLayeredPane.DEFAULT_LAYER.intValue());
/* 224 */     this.jLayeredPane1.setLayer(this.jButton2, JLayeredPane.DEFAULT_LAYER.intValue());
/*     */     
/* 226 */     GroupLayout jLayeredPane1Layout = new GroupLayout(this.jLayeredPane1);
/* 227 */     this.jLayeredPane1.setLayout(jLayeredPane1Layout);
/* 228 */     jLayeredPane1Layout.setHorizontalGroup(jLayeredPane1Layout
/* 229 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 230 */       .addGroup(jLayeredPane1Layout.createSequentialGroup()
/* 231 */       .addContainerGap()
/* 232 */       .addComponent(this.jScrollPane1, -1, 900, 32767)
/* 233 */       .addContainerGap())
/* 234 */       .addGroup(GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
/* 235 */       .addContainerGap(-1, 32767)
/* 236 */       .addComponent(this.jButton2, -2, 123, -2)
/* 237 */       .addGap(372, 372, 372)));
/*     */     
/* 239 */     jLayeredPane1Layout.setVerticalGroup(jLayeredPane1Layout
/* 240 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 241 */       .addGroup(jLayeredPane1Layout.createSequentialGroup()
/* 242 */       .addContainerGap()
/* 243 */       .addComponent(this.jScrollPane1, -2, 396, -2)
/* 244 */       .addGap(18, 18, 18)
/* 245 */       .addComponent(this.jButton2, -1, 38, 32767)
/* 246 */       .addGap(27, 27, 27)));
/*     */     
/*     */ 
/* 249 */     this.jPanel1.add(this.jLayeredPane1);
/* 250 */     this.jLayeredPane1.setBounds(300, 200, 920, 490);
/*     */     
/* 252 */     this.jLabel9.setFont(new Font("Tahoma", 0, 20));
/* 253 */     this.jLabel9.setText("FILTERS");
/*     */     
/* 255 */     this.jLabel4.setFont(new Font("Tahoma", 2, 14));
/* 256 */     this.jLabel4.setText(" Uploaded By");
/*     */     
/* 258 */     this.jComboBox1.setFont(new Font("Tahoma", 0, 14));
/* 259 */     this.jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Any" }));
/*     */     
/* 261 */     this.jLabel5.setFont(new Font("Tahoma", 2, 14));
/* 262 */     this.jLabel5.setText(" Subject");
/*     */     
/* 264 */     this.jComboBox2.setFont(new Font("Tahoma", 0, 14));
/* 265 */     this.jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mathematics", "Chemistry", "Biology", "Computers", "Others" }));
/*     */     
/* 267 */     this.jLabel6.setFont(new Font("Tahoma", 2, 14));
/* 268 */     this.jLabel6.setText(" Title contains");
/*     */     
/* 270 */     this.jTextField1.setFont(new Font("Tahoma", 0, 14));
/*     */     
/* 272 */     this.jButton1.setBackground(new Color(0, 153, 255));
/* 273 */     this.jButton1.setFont(new Font("Tahoma", 0, 12));
/* 274 */     this.jButton1.setText("Filter Results");
/* 275 */     this.jButton1.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 277 */         Student.this.jButton1ActionPerformed(evt);
/*     */       }
/*     */       
/* 280 */     });
/* 281 */     GroupLayout jPanel3Layout = new GroupLayout(this.jPanel3);
/* 282 */     this.jPanel3.setLayout(jPanel3Layout);
/* 283 */     jPanel3Layout.setHorizontalGroup(jPanel3Layout
/* 284 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 285 */       .addGroup(jPanel3Layout.createSequentialGroup()
/* 286 */       .addContainerGap()
/* 287 */       .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 288 */       .addComponent(this.jLabel9, -1, -1, 32767)
/* 289 */       .addComponent(this.jLabel4, -1, -1, 32767)
/* 290 */       .addComponent(this.jComboBox1, 0, -1, 32767)
/* 291 */       .addComponent(this.jLabel5, -1, -1, 32767)
/* 292 */       .addComponent(this.jComboBox2, 0, -1, 32767)
/* 293 */       .addComponent(this.jLabel6, -1, -1, 32767)
/* 294 */       .addComponent(this.jTextField1)
/* 295 */       .addGroup(jPanel3Layout.createSequentialGroup()
/* 296 */       .addComponent(this.jButton1, -2, 135, -2)
/* 297 */       .addGap(0, 145, 32767)))
/* 298 */       .addContainerGap()));
/*     */     
/* 300 */     jPanel3Layout.setVerticalGroup(jPanel3Layout
/* 301 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 302 */       .addGroup(jPanel3Layout.createSequentialGroup()
/* 303 */       .addContainerGap()
/* 304 */       .addComponent(this.jLabel9, -2, 54, -2)
/* 305 */       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
/* 306 */       .addComponent(this.jLabel4, -2, 38, -2)
/* 307 */       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
/* 308 */       .addComponent(this.jComboBox1, -2, 41, -2)
/* 309 */       .addGap(18, 18, 18)
/* 310 */       .addComponent(this.jLabel5, -2, 38, -2)
/* 311 */       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
/* 312 */       .addComponent(this.jComboBox2, -2, 41, -2)
/* 313 */       .addGap(18, 18, 18)
/* 314 */       .addComponent(this.jLabel6, -2, 40, -2)
/* 315 */       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
/* 316 */       .addComponent(this.jTextField1, -2, 40, -2)
/* 317 */       .addGap(18, 18, 18)
/* 318 */       .addComponent(this.jButton1, -2, 38, -2)
/* 319 */       .addContainerGap(51, 32767)));
/*     */     
/*     */ 
/* 322 */     this.jPanel1.add(this.jPanel3);
/* 323 */     this.jPanel3.setBounds(0, 200, 300, 490);
/*     */     
/* 325 */     getContentPane().add(this.jPanel1, "Center");
/*     */     
/* 327 */     pack(); }
/*     */   
/*     */   private JLabel jLabel6;
/*     */   private JLabel jLabel7;
/*     */   
/* 332 */   private void jButton1ActionPerformed(ActionEvent evt) { try { while (this.jTable1.getRowCount() > 0)
/*     */       {
/* 334 */         ((DefaultTableModel)this.jTable1.getModel()).removeRow(0);
/*     */       }
/* 336 */       Class.forName("oracle.jdbc.driver.OracleDriver");
/* 337 */       Connection conn = java.sql.DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "password");
/* 338 */       if (this.jComboBox1.getSelectedItem().equals("Any"))
/*     */       {
/* 340 */         if (this.jTextField1.getText().equals("")) {
/* 341 */           String SQL = "Select * from exam where subject=?";
/* 342 */           PreparedStatement st = conn.prepareStatement(SQL);
/* 343 */           st.setString(1, this.jComboBox2.getSelectedItem().toString());
/* 344 */           st.executeQuery();
/* 345 */           ResultSet rs = st.getResultSet();
/* 346 */           while (rs.next())
/*     */           {
/* 348 */             this.dtm.addRow(new Object[] { rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(5), rs.getString(6), rs.getString(7) });
/*     */           }
/*     */         }
/*     */         else
/*     */         {
/* 353 */           String SQL = "Select * from exam where subject=? and title=?";
/* 354 */           PreparedStatement st = conn.prepareStatement(SQL);
/* 355 */           st.setString(1, this.jComboBox2.getSelectedItem().toString());
/* 356 */           st.setString(2, this.jTextField1.getText());
/* 357 */           st.executeQuery();
/* 358 */           ResultSet rs = st.getResultSet();
/* 359 */           while (rs.next())
/*     */           {
/* 361 */             this.dtm.addRow(new Object[] { rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(5), rs.getString(6), rs.getString(7) });
/*     */           }
/*     */           
/*     */         }
/*     */         
/*     */       }
/* 367 */       else if (this.jTextField1.getText().equals("")) {
/* 368 */         String SQL = "Select * from exam where subject=? and tid=?";
/* 369 */         PreparedStatement st = conn.prepareStatement(SQL);
/* 370 */         st.setString(1, this.jComboBox2.getSelectedItem().toString());
/* 371 */         st.setString(2, this.jComboBox1.getSelectedItem().toString());
/* 372 */         st.executeQuery();
/* 373 */         ResultSet rs = st.getResultSet();
/* 374 */         while (rs.next())
/*     */         {
/* 376 */           this.dtm.addRow(new Object[] { rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(5), rs.getString(6), rs.getString(7) });
/*     */         }
/*     */       }
/*     */       else
/*     */       {
/* 381 */         String SQL = "Select * from exam where subject=? and title=? and tid=?";
/* 382 */         PreparedStatement st = conn.prepareStatement(SQL);
/* 383 */         st.setString(1, this.jComboBox2.getSelectedItem().toString());
/* 384 */         st.setString(2, this.jTextField1.getText());
/* 385 */         st.setString(3, this.jComboBox1.getSelectedItem().toString());
/* 386 */         st.executeQuery();
/* 387 */         ResultSet rs = st.getResultSet();
/* 388 */         while (rs.next())
/*     */         {
/* 390 */           this.dtm.addRow(new Object[] { rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(5), rs.getString(6), rs.getString(7) });
/*     */         }
/*     */         
/*     */       }
/*     */     }
/*     */     catch (Exception e)
/*     */     {
/* 397 */       System.out.println(e.getMessage());
/*     */     } }
/*     */   
/*     */   private JLabel jLabel8;
/*     */   
/* 402 */   private void jButton2ActionPerformed(ActionEvent evt) { this.jDialog1.setVisible(true); }
/*     */   
/*     */   private JLabel jLabel9;
/*     */   
/* 406 */   private void jButton3ActionPerformed(ActionEvent evt) { int row = this.jTable1.getSelectedRow();
/* 407 */     String id = this.jTable1.getValueAt(row, 0).toString();
/* 408 */     int total = Integer.parseInt(this.jTable1.getValueAt(row, 5).toString());
/* 409 */     setVisible(false);
/* 410 */     this.jDialog1.dispose();
/*     */     
/* 412 */     new TEST(total, id, this.sid).setVisible(true); }
/*     */   
/*     */   private JLayeredPane jLayeredPane1;
/*     */   
/* 416 */   private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) { dispose();
/* 417 */     new Home().setVisible(true);
/*     */   }
/*     */   
/*     */   private JPanel jPanel1;
/*     */   private JPanel jPanel3;
/*     */   private javax.swing.JScrollPane jScrollPane1;
/*     */   private JTable jTable1;
/*     */   private JTextField jTextField1;
/*     */   public static void main(String[] args) {
/*     */     try {
/* 427 */       for (javax.swing.UIManager.LookAndFeelInfo info : ) {
/* 428 */         if ("Nimbus".equals(info.getName())) {
/* 429 */           javax.swing.UIManager.setLookAndFeel(info.getClassName());
/* 430 */           break;
/*     */         }
/*     */       }
/*     */     } catch (ClassNotFoundException ex) {
/* 434 */       Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (InstantiationException ex) {
/* 436 */       Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (IllegalAccessException ex) {
/* 438 */       Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
/* 440 */       Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 445 */     java.awt.EventQueue.invokeLater(new Runnable() {
/*     */       public void run() {
/* 447 */         new Student(null).setVisible(true);
/*     */       }
/*     */     });
/*     */   }
/*     */ }


/* Location:              C:\Users\Prash\Downloads\Compressed\dist\MCBCExams.jar!\mcbcexams\Student.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */