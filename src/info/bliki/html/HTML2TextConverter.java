/**
 * 
 */
package info.bliki.html;

import java.awt.Color;
import java.io.Reader;
import java.io.StringReader;
import java.util.logging.Logger;
import javax.swing.text.Document;
import javax.swing.text.EditorKit;
import javax.swing.text.html.HTMLEditorKit;

/**
 * Convert HTML to Text.
 * @author Aaron.Z
 */
public final class HTML2TextConverter {

    /**
     * Utility method to convert HTML to text.
     * @param html The string containing HTML.
     * @return a String containing the derived text .
     */
    public final String html2text(String html) {
        EditorKit kit = new HTMLEditorKit();
        Document doc = kit.createDefaultDocument();
        doc.putProperty("IgnoreCharsetDirective", Boolean.TRUE);
        try {
            Reader reader = new StringReader(html);
            kit.read(reader, doc, 0);
            return doc.getText(0, doc.getLength());
        } catch (Exception e) {
          
            return "";
        }
    }
    
}
