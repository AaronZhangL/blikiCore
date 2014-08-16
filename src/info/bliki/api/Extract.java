package info.bliki.api;

/**
 * Manages revision data from the <a href="http://meta.wikimedia.org/w/api.php">Wikimedia API</a>
 */
public class Extract {
    String content;

    public Extract() {
        this.content = "";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Extract) {
            return content.equals(((Extract) obj).content);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return content.hashCode();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}