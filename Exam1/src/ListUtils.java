import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class ListUtils {
    public List<Integer> sort(List<Integer> list) {
        List<Integer> sortedList = new ArrayList<>();
        
        for (Integer element : list) {
            sortedList.add(element);
            int currentElement = sortedList.size() - 1;
            int previousElement = sortedList.size() - 2;
            
            while (previousElement >= 0 &&
                   sortedList.get(previousElement) > element) {
                
                Collections.swap(sortedList, currentElement, previousElement);
                previousElement--;
                currentElement--;
            }
        }
        
        return sortedList;
    }
    
    public List<Integer> reverse(List<Integer> list) {
        List<Integer> reversedList = new ArrayList<Integer>();
        for (int i = list.size() - 1; i >= 0; --i) {
            reversedList.add(list.get(i));
        }
        return reversedList;
    }
    
    public boolean checkMonotonous(List<Integer> list) {
        boolean isMonotonousDecrease = true;
        boolean isMonotonousIncrease = true;
        for (int i = 0; i < list.size() - 1; ++i) {
            if (list.get(i) < list.get(i + 1)) {
                isMonotonousDecrease = false;
            }
            if (list.get(i) > list.get(i + 1)) {
                isMonotonousIncrease = false;
            }
        }
        return isMonotonousDecrease || isMonotonousIncrease;
    }
}
