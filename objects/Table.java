package objects;

// since this is a European furniture, it is measured in cm and kg

public class Table {

    // Attributes
    private double height;
    private double width;
    private double weight;
    private double price;
    private double length;

    // Default Constructor - Special method
    // name of the method = the name of the class
    public Table(){
        height = 23;
        width = 40;
        weight = 52;
        price = 50;
        length = 936;
    }

    public Table(double height, double width, double weight, double price, double length) {
        this.height = height;
        this.width = width;
        this.weight = weight;
        this.price = price;
        this.length = length;

    }

    // Getters/Accessors
    public double getheight(){
        return height;
    }

    public double getwidth(){
        return width;
    }

    public double getweight(){
        return weight;
    }

    public double getprice(){
        return price;
    }

    public double getlength(){
        return length;
    }

    // Setters/Mutators
    public void setheight(double height){
        this.height = height;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setlength(double length){
        this.length = length;
    }

    public void setwidth(double width) {
        this.width = width;
    }

    public void setweight(double weight) {
        if (weight <= 1000) {
            this.weight = weight;
        }else{
            this.weight = 1000;
        }
    }





}
