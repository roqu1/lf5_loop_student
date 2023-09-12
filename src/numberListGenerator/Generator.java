package numberListGenerator;

public class Generator {

    public String generateNumbers(int start, int end) {
        StringBuilder stringbuilder = new StringBuilder();
        if (start < end) {
            for (int i = start; i <= end; i++) {
                 stringbuilder.append(i).append(",");
            }
            stringbuilder.deleteCharAt(stringbuilder.length() - 1);
        }
        return stringbuilder.toString();
    }
    public String generateNumbers(int start, int end, int steps, char delimiter) {
        StringBuilder stringbuilder = new StringBuilder();
        if (start < end) {
            for (int i = start; i <= end; i += steps) {
                stringbuilder.append(i).append(delimiter);
            }
            stringbuilder.deleteCharAt(stringbuilder.length() - 1);
        }
         return stringbuilder.toString();
    }

}
