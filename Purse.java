 // Class used to add or remove denominations of money
 // Also used to calc total and get string representation

import java.util.HashMap;
import java.util.Map;

public class Purse
{
    // Create map that stores keys & int obj
    public Map<Denominations.MoneyRecord, Integer> cash;

    // Constructor -- starts new money collection
    public Purse()
    {
        cash = new HashMap<>();
    }

    // Adds # of moneyType to map
    public void add(Denominations.MoneyRecord moneyType, int num)
    {
        cash.put(moneyType, cash.getOrDefault(moneyType, 0) + num); // default 0 if type already exist
    }

     // Subtracts # of moneyType from map
    public double remove(Denominations.MoneyRecord moneyType, int num)
    {
        cash.put(moneyType, cash.get(moneyType) - num);
        return moneyType.amount() * num; // total removed
    }

    // Gets total value in purse
    public double getValue()
    {
        double total = 0;

        // iterate over each map entry in the set
        for (Map.Entry<Denominations.MoneyRecord, Integer> entry : cash.entrySet())
        {
            total += entry.getKey().amount() * entry.getValue();
        }
        return total;
    }

    // Represent purse contents
    public String toString()
    {
        StringBuilder stingBuild = new StringBuilder();

        // iterate over each map entry in the set
        for (Map.Entry<Denominations.MoneyRecord, Integer> entry : cash.entrySet())
        {
            // appends name - # per name 
            stingBuild.append(entry.getKey().name()).append(": ").append(entry.getValue()).append("\n");
        }
        return stingBuild.toString();
    }

}
