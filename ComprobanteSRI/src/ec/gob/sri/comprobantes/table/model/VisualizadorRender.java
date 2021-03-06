/*  1:   */ package ec.gob.sri.comprobantes.table.model;
/*  2:   */ 
/*  3:   */ import java.awt.Component;
/*  4:   */ import javax.swing.Icon;
/*  5:   */ import javax.swing.ImageIcon;
/*  6:   */ import javax.swing.JButton;
/*  7:   */ import javax.swing.JTable;
/*  8:   */ import javax.swing.table.TableCellRenderer;
/*  9:   */ 
/* 10:   */ public class VisualizadorRender
/* 11:   */   extends JButton
/* 12:   */   implements TableCellRenderer
/* 13:   */ {
/* 14:19 */   boolean isBordered = true;
/* 15:   */   
/* 16:   */   public VisualizadorRender(boolean isBordered)
/* 17:   */   {
/* 18:22 */     this.isBordered = isBordered;
/* 19:   */   }
/* 20:   */   
/* 21:   */   public Component getTableCellRendererComponent(JTable table, Object color, boolean isSelected, boolean hasFocus, int row, int column)
/* 22:   */   {
/* 23:26 */     JButton boton = new JButton();
/* 24:27 */     boton.setSize(25, 15);
/* 25:28 */     Icon editImage = new ImageIcon("resources/icons/exportar_pdf.gif");
/* 26:29 */     boton.setIcon(editImage);
/* 27:30 */     return boton;
/* 28:   */   }
/* 29:   */ }


/* Location:           C:\Facturacion Electronica\ComprobantesDesktop.jar
 * Qualified Name:     ec.gob.sri.comprobantes.table.model.VisualizadorRender
 * JD-Core Version:    0.7.0.1
 */