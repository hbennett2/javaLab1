// Class calcs the amount of money

public class Register {

    public static Purse makeChange(double amount)
    {
        Purse purse = new Purse();

        // dollar --> cents
        int cents = (int) (amount * 100);

        // # of hundreds
        int hundreds = cents / 10000;
        if (hundreds > 0)
        {
            purse.add(Denominations.hundredNote, hundreds);
            cents %= 10000;
        }

        // # of fifties
        int fifties = cents / 5000;
        if (fifties > 0)
        {
            purse.add(Denominations.fiftyNote, fifties);
            cents %= 5000;
        }

        // # of twenties
        int twenties = cents / 2000;
        if (twenties > 0){
            purse.add(Denominations.twentyNote, twenties);
            cents %= 2000;
        }

        // # of tens
        int tens = cents / 1000;
        if (tens > 0)
        {
            purse.add(Denominations.tenNote, tens);
            cents %= 1000;
        }

        // # of fives
        int fives = cents / 500;
        if (fives > 0)
        {
            purse.add(Denominations.fiveNote, fives);
            cents %= 500;
        }

        // # of ones
        int ones = cents / 100;
        if (ones > 0)
        {
            purse.add(Denominations.oneNote, ones);
            cents %= 100;
        }

        // # of quarters
        int quarters = cents / 25;
        if (quarters > 0){
            purse.add(Denominations.quarter, quarters);
            cents %= 25;
        }

        // # of dimes
        int dimes = cents / 10;
        if (dimes > 0){
            purse.add(Denominations.dime, dimes);
            cents %= 10;
        }

        // # of nickels
        int nickels = cents / 5;
        if (nickels > 0)
        {
            purse.add(Denominations.nickel, nickels);
            cents %= 5;
        }

        // # of pennies
        int pennies = cents;
        if (pennies > 0)
        {
            purse.add(Denominations.penny, pennies);
        }
        return purse;
    }
}

