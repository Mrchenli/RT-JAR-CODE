/*    */ package javax.swing.plaf.nimbus;
/*    */ 
/*    */ import javax.swing.JComponent;
/*    */ 
/*    */ class SliderArrowShapeState extends State
/*    */ {
/*    */   SliderArrowShapeState()
/*    */   {
/* 33 */     super("ArrowShape");
/*    */   }
/*    */ 
/*    */   protected boolean isInState(JComponent paramJComponent) {
/* 37 */     return paramJComponent.getClientProperty("Slider.paintThumbArrowShape") == Boolean.TRUE;
/*    */   }
/*    */ }

/* Location:           C:\Program Files\Java\jdk1.7.0_79\jre\lib\rt.jar
 * Qualified Name:     javax.swing.plaf.nimbus.SliderArrowShapeState
 * JD-Core Version:    0.6.2
 */