package Designpattern.Creation.Prototype;

import java.util.HashMap;
import java.util.Map;

public class Colors {
    public static void main(String[] args) {
        System.out.println();
        ColorStore colorStore = new ColorStore();
        colorStore.duplicate(new RedColor());
    }
}

interface Color {
    void applyColor();

    Color clone();

}

// Creating Duplicates of colors and storing them
class ColorStore {
    Map<String, Color> colorMap = new HashMap<>();

    public void duplicate(Color color) {

        // cloning the colors
        Color newColor = color.clone();

        // Adding the cloned colors to Map
        colorMap.put("Red", newColor);

    }

}

class RedColor implements Color {
    private String colorName = "Red";

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    @Override
    public void applyColor() {
        System.out.println("Applying " + colorName + " color");

    }

    @Override
    public Color clone() {
        RedColor newColor = new RedColor();
        newColor.setColorName("RED");
        newColor.applyColor();
        return newColor;
    }
}
