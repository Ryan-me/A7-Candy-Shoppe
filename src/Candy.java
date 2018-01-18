/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryan Messenger
 */
public class Candy extends DessertItem{
    private int costLbs;
    private double lbs;
    /**
     * the constructor
     * @param name of the candy
     * @param weight of the candy
     * @param pricePerLbs of the candy
     */
    public Candy(String name, double weight, int pricePerLbs){
        super(name);
        this.costLbs = pricePerLbs;
        this.lbs = weight;
    }
/**
 * creates how the candy appears when outputted
 * @return the string of the formatted candy
 */
    public String toString(){
        String receipt = this.lbs+" lbs. @ $"+DessertShoppe.cents2dollarsAndCents(this.costLbs)+" /lb.";
        receipt += "\n"+Candy.super.getName();
        int cost = Candy.this.getCost();
        String costs = DessertShoppe.cents2dollarsAndCents(cost);
        for (int i = Candy.super.getName().length(); i < 30- costs.length(); i++) {
            receipt += " ";
        }
        receipt += costs;
        return receipt;
    }
/**
 * gets the cost of the  candy
 * @return the cost of the amount of candy
 */
    @Override
    public int getCost() {
        double cost = this.costLbs*this.lbs;
        cost =Math.round(cost);
        int costs = (int)(cost);
        return costs;
    }
}
