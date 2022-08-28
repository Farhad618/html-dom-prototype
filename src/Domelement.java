import java.util.Arrays;
import java.util.stream.Collectors;

public class Domelement {
    private final String tag;
    private final String content;
    protected boolean style;
    protected int width;
    protected int height;

    protected int borderTop;
    protected int borderRight;
    protected int borderBottom;
    protected int borderLeft;


    Domelement(String t){
        tag = t;
        content = "";
    }
    Domelement(String t, String c){
        tag = t;
        content = c;
    }

    String dom() {
        String temp_style = style?  " style=\"width: "+width+"px; " +
                "height: "+height+"px; " +
                "border-top: "+borderTop+"px; " +
                "border-right: "+borderRight+"px; " +
                "border-bottom: "+borderBottom+"px; " +
                "border-left: "+borderLeft+"px;\"" : "";

        String temp_content = Arrays.stream(content.split("\n"))
                .collect(Collectors.joining("\n\t"));
        return "<"+tag+temp_style+">\n\t"+temp_content+"\n</"+tag+">\n";
    }
}
