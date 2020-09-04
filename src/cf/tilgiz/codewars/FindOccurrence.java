package cf.tilgiz.codewars;

public class FindOccurrence {
    public static int findOccurrence(String subStr, String str, int occurrence) {
        int last = str.lastIndexOf(subStr);
        int index = 0;
        int count = 1;
        while(index < last){
            int itemPosition = str.indexOf(subStr, index);
            if (count == occurrence) return itemPosition;
            index = itemPosition + 1;
            count ++;
        }
        return -1;
    }
}
