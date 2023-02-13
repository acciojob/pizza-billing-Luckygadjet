package com.driver;

public class DeluxePizza extends Pizza {


    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        super.flag_cheese = false;
        super.flag_tops = false;
        if(isVeg)
        {
            int cheese_tops = 70+80;
            setPrice(getPrice()+cheese_tops);
        }
        else
        {
            int cheese_tops =120+80;
            setPrice(getPrice()+cheese_tops);
        }

        // your code goes here
    }

}
