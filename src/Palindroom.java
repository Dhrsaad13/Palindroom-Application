public abstract class Palindroom {

    public static String setPalindroom(String string) {
        String input = string;
        char chr;
        String output = "";
        int length = input.length();
        for (int i = length - 1; i >= 0; i--) {
            chr = input.charAt(i);
            output = output + chr;
        }
        return output;

    }

}
