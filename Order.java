// ALLEN MOODY

package com.company.Hello;

/**
 * Created by AJ on 1/28/15.
 */
public class Order {

    private String crust;
    private String size;
    private float price;
    private String topping;
    private int pizzaCount;
    private int bakeTime;


    public void setSize( String sizePizza)
    {
        size = sizePizza;
    }

    public void setCrust( String crustType)
    {
        crust = crustType;
    }

    public void setPrice( Float pizzaPrice )
    {
        price = pizzaPrice;
    }

    public void setTopping( String pizzaTopping)
    {
        topping = pizzaTopping;
    }

    public void setPizzaCount( int count)
    {
        pizzaCount = count;
    }

    public void setBakeTime( int time)
    {
         bakeTime = time;

    }





    public String getSize()
    {
        return size;
    }

    public String getCrust()
    {
        return crust;
    }

    public Float getPrice()
    {
        return price;
    }

    public String getTopping()
    {
        return topping;
    }

    public int getPizzaCount()
    {
        return pizzaCount;
    }

    public int getBakeTime()
    {
        return bakeTime;
    }



}
