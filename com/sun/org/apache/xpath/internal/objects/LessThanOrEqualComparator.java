/*     */ package com.sun.org.apache.xpath.internal.objects;
/*     */ 
/*     */ import com.sun.org.apache.xml.internal.utils.XMLString;
/*     */ 
/*     */ class LessThanOrEqualComparator extends Comparator
/*     */ {
/*     */   boolean compareStrings(XMLString s1, XMLString s2)
/*     */   {
/* 812 */     return s1.toDouble() <= s2.toDouble();
/*     */   }
/*     */ 
/*     */   boolean compareNumbers(double n1, double n2)
/*     */   {
/* 827 */     return n1 <= n2;
/*     */   }
/*     */ }

/* Location:           C:\Program Files\Java\jdk1.7.0_79\jre\lib\rt.jar
 * Qualified Name:     com.sun.org.apache.xpath.internal.objects.LessThanOrEqualComparator
 * JD-Core Version:    0.6.2
 */