package com.driver;

public class DeluxePizza extends Pizza {


    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        super.flag_cheese = false;
        super.flag_tops = false;
        if(isVeg)
        {
            int cheesetops = 150;
            setPrice(getPrice()+cheesetops);
        }
        else
        {
            int cheesetops =200;
            setPrice(getPrice()+cheesetops);
        }

        // your code goes here
    }

}
