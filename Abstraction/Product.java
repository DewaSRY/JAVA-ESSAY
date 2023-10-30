package Abstraction;

public  class Product {
    

}
 abstract  class ProductForSale {
    
     protected String type;
     protected double price;
     protected String description;
     
     public ProductForSale(String type, double price, String description) {
         this.type = type;
         this.price = price;
         this.description = description;
     }

     public double getSalePrice(int qyt) {
         return this.price * qyt;
     }

     public void printPricedItem(int qyt) {
         System.out.printf("%2d qty at $%8.2f each , %-15s %-35s %n", qyt, this.price, this.type, this.description);
     }

     public abstract void showDetails();
}

class ArtObject extends ProductForSale {

    public ArtObject(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("This "+ this.type+ " is a beautiful product ");
        System.out.printf("the price of this piece is $%6.2f %N ", this.price);
        System.out.println(this.description);
    }
    
}