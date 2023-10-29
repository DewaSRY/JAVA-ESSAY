package List;

import java.util.LinkedList;
import java.util.Scanner;

record Place(String name, int distance) {
    @Override
    public String toString() {
        return String.format("%s (%d)", name, distance);
    }
}

public class Challenge {
    
    public static void run() {
        LinkedList<Place> placeToVisit = new LinkedList<Place>();

        Place firstPlace = new Place("hallo", 2);
        addPlace(placeToVisit, firstPlace);
       
        var iterator = placeToVisit.listIterator();
        Scanner sc = new Scanner(System.in);
        boolean quiteLoop = false;
        // boolean forward = true;

        printMenu();
        while (!quiteLoop) {
            if(!iterator.hasPrevious()){
                System.out.println("Origin :"+ iterator.next());
                // forward= true;
            }else{

                System.out.println("Final :"+ iterator.previous());
                // forward= false;
            }
            System.out.print("Enter values: ");
            String menuItem = sc.nextLine().toUpperCase().substring(0, 1);
            
            switch (menuItem) {
                case "F" :
                    System.out.println("User wants to go forwards");
                    if (iterator.hasNext()) {
                        System.out.println(iterator.next());
                    }
                    break;
                case "B":
                    System.out.println("User wants to go Back wards ");
                    if (iterator.hasPrevious()) {
                        System.out.println(iterator.previous());
                    }
                    break;
                case "M":
                    System.out.println("User wants Print menu ");
                    printMenu();
                    break;
                case "L":
                    System.out.println("User wants Print List ");
                    System.out.println(placeToVisit);
                    break;
                default:
                    quiteLoop = true;
                    break;
            }
        }
        sc.close();
    }

    private static void addPlace(LinkedList<Place> list, Place place) {
        if (list.contains(place)) {
            System.out.println("found duplication: " + place);
        } else {
            for (Place p : list) {
                if (p.name().equalsIgnoreCase(place.name())) {
                    System.out.println("there is place with same name");
                    return;
                }
            }

            int matchIndex = 0;
            for (var listPlace : list) {
                if (place.distance() < listPlace.distance()) {
                    list.add(matchIndex, place);
                    return;
                }
                matchIndex++;
            }
            list.add(place);
        }
    }
    
    private static void printMenu() {
        System.out.println("""
                Available actions (select words or letter):
                (F) Forwards
                (B) Back Wards
                (L) List Places
                (M) Menu
                (Q) Quit
                """);
    }

}
