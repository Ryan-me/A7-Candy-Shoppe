/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryan Messenger
 */
public class Sundae extends IceCream{
    private int cost;
    private String toppingName;
    private int toppingCost;
    
    /**
     * constructor
     * @param icName name of the ice cream sent to the super class
     * @param icCost cost of the ice cream sent to the super class
     * @param toppingName name of the topping
     * @param toppingCost name of the topping
     */
    public Sundae(String icName, int icCost, String toppingName, int toppingCost){
            super(icName,icCost);
            this.cost = icCost;
            this.toppingName = toppingName;
            this.toppingCost = toppingCost;
    }
    

    /**
     * 
     * @return 
     */
    public String toString(){
        String receipt = "";
        receipt += Sundae.super.getName()+ " with";
        receipt += "\n"+this.toppingName;
        int cost = Sundae.this.getCost();
        String costs = DessertShoppe.cents2dollarsAndCents(cost);
        for (int i = this.toppingName.length(); i < 30- costs.length(); i++) {
            receipt += " ";
        }
        receipt += costs;
        return receipt;
    }
    /**
 * get the price of how many sundaes 
 * @return the price of amount of sundaes
 */
    @Override
    public int getCost() {
        int cost = this.cost+ this.toppingCost;
        return cost;
    }
}
