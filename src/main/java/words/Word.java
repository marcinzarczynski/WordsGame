package words;

import java.awt.*;

public class Word {
    String pl;
    String eng;
    Point value;

    public Word(String pl, String eng, Point value) {
        this.pl = pl;
        this.eng = eng;
        this.value = value;
    }

    public String getPl() {
        return pl;
    }

    public void setPl(String pl) {
        this.pl = pl;
    }

    public String getEng() {
        return eng;
    }

    public void setEng(String eng) {
        this.eng = eng;
    }

    public Point getValue() {
        return value;
    }

    public void setValue(Point value) {
        this.value = value;
    }
}
