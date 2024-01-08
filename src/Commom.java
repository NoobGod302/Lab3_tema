import java.util.ArrayList;
import java.util.List;

public class Commom {

    public static List<String> findCommonElements(String[] a, String[] b) {
        List<String> commonElements = new ArrayList<>();
        for (String elementA : a) {
            for (String elementB : b) {
                if (elementA.equals(elementB)) {
                    commonElements.add(elementA);
                    break;
                }
            }
        }
        return commonElements;
    }

    public static void main(String[] args) {
        String[] a = {"java", "test", "university"};
        String[] b = {"car", "university", "plane"};

        List<String> commonElements = findCommonElements(a, b);
        System.out.println("Elementele comune sunt: " + commonElements);
    }
}
