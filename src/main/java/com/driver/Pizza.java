package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    boolean flag_cheese = true;
    boolean flag_tops = true;
    boolean flag_paper = true;

    public void setPrice(int price) {
        this.price = price;
    }



    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg)
        {
            this.price = 300;
        }
        else {
            this.price = 400;
        }
        // your code goes here

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here

       if(flag_cheese)
       {
           this.price +=80;
           flag_cheese = false;
       }


    }

    public void addExtraToppings(){
        // your code goes here
        if(flag_tops)
        {
            if(isVeg)
            {
                this.price +=70;
            }
            else{
                this.price += 120;
            }
            flag_tops = false;
        }
    }

    public void addTakeaway(){
        // your code goes here

        if(flag_paper)
        {
            this.price +=20;
            flag_paper = false;
        }
    }

    public String getBill(){
        // your code goes here
        if(isVeg)
        {
            this.bill = "Base Price Of The Pizza: 300\nExtra Cheese Added: 80\nExtra Toppings Added: 70\nPaperbag Added: 20\nTotal Price: "+getPrice()+"\n";
        }
        else
        {
            this.bill = "Base Price Of The Pizza: 400\nExtra Cheese Added: 80\nExtra Toppings Added: 120\nPaperbag Added: 20\nTotal Price: "+getPrice()+"\n";
        }

        return this.bill;
    }
}
