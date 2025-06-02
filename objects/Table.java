package objects;

// since this is a European furniture, it is measured in cm and kg

public class Table {

    // Attributes
    double height;
    double width;
    double weight;
    double price;
    double length;

    // Default Constructor
    // name of the method = the name of the class
    public Table(){
        height = 23;
        width = 40;
        weight = 52;
        price = 50;
        length = 936;
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







}
