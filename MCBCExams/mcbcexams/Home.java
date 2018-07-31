/*     */ package mcbcexams;
/*     */ 
/*     */ import javax.swing.JTextField;
/*     */ 
/*     */ public class Home
/*     */   extends javax.swing.JFrame
/*     */ {
/*     */   private javax.swing.JButton jButton1;
/*     */   private javax.swing.JButton jButton2;
/*     */   private javax.swing.JComboBox<String> jComboBox1;
/*     */   
/*  12 */   public Home() { initComponents(); }
/*     */   
/*     */   private javax.swing.JLabel jLabel1;
/*     */   private javax.swing.JLabel jLabel2;
/*     */   private javax.swing.JLabel jLabel3;
/*     */   
/*  18 */   private void initComponents() { this.jLabel4 = new javax.swing.JLabel();
/*  19 */     this.jLabel1 = new javax.swing.JLabel();
/*  20 */     this.jButton1 = new javax.swing.JButton();
/*  21 */     this.jTextField1 = new JTextField();
/*  22 */     this.jPasswordField1 = new javax.swing.JPasswordField();
/*  23 */     this.jLabel3 = new javax.swing.JLabel();
/*  24 */     this.jLabel2 = new javax.swing.JLabel();
/*  25 */     this.jLabel6 = new javax.swing.JLabel();
/*  26 */     this.jTextField2 = new JTextField();
/*  27 */     this.jTextField3 = new JTextField();
/*  28 */     this.jTextField4 = new JTextField();
/*  29 */     this.jPasswordField2 = new javax.swing.JPasswordField();
/*  30 */     this.jComboBox1 = new javax.swing.JComboBox();
/*  31 */     this.jButton2 = new javax.swing.JButton();
/*  32 */     this.jLabel5 = new javax.swing.JLabel();
/*     */     
/*  34 */     setDefaultCloseOperation(3);
/*  35 */     setTitle("MCBC Exams");
/*  36 */     setLocation(new java.awt.Point(0, 0));
/*  37 */     setMaximizedBounds(new java.awt.Rectangle(0, 0, 1231, 694));
/*  38 */     setMaximumSize(getPreferredSize());
/*  39 */     setPreferredSize(new java.awt.Dimension(1231, 720));
/*  40 */     setResizable(false);
/*  41 */     setSize(new java.awt.Dimension(1231, 694));
/*  42 */     getContentPane().setLayout(null);
/*     */     
/*  44 */     this.jLabel4.setFont(new java.awt.Font("Georgia", 0, 18));
/*  45 */     this.jLabel4.setText("Password");
/*  46 */     getContentPane().add(this.jLabel4);
/*  47 */     this.jLabel4.setBounds(950, 30, 150, 30);
/*     */     
/*  49 */     this.jLabel1.setFont(new java.awt.Font("Georgia", 0, 18));
/*  50 */     this.jLabel1.setText("User ID");
/*  51 */     getContentPane().add(this.jLabel1);
/*  52 */     this.jLabel1.setBounds(780, 30, 150, 30);
/*     */     
/*  54 */     this.jButton1.setFont(new java.awt.Font("Georgia", 1, 18));
/*  55 */     this.jButton1.setText("Log In");
/*  56 */     this.jButton1.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  58 */         Home.this.jButton1ActionPerformed(evt);
/*     */       }
/*  60 */     });
/*  61 */     getContentPane().add(this.jButton1);
/*  62 */     this.jButton1.setBounds(1110, 70, 100, 30);
/*     */     
/*  64 */     this.jTextField1.setFont(new java.awt.Font("Georgia", 0, 18));
/*  65 */     getContentPane().add(this.jTextField1);
/*  66 */     this.jTextField1.setBounds(780, 70, 150, 30);
/*     */     
/*  68 */     this.jPasswordField1.setFont(new java.awt.Font("Georgia", 0, 18));
/*  69 */     getContentPane().add(this.jPasswordField1);
/*  70 */     this.jPasswordField1.setBounds(950, 70, 150, 30);
/*     */     
/*  72 */     this.jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/logo3.jpg")));
/*  73 */     getContentPane().add(this.jLabel3);
/*  74 */     this.jLabel3.setBounds(0, 0, 1230, 140);
/*     */     
/*  76 */     this.jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14));
/*  77 */     this.jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/a.jpg")));
/*  78 */     this.jLabel2.setPreferredSize(new java.awt.Dimension(1216, 623));
/*  79 */     getContentPane().add(this.jLabel2);
/*  80 */     this.jLabel2.setBounds(2, 7, 1230, 623);
/*     */     
/*  82 */     this.jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12));
/*  83 */     this.jLabel6.setText("New Here? Join us!");
/*  84 */     getContentPane().add(this.jLabel6);
/*  85 */     this.jLabel6.setBounds(20, 650, 120, 30);
/*     */     
/*  87 */     this.jTextField2.setFont(new java.awt.Font("Times New Roman", 0, 14));
/*  88 */     this.jTextField2.setForeground(new java.awt.Color(153, 153, 153));
/*  89 */     this.jTextField2.setText("First Name");
/*  90 */     this.jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
/*     */       public void mouseClicked(java.awt.event.MouseEvent evt) {
/*  92 */         Home.this.jTextField2MouseClicked(evt);
/*     */       }
/*  94 */     });
/*  95 */     getContentPane().add(this.jTextField2);
/*  96 */     this.jTextField2.setBounds(160, 650, 170, 30);
/*     */     
/*  98 */     this.jTextField3.setFont(new java.awt.Font("Times New Roman", 0, 14));
/*  99 */     this.jTextField3.setForeground(new java.awt.Color(153, 153, 153));
/* 100 */     this.jTextField3.setText("Last Name");
/* 101 */     this.jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
/*     */       public void mouseClicked(java.awt.event.MouseEvent evt) {
/* 103 */         Home.this.jTextField3MouseClicked(evt);
/*     */       }
/* 105 */     });
/* 106 */     getContentPane().add(this.jTextField3);
/* 107 */     this.jTextField3.setBounds(350, 650, 170, 30);
/*     */     
/* 109 */     this.jTextField4.setFont(new java.awt.Font("Times New Roman", 0, 14));
/* 110 */     this.jTextField4.setForeground(new java.awt.Color(153, 153, 153));
/* 111 */     this.jTextField4.setText("Email Address");
/* 112 */     this.jTextField4.addMouseListener(new java.awt.event.MouseAdapter() {
/*     */       public void mouseClicked(java.awt.event.MouseEvent evt) {
/* 114 */         Home.this.jTextField4MouseClicked(evt);
/*     */       }
/* 116 */     });
/* 117 */     getContentPane().add(this.jTextField4);
/* 118 */     this.jTextField4.setBounds(550, 650, 180, 30);
/*     */     
/* 120 */     this.jPasswordField2.setFont(new java.awt.Font("Times New Roman", 0, 14));
/* 121 */     this.jPasswordField2.setForeground(new java.awt.Color(153, 153, 153));
/* 122 */     this.jPasswordField2.setText("password");
/* 123 */     this.jPasswordField2.addMouseListener(new java.awt.event.MouseAdapter() {
/*     */       public void mouseClicked(java.awt.event.MouseEvent evt) {
/* 125 */         Home.this.jPasswordField2MouseClicked(evt);
/*     */       }
/* 127 */     });
/* 128 */     getContentPane().add(this.jPasswordField2);
/* 129 */     this.jPasswordField2.setBounds(760, 650, 170, 30);
/*     */     
/* 131 */     this.jComboBox1.setFont(new java.awt.Font("Times New Roman", 0, 14));
/* 132 */     this.jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Student", "Teacher" }));
/* 133 */     getContentPane().add(this.jComboBox1);
/* 134 */     this.jComboBox1.setBounds(960, 650, 100, 30);
/*     */     
/* 136 */     this.jButton2.setBackground(new java.awt.Color(204, 204, 204));
/* 137 */     this.jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18));
/* 138 */     this.jButton2.setText("Sign Up");
/* 139 */     this.jButton2.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/* 141 */         Home.this.jButton2ActionPerformed(evt);
/*     */       }
/* 143 */     });
/* 144 */     getContentPane().add(this.jButton2);
/* 145 */     this.jButton2.setBounds(1090, 650, 110, 30);
/*     */     
/* 147 */     this.jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/bg1.jpg")));
/* 148 */     getContentPane().add(this.jLabel5);
/* 149 */     this.jLabel5.setBounds(0, 630, 1220, 60);
/*     */     
/* 151 */     pack(); }
/*     */   
/*     */   private javax.swing.JLabel jLabel4;
/*     */   private javax.swing.JLabel jLabel5;
/*     */   
/* 156 */   private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) { try { Class.forName("oracle.jdbc.driver.OracleDriver");
/* 157 */       java.sql.Connection conn = java.sql.DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "password");
/* 158 */       String SQL = "Insert into register values('',?,?,?,?,?)";
/* 159 */       java.sql.PreparedStatement st = conn.prepareStatement(SQL);
/* 160 */       st.setString(1, this.jTextField2.getText());
/* 161 */       st.setString(2, this.jTextField3.getText());
/* 162 */       st.setString(3, this.jTextField4.getText());
/* 163 */       st.setString(4, this.jPasswordField2.getText());
/* 164 */       st.setString(5, this.jComboBox1.getSelectedItem().toString());
/*     */       
/* 166 */       java.awt.Component frame = null;
/* 167 */       javax.swing.Icon icon = null;
/* 168 */       st.executeUpdate();
/* 169 */       javax.swing.JOptionPane.showMessageDialog(frame, "Use your email id as login id");
/*     */     }
/*     */     catch (Exception e)
/*     */     {
/* 173 */       System.out.println(e.getMessage());
/*     */     } }
/*     */   
/*     */   private javax.swing.JLabel jLabel6;
/*     */   
/* 178 */   private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) { this.jTextField2.setForeground(java.awt.Color.black);
/* 179 */     this.jTextField2.setText(""); }
/*     */   
/*     */   private javax.swing.JPasswordField jPasswordField1;
/*     */   
/* 183 */   private void jTextField3MouseClicked(java.awt.event.MouseEvent evt) { this.jTextField3.setForeground(java.awt.Color.black);
/* 184 */     this.jTextField3.setText(""); }
/*     */   
/*     */   private javax.swing.JPasswordField jPasswordField2;
/*     */   
/* 188 */   private void jTextField4MouseClicked(java.awt.event.MouseEvent evt) { this.jTextField4.setForeground(java.awt.Color.black);
/* 189 */     this.jTextField4.setText(""); }
/*     */   
/*     */   private JTextField jTextField1;
/*     */   
/* 193 */   private void jPasswordField2MouseClicked(java.awt.event.MouseEvent evt) { this.jPasswordField2.setForeground(java.awt.Color.black);
/* 194 */     this.jPasswordField2.setText(""); }
/*     */   
/*     */   private JTextField jTextField2;
/*     */   private JTextField jTextField3;
/*     */   private JTextField jTextField4;
/* 199 */   private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) { try { Class.forName("oracle.jdbc.driver.OracleDriver");
/* 200 */       java.sql.Connection conn = java.sql.DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "password");
/* 201 */       String SQL = "Select * from register where email=? and password=?";
/* 202 */       java.sql.PreparedStatement st = conn.prepareStatement(SQL);
/* 203 */       st.setString(1, this.jTextField1.getText());
/* 204 */       st.setString(2, this.jPasswordField1.getText());
/* 205 */       java.sql.ResultSet rs = st.executeQuery();
/* 206 */       if (rs.next())
/*     */       {
/* 208 */         if (rs.getString(6).equals("Student"))
/*     */         {
/* 210 */           Student s = new Student(rs.getString(1), rs.getString(2), rs.getString(3));
/* 211 */           s.setVisible(true);
/* 212 */           setVisible(false);
/*     */         }
/*     */         else
/*     */         {
/* 216 */           Teacher s = new Teacher(rs.getString(1), rs.getString(2), rs.getString(3));
/* 217 */           s.setVisible(true);
/* 218 */           setVisible(false);
/*     */         }
/*     */         
/*     */       }
/*     */       else
/*     */       {
/* 224 */         java.awt.Component frame = null;
/* 225 */         javax.swing.Icon icon = null;
/* 226 */         st.executeUpdate();
/* 227 */         javax.swing.JOptionPane.showMessageDialog(frame, " Wrong Username or Password ");
/*     */       }
/*     */     }
/*     */     catch (Exception e)
/*     */     {
/* 232 */       System.out.println(e.getMessage());
/*     */     }
/*     */   }
/*     */   
/*     */   public static void main(String[] args) {
/*     */     try {
/* 238 */       for (javax.swing.UIManager.LookAndFeelInfo info : ) {
/* 239 */         if ("Nimbus".equals(info.getName())) {
/* 240 */           javax.swing.UIManager.setLookAndFeel(info.getClassName());
/* 241 */           break;
/*     */         }
/*     */       }
/*     */     } catch (ClassNotFoundException ex) {
/* 245 */       java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (InstantiationException ex) {
/* 247 */       java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (IllegalAccessException ex) {
/* 249 */       java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
/* 251 */       java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     }
/*     */     
/* 254 */     java.awt.EventQueue.invokeLater(new Runnable() {
/*     */       public void run() {
/* 256 */         new Home().setVisible(true);
/*     */       }
/*     */     });
/*     */   }
/*     */ }


/* Location:              C:\Users\Prash\Downloads\Compressed\dist\MCBCExams.jar!\mcbcexams\Home.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */