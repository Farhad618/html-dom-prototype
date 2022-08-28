public class Html {
    public static Domelement html, head, body, title, div1, div2, div3, span1;
    Html() {
        div1 = new Domelement("div", "i am div1.");
        new Style_css_border(div1, 5);
        new Style_css_width(div1, 100);
        new Style_css_height(div1, 100);

        div2 = new Domelement("div", "i am div2.");
        new Style_css_border(div2, 5, 10);

        div3 = new Domelement("div", "i am div3.");
        new Style_css_border(div3, 2, 4, 8, 10);

        span1 = new Domelement("span");
        new Style_css_border(span1);
        new Style_css_width(div1, 500);
        new Style_css_height(div1, 200);

        title = new Domelement("title", "This is title");

        head = new Domelement("head", title.dom());
        body = new Domelement("body", div1.dom() + div2.dom() + div3.dom() + span1.dom());
        html = new Domelement("html", head.dom() + body.dom());
    }

}
