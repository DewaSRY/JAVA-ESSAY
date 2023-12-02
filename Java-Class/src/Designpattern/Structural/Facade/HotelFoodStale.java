package Designpattern.Structural.Facade;

public class HotelFoodStale {
    public static void main(String[] args) {
        System.out.println();
    }
}

class BothResto implements Hotel {
    @Override
    public Menus getMenus() {
        BothVegNon b = new BothVegNon();
        return b;
    }
}

class BothVegNon extends Menus {
    public BothVegNon() {
        super("Crispy Baked Falafel \n" +
                "\"Grilled Chicken Escalope\"");
    }
}

interface Hotel {
    public Menus getMenus();

}

class HotelKeeper {

    public VegMenu getVegMenu() {
        VegResto v = new VegResto();
        VegMenu vegMenu = (VegMenu) v.getMenus();
        return vegMenu;
    }

    public NonVegMenu getNonVegMenu() {
        NonVegResto v = new NonVegResto();
        NonVegMenu nonVegMenu = (NonVegMenu) v.getMenus();
        return nonVegMenu;
    }

    public BothVegNon getVegNonVegMenu() {
        BothResto b = new BothResto();
        BothVegNon bothMenus = (BothVegNon) b.getMenus();
        return bothMenus;
    }
}

abstract class Menus {
    private String menu;

    public Menus(String menu) {
        this.menu = menu;
    }

    public String getMenu() {
        return menu;
    }
}

class NonVegMenu extends Menus {
    public NonVegMenu() {
        super("Grilled Chicken Escalope");
    }
}

class NonVegResto implements Hotel {
    @Override
    public Menus getMenus() {
        NonVegMenu nv = new NonVegMenu();
        return nv;
    }
}

class VegMenu extends Menus {
    public VegMenu() {
        super("Crispy Baked Falafel");
    }
}

class VegResto implements Hotel {
    @Override
    public Menus getMenus() {
        VegMenu v = new VegMenu();
        return v;
    }
}
