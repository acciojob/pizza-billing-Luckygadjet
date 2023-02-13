package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int cheese;

    private int toppings;

    boolean isCheeseAdded;
    boolean isToppingsAdded;
    boolean isPaperAdded;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.isCheeseAdded = false;
        this.isToppingsAdded = false;
        this.isPaperAdded = false;

        if(isVeg)
        {
            this.price = 300;
            this.toppings = 70;

        }
        else {
            this.price = 400;
            this.toppings=120;


        }
        this.bill ="Base Price Of The Pizza: "+this.price+"\n";
        this.cheese = 80;
        // your code goes here

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here

       if(!isCheeseAdded)
       {
           this.price +=this.cheese;
           isCheeseAdded = true;
       }


    }

    public void addExtraToppings(){
        // your code goes here
        if(!isToppingsAdded)
        {

            this.price +=this.toppings;

            isToppingsAdded =true;

        }
    }

    public void addTakeaway(){
        // your code goes here

        if(!isPaperAdded)
        {
            this.price +=20;
            isPaperAdded = true;

        }
    }

    public String getBill(){
        // your code goes here

        if(isCheeseAdded) {
            this.bill += "Extra Cheese Added: " + this.cheese + "\n";
        }
        if(isToppingsAdded){
            this.bill += "Extra Toppings Added: " + this.toppings + "\n";
        }
        if (isPaperAdded){
            this.bill += "Paperbag Added: 20" + "\n";
        }
        this.bill += "Total Price: "+getPrice()+"\n";

        return this.bill;
    }
}
