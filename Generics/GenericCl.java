package Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericCl {
    static public void run() {
        var nationalUSParks = new Park[]{
        new Park("Yellowstone", "44.4882, -110.5916"),
        new Park("Grand Canyon", "36.1085, -112.0965"),
        new Park("Yosemite", "37.8855, -119.5360")
        };

        Layer<Park> parkLayer = new Layer<>(nationalUSParks);
        parkLayer.renderLayer();
        var majorUSRivers = new River[]{
                new River("Mississippi",
                        "47.2160, -95.2348", "29.1566, -89.2495",
                        "35.1556, -90.0659"),
                new River("Missouri",
                        "45.9239, -111.4983", "38.8146, -90.1218")
        };
        Layer<River> riverLayer = new Layer<>(majorUSRivers);

        riverLayer.addElements(new River[]{
            new River("Colorado","40.4708, -105.8286", "31.7811, -114.7724"),
            new River("Delaware","42.2026, -75.00836", "39.4955, -75.5592")
        });

        riverLayer.renderLayer();
    }
    
}

interface MapAbles {

    void render();

    static double[] stringToLatLOng(String location) {
        var splits = location.split(",");
        double lat = Double.valueOf(splits[0]);
        double lon = Double.valueOf(splits[1]);
        return new double[]{lat, lon};
    }
    
    
}

abstract class Point implements MapAbles {

    private double[] location = new double[2];

    public Point(String location) {
        this.location = MapAbles.stringToLatLOng(location);
    }

    @Override
    public void render() {

        System.out.println("Render " + this + " as POINT (" + location() + ")");
    }

    private String location() {
        return Arrays.toString(location);
    }
}


abstract class Line implements MapAbles {

    private double[][] locations;

    public Line(String... locations) {
        this.locations = new double[locations.length][];
        int index = 0;
        for (var l : locations) {
            this.locations[index++] = MapAbles.stringToLatLOng(l);
        }
    }

    @Override
    public void render() {
        System.out.println("Render " + this + " as LINE (" + locations() + ")");
    }

    private String locations() {
        return Arrays.deepToString(locations);
    }
}

class Park extends Point {

    private String name;

    public Park(String name, String location) {
        super(location);
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " National Park";
    }
}


 class River extends Line {

    private String name;

    public River(String name, String... locations) {
        super(locations);
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " River";
    }
}

class Layer <T extends MapAbles> {

    private List<T> layerElements;

    public Layer(T[] layerElements) {
        this.layerElements = new ArrayList<T>(List.of(layerElements));
    }

    public void addElements(T[] elements) {
        layerElements.addAll(List.of(elements));
    }

    public void renderLayer() {

        for (T element : layerElements) {
            element.render();
        }
    }
}