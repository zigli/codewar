package cf.tilgiz.codewars;

public class HQ {
    public static String HQ9(char code) {
        switch(code){
            case 'H':
                return "Hello World!";
            case 'Q': return "Q";
            case '9':
                StringBuilder builder = new StringBuilder();
                for (int i = 99; i > 0 ; i--) {
                    String bottles = (i > 1) ? i + " bottles" : (i == 1) ? "1 bottle" : "No more bottles";
                    builder.append(bottles + " of beer on the wall, " + bottles + " of beer.\n");
                    builder.append("Take one down and pass it around, " + (((i - 1) > 1) ? (i - 1) + " bottles" : ((i - 1)  == 1) ? "1 bottle" : "no more bottles") + " of beer on the wall.\n");

                }
                builder.append("No more bottles of beer on the wall, no more bottles of beer.\n" +
                        "Go to the store and buy some more, 99 bottles of beer on the wall.");
                return builder.toString();
            default: return null;
        }
    }
}
