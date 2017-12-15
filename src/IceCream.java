/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryan Messenger
 */
public class IceCream extends DessertItem{
    private int cost;

    public IceCream(String name, int cost){
        super(name);
        this.cost = cost;
    }

  /**
   * formates the outputs of the ice cream
   * @return the formatted ice creams
   */
    public String toString(){
       String receipt = "";
        receipt += IceCream.super.getName();
        int cost = IceCream.this.getCost();
        String costs = DessertShoppe.cents2dollarsAndCents(this.cost);
        for (int i = IceCream.super.getName().length(); i < 30- costs.length(); i++) {
            receipt += " ";
        }
        receipt += costs;
        return receipt;
    }

/**
 * get the price of how many ice cream 
 * @return the price of amount of ice cream
 */
    @Override
    public int getCost() {
        return this.cost;
    }
    
}
