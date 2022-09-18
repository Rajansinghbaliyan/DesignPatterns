package builder.htmlelement.io;

public class HtmlBuilder {
    private final String rootName;
    private final HtmlElement root;

    public HtmlBuilder(String rootName, String text) {
        this.rootName = rootName;
        this.root = new HtmlElement(rootName,text);
    }

    public HtmlBuilder addChild(String childName,String text){
        this.root.elements.add(new HtmlElement(childName,text));
        return this;
    }

    public HtmlElement build(){
        return this.root;
    }

}
