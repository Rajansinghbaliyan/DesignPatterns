package builder.stringbuilder;

import java.util.Arrays;

class BuilderFroString {
    static void practise(){
        String [] words = {"hello", "how", "are", "you", "doing"};

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("<ul>");
        Arrays.asList(words)
                .forEach(w -> stringBuilder.append("\n<li>").append(w).append("</li>"));

        stringBuilder.append("\n</ul>");


        System.out.println(stringBuilder);
    }
}