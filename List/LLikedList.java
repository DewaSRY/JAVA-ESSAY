package List;


import java.util.LinkedList;

public class LLikedList {
    

    public static void run() {

        // LinkedList<String> placeToVisit = new LinkedList<>();
        var placeToVisit = new LinkedList<String>();
        placeToVisit.add("Sydney");
        placeToVisit.add(0, "Sydney");

        System.out.println(placeToVisit);
        addMoreElements(placeToVisit);
        System.out.println(placeToVisit);
        removeElement(placeToVisit);
        System.out.println(placeToVisit);

    }

    private static void addMoreElements(LinkedList<String> list) {

        list.addFirst("Darwin");
        list.addFirst("Habort");
        list.addFirst("Habort");
    }

    private static void removeElement(LinkedList<String> list) {
        list.remove(4);
        list.remove("Darwin");
    }
}
