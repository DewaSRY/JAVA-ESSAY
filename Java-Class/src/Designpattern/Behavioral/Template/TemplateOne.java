package Designpattern.Behavioral.Template;

public class TemplateOne {
    public static void main(String[] args) {
        System.out.println();
    }
}

class GlassHouse extends HouseTemplate {
    @Override
    public void buildWalls() {
        System.out.println("Building Glass Walls");
    }

    @Override
    public void buildPillars() {
        System.out.println("Building Pillars with Glass coating");
    }
}

abstract class HouseTemplate {

    // Template Method
    // final, so subclasses can't override
    public final void buildHouse() {
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();

        System.out.println("House is Built!");
    }

    // Common Steps between all the houses:
    private void buildWindows() {
        System.out.println("Building Glass Windows");
    }

    private void buildFoundation() {
        System.out.println("Building Foundation (cement, Iron rods & Sand");
    }

    // Different Steps among the houses:
    public abstract void buildWalls();

    public abstract void buildPillars();

}

class WoodenHouse extends HouseTemplate {
    @Override
    public void buildWalls() {
        System.out.println("Building Wooden Walls");
    }

    @Override
    public void buildPillars() {
        System.out.println("Building Pillars with Wood coating");
    }
}
