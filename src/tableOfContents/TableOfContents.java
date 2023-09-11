package tableOfContents;

public class TableOfContents {
    public String createEntry(String heading, String page) {
        String result = "";
        if (heading.length() + page.length() <= 50) {
            result = heading;
            for (int i = 0; i < 50 - heading.length() - page.length(); i++) {
                result += ".";
            }
            result += page;
        }
        return result;
    }

}
