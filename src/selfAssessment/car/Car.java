package selfAssessment.car;

public class Car {

    private String model;
    private String year;
    private double price;
    private int discount;

    public Car(String model, String year, double price, int discount){
        this.discount = discount;
        this.model = model;
        this.year = year;
        int carDiscount = discount/100;
        double amount = carDiscount * price;
        price = price - amount;
        this.price = price;
    }

    public void setModel(String model){

        this.model = model;
    }
    public String getModel(){

        return this.model;
    }

    public void setYear(String year){
        this.year = year;
    }
    public String getYear(){
        return this.year;
    }


    public void setPrice(double price){
        boolean itIsPositive = price > 0;
        if (itIsPositive){
            int carDiscount = discount/100;
            double amount = carDiscount * price;
            price = price - amount;
            this.price = price;
        }
    }
    public double getPrice(){

        return price = price - discount;
    }


}