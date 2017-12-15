/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryan Messenger
 */
public class Cookie extends DessertItem{
    private int numberOf;
    private int pricePer12;
    
    /**
     * the constructor
     * @param name of the cookie type
     * @param number of cookies
     * @param pricePer12 price of a dozen
     */
    public Cookie(String name, int number, int pricePer12){
        super(name);
        this.numberOf = number;
        this.pricePer12 = pricePer12;
    }

    /**
     * formats the cookies name and price to fit on a receipt
     * @return the formatted string
     */
    public String toString(){
        String receipt = this.numberOf+" @ $"+DessertShoppe.cents2dollarsAndCents(this.pricePer12)+"/dz";
        receipt += "\n"+Cookie.super.getName();
        int cost = Cookie.this.getCost();
        String costs = DessertShoppe.cents2dollarsAndCents(cost);
        for (int i = Cookie.super.getName().length(); i < 30- costs.length(); i++) {
            receipt += " ";
        }
        receipt += costs;
        return receipt;
    }
        
/**
 * get the price of how many cookies 
 * @return the price of amount of cookies
 */
    @Override
    public int getCost() {
        int cost = 12/this.numberOf;
        cost = this.pricePer12/cost;
        return cost;
            }
}
