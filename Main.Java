// ALLEN MOODY


package com.company.Hello;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("Hello!");

        Order newOrder = new Order();

        Scanner input = new Scanner( System.in);
        int numberPizzas = Integer.parseInt(JOptionPane.showInputDialog("Begin order by entering number of pizzas"));


        newOrder.setPizzaCount(numberPizzas);
        if (newOrder.getPizzaCount() <= 0)
        {
            String quantityError = String.format("Not a valid number. Pizza quantity must be greater than 0. ");
            JOptionPane.showMessageDialog(null, quantityError);

            numberPizzas = Integer.parseInt(JOptionPane.showInputDialog("Enter number of pizzas"));

            newOrder.setPizzaCount(numberPizzas);
        }
        if (newOrder.getPizzaCount() == 3) {
            String dealApplied = String.format("3 for 15 deal applied.");
            JOptionPane.showMessageDialog(null, dealApplied);

        }

        String pizzaSize;
        pizzaSize = JOptionPane.showInputDialog("Enter the size of the pizzas");

        newOrder.setSize(pizzaSize);
        if (!"large".equals(newOrder.getSize()) && !"Large".equals(newOrder.getSize())
                && !"Medium".equals(newOrder.getSize()) && !"medium".equals(newOrder.getSize())
                 && !"Small".equals(newOrder.getSize()) && !"small".equals(newOrder.getSize()) )
        {
            String sizeError = String.format("Not a valid size. Enter Small, Medium, or Large");
            JOptionPane.showMessageDialog(null, sizeError);


            pizzaSize = JOptionPane.showInputDialog("Enter the size of the pizzas");
            newOrder.setSize(pizzaSize);
        }

        String pizzaTopping;
        pizzaTopping = JOptionPane.showInputDialog("Enter the topping of the pizza: ");
        newOrder.setTopping(pizzaTopping);

        String pizzaCrust;
        pizzaCrust = JOptionPane.showInputDialog("Enter the crust of the pizza");
        newOrder.setCrust(pizzaCrust);

        int bakeTime = newOrder.getPizzaCount() * 15;
        newOrder.setBakeTime(bakeTime);

        String orderResult = String.format("You ordered %s %s %s pizza with %s crust. It will be ready in %s minutes.",newOrder.getPizzaCount(),
                newOrder.getSize(), newOrder.getTopping(), newOrder.getCrust(), newOrder.getBakeTime());
        JOptionPane.showMessageDialog(null, orderResult);



    }
}
