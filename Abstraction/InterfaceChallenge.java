package Abstraction;

import java.util.ArrayList;
import java.util.List;

public class InterfaceChallenge {
    public static void run() {
        List<Mappable> mapAbles = new ArrayList<>();

        mapAbles.add(new Building("Sydney Town Hall", UsageType.GOVERNMENT));
        mapAbles.add(new Building("Sydney Opera House",
                UsageType.ENTERTAINMENT));
        mapAbles.add(new Building("Stadium Australia", UsageType.SPORTS));

        mapAbles.add(new UtilityLine("College St", UtilityType.FIBER_OPTIC));
        mapAbles.add(new UtilityLine("Olympic Blvd", UtilityType.WATER));

        for (var m : mapAbles) {
            Mappable.mapIt(m);
        }
    }
}

enum Geometry {
    LINE,
    POINT,
    POLYGON
}
enum Color {
    BLACK,
    BLUE,
    GREEN,
    ORANGE,
    RED,
}

enum PointMarker {
    CIRCLE,
    PUSH_PIN,
    START,
    SQUARE,
    TRIANGLE,
}
enum LineMarker {DASHED, DOTTED, SOLID}
interface Mappable {
    String JSON_PROPERTY= """
            "PROPERTIES":{%S}
            """;

    String getLabel();

    Geometry getShape();

    String getMarker();

    default String toJson() {
        return """
                "type":"%s", label" :"%s","marker, :"%s"
                """.formatted(this.getShape(), this.getLabel(), this.getMarker());
    }

    static void mapIt(Mappable mappAble) {
        System.out.println(JSON_PROPERTY.formatted(mappAble.toJson()));
    }

}


enum UsageType {ENTERTAINMENT, GOVERNMENT, RESIDENTIAL, SPORTS}

 class Building implements Mappable {

    private String name;
    private UsageType usage;

    public Building(String name, UsageType usage) {
        this.name = name;
        this.usage = usage;
    }

    @Override
    public String getLabel() {
        return name + " (" + this.usage + ")";
    }

    @Override
    public Geometry getShape() {
        return Geometry.POINT;
    }

    @Override
    public String getMarker() {
        return switch (this.usage ) {
            case ENTERTAINMENT -> Color.GREEN + " " + PointMarker.TRIANGLE;
            case GOVERNMENT -> Color.RED + " " + PointMarker.START;
            case RESIDENTIAL -> Color.BLUE + " " + PointMarker.SQUARE;
            case SPORTS -> Color.ORANGE + " " + PointMarker.PUSH_PIN;
            default -> Color.BLACK + " " + PointMarker.CIRCLE;
        };
    }

    @Override
    public String toJson() {
        return Mappable.super.toJson() + """
                , "name": "%s", "usage": "%s" """.formatted(this.name, this.usage);
    }
}


enum UtilityType {ELECTRICAL, FIBER_OPTIC, GAS, WATER}

 class UtilityLine implements Mappable {

    private String name;
    private UtilityType type;

    public UtilityLine(String name, UtilityType type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String getLabel() {
        return name + " (" + type + ")";
    }

    @Override
    public Geometry getShape() {
        return Geometry.LINE;
    }

    @Override
    public String getMarker() {
        return switch (type) {
            case ELECTRICAL -> Color.RED + " " + LineMarker.DASHED;
            case FIBER_OPTIC -> Color.GREEN + " " + LineMarker.DOTTED;
            case GAS -> Color.ORANGE + " " + LineMarker.SOLID;
            case WATER -> Color.BLUE + " " + LineMarker.SOLID;
            default -> Color.BLACK + " " + LineMarker.SOLID;
        };
    }

    @Override
    public String toJson() {
        return Mappable.super.toJson() + """
                , "name": "%s", "utility": "%s" """.formatted(this.name, this.type);
    }
}
