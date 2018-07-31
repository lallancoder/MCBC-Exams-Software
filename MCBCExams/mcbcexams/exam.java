/*     */ package mcbcexams;
/*     */ 
/*     */ import java.util.logging.Logger;
/*     */ import javax.swing.GroupLayout;
/*     */ import javax.swing.GroupLayout.SequentialGroup;
/*     */ import javax.swing.JTable;
/*     */ import javax.swing.table.DefaultTableModel;
/*     */ 
/*     */ public class exam extends javax.swing.JFrame
/*     */ {
/*  11 */   DefaultTableModel dtm = new DefaultTableModel(0, 0);
/*  12 */   String[] header = { "First", "Last", "Email", "Username", "password", "client" };
/*     */   private javax.swing.JButton jButton1;
/*     */   
/*     */   public exam() {
/*  16 */     initComponents();
/*  17 */     this.dtm.setColumnIdentifiers(this.header);
/*  18 */     this.jTable1.setModel(this.dtm);
/*  19 */     this.dtm.addRow(new Object[] { "data", "data", "data", "data", "data", "data" });
/*  20 */     this.dtm.addRow(new Object[] { "data1", "data1", "data1", "data1", "data1", "data1" });
/*  21 */     this.dtm.addRow(new Object[] { "data2", "data2", "data2", "data2", "data2", "data2" });
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   private void initComponents()
/*     */   {
/*  29 */     this.jScrollPane1 = new javax.swing.JScrollPane();
/*  30 */     this.jTable1 = new JTable();
/*  31 */     this.jButton1 = new javax.swing.JButton();
/*     */     
/*  33 */     setDefaultCloseOperation(3);
/*     */     
/*  35 */     this.jTable1.setModel(new DefaultTableModel(new Object[0][], new String[] { "First", "Last", "Email", "Username", "Password", "Client" })
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  43 */       boolean[] canEdit = { false, false, false, false, false, false };
/*     */       
/*     */ 
/*     */       public boolean isCellEditable(int rowIndex, int columnIndex)
/*     */       {
/*  48 */         return this.canEdit[columnIndex];
/*     */       }
/*  50 */     });
/*  51 */     this.jScrollPane1.setViewportView(this.jTable1);
/*     */     
/*  53 */     this.jButton1.setText("Delete");
/*  54 */     this.jButton1.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  56 */         exam.this.jButton1ActionPerformed(evt);
/*     */       }
/*     */       
/*  59 */     });
/*  60 */     GroupLayout layout = new GroupLayout(getContentPane());
/*  61 */     getContentPane().setLayout(layout);
/*  62 */     layout.setHorizontalGroup(layout
/*  63 */       .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
/*  64 */       .addGroup(layout.createSequentialGroup()
/*  65 */       .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
/*  66 */       .addGroup(layout.createSequentialGroup()
/*  67 */       .addGap(228, 228, 228)
/*  68 */       .addComponent(this.jButton1, -2, 114, -2))
/*  69 */       .addGroup(layout.createSequentialGroup()
/*  70 */       .addGap(57, 57, 57)
/*  71 */       .addComponent(this.jScrollPane1, -2, 452, -2)))
/*  72 */       .addContainerGap(117, 32767)));
/*     */     
/*  74 */     layout.setVerticalGroup(layout
/*  75 */       .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
/*  76 */       .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
/*  77 */       .addContainerGap()
/*  78 */       .addComponent(this.jScrollPane1, -2, 205, -2)
/*  79 */       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, 32767)
/*  80 */       .addComponent(this.jButton1)
/*  81 */       .addGap(27, 27, 27)));
/*     */     
/*     */ 
/*  84 */     pack();
/*     */   }
/*     */   
/*     */   private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
/*  88 */     ((DefaultTableModel)this.jTable1.getModel()).removeRow(this.jTable1.getSelectedRow());
/*     */   }
/*     */   
/*     */ 
/*     */   private javax.swing.JScrollPane jScrollPane1;
/*     */   
/*     */   private JTable jTable1;
/*     */   public static void main(String[] args)
/*     */   {
/*     */     try
/*     */     {
/*  99 */       for (javax.swing.UIManager.LookAndFeelInfo info : ) {
/* 100 */         if ("Nimbus".equals(info.getName())) {
/* 101 */           javax.swing.UIManager.setLookAndFeel(info.getClassName());
/* 102 */           break;
/*     */         }
/*     */       }
/*     */     } catch (ClassNotFoundException ex) {
/* 106 */       Logger.getLogger(exam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (InstantiationException ex) {
/* 108 */       Logger.getLogger(exam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (IllegalAccessException ex) {
/* 110 */       Logger.getLogger(exam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
/* 112 */       Logger.getLogger(exam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 117 */     java.awt.EventQueue.invokeLater(new Runnable() {
/*     */       public void run() {
/* 119 */         new exam().setVisible(true);
/*     */       }
/*     */     });
/*     */   }
/*     */ }


/* Location:              C:\Users\Prash\Downloads\Compressed\dist\MCBCExams.jar!\mcbcexams\exam.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */