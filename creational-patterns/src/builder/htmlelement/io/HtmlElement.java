package builder.htmlelement.io;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HtmlElement {
    private String name, text;
    public List<HtmlElement> elements;
    private final String newLine = System.lineSeparator();
    private final int indentSize = 2;

    public HtmlElement(String name, String text) {
        this.name = name;
        this.text = text;
        this.elements = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public HtmlElement setName(String name) {
        this.name = name;
        return this;
    }

    public String getText() {
        return text;
    }

    public HtmlElement setText(String text) {
        this.text = text;
        return this;
    }

    public List<HtmlElement> getElements() {
        return elements;
    }

    public HtmlElement setElements(List<HtmlElement> elements) {
        this.elements = elements;
        return this;
    }

    public String getNewLine() {
        return newLine;
    }

    public int getIndentSize() {
        return indentSize;
    }

    private String toStringImpl(int indent) {
        StringBuilder stringBuilder = new StringBuilder();

        String i = String.join("", Collections.nCopies(indent * indentSize, " "));
        stringBuilder.append(
                String.format("%s<%s>%s", i, name, newLine)
        );

        if (text != null && !text.isEmpty()) {
            stringBuilder.append(String.join("", Collections.nCopies((indent + 1) * indentSize, " ")))
                    .append(text)
                    .append(newLine);
        }

        if (elements != null)
            elements
                    .forEach(element ->
                            stringBuilder.append(element.toStringImpl(indent + 1))
                    );

        stringBuilder.append(
                String.format("%s</%s>%s", i, name, newLine)
        );

        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return toStringImpl(0);
    }
}
