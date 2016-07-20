package in.singh_nidhi.awesomequotes.model;

/**
 * Created by HOME on 15-07-2016.
 */
public class Quote {
    String titleText;
    String authorName;

    public String getTitleText() {
        return titleText;
    }

    public void setTitleText(String titleText) {
        this.titleText = titleText;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    Quote(String s1, String s2){
        titleText = s1;
        authorName = s2;
    }
}
