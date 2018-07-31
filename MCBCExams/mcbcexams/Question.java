/*    */ package mcbcexams;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ 
/*    */ public class Question {
/*    */   public String ques;
/*    */   public String option1;
/*    */   public String option2;
/*    */   public String option3;
/*    */   public String option4;
/*    */   public String answer;
/*    */   
/* 13 */   Question() { this.ques = null;
/* 14 */     this.option1 = null;
/* 15 */     this.option2 = null;
/* 16 */     this.option3 = null;
/* 17 */     this.option4 = null;
/* 18 */     this.answer = null;
/*    */   }
/*    */   
/*    */   public void display()
/*    */   {
/* 23 */     System.out.println(this.ques);
/* 24 */     System.out.println(this.option1);
/* 25 */     System.out.println(this.option2);
/* 26 */     System.out.println(this.option3);
/* 27 */     System.out.println(this.option4);
/* 28 */     System.out.println(this.answer);
/*    */   }
/*    */ }


/* Location:              C:\Users\Prash\Downloads\Compressed\dist\MCBCExams.jar!\mcbcexams\Question.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */