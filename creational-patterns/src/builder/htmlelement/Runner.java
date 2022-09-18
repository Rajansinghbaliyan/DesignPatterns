package builder.htmlelement;

import builder.htmlelement.io.HtmlBuilder;
import builder.htmlelement.io.HtmlElement;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
//        HtmlElement ulHtmlElement = new HtmlElement("ul", "");

        HtmlBuilder builder = new HtmlBuilder("ul","");
        String[] listText = {"apples", "tomatoes", "potatoes", "pineapple", "mobile", "laptop"};

        Arrays.asList(listText)
                        .forEach(item -> builder.addChild("li",item));

        HtmlElement ulHtmlElement = builder.build();
        System.out.println(ulHtmlElement);
    }
}
