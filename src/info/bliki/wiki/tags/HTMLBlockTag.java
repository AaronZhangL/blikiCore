package info.bliki.wiki.tags;


/**
 * A wiki tag that's partitioning the HTML document
 *
 */
public class HTMLBlockTag extends HTMLTag {

    private final String fAllowedParents;
    private final HTMLTag fDefaultParentTag;

    public HTMLBlockTag(String name, String allowedParents, HTMLTag defaultParentTag) {
        super(name);
        fAllowedParents = allowedParents;
        fDefaultParentTag = defaultParentTag;
    }

    public HTMLBlockTag(String name, String allowedParents) {
        this(name, allowedParents, null);
    }

    @Override
    public Object clone() {
        HTMLBlockTag bt = new HTMLBlockTag(name, fAllowedParents, fDefaultParentTag);
        return bt;
    }

    @Override
    public String getParents() {
        return fAllowedParents;
    }

    @Override
    public boolean isReduceTokenStack() {
        return true;
    }

    public String getCloseTag() {
        return "\n</" + name + ">";
    }

    /**
     * Use this tag if no parent tag was found on the wiki model's tag stack.
     *
     * @return the default parent tag
     */
    @Override
    public HTMLTag getDefaultParentTag() {
        return fDefaultParentTag;
    }
}
