package cf.tilgiz.codewars;

import java.util.Arrays;
import java.util.List;

public class PaginationHelper<I> {

    public int itemsPerPage;
    public String[] arrayCollection;
    public String[][] filledPages;
    public String[] pageArray;

    /**
     * The constructor takes in an array of items and a integer indicating how many
     * items fit within a single page
     */
    public PaginationHelper(List<I> collection, int itemsPerPage) {
        try {
            arrayCollection = new String[collection.size()];
            for (int i = 0; i < collection.size(); i++) {
                arrayCollection[i] = String.valueOf(collection.get(i));
            }
            this.itemsPerPage = itemsPerPage;

            fillPageArray(itemsPerPage);
        }catch (ArrayIndexOutOfBoundsException e){
            //System.out.println("Empty collection");
        }
    }

    public void fillPageArray(int itemsPerPage) {
        filledPages = new String[pageCount()][];
        int i = 0;
        if (itemCount() > itemsPerPage) {
            int j = 0;
            for (; j < pageCount() - 1; j++) {
                pageArray = new String[itemsPerPage];
                for (int k = 0; k < itemsPerPage; k++) {
//                    System.out.print(arrayCollection[i]);
//                    System.out.println(String.format(" item: i=%d, page: j=%d, itemInPage: k=%d, itemCount: %d", i, j, k, itemCount()));
                    pageArray[k] = arrayCollection[i];
                    i++;
                }
                filledPages[j] = pageArray;
            }
            pageArray = new String[itemCount() - itemsPerPage * j];
            for (int k = 0; k < itemCount() - itemsPerPage * j; k++) {
//                System.out.print(arrayCollection[i]);
//                System.out.println(String.format(" item: i=%d, page: j=%d, itemInPage: k=%d, itemCount: %d", i, j, k, itemCount()));
                pageArray[k] = arrayCollection[i];
                i++;
            }
            filledPages[j] = pageArray;
        } else {
            pageArray = new String[itemCount()];
            for (int k = 0; k < itemCount(); k++) {
//                System.out.print(arrayCollection[i]);
//                System.out.println(String.format(" item: i=%d, page: j=%d, itemInPage: k=%d, itemCount: %d", i, 0, k, itemCount()));
                pageArray[k] = arrayCollection[i];
                i++;
            }
            filledPages[0] = pageArray;

        }
        System.out.println(Arrays.deepToString(filledPages));
    }

    /**
     * returns the number of items within the entire collection
     */
    public int itemCount() {
        return arrayCollection.length;
    }

    /**
     * returns the number of pages
     */
    public int pageCount() {
        return (int) Math.ceil((float) arrayCollection.length / itemsPerPage);
    }

    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int
    pageItemCount(int pageIndex) {
        if (pageIndex < pageCount()) return filledPages[pageIndex].length;
        return -1;
    }

    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) {
        int page = (int) Math.floor((float) itemIndex / itemsPerPage);
        if (page < pageCount() && page >= 0) return page;
        return -1;
    }


}
