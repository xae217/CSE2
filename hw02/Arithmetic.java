// Xavier Escobar
// February 3th, 2015
// CSE 002
// Arithmetic will compute the cost of items bought including tax.

public class Arithmetic{
    
    public static void main(String[] args) {
        
        // number of socks and cost per pair of socks
        int nSocks=3;
        double sockCost$=2.58;
        // number of drinking glasses and cost per glass
        int nGlasses=6;
        double glassCost$=2.29;
        // number of envelopes and cost per envelope
        int nEnvelopes=1;
        double envelopeCost$=3.25; 
        // PA tax percent in decimal form
        double taxPercent=0.06;
        
        // useful calculations and variable assignment
        double totalSockCost$=nSocks*sockCost$; // total cost of pair of socks
        double totalGlassCost$=nGlasses*glassCost$; // total cost of drink glasses
        double totalEnvelopCost$=nEnvelopes*envelopeCost$; // total cost of envelopes
        
        // total cost of purchase before tax
        double grossTotal$=totalEnvelopCost$+totalGlassCost$+totalSockCost$;
        // shorten the decimal spaces to two places
        grossTotal$*=100; // multiplies * 100 to translate 2 decimal places into int
        grossTotal$= (int) grossTotal$; // explicit casting to int
        grossTotal$/=100; // coverts back to double with only 2 decimal places
        
        //total cost of purchase after tax
        double netTotal$=grossTotal$*taxPercent+grossTotal$; 
        // shorten the decimal spaces to two places
        netTotal$*=100;  
        netTotal$= (int) netTotal$; 
        netTotal$/=100; 
        
        // sales tax per item
        double sockTax=totalSockCost$*taxPercent;
        sockTax*=100;
        sockTax= (int) sockTax;
        sockTax/=100;
        double glassTax=totalGlassCost$*taxPercent;
        glassTax*=100;
        glassTax= (int) glassTax;
        glassTax/=100;
        double envelopeTax=totalEnvelopCost$*taxPercent;
        envelopeTax*=100;
        envelopeTax= (int) envelopeTax;
        envelopeTax/=100;
        // total sales tax
        double totalSalesTax=grossTotal$*taxPercent;
        totalSalesTax*=100;
        totalSalesTax= (int) totalSalesTax;
        totalSalesTax/=100;
        
        // print costs of items and total cost of purchase
        
        // prints quantity and price per unit fot the pair of socks
        System.out.println(nSocks+" pair/s of socks at $"+sockCost$+" per unit");
        System.out.println("    total: $"+totalSockCost$); // prints total item cost 
        System.out.println("sales tax: $"+sockTax); // prints item sales tax 
        System.out.println(" "); // adds empty line
        
        // prints quantity and price per unit fot the drinking glasses
        System.out.println(nGlasses+" drinking glass/es at $"+glassCost$+" per unit");
        System.out.println("    total: $"+totalGlassCost$);
        System.out.println("sales tax: $"+(glassTax));
        System.out.println(" ");
        
        // prints quantity and price per unit fot the envelopes
        System.out.println(nEnvelopes+" envelope/s at $"+envelopeCost$+" per unit");
        System.out.println("    total: $"+totalEnvelopCost$);
        System.out.println("sales tax: $"+(envelopeTax));
        System.out.println(" ");
        
        // prints gross/net totals and total sales tax
        System.out.println("total gross cost: $"+grossTotal$);
        System.out.println("total sales tax: $"+totalSalesTax);
        System.out.println("total net cost: $"+netTotal$);
        
    }
    
}