package javax.swing.plaf;

import java.awt.Rectangle;
import javax.swing.JTree;
import javax.swing.tree.TreePath;

public abstract class TreeUI extends ComponentUI
{
  public abstract Rectangle getPathBounds(JTree paramJTree, TreePath paramTreePath);

  public abstract TreePath getPathForRow(JTree paramJTree, int paramInt);

  public abstract int getRowForPath(JTree paramJTree, TreePath paramTreePath);

  public abstract int getRowCount(JTree paramJTree);

  public abstract TreePath getClosestPathForLocation(JTree paramJTree, int paramInt1, int paramInt2);

  public abstract boolean isEditing(JTree paramJTree);

  public abstract boolean stopEditing(JTree paramJTree);

  public abstract void cancelEditing(JTree paramJTree);

  public abstract void startEditingAtPath(JTree paramJTree, TreePath paramTreePath);

  public abstract TreePath getEditingPath(JTree paramJTree);
}

/* Location:           C:\Program Files\Java\jdk1.7.0_79\jre\lib\rt.jar
 * Qualified Name:     javax.swing.plaf.TreeUI
 * JD-Core Version:    0.6.2
 */