package Designpattern.Behavioral.Template;

public class TemplateTwo {
    public static void main(String[] args) {
        System.out.println();
    }
}

abstract class ComputerTemplate {

    // Template Method
    public final void buildComputer() {
        buildMotherBoard();
        buildCPU();
        buildHDD();
        buildGraphics();
    };

    // Steps to Follow
    public abstract void buildMotherBoard();

    public abstract void buildCPU();

    public abstract void buildHDD();

    public abstract void buildGraphics();

}

class StandardComputer extends ComputerTemplate {
    @Override
    public void buildMotherBoard() {
        System.out.println("Standard Mother Board");
    }

    @Override
    public void buildCPU() {
        System.out.println("Intel Core i7");
    }

    @Override
    public void buildHDD() {
        System.out.println("1 TB HDD");
    }

    @Override
    public void buildGraphics() {
        System.out.println("No Graphics Card");
    }
}

class SuperComputer extends ComputerTemplate {
    @Override
    public void buildMotherBoard() {
        System.out.println("TUF Mother Board");
    }

    @Override
    public void buildCPU() {
        System.out.println("Intel i9 12th Gen.");
    }

    @Override
    public void buildHDD() {
        System.out.println("2 TB NVME");
    }

    @Override
    public void buildGraphics() {
        System.out.println("Nvidia GTX 4070");
    }
}