/*      */ package mcbcexams;
/*      */ 
/*      */ import java.awt.event.MouseEvent;
/*      */ import java.io.IOException;
/*      */ import java.util.logging.Level;
/*      */ import java.util.logging.Logger;
/*      */ import javax.swing.BorderFactory;
/*      */ import javax.swing.GroupLayout;
/*      */ import javax.swing.GroupLayout.Alignment;
/*      */ import javax.swing.GroupLayout.ParallelGroup;
/*      */ import javax.swing.GroupLayout.SequentialGroup;
/*      */ import javax.swing.JLabel;
/*      */ 
/*      */ public class TEST extends javax.swing.JFrame
/*      */ {
/*   16 */   javax.swing.table.DefaultTableModel dtm = new javax.swing.table.DefaultTableModel(0, 0);
/*   17 */   String[] header = { "Ques", "Ans" };
/*      */   String url;
/*      */   int total_ques;
/*   20 */   javax.swing.ButtonGroup br = new javax.swing.ButtonGroup();
/*      */   
/*      */   int ques;
/*      */   int time;
/*      */   java.io.BufferedReader fr;
/*      */   int hours;
/*      */   
/*   27 */   private TEST() { throw new UnsupportedOperationException("Not supported yet."); }
/*      */   
/*      */   int min;
/*      */   int sec;
/*      */   
/*      */   class ExamTimer implements Runnable { ExamTimer() {}
/*      */     
/*   34 */     public void run() { for (int i = TEST.this.time; i >= 0; i--) {
/*   35 */         if (i == 0)
/*   36 */           TEST.this.resultDisplay();
/*   37 */         TEST.this.hours = (i / 3600);
/*   38 */         TEST.this.min = ((i - TEST.this.hours * 60 * 60) / 60);
/*   39 */         TEST.this.sec = (i % 60);
/*   40 */         if (TEST.this.sec > 9)
/*   41 */           TEST.this.jLabel40.setText(TEST.this.hours + " : " + TEST.this.min + " : " + TEST.this.sec); else
/*   42 */           TEST.this.jLabel40.setText(TEST.this.hours + " : " + TEST.this.min + " : 0" + TEST.this.sec);
/*      */         try {
/*   44 */           Thread.sleep(1000L);
/*      */         }
/*      */         catch (InterruptedException ex) {
/*   47 */           Logger.getLogger(TEST.class.getName()).log(Level.SEVERE, null, ex); } } } }
/*      */   
/*      */   String SID;
/*      */   String EID;
/*      */   private javax.swing.JButton jButton1;
/*      */   private javax.swing.JButton jButton2;
/*   53 */   public TEST(int count, String id, String sid) { this.total_ques = count;
/*   54 */     this.SID = sid;
/*   55 */     this.EID = id;
/*   56 */     initComponents();
/*   57 */     this.br.add(this.jRadioButton1);
/*   58 */     this.br.add(this.jRadioButton2);
/*   59 */     this.br.add(this.jRadioButton3);
/*   60 */     this.br.add(this.jRadioButton4);
/*   61 */     for (int i = 1; i <= count; i++)
/*      */     {
/*   63 */       switch (i) {
/*      */       case 1: 
/*   65 */         this.jLabel1.setVisible(true); break;
/*   66 */       case 2:  this.jLabel2.setVisible(true); break;
/*   67 */       case 3:  this.jLabel3.setVisible(true); break;
/*   68 */       case 4:  this.jLabel4.setVisible(true); break;
/*   69 */       case 5:  this.jLabel5.setVisible(true); break;
/*   70 */       case 6:  this.jLabel6.setVisible(true); break;
/*   71 */       case 7:  this.jLabel7.setVisible(true); break;
/*   72 */       case 8:  this.jLabel8.setVisible(true); break;
/*   73 */       case 9:  this.jLabel9.setVisible(true); break;
/*   74 */       case 10:  this.jLabel10.setVisible(true); break;
/*   75 */       case 11:  this.jLabel11.setVisible(true); break;
/*   76 */       case 12:  this.jLabel12.setVisible(true); break;
/*   77 */       case 13:  this.jLabel13.setVisible(true); break;
/*   78 */       case 14:  this.jLabel14.setVisible(true); break;
/*   79 */       case 15:  this.jLabel15.setVisible(true); break;
/*   80 */       case 16:  this.jLabel16.setVisible(true); break;
/*   81 */       case 17:  this.jLabel17.setVisible(true); break;
/*   82 */       case 18:  this.jLabel18.setVisible(true); break;
/*   83 */       case 19:  this.jLabel19.setVisible(true); break;
/*   84 */       case 20:  this.jLabel20.setVisible(true); break;
/*   85 */       case 21:  this.jLabel21.setVisible(true); break;
/*   86 */       case 22:  this.jLabel22.setVisible(true); break;
/*   87 */       case 23:  this.jLabel23.setVisible(true); break;
/*   88 */       case 24:  this.jLabel24.setVisible(true); break;
/*   89 */       case 25:  this.jLabel25.setVisible(true); break;
/*   90 */       case 26:  this.jLabel26.setVisible(true); break;
/*   91 */       case 27:  this.jLabel27.setVisible(true); break;
/*   92 */       case 28:  this.jLabel28.setVisible(true); break;
/*   93 */       case 29:  this.jLabel29.setVisible(true); break;
/*   94 */       case 30:  this.jLabel30.setVisible(true);
/*      */       }
/*      */     }
/*   97 */     for (int i = count + 1; i <= 30; i++)
/*      */     {
/*   99 */       switch (i) {
/*      */       case 1: 
/*  101 */         this.jLabel1.setVisible(false); break;
/*  102 */       case 2:  this.jLabel2.setVisible(false); break;
/*  103 */       case 3:  this.jLabel3.setVisible(false); break;
/*  104 */       case 4:  this.jLabel4.setVisible(false); break;
/*  105 */       case 5:  this.jLabel5.setVisible(false); break;
/*  106 */       case 6:  this.jLabel6.setVisible(false); break;
/*  107 */       case 7:  this.jLabel7.setVisible(false); break;
/*  108 */       case 8:  this.jLabel8.setVisible(false); break;
/*  109 */       case 9:  this.jLabel9.setVisible(false); break;
/*  110 */       case 10:  this.jLabel10.setVisible(false); break;
/*  111 */       case 11:  this.jLabel11.setVisible(false); break;
/*  112 */       case 12:  this.jLabel12.setVisible(false); break;
/*  113 */       case 13:  this.jLabel13.setVisible(false); break;
/*  114 */       case 14:  this.jLabel14.setVisible(false); break;
/*  115 */       case 15:  this.jLabel15.setVisible(false); break;
/*  116 */       case 16:  this.jLabel16.setVisible(false); break;
/*  117 */       case 17:  this.jLabel17.setVisible(false); break;
/*  118 */       case 18:  this.jLabel18.setVisible(false); break;
/*  119 */       case 19:  this.jLabel19.setVisible(false); break;
/*  120 */       case 20:  this.jLabel20.setVisible(false); break;
/*  121 */       case 21:  this.jLabel21.setVisible(false); break;
/*  122 */       case 22:  this.jLabel22.setVisible(false); break;
/*  123 */       case 23:  this.jLabel23.setVisible(false); break;
/*  124 */       case 24:  this.jLabel24.setVisible(false); break;
/*  125 */       case 25:  this.jLabel25.setVisible(false); break;
/*  126 */       case 26:  this.jLabel26.setVisible(false); break;
/*  127 */       case 27:  this.jLabel27.setVisible(false); break;
/*  128 */       case 28:  this.jLabel28.setVisible(false); break;
/*  129 */       case 29:  this.jLabel29.setVisible(false); break;
/*  130 */       case 30:  this.jLabel30.setVisible(false);
/*      */       }
/*      */     }
/*  133 */     this.jPanel4.setVisible(false);
/*  134 */     this.dtm.setColumnIdentifiers(this.header);
/*  135 */     this.jTable1.setModel(this.dtm);
/*  136 */     for (int i = 1; i <= count; i++)
/*      */     {
/*  138 */       this.dtm.addRow(new Object[] { Integer.valueOf(-1), Integer.valueOf(0) });
/*      */     }
/*  140 */     this.jLabel1.setBackground(java.awt.Color.YELLOW);
/*  141 */     this.ques = 1;
/*      */     try
/*      */     {
/*  144 */       Class.forName("oracle.jdbc.driver.OracleDriver");
/*  145 */       java.sql.Connection conn = java.sql.DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "password");
/*  146 */       String SQL = "Select * from exam where eid =?";
/*  147 */       java.sql.PreparedStatement st = conn.prepareStatement(SQL);
/*  148 */       st.setString(1, id);
/*  149 */       java.sql.ResultSet rs = st.executeQuery();
/*  150 */       rs.next();
/*  151 */       this.time = rs.getInt(5);
/*  152 */       this.url = rs.getString(8).toString();
/*  153 */       this.fr = new java.io.BufferedReader(new java.io.FileReader(this.url));
/*  154 */       Question q = new Question();
/*  155 */       q.ques = this.fr.readLine();
/*  156 */       q.option1 = this.fr.readLine();
/*  157 */       q.option2 = this.fr.readLine();
/*  158 */       q.option3 = this.fr.readLine();
/*  159 */       q.option4 = this.fr.readLine();
/*  160 */       q.answer = this.fr.readLine();
/*  161 */       this.dtm.setValueAt(q.answer, 0, 1);
/*  162 */       this.jLabel31.setText("Q." + q.ques);
/*  163 */       this.jRadioButton1.setText(q.option1);
/*  164 */       this.jRadioButton2.setText(q.option2);
/*  165 */       this.jRadioButton3.setText(q.option3);
/*  166 */       this.jRadioButton4.setText(q.option4);
/*  167 */       ExamTimer e = new ExamTimer();
/*  168 */       Thread t = new Thread(e);
/*  169 */       t.start();
/*      */     }
/*      */     catch (Exception e)
/*      */     {
/*  173 */       System.out.println(e.getMessage()); } }
/*      */   
/*      */   private javax.swing.JButton jButton3;
/*      */   private javax.swing.JDialog jDialog1;
/*      */   private JLabel jLabel1;
/*      */   private JLabel jLabel10;
/*  179 */   public int getSelectedButtonText(javax.swing.ButtonGroup br) { int option = 1;
/*  180 */     for (java.util.Enumeration<javax.swing.AbstractButton> buttons = br.getElements(); buttons.hasMoreElements();)
/*      */     {
/*  182 */       javax.swing.AbstractButton button = (javax.swing.AbstractButton)buttons.nextElement();
/*      */       
/*  184 */       if (button.isSelected()) {
/*  185 */         return option;
/*      */       }
/*  187 */       option++;
/*      */     }
/*  189 */     return 0; }
/*      */   
/*      */   private JLabel jLabel11;
/*      */   private JLabel jLabel12;
/*  193 */   public void setSelectedButtonText(javax.swing.ButtonGroup br) { int option = Integer.parseInt(this.dtm.getValueAt(this.ques - 1, 0).toString());
/*  194 */     int count = 0;
/*  195 */     for (java.util.Enumeration<javax.swing.AbstractButton> buttons = br.getElements(); buttons.hasMoreElements();) {
/*  196 */       count++;
/*  197 */       javax.swing.AbstractButton button = (javax.swing.AbstractButton)buttons.nextElement();
/*  198 */       if (count == option)
/*      */       {
/*  200 */         button.setSelected(true);
/*  201 */         break;
/*      */       }
/*      */     } }
/*      */   
/*      */   private JLabel jLabel13;
/*      */   private JLabel jLabel14;
/*      */   private JLabel jLabel15;
/*  208 */   public void setBkg(java.awt.Color c) { switch (this.ques) {
/*      */     case 1: 
/*  210 */       this.jLabel1.setBackground(c); break;
/*  211 */     case 2:  this.jLabel2.setBackground(c); break;
/*  212 */     case 3:  this.jLabel3.setBackground(c); break;
/*  213 */     case 4:  this.jLabel4.setBackground(c); break;
/*  214 */     case 5:  this.jLabel5.setBackground(c); break;
/*  215 */     case 6:  this.jLabel6.setBackground(c); break;
/*  216 */     case 7:  this.jLabel7.setBackground(c); break;
/*  217 */     case 8:  this.jLabel8.setBackground(c); break;
/*  218 */     case 9:  this.jLabel9.setBackground(c); break;
/*  219 */     case 10:  this.jLabel10.setBackground(c); break;
/*  220 */     case 11:  this.jLabel11.setBackground(c); break;
/*  221 */     case 12:  this.jLabel12.setBackground(c); break;
/*  222 */     case 13:  this.jLabel13.setBackground(c); break;
/*  223 */     case 14:  this.jLabel14.setBackground(c); break;
/*  224 */     case 15:  this.jLabel15.setBackground(c); break;
/*  225 */     case 16:  this.jLabel16.setBackground(c); break;
/*  226 */     case 17:  this.jLabel17.setBackground(c); break;
/*  227 */     case 18:  this.jLabel18.setBackground(c); break;
/*  228 */     case 19:  this.jLabel19.setBackground(c); break;
/*  229 */     case 20:  this.jLabel20.setBackground(c); break;
/*  230 */     case 21:  this.jLabel21.setBackground(c); break;
/*  231 */     case 22:  this.jLabel22.setBackground(c); break;
/*  232 */     case 23:  this.jLabel23.setBackground(c); break;
/*  233 */     case 24:  this.jLabel24.setBackground(c); break;
/*  234 */     case 25:  this.jLabel25.setBackground(c); break;
/*  235 */     case 26:  this.jLabel26.setBackground(c); break;
/*  236 */     case 27:  this.jLabel27.setBackground(c); break;
/*  237 */     case 28:  this.jLabel28.setBackground(c); break;
/*  238 */     case 29:  this.jLabel29.setBackground(c); break;
/*  239 */     case 30:  this.jLabel30.setBackground(c);
/*      */     }
/*      */   }
/*      */   
/*      */   public void labelMouseBeforeClicked(int ques) throws IOException
/*      */   {
/*  245 */     this.dtm.setValueAt(Integer.valueOf(getSelectedButtonText(this.br)), ques - 1, 0);
/*  246 */     int j = getSelectedButtonText(this.br);
/*  247 */     this.br.clearSelection();
/*  248 */     this.fr.close();
/*  249 */     this.jLabel40.setText(this.hours + " : " + this.min + " : " + this.sec);
/*  250 */     if (j == 0)
/*      */     {
/*  252 */       setBkg(java.awt.Color.RED);
/*      */     }
/*      */     else
/*      */     {
/*  256 */       setBkg(java.awt.Color.GREEN); }
/*      */   }
/*      */   private JLabel jLabel16;
/*      */   private JLabel jLabel17;
/*      */   private JLabel jLabel18;
/*      */   
/*  262 */   public void labelMouseAfterClicked(int ques) throws IOException { setBkg(java.awt.Color.YELLOW);
/*  263 */     this.fr = new java.io.BufferedReader(new java.io.FileReader(this.url));
/*  264 */     Question q = new Question();
/*  265 */     for (int i = 1; i < ques; i++)
/*      */     {
/*  267 */       q.ques = this.fr.readLine();
/*  268 */       q.option1 = this.fr.readLine();
/*  269 */       q.option2 = this.fr.readLine();
/*  270 */       q.option3 = this.fr.readLine();
/*  271 */       q.option4 = this.fr.readLine();
/*  272 */       q.answer = this.fr.readLine();
/*      */     }
/*      */     
/*  275 */     q.ques = this.fr.readLine();
/*  276 */     q.option1 = this.fr.readLine();
/*  277 */     q.option2 = this.fr.readLine();
/*  278 */     q.option3 = this.fr.readLine();
/*  279 */     q.option4 = this.fr.readLine();
/*  280 */     q.answer = this.fr.readLine();
/*  281 */     this.dtm.setValueAt(q.answer, ques - 1, 1);
/*  282 */     this.jLabel31.setText("Q." + q.ques);
/*  283 */     this.jRadioButton1.setText(q.option1);
/*  284 */     this.jRadioButton2.setText(q.option2);
/*  285 */     this.jRadioButton3.setText(q.option3);
/*  286 */     this.jRadioButton4.setText(q.option4);
/*  287 */     setSelectedButtonText(this.br); }
/*      */   
/*      */   private JLabel jLabel19;
/*      */   private JLabel jLabel2;
/*      */   
/*  292 */   public int charToInt(String s) { if (s.equals("A")) return 1;
/*  293 */     if (s.equals("B")) return 2;
/*  294 */     if (s.equals("C")) return 3;
/*  295 */     if (s.equals("D")) return 4;
/*  296 */     return 0; }
/*      */   
/*      */   private JLabel jLabel20;
/*      */   private JLabel jLabel21;
/*      */   
/*  301 */   public void resultDisplay() { int marks = 0;
/*  302 */     for (int i = 0; i < this.total_ques; i++)
/*      */     {
/*  304 */       if (charToInt(this.dtm.getValueAt(i, 1).toString()) == Integer.parseInt(this.dtm.getValueAt(i, 0).toString()))
/*  305 */         marks++;
/*      */     }
/*  307 */     this.jDialog1.setVisible(true);
/*  308 */     this.jLabel35.setText(this.total_ques + "");
/*  309 */     this.jLabel37.setText(marks + "");
/*  310 */     float per = marks * 100 / this.total_ques;
/*  311 */     String percent = per + "";
/*  312 */     System.out.println(percent);
/*  313 */     if (percent.length() > 5)
/*  314 */       percent = percent.substring(0, 5);
/*  315 */     this.jLabel39.setText(percent + " %");
/*      */     
/*  317 */     java.util.GregorianCalendar date = new java.util.GregorianCalendar();
/*  318 */     int day = date.get(5);
/*  319 */     int month = date.get(2);
/*  320 */     int year = date.get(1);
/*  321 */     String submit_on = day + "/" + month + "/" + year;
/*      */     try {
/*  323 */       Class.forName("oracle.jdbc.driver.OracleDriver");
/*  324 */       java.sql.Connection conn = java.sql.DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "password");
/*  325 */       String SQL = "Insert into student values(?,?,?,?)";
/*  326 */       java.sql.PreparedStatement st = conn.prepareStatement(SQL);
/*  327 */       st.setString(1, this.SID);
/*  328 */       st.setString(2, this.EID);
/*  329 */       st.setInt(3, (int)per);
/*  330 */       st.setString(4, submit_on);
/*  331 */       st.executeUpdate();
/*      */     }
/*      */     catch (Exception localException) {}
/*  334 */     setVisible(false);
/*      */   }
/*      */   
/*      */   private JLabel jLabel22;
/*      */   private JLabel jLabel23;
/*      */   
/*      */   private void initComponents() {
/*  341 */     this.jDialog1 = new javax.swing.JDialog();
/*  342 */     this.jLabel33 = new JLabel();
/*  343 */     this.jLabel34 = new JLabel();
/*  344 */     this.jLabel35 = new JLabel();
/*  345 */     this.jLabel36 = new JLabel();
/*  346 */     this.jLabel37 = new JLabel();
/*  347 */     this.jLabel38 = new JLabel();
/*  348 */     this.jLabel39 = new JLabel();
/*  349 */     this.jButton1 = new javax.swing.JButton();
/*  350 */     this.jPanel5 = new javax.swing.JPanel();
/*  351 */     this.jPanel6 = new javax.swing.JPanel();
/*  352 */     this.jPanel1 = new javax.swing.JPanel();
/*  353 */     this.jLabel2 = new JLabel();
/*  354 */     this.jLabel1 = new JLabel();
/*  355 */     this.jLabel3 = new JLabel();
/*  356 */     this.jLabel4 = new JLabel();
/*  357 */     this.jLabel5 = new JLabel();
/*  358 */     this.jLabel6 = new JLabel();
/*  359 */     this.jLabel7 = new JLabel();
/*  360 */     this.jLabel8 = new JLabel();
/*  361 */     this.jLabel9 = new JLabel();
/*  362 */     this.jLabel10 = new JLabel();
/*  363 */     this.jLabel11 = new JLabel();
/*  364 */     this.jLabel12 = new JLabel();
/*  365 */     this.jLabel13 = new JLabel();
/*  366 */     this.jLabel14 = new JLabel();
/*  367 */     this.jLabel15 = new JLabel();
/*  368 */     this.jLabel16 = new JLabel();
/*  369 */     this.jLabel17 = new JLabel();
/*  370 */     this.jLabel18 = new JLabel();
/*  371 */     this.jLabel19 = new JLabel();
/*  372 */     this.jLabel20 = new JLabel();
/*  373 */     this.jLabel21 = new JLabel();
/*  374 */     this.jLabel22 = new JLabel();
/*  375 */     this.jLabel23 = new JLabel();
/*  376 */     this.jLabel24 = new JLabel();
/*  377 */     this.jLabel25 = new JLabel();
/*  378 */     this.jLabel26 = new JLabel();
/*  379 */     this.jLabel27 = new JLabel();
/*  380 */     this.jLabel28 = new JLabel();
/*  381 */     this.jLabel29 = new JLabel();
/*  382 */     this.jLabel30 = new JLabel();
/*  383 */     this.jLabel41 = new JLabel();
/*  384 */     this.jLabel43 = new JLabel();
/*  385 */     this.jLabel44 = new JLabel();
/*  386 */     this.jLabel45 = new JLabel();
/*  387 */     this.jLabel46 = new JLabel();
/*  388 */     this.jLabel47 = new JLabel();
/*  389 */     this.jLabel48 = new JLabel();
/*  390 */     this.jPanel2 = new javax.swing.JPanel();
/*  391 */     this.jScrollPane3 = new javax.swing.JScrollPane();
/*  392 */     this.jLabel31 = new JLabel();
/*  393 */     this.jPanel3 = new javax.swing.JPanel();
/*  394 */     this.jButton2 = new javax.swing.JButton();
/*  395 */     this.jButton3 = new javax.swing.JButton();
/*  396 */     this.jRadioButton1 = new javax.swing.JRadioButton();
/*  397 */     this.jRadioButton2 = new javax.swing.JRadioButton();
/*  398 */     this.jRadioButton3 = new javax.swing.JRadioButton();
/*  399 */     this.jRadioButton4 = new javax.swing.JRadioButton();
/*  400 */     this.jPanel4 = new javax.swing.JPanel();
/*  401 */     this.jScrollPane1 = new javax.swing.JScrollPane();
/*  402 */     this.jTable1 = new javax.swing.JTable();
/*  403 */     this.jSeparator1 = new javax.swing.JSeparator();
/*  404 */     this.jSeparator2 = new javax.swing.JSeparator();
/*  405 */     this.jSeparator3 = new javax.swing.JSeparator();
/*  406 */     this.jPanel7 = new javax.swing.JPanel();
/*  407 */     this.jLabel42 = new JLabel();
/*  408 */     this.jLabel40 = new JLabel();
/*      */     
/*  410 */     this.jDialog1.setBounds(new java.awt.Rectangle(0, 0, 585, 316));
/*  411 */     this.jDialog1.setResizable(false);
/*      */     
/*  413 */     this.jLabel33.setFont(new java.awt.Font("Lucida Sans", 0, 24));
/*  414 */     this.jLabel33.setHorizontalAlignment(0);
/*  415 */     this.jLabel33.setText("RESULT");
/*  416 */     this.jLabel33.setToolTipText("");
/*      */     
/*  418 */     this.jLabel34.setBackground(new java.awt.Color(255, 204, 204));
/*  419 */     this.jLabel34.setFont(new java.awt.Font("Tahoma", 0, 12));
/*  420 */     this.jLabel34.setText("TOTAL QUESTIONS    :");
/*  421 */     this.jLabel34.setBorder(BorderFactory.createEtchedBorder());
/*  422 */     this.jLabel34.setOpaque(true);
/*      */     
/*  424 */     this.jLabel35.setBackground(new java.awt.Color(255, 255, 204));
/*  425 */     this.jLabel35.setFont(new java.awt.Font("Tahoma", 0, 12));
/*  426 */     this.jLabel35.setHorizontalAlignment(0);
/*  427 */     this.jLabel35.setBorder(BorderFactory.createEtchedBorder());
/*  428 */     this.jLabel35.setOpaque(true);
/*      */     
/*  430 */     this.jLabel36.setBackground(new java.awt.Color(255, 204, 204));
/*  431 */     this.jLabel36.setFont(new java.awt.Font("Tahoma", 0, 12));
/*  432 */     this.jLabel36.setText("CORRECT QUESTIONS :");
/*  433 */     this.jLabel36.setBorder(BorderFactory.createEtchedBorder());
/*  434 */     this.jLabel36.setOpaque(true);
/*      */     
/*  436 */     this.jLabel37.setBackground(new java.awt.Color(204, 255, 204));
/*  437 */     this.jLabel37.setFont(new java.awt.Font("Tahoma", 0, 12));
/*  438 */     this.jLabel37.setHorizontalAlignment(0);
/*  439 */     this.jLabel37.setBorder(BorderFactory.createEtchedBorder());
/*  440 */     this.jLabel37.setOpaque(true);
/*      */     
/*  442 */     this.jLabel38.setBackground(new java.awt.Color(255, 204, 204));
/*  443 */     this.jLabel38.setFont(new java.awt.Font("Tahoma", 0, 12));
/*  444 */     this.jLabel38.setText("PERCENTAGE             :");
/*  445 */     this.jLabel38.setBorder(BorderFactory.createEtchedBorder());
/*  446 */     this.jLabel38.setOpaque(true);
/*      */     
/*  448 */     this.jLabel39.setBackground(new java.awt.Color(204, 255, 255));
/*  449 */     this.jLabel39.setFont(new java.awt.Font("Tahoma", 0, 12));
/*  450 */     this.jLabel39.setHorizontalAlignment(0);
/*  451 */     this.jLabel39.setBorder(BorderFactory.createEtchedBorder());
/*  452 */     this.jLabel39.setOpaque(true);
/*      */     
/*  454 */     this.jButton1.setText("OK");
/*  455 */     this.jButton1.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  457 */         TEST.this.jButton1ActionPerformed(evt);
/*      */       }
/*      */       
/*  460 */     });
/*  461 */     GroupLayout jDialog1Layout = new GroupLayout(this.jDialog1.getContentPane());
/*  462 */     this.jDialog1.getContentPane().setLayout(jDialog1Layout);
/*  463 */     jDialog1Layout.setHorizontalGroup(jDialog1Layout
/*  464 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  465 */       .addGroup(GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
/*  466 */       .addContainerGap(-1, 32767)
/*  467 */       .addGroup(jDialog1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
/*  468 */       .addComponent(this.jLabel38, -1, -1, 32767)
/*  469 */       .addComponent(this.jLabel36, GroupLayout.Alignment.LEADING, -1, -1, 32767)
/*  470 */       .addComponent(this.jLabel34, GroupLayout.Alignment.LEADING, -1, -1, 32767))
/*  471 */       .addGap(27, 27, 27)
/*  472 */       .addGroup(jDialog1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
/*  473 */       .addComponent(this.jLabel35, -1, -1, 32767)
/*  474 */       .addComponent(this.jLabel37, -1, -1, 32767)
/*  475 */       .addComponent(this.jLabel39, -1, 124, 32767))
/*  476 */       .addGap(173, 173, 173))
/*  477 */       .addGroup(jDialog1Layout.createSequentialGroup()
/*  478 */       .addGroup(jDialog1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  479 */       .addGroup(jDialog1Layout.createSequentialGroup()
/*  480 */       .addGap(187, 187, 187)
/*  481 */       .addComponent(this.jLabel33, -2, 162, -2))
/*  482 */       .addGroup(jDialog1Layout.createSequentialGroup()
/*  483 */       .addGap(255, 255, 255)
/*  484 */       .addComponent(this.jButton1)))
/*  485 */       .addContainerGap(236, 32767)));
/*      */     
/*  487 */     jDialog1Layout.setVerticalGroup(jDialog1Layout
/*  488 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  489 */       .addGroup(jDialog1Layout.createSequentialGroup()
/*  490 */       .addGap(38, 38, 38)
/*  491 */       .addComponent(this.jLabel33, -2, 45, -2)
/*  492 */       .addGap(18, 18, 18)
/*  493 */       .addGroup(jDialog1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  494 */       .addComponent(this.jLabel34, -2, 35, -2)
/*  495 */       .addComponent(this.jLabel35, -2, 35, -2))
/*  496 */       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
/*  497 */       .addGroup(jDialog1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
/*  498 */       .addComponent(this.jLabel36, -1, 34, 32767)
/*  499 */       .addComponent(this.jLabel37, -1, -1, 32767))
/*  500 */       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
/*  501 */       .addGroup(jDialog1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
/*  502 */       .addComponent(this.jLabel38, -2, 35, -2)
/*  503 */       .addComponent(this.jLabel39, -1, -1, 32767))
/*  504 */       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, 32767)
/*  505 */       .addComponent(this.jButton1, -2, 35, -2)
/*  506 */       .addContainerGap()));
/*      */     
/*      */ 
/*  509 */     GroupLayout jPanel5Layout = new GroupLayout(this.jPanel5);
/*  510 */     this.jPanel5.setLayout(jPanel5Layout);
/*  511 */     jPanel5Layout.setHorizontalGroup(jPanel5Layout
/*  512 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  513 */       .addGap(0, 100, 32767));
/*      */     
/*  515 */     jPanel5Layout.setVerticalGroup(jPanel5Layout
/*  516 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  517 */       .addGap(0, 100, 32767));
/*      */     
/*      */ 
/*  520 */     GroupLayout jPanel6Layout = new GroupLayout(this.jPanel6);
/*  521 */     this.jPanel6.setLayout(jPanel6Layout);
/*  522 */     jPanel6Layout.setHorizontalGroup(jPanel6Layout
/*  523 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  524 */       .addGap(0, 100, 32767));
/*      */     
/*  526 */     jPanel6Layout.setVerticalGroup(jPanel6Layout
/*  527 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  528 */       .addGap(0, 100, 32767));
/*      */     
/*      */ 
/*  531 */     setDefaultCloseOperation(3);
/*  532 */     setResizable(false);
/*      */     
/*  534 */     this.jPanel1.setBackground(new java.awt.Color(204, 204, 255));
/*  535 */     this.jPanel1.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
/*      */     
/*  537 */     this.jLabel2.setHorizontalAlignment(0);
/*  538 */     this.jLabel2.setText("2");
/*  539 */     this.jLabel2.setBorder(BorderFactory.createBevelBorder(0));
/*  540 */     this.jLabel2.setOpaque(true);
/*  541 */     this.jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
/*      */       public void mouseClicked(MouseEvent evt) {
/*  543 */         TEST.this.jLabel2MouseClicked(evt);
/*      */       }
/*      */       
/*  546 */     });
/*  547 */     this.jLabel1.setHorizontalAlignment(0);
/*  548 */     this.jLabel1.setText("1");
/*  549 */     this.jLabel1.setBorder(BorderFactory.createBevelBorder(0));
/*  550 */     this.jLabel1.setOpaque(true);
/*  551 */     this.jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
/*      */       public void mouseClicked(MouseEvent evt) {
/*  553 */         TEST.this.jLabel1MouseClicked(evt);
/*      */       }
/*      */       
/*  556 */     });
/*  557 */     this.jLabel3.setHorizontalAlignment(0);
/*  558 */     this.jLabel3.setText("3");
/*  559 */     this.jLabel3.setBorder(BorderFactory.createBevelBorder(0));
/*  560 */     this.jLabel3.setOpaque(true);
/*  561 */     this.jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
/*      */       public void mouseClicked(MouseEvent evt) {
/*  563 */         TEST.this.jLabel3MouseClicked(evt);
/*      */       }
/*      */       
/*  566 */     });
/*  567 */     this.jLabel4.setHorizontalAlignment(0);
/*  568 */     this.jLabel4.setText("4");
/*  569 */     this.jLabel4.setBorder(BorderFactory.createBevelBorder(0));
/*  570 */     this.jLabel4.setOpaque(true);
/*  571 */     this.jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
/*      */       public void mouseClicked(MouseEvent evt) {
/*  573 */         TEST.this.jLabel4MouseClicked(evt);
/*      */       }
/*      */       
/*  576 */     });
/*  577 */     this.jLabel5.setHorizontalAlignment(0);
/*  578 */     this.jLabel5.setText("5");
/*  579 */     this.jLabel5.setBorder(BorderFactory.createBevelBorder(0));
/*  580 */     this.jLabel5.setOpaque(true);
/*  581 */     this.jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
/*      */       public void mouseClicked(MouseEvent evt) {
/*  583 */         TEST.this.jLabel5MouseClicked(evt);
/*      */       }
/*      */       
/*  586 */     });
/*  587 */     this.jLabel6.setHorizontalAlignment(0);
/*  588 */     this.jLabel6.setText("6");
/*  589 */     this.jLabel6.setBorder(BorderFactory.createBevelBorder(0));
/*  590 */     this.jLabel6.setOpaque(true);
/*  591 */     this.jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
/*      */       public void mouseClicked(MouseEvent evt) {
/*  593 */         TEST.this.jLabel6MouseClicked(evt);
/*      */       }
/*      */       
/*  596 */     });
/*  597 */     this.jLabel7.setHorizontalAlignment(0);
/*  598 */     this.jLabel7.setText("7");
/*  599 */     this.jLabel7.setBorder(BorderFactory.createBevelBorder(0));
/*  600 */     this.jLabel7.setOpaque(true);
/*  601 */     this.jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
/*      */       public void mouseClicked(MouseEvent evt) {
/*  603 */         TEST.this.jLabel7MouseClicked(evt);
/*      */       }
/*      */       
/*  606 */     });
/*  607 */     this.jLabel8.setHorizontalAlignment(0);
/*  608 */     this.jLabel8.setText("8");
/*  609 */     this.jLabel8.setBorder(BorderFactory.createBevelBorder(0));
/*  610 */     this.jLabel8.setOpaque(true);
/*  611 */     this.jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
/*      */       public void mouseClicked(MouseEvent evt) {
/*  613 */         TEST.this.jLabel8MouseClicked(evt);
/*      */       }
/*      */       
/*  616 */     });
/*  617 */     this.jLabel9.setHorizontalAlignment(0);
/*  618 */     this.jLabel9.setText("9");
/*  619 */     this.jLabel9.setBorder(BorderFactory.createBevelBorder(0));
/*  620 */     this.jLabel9.setOpaque(true);
/*  621 */     this.jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
/*      */       public void mouseClicked(MouseEvent evt) {
/*  623 */         TEST.this.jLabel9MouseClicked(evt);
/*      */       }
/*      */       
/*  626 */     });
/*  627 */     this.jLabel10.setHorizontalAlignment(0);
/*  628 */     this.jLabel10.setText("10");
/*  629 */     this.jLabel10.setBorder(BorderFactory.createBevelBorder(0));
/*  630 */     this.jLabel10.setOpaque(true);
/*  631 */     this.jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
/*      */       public void mouseClicked(MouseEvent evt) {
/*  633 */         TEST.this.jLabel10MouseClicked(evt);
/*      */       }
/*      */       
/*  636 */     });
/*  637 */     this.jLabel11.setHorizontalAlignment(0);
/*  638 */     this.jLabel11.setText("11");
/*  639 */     this.jLabel11.setBorder(BorderFactory.createBevelBorder(0));
/*  640 */     this.jLabel11.setOpaque(true);
/*  641 */     this.jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
/*      */       public void mouseClicked(MouseEvent evt) {
/*  643 */         TEST.this.jLabel11MouseClicked(evt);
/*      */       }
/*      */       
/*  646 */     });
/*  647 */     this.jLabel12.setHorizontalAlignment(0);
/*  648 */     this.jLabel12.setText("12");
/*  649 */     this.jLabel12.setBorder(BorderFactory.createBevelBorder(0));
/*  650 */     this.jLabel12.setOpaque(true);
/*  651 */     this.jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
/*      */       public void mouseClicked(MouseEvent evt) {
/*  653 */         TEST.this.jLabel12MouseClicked(evt);
/*      */       }
/*      */       
/*  656 */     });
/*  657 */     this.jLabel13.setHorizontalAlignment(0);
/*  658 */     this.jLabel13.setText("13");
/*  659 */     this.jLabel13.setBorder(BorderFactory.createBevelBorder(0));
/*  660 */     this.jLabel13.setOpaque(true);
/*  661 */     this.jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
/*      */       public void mouseClicked(MouseEvent evt) {
/*  663 */         TEST.this.jLabel13MouseClicked(evt);
/*      */       }
/*      */       
/*  666 */     });
/*  667 */     this.jLabel14.setHorizontalAlignment(0);
/*  668 */     this.jLabel14.setText("14");
/*  669 */     this.jLabel14.setBorder(BorderFactory.createBevelBorder(0));
/*  670 */     this.jLabel14.setOpaque(true);
/*  671 */     this.jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
/*      */       public void mouseClicked(MouseEvent evt) {
/*  673 */         TEST.this.jLabel14MouseClicked(evt);
/*      */       }
/*      */       
/*  676 */     });
/*  677 */     this.jLabel15.setHorizontalAlignment(0);
/*  678 */     this.jLabel15.setText("15");
/*  679 */     this.jLabel15.setBorder(BorderFactory.createBevelBorder(0));
/*  680 */     this.jLabel15.setOpaque(true);
/*  681 */     this.jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
/*      */       public void mouseClicked(MouseEvent evt) {
/*  683 */         TEST.this.jLabel15MouseClicked(evt);
/*      */       }
/*      */       
/*  686 */     });
/*  687 */     this.jLabel16.setHorizontalAlignment(0);
/*  688 */     this.jLabel16.setText("16");
/*  689 */     this.jLabel16.setBorder(BorderFactory.createBevelBorder(0));
/*  690 */     this.jLabel16.setOpaque(true);
/*  691 */     this.jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
/*      */       public void mouseClicked(MouseEvent evt) {
/*  693 */         TEST.this.jLabel16MouseClicked(evt);
/*      */       }
/*      */       
/*  696 */     });
/*  697 */     this.jLabel17.setHorizontalAlignment(0);
/*  698 */     this.jLabel17.setText("17");
/*  699 */     this.jLabel17.setBorder(BorderFactory.createBevelBorder(0));
/*  700 */     this.jLabel17.setOpaque(true);
/*  701 */     this.jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
/*      */       public void mouseClicked(MouseEvent evt) {
/*  703 */         TEST.this.jLabel17MouseClicked(evt);
/*      */       }
/*      */       
/*  706 */     });
/*  707 */     this.jLabel18.setHorizontalAlignment(0);
/*  708 */     this.jLabel18.setText("18");
/*  709 */     this.jLabel18.setBorder(BorderFactory.createBevelBorder(0));
/*  710 */     this.jLabel18.setOpaque(true);
/*  711 */     this.jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
/*      */       public void mouseClicked(MouseEvent evt) {
/*  713 */         TEST.this.jLabel18MouseClicked(evt);
/*      */       }
/*      */       
/*  716 */     });
/*  717 */     this.jLabel19.setHorizontalAlignment(0);
/*  718 */     this.jLabel19.setText("19");
/*  719 */     this.jLabel19.setBorder(BorderFactory.createBevelBorder(0));
/*  720 */     this.jLabel19.setOpaque(true);
/*  721 */     this.jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
/*      */       public void mouseClicked(MouseEvent evt) {
/*  723 */         TEST.this.jLabel19MouseClicked(evt);
/*      */       }
/*      */       
/*  726 */     });
/*  727 */     this.jLabel20.setHorizontalAlignment(0);
/*  728 */     this.jLabel20.setText("20");
/*  729 */     this.jLabel20.setBorder(BorderFactory.createBevelBorder(0));
/*  730 */     this.jLabel20.setOpaque(true);
/*  731 */     this.jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
/*      */       public void mouseClicked(MouseEvent evt) {
/*  733 */         TEST.this.jLabel20MouseClicked(evt);
/*      */       }
/*      */       
/*  736 */     });
/*  737 */     this.jLabel21.setHorizontalAlignment(0);
/*  738 */     this.jLabel21.setText("21");
/*  739 */     this.jLabel21.setBorder(BorderFactory.createBevelBorder(0));
/*  740 */     this.jLabel21.setOpaque(true);
/*  741 */     this.jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
/*      */       public void mouseClicked(MouseEvent evt) {
/*  743 */         TEST.this.jLabel21MouseClicked(evt);
/*      */       }
/*      */       
/*  746 */     });
/*  747 */     this.jLabel22.setHorizontalAlignment(0);
/*  748 */     this.jLabel22.setText("22");
/*  749 */     this.jLabel22.setBorder(BorderFactory.createBevelBorder(0));
/*  750 */     this.jLabel22.setOpaque(true);
/*  751 */     this.jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
/*      */       public void mouseClicked(MouseEvent evt) {
/*  753 */         TEST.this.jLabel22MouseClicked(evt);
/*      */       }
/*      */       
/*  756 */     });
/*  757 */     this.jLabel23.setHorizontalAlignment(0);
/*  758 */     this.jLabel23.setText("23");
/*  759 */     this.jLabel23.setBorder(BorderFactory.createBevelBorder(0));
/*  760 */     this.jLabel23.setOpaque(true);
/*  761 */     this.jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
/*      */       public void mouseClicked(MouseEvent evt) {
/*  763 */         TEST.this.jLabel23MouseClicked(evt);
/*      */       }
/*      */       
/*  766 */     });
/*  767 */     this.jLabel24.setHorizontalAlignment(0);
/*  768 */     this.jLabel24.setText("24");
/*  769 */     this.jLabel24.setBorder(BorderFactory.createBevelBorder(0));
/*  770 */     this.jLabel24.setOpaque(true);
/*  771 */     this.jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
/*      */       public void mouseClicked(MouseEvent evt) {
/*  773 */         TEST.this.jLabel24MouseClicked(evt);
/*      */       }
/*      */       
/*  776 */     });
/*  777 */     this.jLabel25.setHorizontalAlignment(0);
/*  778 */     this.jLabel25.setText("25");
/*  779 */     this.jLabel25.setBorder(BorderFactory.createBevelBorder(0));
/*  780 */     this.jLabel25.setOpaque(true);
/*  781 */     this.jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
/*      */       public void mouseClicked(MouseEvent evt) {
/*  783 */         TEST.this.jLabel25MouseClicked(evt);
/*      */       }
/*      */       
/*  786 */     });
/*  787 */     this.jLabel26.setHorizontalAlignment(0);
/*  788 */     this.jLabel26.setText("26");
/*  789 */     this.jLabel26.setBorder(BorderFactory.createBevelBorder(0));
/*  790 */     this.jLabel26.setOpaque(true);
/*  791 */     this.jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
/*      */       public void mouseClicked(MouseEvent evt) {
/*  793 */         TEST.this.jLabel26MouseClicked(evt);
/*      */       }
/*      */       
/*  796 */     });
/*  797 */     this.jLabel27.setHorizontalAlignment(0);
/*  798 */     this.jLabel27.setText("27");
/*  799 */     this.jLabel27.setBorder(BorderFactory.createBevelBorder(0));
/*  800 */     this.jLabel27.setOpaque(true);
/*  801 */     this.jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
/*      */       public void mouseClicked(MouseEvent evt) {
/*  803 */         TEST.this.jLabel27MouseClicked(evt);
/*      */       }
/*      */       
/*  806 */     });
/*  807 */     this.jLabel28.setHorizontalAlignment(0);
/*  808 */     this.jLabel28.setText("28");
/*  809 */     this.jLabel28.setBorder(BorderFactory.createBevelBorder(0));
/*  810 */     this.jLabel28.setOpaque(true);
/*  811 */     this.jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
/*      */       public void mouseClicked(MouseEvent evt) {
/*  813 */         TEST.this.jLabel28MouseClicked(evt);
/*      */       }
/*      */       
/*  816 */     });
/*  817 */     this.jLabel29.setHorizontalAlignment(0);
/*  818 */     this.jLabel29.setText("29");
/*  819 */     this.jLabel29.setBorder(BorderFactory.createBevelBorder(0));
/*  820 */     this.jLabel29.setOpaque(true);
/*  821 */     this.jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
/*      */       public void mouseClicked(MouseEvent evt) {
/*  823 */         TEST.this.jLabel29MouseClicked(evt);
/*      */       }
/*      */       
/*  826 */     });
/*  827 */     this.jLabel30.setHorizontalAlignment(0);
/*  828 */     this.jLabel30.setText("30");
/*  829 */     this.jLabel30.setBorder(BorderFactory.createBevelBorder(0));
/*  830 */     this.jLabel30.setOpaque(true);
/*  831 */     this.jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
/*      */       public void mouseClicked(MouseEvent evt) {
/*  833 */         TEST.this.jLabel30MouseClicked(evt);
/*      */       }
/*      */       
/*  836 */     });
/*  837 */     this.jLabel41.setFont(new java.awt.Font("Tahoma", 3, 12));
/*  838 */     this.jLabel41.setText("Question Pallete");
/*      */     
/*  840 */     this.jLabel43.setBackground(java.awt.Color.red);
/*  841 */     this.jLabel43.setHorizontalAlignment(0);
/*  842 */     this.jLabel43.setBorder(BorderFactory.createBevelBorder(0));
/*  843 */     this.jLabel43.setOpaque(true);
/*      */     
/*  845 */     this.jLabel44.setText("Not Answered");
/*      */     
/*  847 */     this.jLabel45.setBackground(java.awt.Color.green);
/*  848 */     this.jLabel45.setHorizontalAlignment(0);
/*  849 */     this.jLabel45.setBorder(BorderFactory.createBevelBorder(0));
/*  850 */     this.jLabel45.setOpaque(true);
/*      */     
/*  852 */     this.jLabel46.setText("Answered");
/*      */     
/*  854 */     this.jLabel47.setBackground(java.awt.Color.yellow);
/*  855 */     this.jLabel47.setHorizontalAlignment(0);
/*  856 */     this.jLabel47.setBorder(BorderFactory.createBevelBorder(0));
/*  857 */     this.jLabel47.setOpaque(true);
/*      */     
/*  859 */     this.jLabel48.setText("Current Ques");
/*      */     
/*  861 */     GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
/*  862 */     this.jPanel1.setLayout(jPanel1Layout);
/*  863 */     jPanel1Layout.setHorizontalGroup(jPanel1Layout
/*  864 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  865 */       .addGroup(jPanel1Layout.createSequentialGroup()
/*  866 */       .addContainerGap()
/*  867 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  868 */       .addComponent(this.jLabel41, -1, -1, 32767)
/*  869 */       .addGroup(jPanel1Layout.createSequentialGroup()
/*  870 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  871 */       .addGroup(jPanel1Layout.createSequentialGroup()
/*  872 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  873 */       .addComponent(this.jLabel4, -2, 20, -2)
/*  874 */       .addComponent(this.jLabel7, -2, 20, -2)
/*  875 */       .addComponent(this.jLabel10, -2, 20, -2)
/*  876 */       .addComponent(this.jLabel13, -2, 20, -2)
/*  877 */       .addComponent(this.jLabel16, -2, 20, -2)
/*  878 */       .addComponent(this.jLabel19, -2, 20, -2)
/*  879 */       .addComponent(this.jLabel22, -2, 20, -2)
/*  880 */       .addComponent(this.jLabel25, -2, 20, -2)
/*  881 */       .addComponent(this.jLabel28, -2, 20, -2)
/*  882 */       .addComponent(this.jLabel1, -2, 20, -2))
/*  883 */       .addGap(18, 18, 18)
/*  884 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  885 */       .addComponent(this.jLabel5, -2, 20, -2)
/*  886 */       .addComponent(this.jLabel8, -2, 20, -2)
/*  887 */       .addComponent(this.jLabel11, -2, 20, -2)
/*  888 */       .addComponent(this.jLabel14, -2, 20, -2)
/*  889 */       .addComponent(this.jLabel17, -2, 20, -2)
/*  890 */       .addComponent(this.jLabel20, -2, 20, -2)
/*  891 */       .addComponent(this.jLabel23, -2, 20, -2)
/*  892 */       .addComponent(this.jLabel26, -2, 20, -2)
/*  893 */       .addComponent(this.jLabel29, -2, 20, -2)
/*  894 */       .addComponent(this.jLabel2, -2, 20, -2))
/*  895 */       .addGap(18, 18, 18)
/*  896 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  897 */       .addComponent(this.jLabel6, -2, 20, -2)
/*  898 */       .addComponent(this.jLabel9, -2, 20, -2)
/*  899 */       .addComponent(this.jLabel12, -2, 20, -2)
/*  900 */       .addComponent(this.jLabel15, -2, 20, -2)
/*  901 */       .addComponent(this.jLabel18, -2, 20, -2)
/*  902 */       .addComponent(this.jLabel21, -2, 20, -2)
/*  903 */       .addComponent(this.jLabel24, -2, 20, -2)
/*  904 */       .addComponent(this.jLabel27, -2, 20, -2)
/*  905 */       .addComponent(this.jLabel30, -2, 20, -2)
/*  906 */       .addComponent(this.jLabel3, -2, 20, -2))
/*  907 */       .addGap(0, 0, 32767))
/*  908 */       .addGroup(jPanel1Layout.createSequentialGroup()
/*  909 */       .addComponent(this.jLabel43, -2, 20, -2)
/*  910 */       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
/*  911 */       .addComponent(this.jLabel44, -1, 69, 32767))
/*  912 */       .addGroup(jPanel1Layout.createSequentialGroup()
/*  913 */       .addComponent(this.jLabel45, -2, 20, -2)
/*  914 */       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
/*  915 */       .addComponent(this.jLabel46, -1, -1, 32767))
/*  916 */       .addGroup(jPanel1Layout.createSequentialGroup()
/*  917 */       .addComponent(this.jLabel47, -2, 20, -2)
/*  918 */       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
/*  919 */       .addComponent(this.jLabel48, -1, -1, 32767)))
/*  920 */       .addContainerGap()))));
/*      */     
/*  922 */     jPanel1Layout.setVerticalGroup(jPanel1Layout
/*  923 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  924 */       .addGroup(jPanel1Layout.createSequentialGroup()
/*  925 */       .addContainerGap()
/*  926 */       .addComponent(this.jLabel41, -2, 25, -2)
/*  927 */       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
/*  928 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/*  929 */       .addComponent(this.jLabel1, -2, 22, -2)
/*  930 */       .addComponent(this.jLabel2, -2, 22, -2)
/*  931 */       .addComponent(this.jLabel3, -2, 22, -2))
/*  932 */       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
/*  933 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/*  934 */       .addComponent(this.jLabel4, -2, 22, -2)
/*  935 */       .addComponent(this.jLabel5, -2, 22, -2)
/*  936 */       .addComponent(this.jLabel6, -2, 22, -2))
/*  937 */       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
/*  938 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/*  939 */       .addComponent(this.jLabel7, -2, 22, -2)
/*  940 */       .addComponent(this.jLabel8, -2, 22, -2)
/*  941 */       .addComponent(this.jLabel9, -2, 22, -2))
/*  942 */       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
/*  943 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/*  944 */       .addComponent(this.jLabel10, -2, 22, -2)
/*  945 */       .addComponent(this.jLabel11, -2, 22, -2)
/*  946 */       .addComponent(this.jLabel12, -2, 22, -2))
/*  947 */       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
/*  948 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/*  949 */       .addComponent(this.jLabel13, -2, 22, -2)
/*  950 */       .addComponent(this.jLabel14, -2, 22, -2)
/*  951 */       .addComponent(this.jLabel15, -2, 22, -2))
/*  952 */       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
/*  953 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/*  954 */       .addComponent(this.jLabel16, -2, 22, -2)
/*  955 */       .addComponent(this.jLabel17, -2, 22, -2)
/*  956 */       .addComponent(this.jLabel18, -2, 22, -2))
/*  957 */       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
/*  958 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/*  959 */       .addComponent(this.jLabel19, -2, 22, -2)
/*  960 */       .addComponent(this.jLabel20, -2, 22, -2)
/*  961 */       .addComponent(this.jLabel21, -2, 22, -2))
/*  962 */       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
/*  963 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/*  964 */       .addComponent(this.jLabel22, -2, 22, -2)
/*  965 */       .addComponent(this.jLabel23, -2, 22, -2)
/*  966 */       .addComponent(this.jLabel24, -2, 22, -2))
/*  967 */       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
/*  968 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/*  969 */       .addComponent(this.jLabel25, -2, 22, -2)
/*  970 */       .addComponent(this.jLabel26, -2, 22, -2)
/*  971 */       .addComponent(this.jLabel27, -2, 22, -2))
/*  972 */       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
/*  973 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/*  974 */       .addComponent(this.jLabel28, -2, 22, -2)
/*  975 */       .addComponent(this.jLabel29, -2, 22, -2)
/*  976 */       .addComponent(this.jLabel30, -2, 22, -2))
/*  977 */       .addGap(17, 17, 17)
/*  978 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
/*  979 */       .addComponent(this.jLabel43, -1, -1, 32767)
/*  980 */       .addComponent(this.jLabel44, -2, 22, -2))
/*  981 */       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
/*  982 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
/*  983 */       .addComponent(this.jLabel45, -1, -1, 32767)
/*  984 */       .addComponent(this.jLabel46, -2, 22, -2))
/*  985 */       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
/*  986 */       .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
/*  987 */       .addComponent(this.jLabel47, -1, -1, 32767)
/*  988 */       .addComponent(this.jLabel48, -2, 22, -2))
/*  989 */       .addContainerGap(-1, 32767)));
/*      */     
/*      */ 
/*  992 */     this.jPanel2.setBackground(new java.awt.Color(204, 255, 204));
/*      */     
/*  994 */     this.jLabel31.setBackground(new java.awt.Color(204, 255, 204));
/*  995 */     this.jLabel31.setFont(new java.awt.Font("Tahoma", 1, 14));
/*  996 */     this.jLabel31.setText("jLabel31");
/*  997 */     this.jLabel31.setAutoscrolls(true);
/*  998 */     this.jLabel31.setOpaque(true);
/*  999 */     this.jScrollPane3.setViewportView(this.jLabel31);
/*      */     
/* 1001 */     GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
/* 1002 */     this.jPanel2.setLayout(jPanel2Layout);
/* 1003 */     jPanel2Layout.setHorizontalGroup(jPanel2Layout
/* 1004 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 1005 */       .addComponent(this.jScrollPane3, -1, 659, 32767));
/*      */     
/* 1007 */     jPanel2Layout.setVerticalGroup(jPanel2Layout
/* 1008 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 1009 */       .addComponent(this.jScrollPane3, -1, 100, 32767));
/*      */     
/*      */ 
/* 1012 */     this.jButton2.setBackground(new java.awt.Color(204, 204, 255));
/* 1013 */     this.jButton2.setText("NEXT");
/* 1014 */     this.jButton2.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/* 1016 */         TEST.this.jButton2ActionPerformed(evt);
/*      */       }
/*      */       
/* 1019 */     });
/* 1020 */     this.jButton3.setBackground(new java.awt.Color(204, 204, 255));
/* 1021 */     this.jButton3.setText("FINISH");
/* 1022 */     this.jButton3.addActionListener(new java.awt.event.ActionListener() {
/*      */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/* 1024 */         TEST.this.jButton3ActionPerformed(evt);
/*      */       }
/*      */       
/* 1027 */     });
/* 1028 */     this.jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 12));
/* 1029 */     this.jRadioButton1.setText("jRadioButton1");
/*      */     
/* 1031 */     this.jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 12));
/* 1032 */     this.jRadioButton2.setText("jRadioButton2");
/*      */     
/* 1034 */     this.jRadioButton3.setFont(new java.awt.Font("Tahoma", 0, 12));
/* 1035 */     this.jRadioButton3.setText("jRadioButton3");
/*      */     
/* 1037 */     this.jRadioButton4.setFont(new java.awt.Font("Tahoma", 0, 12));
/* 1038 */     this.jRadioButton4.setText("jRadioButton4");
/*      */     
/* 1040 */     GroupLayout jPanel3Layout = new GroupLayout(this.jPanel3);
/* 1041 */     this.jPanel3.setLayout(jPanel3Layout);
/* 1042 */     jPanel3Layout.setHorizontalGroup(jPanel3Layout
/* 1043 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 1044 */       .addGroup(jPanel3Layout.createSequentialGroup()
/* 1045 */       .addGap(28, 28, 28)
/* 1046 */       .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 1047 */       .addComponent(this.jRadioButton1, -1, -1, 32767)
/* 1048 */       .addComponent(this.jRadioButton2, -1, -1, 32767)
/* 1049 */       .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
/* 1050 */       .addComponent(this.jButton2, -2, 74, -2)
/* 1051 */       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 467, 32767)
/* 1052 */       .addComponent(this.jButton3))
/* 1053 */       .addComponent(this.jRadioButton3, -1, -1, 32767)
/* 1054 */       .addComponent(this.jRadioButton4, -1, -1, 32767))
/* 1055 */       .addGap(36, 36, 36)));
/*      */     
/* 1057 */     jPanel3Layout.setVerticalGroup(jPanel3Layout
/* 1058 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 1059 */       .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
/* 1060 */       .addGap(16, 16, 16)
/* 1061 */       .addComponent(this.jRadioButton1)
/* 1062 */       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
/* 1063 */       .addComponent(this.jRadioButton2)
/* 1064 */       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
/* 1065 */       .addComponent(this.jRadioButton3)
/* 1066 */       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
/* 1067 */       .addComponent(this.jRadioButton4)
/* 1068 */       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, 32767)
/* 1069 */       .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 1070 */       .addComponent(this.jButton2)
/* 1071 */       .addComponent(this.jButton3))
/* 1072 */       .addGap(19, 19, 19)));
/*      */     
/*      */ 
/* 1075 */     this.jTable1.setModel(new javax.swing.table.DefaultTableModel(new Object[0][], new String[] { "Ques", "Ans" })
/*      */     {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1083 */       Class[] types = { Integer.class, String.class };
/*      */       
/*      */ 
/* 1086 */       boolean[] canEdit = { false, false };
/*      */       
/*      */ 
/*      */       public Class getColumnClass(int columnIndex)
/*      */       {
/* 1091 */         return this.types[columnIndex];
/*      */       }
/*      */       
/*      */       public boolean isCellEditable(int rowIndex, int columnIndex) {
/* 1095 */         return this.canEdit[columnIndex];
/*      */       }
/* 1097 */     });
/* 1098 */     this.jScrollPane1.setViewportView(this.jTable1);
/* 1099 */     if (this.jTable1.getColumnModel().getColumnCount() > 0) {
/* 1100 */       this.jTable1.getColumnModel().getColumn(0).setResizable(false);
/* 1101 */       this.jTable1.getColumnModel().getColumn(1).setResizable(false);
/*      */     }
/*      */     
/* 1104 */     GroupLayout jPanel4Layout = new GroupLayout(this.jPanel4);
/* 1105 */     this.jPanel4.setLayout(jPanel4Layout);
/* 1106 */     jPanel4Layout.setHorizontalGroup(jPanel4Layout
/* 1107 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 1108 */       .addGroup(jPanel4Layout.createSequentialGroup()
/* 1109 */       .addContainerGap()
/* 1110 */       .addComponent(this.jScrollPane1, -2, 82, -2)
/* 1111 */       .addContainerGap(-1, 32767)));
/*      */     
/* 1113 */     jPanel4Layout.setVerticalGroup(jPanel4Layout
/* 1114 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 1115 */       .addGroup(jPanel4Layout.createSequentialGroup()
/* 1116 */       .addComponent(this.jScrollPane1, -2, 34, -2)
/* 1117 */       .addGap(0, 0, 32767)));
/*      */     
/*      */ 
/* 1120 */     this.jSeparator2.setOrientation(1);
/*      */     
/* 1122 */     this.jPanel7.setBackground(new java.awt.Color(204, 204, 255));
/*      */     
/* 1124 */     this.jLabel42.setFont(new java.awt.Font("Tahoma", 1, 14));
/* 1125 */     this.jLabel42.setText("Time Left :");
/*      */     
/* 1127 */     this.jLabel40.setFont(new java.awt.Font("Tahoma", 1, 14));
/*      */     
/* 1129 */     GroupLayout jPanel7Layout = new GroupLayout(this.jPanel7);
/* 1130 */     this.jPanel7.setLayout(jPanel7Layout);
/* 1131 */     jPanel7Layout.setHorizontalGroup(jPanel7Layout
/* 1132 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 1133 */       .addGroup(jPanel7Layout.createSequentialGroup()
/* 1134 */       .addContainerGap()
/* 1135 */       .addComponent(this.jLabel42)
/* 1136 */       .addGap(18, 18, 18)
/* 1137 */       .addComponent(this.jLabel40, -2, 103, -2)
/* 1138 */       .addContainerGap(-1, 32767)));
/*      */     
/* 1140 */     jPanel7Layout.setVerticalGroup(jPanel7Layout
/* 1141 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 1142 */       .addGroup(jPanel7Layout.createSequentialGroup()
/* 1143 */       .addGap(6, 6, 6)
/* 1144 */       .addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 1145 */       .addComponent(this.jLabel40, -1, -1, 32767)
/* 1146 */       .addComponent(this.jLabel42, -1, 26, 32767))
/* 1147 */       .addContainerGap()));
/*      */     
/*      */ 
/* 1150 */     GroupLayout layout = new GroupLayout(getContentPane());
/* 1151 */     getContentPane().setLayout(layout);
/* 1152 */     layout.setHorizontalGroup(layout
/* 1153 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 1154 */       .addGroup(layout.createSequentialGroup()
/* 1155 */       .addContainerGap()
/* 1156 */       .addComponent(this.jPanel1, -2, -1, -2)
/* 1157 */       .addGap(18, 18, 18)
/* 1158 */       .addComponent(this.jSeparator2, -2, 14, -2)
/* 1159 */       .addGap(18, 18, 18)
/* 1160 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 1161 */       .addGroup(layout.createSequentialGroup()
/* 1162 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
/* 1163 */       .addComponent(this.jSeparator1)
/* 1164 */       .addComponent(this.jPanel3, -1, -1, 32767)
/* 1165 */       .addComponent(this.jPanel2, -2, -1, -2))
/* 1166 */       .addContainerGap(-1, 32767))
/* 1167 */       .addGroup(layout.createSequentialGroup()
/* 1168 */       .addComponent(this.jSeparator3)
/* 1169 */       .addGap(22, 22, 22))
/* 1170 */       .addGroup(layout.createSequentialGroup()
/* 1171 */       .addComponent(this.jPanel4, -2, -1, -2)
/* 1172 */       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 336, 32767)
/* 1173 */       .addComponent(this.jPanel7, -2, -1, -2)
/* 1174 */       .addGap(40, 40, 40)))));
/*      */     
/* 1176 */     layout.setVerticalGroup(layout
/* 1177 */       .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 1178 */       .addGroup(layout.createSequentialGroup()
/* 1179 */       .addContainerGap()
/* 1180 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
/* 1181 */       .addGroup(layout.createSequentialGroup()
/* 1182 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 1183 */       .addComponent(this.jPanel4, -2, -1, -2)
/* 1184 */       .addComponent(this.jPanel7, -2, -1, -2))
/* 1185 */       .addGap(20, 20, 20)
/* 1186 */       .addComponent(this.jSeparator3, -2, 10, -2)
/* 1187 */       .addGap(23, 23, 23)
/* 1188 */       .addComponent(this.jPanel2, -2, -1, -2)
/* 1189 */       .addGap(18, 18, 18)
/* 1190 */       .addComponent(this.jSeparator1, -2, 10, -2)
/* 1191 */       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
/* 1192 */       .addComponent(this.jPanel3, -2, -1, -2))
/* 1193 */       .addComponent(this.jSeparator2))
/* 1194 */       .addContainerGap())
/* 1195 */       .addGroup(layout.createSequentialGroup()
/* 1196 */       .addGap(23, 23, 23)
/* 1197 */       .addComponent(this.jPanel1, -2, -1, -2)
/* 1198 */       .addContainerGap(-1, 32767)));
/*      */     
/*      */ 
/* 1201 */     pack();
/*      */   }
/*      */   
/*      */   private JLabel jLabel24;
/*      */   private JLabel jLabel25;
/*      */   
/* 1207 */   private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) { try { this.dtm.setValueAt(Integer.valueOf(getSelectedButtonText(this.br)), this.ques - 1, 0);
/* 1208 */       int i = getSelectedButtonText(this.br);
/* 1209 */       this.br.clearSelection();
/* 1210 */       if (i == 0)
/*      */       {
/* 1212 */         setBkg(java.awt.Color.RED);
/*      */       }
/*      */       else
/*      */       {
/* 1216 */         setBkg(java.awt.Color.GREEN);
/*      */       }
/*      */       
/* 1219 */       Question q = new Question();
/* 1220 */       this.ques += 1;
/* 1221 */       if (this.ques > this.total_ques)
/* 1222 */         resultDisplay();
/* 1223 */       setBkg(java.awt.Color.YELLOW);
/* 1224 */       q.ques = this.fr.readLine();
/* 1225 */       q.option1 = this.fr.readLine();
/* 1226 */       q.option2 = this.fr.readLine();
/* 1227 */       q.option3 = this.fr.readLine();
/* 1228 */       q.option4 = this.fr.readLine();
/* 1229 */       q.answer = this.fr.readLine();
/* 1230 */       this.dtm.setValueAt(q.answer, this.ques - 1, 1);
/* 1231 */       this.jLabel31.setText("Q." + q.ques);
/* 1232 */       this.jRadioButton1.setText(q.option1);
/* 1233 */       this.jRadioButton2.setText(q.option2);
/* 1234 */       this.jRadioButton3.setText(q.option3);
/* 1235 */       this.jRadioButton4.setText(q.option4);
/* 1236 */       setSelectedButtonText(this.br);
/*      */     }
/*      */     catch (IOException ex)
/*      */     {
/*      */       try {
/* 1241 */         labelMouseBeforeClicked(this.ques);
/*      */       } catch (IOException ex1) {
/* 1243 */         Logger.getLogger(TEST.class.getName()).log(Level.SEVERE, null, ex1);
/*      */       }
/* 1245 */       resultDisplay();
/*      */     } }
/*      */   
/*      */   private JLabel jLabel26;
/*      */   private JLabel jLabel27;
/*      */   
/* 1251 */   private void jLabel1MouseClicked(MouseEvent evt) { try { labelMouseBeforeClicked(this.ques);
/* 1252 */       this.ques = 1;
/* 1253 */       labelMouseAfterClicked(this.ques);
/*      */     } catch (IOException ex) {
/* 1255 */       Logger.getLogger(TEST.class.getName()).log(Level.SEVERE, null, ex);
/*      */     } }
/*      */   
/*      */   private JLabel jLabel28;
/*      */   private JLabel jLabel29;
/*      */   
/* 1261 */   private void jLabel2MouseClicked(MouseEvent evt) { try { labelMouseBeforeClicked(this.ques);
/* 1262 */       this.ques = 2;
/* 1263 */       labelMouseAfterClicked(this.ques);
/*      */     } catch (IOException ex) {
/* 1265 */       Logger.getLogger(TEST.class.getName()).log(Level.SEVERE, null, ex); } }
/*      */   
/*      */   private JLabel jLabel3;
/*      */   private JLabel jLabel30;
/*      */   private JLabel jLabel31;
/*      */   private JLabel jLabel33;
/* 1271 */   private void jLabel3MouseClicked(MouseEvent evt) { try { labelMouseBeforeClicked(this.ques);
/* 1272 */       this.ques = 3;
/* 1273 */       labelMouseAfterClicked(this.ques);
/*      */     } catch (IOException ex) {
/* 1275 */       Logger.getLogger(TEST.class.getName()).log(Level.SEVERE, null, ex);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jLabel4MouseClicked(MouseEvent evt) {
/*      */     try {
/* 1281 */       labelMouseBeforeClicked(this.ques);
/* 1282 */       this.ques = 4;
/* 1283 */       labelMouseAfterClicked(this.ques);
/*      */     } catch (IOException ex) {
/* 1285 */       Logger.getLogger(TEST.class.getName()).log(Level.SEVERE, null, ex);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jLabel5MouseClicked(MouseEvent evt) {
/*      */     try {
/* 1291 */       labelMouseBeforeClicked(this.ques);
/* 1292 */       this.ques = 5;
/* 1293 */       labelMouseAfterClicked(this.ques);
/*      */     } catch (IOException ex) {
/* 1295 */       Logger.getLogger(TEST.class.getName()).log(Level.SEVERE, null, ex);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jLabel6MouseClicked(MouseEvent evt) {
/*      */     try {
/* 1301 */       labelMouseBeforeClicked(this.ques);
/* 1302 */       this.ques = 6;
/* 1303 */       labelMouseAfterClicked(this.ques);
/*      */     } catch (IOException ex) {
/* 1305 */       Logger.getLogger(TEST.class.getName()).log(Level.SEVERE, null, ex);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jLabel7MouseClicked(MouseEvent evt) {
/*      */     try {
/* 1311 */       labelMouseBeforeClicked(this.ques);
/* 1312 */       this.ques = 7;
/* 1313 */       labelMouseAfterClicked(this.ques);
/*      */     } catch (IOException ex) {
/* 1315 */       Logger.getLogger(TEST.class.getName()).log(Level.SEVERE, null, ex);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jLabel8MouseClicked(MouseEvent evt) {
/*      */     try {
/* 1321 */       labelMouseBeforeClicked(this.ques);
/* 1322 */       this.ques = 8;
/* 1323 */       labelMouseAfterClicked(this.ques);
/*      */     } catch (IOException ex) {
/* 1325 */       Logger.getLogger(TEST.class.getName()).log(Level.SEVERE, null, ex);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jLabel9MouseClicked(MouseEvent evt) {
/*      */     try {
/* 1331 */       labelMouseBeforeClicked(this.ques);
/* 1332 */       this.ques = 9;
/* 1333 */       labelMouseAfterClicked(this.ques);
/*      */     } catch (IOException ex) {
/* 1335 */       Logger.getLogger(TEST.class.getName()).log(Level.SEVERE, null, ex);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jLabel10MouseClicked(MouseEvent evt) {
/*      */     try {
/* 1341 */       labelMouseBeforeClicked(this.ques);
/* 1342 */       this.ques = 10;
/* 1343 */       labelMouseAfterClicked(this.ques);
/*      */     } catch (IOException ex) {
/* 1345 */       Logger.getLogger(TEST.class.getName()).log(Level.SEVERE, null, ex);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jLabel11MouseClicked(MouseEvent evt) {
/*      */     try {
/* 1351 */       labelMouseBeforeClicked(this.ques);
/* 1352 */       this.ques = 11;
/* 1353 */       labelMouseAfterClicked(this.ques);
/*      */     } catch (IOException ex) {
/* 1355 */       Logger.getLogger(TEST.class.getName()).log(Level.SEVERE, null, ex);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jLabel12MouseClicked(MouseEvent evt) {
/*      */     try {
/* 1361 */       labelMouseBeforeClicked(this.ques);
/* 1362 */       this.ques = 12;
/* 1363 */       labelMouseAfterClicked(this.ques);
/*      */     } catch (IOException ex) {
/* 1365 */       Logger.getLogger(TEST.class.getName()).log(Level.SEVERE, null, ex);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jLabel13MouseClicked(MouseEvent evt) {
/*      */     try {
/* 1371 */       labelMouseBeforeClicked(this.ques);
/* 1372 */       this.ques = 13;
/* 1373 */       labelMouseAfterClicked(this.ques);
/*      */     } catch (IOException ex) {
/* 1375 */       Logger.getLogger(TEST.class.getName()).log(Level.SEVERE, null, ex);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jLabel14MouseClicked(MouseEvent evt) {
/*      */     try {
/* 1381 */       labelMouseBeforeClicked(this.ques);
/* 1382 */       this.ques = 14;
/* 1383 */       labelMouseAfterClicked(this.ques);
/*      */     } catch (IOException ex) {
/* 1385 */       Logger.getLogger(TEST.class.getName()).log(Level.SEVERE, null, ex);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jLabel15MouseClicked(MouseEvent evt) {
/*      */     try {
/* 1391 */       labelMouseBeforeClicked(this.ques);
/* 1392 */       this.ques = 15;
/* 1393 */       labelMouseAfterClicked(this.ques);
/*      */     } catch (IOException ex) {
/* 1395 */       Logger.getLogger(TEST.class.getName()).log(Level.SEVERE, null, ex);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jLabel16MouseClicked(MouseEvent evt) {
/*      */     try {
/* 1401 */       labelMouseBeforeClicked(this.ques);
/* 1402 */       this.ques = 16;
/* 1403 */       labelMouseAfterClicked(this.ques);
/*      */     } catch (IOException ex) {
/* 1405 */       Logger.getLogger(TEST.class.getName()).log(Level.SEVERE, null, ex);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jLabel17MouseClicked(MouseEvent evt) {
/*      */     try {
/* 1411 */       labelMouseBeforeClicked(this.ques);
/* 1412 */       this.ques = 17;
/* 1413 */       labelMouseAfterClicked(this.ques);
/*      */     } catch (IOException ex) {
/* 1415 */       Logger.getLogger(TEST.class.getName()).log(Level.SEVERE, null, ex);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jLabel18MouseClicked(MouseEvent evt) {
/*      */     try {
/* 1421 */       labelMouseBeforeClicked(this.ques);
/* 1422 */       this.ques = 18;
/* 1423 */       labelMouseAfterClicked(this.ques);
/*      */     } catch (IOException ex) {
/* 1425 */       Logger.getLogger(TEST.class.getName()).log(Level.SEVERE, null, ex);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jLabel19MouseClicked(MouseEvent evt) {
/*      */     try {
/* 1431 */       labelMouseBeforeClicked(this.ques);
/* 1432 */       this.ques = 19;
/* 1433 */       labelMouseAfterClicked(this.ques);
/*      */     } catch (IOException ex) {
/* 1435 */       Logger.getLogger(TEST.class.getName()).log(Level.SEVERE, null, ex);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jLabel20MouseClicked(MouseEvent evt) {
/*      */     try {
/* 1441 */       labelMouseBeforeClicked(this.ques);
/* 1442 */       this.ques = 20;
/* 1443 */       labelMouseAfterClicked(this.ques);
/*      */     } catch (IOException ex) {
/* 1445 */       Logger.getLogger(TEST.class.getName()).log(Level.SEVERE, null, ex);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jLabel21MouseClicked(MouseEvent evt) {
/*      */     try {
/* 1451 */       labelMouseBeforeClicked(this.ques);
/* 1452 */       this.ques = 21;
/* 1453 */       labelMouseAfterClicked(this.ques);
/*      */     } catch (IOException ex) {
/* 1455 */       Logger.getLogger(TEST.class.getName()).log(Level.SEVERE, null, ex);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jLabel22MouseClicked(MouseEvent evt) {
/*      */     try {
/* 1461 */       labelMouseBeforeClicked(this.ques);
/* 1462 */       this.ques = 22;
/* 1463 */       labelMouseAfterClicked(this.ques);
/*      */     } catch (IOException ex) {
/* 1465 */       Logger.getLogger(TEST.class.getName()).log(Level.SEVERE, null, ex);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jLabel23MouseClicked(MouseEvent evt) {
/*      */     try {
/* 1471 */       labelMouseBeforeClicked(this.ques);
/* 1472 */       this.ques = 23;
/* 1473 */       labelMouseAfterClicked(this.ques);
/*      */     } catch (IOException ex) {
/* 1475 */       Logger.getLogger(TEST.class.getName()).log(Level.SEVERE, null, ex);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jLabel24MouseClicked(MouseEvent evt) {
/*      */     try {
/* 1481 */       labelMouseBeforeClicked(this.ques);
/* 1482 */       this.ques = 24;
/* 1483 */       labelMouseAfterClicked(this.ques);
/*      */     } catch (IOException ex) {
/* 1485 */       Logger.getLogger(TEST.class.getName()).log(Level.SEVERE, null, ex);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jLabel25MouseClicked(MouseEvent evt) {
/*      */     try {
/* 1491 */       labelMouseBeforeClicked(this.ques);
/* 1492 */       this.ques = 25;
/* 1493 */       labelMouseAfterClicked(this.ques);
/*      */     } catch (IOException ex) {
/* 1495 */       Logger.getLogger(TEST.class.getName()).log(Level.SEVERE, null, ex);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jLabel26MouseClicked(MouseEvent evt) {
/*      */     try {
/* 1501 */       labelMouseBeforeClicked(this.ques);
/* 1502 */       this.ques = 26;
/* 1503 */       labelMouseAfterClicked(this.ques);
/*      */     } catch (IOException ex) {
/* 1505 */       Logger.getLogger(TEST.class.getName()).log(Level.SEVERE, null, ex);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jLabel27MouseClicked(MouseEvent evt) {
/*      */     try {
/* 1511 */       labelMouseBeforeClicked(this.ques);
/* 1512 */       this.ques = 27;
/* 1513 */       labelMouseAfterClicked(this.ques);
/*      */     } catch (IOException ex) {
/* 1515 */       Logger.getLogger(TEST.class.getName()).log(Level.SEVERE, null, ex);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jLabel28MouseClicked(MouseEvent evt) {
/*      */     try {
/* 1521 */       labelMouseBeforeClicked(this.ques);
/* 1522 */       this.ques = 28;
/* 1523 */       labelMouseAfterClicked(this.ques);
/*      */     } catch (IOException ex) {
/* 1525 */       Logger.getLogger(TEST.class.getName()).log(Level.SEVERE, null, ex);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jLabel29MouseClicked(MouseEvent evt) {
/*      */     try {
/* 1531 */       labelMouseBeforeClicked(this.ques);
/* 1532 */       this.ques = 29;
/* 1533 */       labelMouseAfterClicked(this.ques);
/*      */     } catch (IOException ex) {
/* 1535 */       Logger.getLogger(TEST.class.getName()).log(Level.SEVERE, null, ex);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jLabel30MouseClicked(MouseEvent evt) {
/*      */     try {
/* 1541 */       labelMouseBeforeClicked(this.ques);
/* 1542 */       this.ques = 30;
/* 1543 */       labelMouseAfterClicked(this.ques);
/*      */     } catch (IOException ex) {
/* 1545 */       Logger.getLogger(TEST.class.getName()).log(Level.SEVERE, null, ex);
/*      */     }
/*      */   }
/*      */   
/*      */   private void jButton3ActionPerformed(java.awt.event.ActionEvent evt)
/*      */   {
/*      */     try {
/* 1552 */       labelMouseBeforeClicked(this.ques);
/*      */     }
/*      */     catch (IOException ex) {
/* 1555 */       Logger.getLogger(TEST.class.getName()).log(Level.SEVERE, null, ex);
/*      */     }
/* 1557 */     resultDisplay();
/*      */   }
/*      */   
/*      */   private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
/*      */     try {
/* 1562 */       Class.forName("oracle.jdbc.driver.OracleDriver");
/* 1563 */       java.sql.Connection conn = java.sql.DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "password");
/* 1564 */       String SQL = "Select * from register where id= ?";
/* 1565 */       java.sql.PreparedStatement st = conn.prepareStatement(SQL);
/* 1566 */       st.setString(1, this.SID);
/* 1567 */       java.sql.ResultSet rs = st.executeQuery();
/* 1568 */       rs.next();
/* 1569 */       Student s = new Student(rs.getString(1), rs.getString(2), rs.getString(3));
/* 1570 */       s.setVisible(true);
/* 1571 */       setVisible(false);
/*      */     } catch (Exception localException) {} }
/*      */   
/*      */   private JLabel jLabel34;
/*      */   private JLabel jLabel35;
/*      */   private JLabel jLabel36;
/*      */   private JLabel jLabel37;
/*      */   private JLabel jLabel38;
/*      */   private JLabel jLabel39;
/*      */   private JLabel jLabel4;
/*      */   private JLabel jLabel40;
/*      */   private JLabel jLabel41;
/*      */   
/* 1584 */   public static void main(String[] args) { try { for (javax.swing.UIManager.LookAndFeelInfo info : ) {
/* 1585 */         if ("Nimbus".equals(info.getName())) {
/* 1586 */           javax.swing.UIManager.setLookAndFeel(info.getClassName());
/* 1587 */           break;
/*      */         }
/*      */       }
/*      */     } catch (ClassNotFoundException ex) {
/* 1591 */       Logger.getLogger(TEST.class.getName()).log(Level.SEVERE, null, ex);
/*      */     } catch (InstantiationException ex) {
/* 1593 */       Logger.getLogger(TEST.class.getName()).log(Level.SEVERE, null, ex);
/*      */     } catch (IllegalAccessException ex) {
/* 1595 */       Logger.getLogger(TEST.class.getName()).log(Level.SEVERE, null, ex);
/*      */     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
/* 1597 */       Logger.getLogger(TEST.class.getName()).log(Level.SEVERE, null, ex);
/*      */     }
/*      */     
/*      */ 
/*      */ 
/* 1602 */     java.awt.EventQueue.invokeLater(new Runnable() {
/*      */       public void run() {
/* 1604 */         new TEST(null).setVisible(true);
/*      */       }
/*      */     });
/*      */   }
/*      */   
/*      */   private JLabel jLabel42;
/*      */   private JLabel jLabel43;
/*      */   private JLabel jLabel44;
/*      */   private JLabel jLabel45;
/*      */   private JLabel jLabel46;
/*      */   private JLabel jLabel47;
/*      */   private JLabel jLabel48;
/*      */   private JLabel jLabel5;
/*      */   private JLabel jLabel6;
/*      */   private JLabel jLabel7;
/*      */   private JLabel jLabel8;
/*      */   private JLabel jLabel9;
/*      */   private javax.swing.JPanel jPanel1;
/*      */   private javax.swing.JPanel jPanel2;
/*      */   private javax.swing.JPanel jPanel3;
/*      */   private javax.swing.JPanel jPanel4;
/*      */   private javax.swing.JPanel jPanel5;
/*      */   private javax.swing.JPanel jPanel6;
/*      */   private javax.swing.JPanel jPanel7;
/*      */   private javax.swing.JRadioButton jRadioButton1;
/*      */   private javax.swing.JRadioButton jRadioButton2;
/*      */   private javax.swing.JRadioButton jRadioButton3;
/*      */   private javax.swing.JRadioButton jRadioButton4;
/*      */   private javax.swing.JScrollPane jScrollPane1;
/*      */   private javax.swing.JScrollPane jScrollPane3;
/*      */   private javax.swing.JSeparator jSeparator1;
/*      */   private javax.swing.JSeparator jSeparator2;
/*      */   private javax.swing.JSeparator jSeparator3;
/*      */   private javax.swing.JTable jTable1;
/*      */ }


/* Location:              C:\Users\Prash\Downloads\Compressed\dist\MCBCExams.jar!\mcbcexams\TEST.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */