package org.w3c.dom.css;

import org.w3c.dom.Element;
import org.w3c.dom.views.AbstractView;

public abstract interface ViewCSS extends AbstractView
{
  public abstract CSSStyleDeclaration getComputedStyle(Element paramElement, String paramString);
}

/* Location:           C:\Program Files\Java\jdk1.7.0_79\jre\lib\rt.jar
 * Qualified Name:     org.w3c.dom.css.ViewCSS
 * JD-Core Version:    0.6.2
 */