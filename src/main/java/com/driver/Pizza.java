package com.driver;

public class Pizza {

    private int billprice;
    private Boolean isVeg;
    private String bill;
    private int cheesePrice;
    private int toppingsPrice;
    private int paperBagPrice;
    private boolean isExtraCheeseAdded;
    private boolean isExtraToppingsAdded;
    private boolean isPaperbagAdded;
    private boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;

        if(isVeg){
            this.billprice =300;
            this.toppingsPrice=70;
        }
        else{
            this.billprice =400;
            this.toppingsPrice=120;
        }

      this.cheesePrice=80;
        this.paperBagPrice=20;
        this.bill="Base Price Of The Pizza: "+this.billprice+"\n";
    }

    public int getBillprice(){
        return this.billprice;
    }

    public void addExtraCheese(){
        if(isExtraCheeseAdded==false){
            billprice+=cheesePrice;
            isExtraCheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        if(isExtraCheeseAdded==false){
            billprice+=toppingsPrice;
            isExtraCheeseAdded=true;
        }
    }

    public void addTakeaway(){
        if(isPaperbagAdded==false){
            billprice+=paperBagPrice;
            isPaperbagAdded=true;
        }
    }

    public String getBill(){
    if(isBillGenerated==false){
        if(isExtraCheeseAdded){
            bill+="Extra Cheese Added: "+this.cheesePrice;
        }
        if(isExtraToppingsAdded){
            bill+="Extra Toppings Added: "+this.toppingsPrice;
        }
        if(isPaperbagAdded){
            bill+="Paperbag Added: "+this.paperBagPrice;
        }
        bill=bill+"Total Price: "+bill;
        isBillGenerated=true;
    }
    return this.bill;
    }
}
