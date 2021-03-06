/*    */ package com.sun.org.apache.xerces.internal.impl.dv.dtd;
/*    */ 
/*    */ import com.sun.org.apache.xerces.internal.impl.dv.InvalidDatatypeValueException;
/*    */ import com.sun.org.apache.xerces.internal.impl.dv.ValidationContext;
/*    */ import com.sun.org.apache.xerces.internal.util.XML11Char;
/*    */ 
/*    */ public class XML11NMTOKENDatatypeValidator extends NMTOKENDatatypeValidator
/*    */ {
/*    */   public void validate(String content, ValidationContext context)
/*    */     throws InvalidDatatypeValueException
/*    */   {
/* 54 */     if (!XML11Char.isXML11ValidNmtoken(content))
/* 55 */       throw new InvalidDatatypeValueException("NMTOKENInvalid", new Object[] { content });
/*    */   }
/*    */ }

/* Location:           C:\Program Files\Java\jdk1.7.0_79\jre\lib\rt.jar
 * Qualified Name:     com.sun.org.apache.xerces.internal.impl.dv.dtd.XML11NMTOKENDatatypeValidator
 * JD-Core Version:    0.6.2
 */