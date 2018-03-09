package hashMapping;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListUtils {

	public static void sortListOfLists(List < List < String >> listOfLists) {

        // first sort the inner arrays using collections.sort
        for (List < String > innerList: listOfLists) {
            Collections.sort(innerList);
        }

        // now sort by comparing the first string of each inner list using a comparator
        Collections.sort(listOfLists, new ListOfStringsComparator());
    }

    static final class ListOfStringsComparator implements Comparator < List < String >> {

       // @Override
        public int compare(List < String > o1, List < String > o2) {
            
            return o1.get(0).compareTo(o2.get(0));
        }

    }
}
