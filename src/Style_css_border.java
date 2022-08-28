public class Style_css_border {

    Style_css_border(Domelement d) {
        d.borderTop = 1;
        d.borderRight = 1;
        d.borderBottom = 1;
        d.borderLeft = 1;
        d.style = true;
    }
    Style_css_border(Domelement d, int trbl) {
        d.borderTop = trbl;
        d.borderRight = trbl;
        d.borderBottom = trbl;
        d.borderLeft = trbl;
        d.style = true;
    }
    Style_css_border(Domelement d, int tb, int rl) {
        d.borderTop = tb;
        d.borderRight = rl;
        d.borderBottom = tb;
        d.borderLeft = rl;
        d.style = true;
    }
    Style_css_border(Domelement d, int t, int r, int b, int l) {
        d.borderTop = t;
        d.borderRight = r;
        d.borderBottom = b;
        d.borderLeft = l;
        d.style = true;
    }

}
