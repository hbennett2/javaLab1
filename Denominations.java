// Class sets denominations to reference

public class Denominations{

    public record MoneyRecord(String name, double amount, String image) {}

    public static final MoneyRecord hundredNote = new MoneyRecord("Hundred Note", 100.00, "images/hundred_note.png");
    public static final MoneyRecord fiftyNote = new MoneyRecord("Fifty Note", 50.00, "images/fifty_note.png");
    public static final MoneyRecord twentyNote = new MoneyRecord("Twenty Note", 20.00, "images/twenty_note.png");
    public static final MoneyRecord tenNote = new MoneyRecord("Ten Note", 10.00, "images/ten_note.png");
    public static final MoneyRecord fiveNote = new MoneyRecord("Five Note", 5.00, "images/five_note.png");
    public static final MoneyRecord oneNote = new MoneyRecord("One Note", 1.00, "images/one_note.png");
    public static final MoneyRecord quarter = new MoneyRecord("Quarter", .25, "images/quarter.png");
    public static final MoneyRecord dime = new MoneyRecord("Dime", .10, "images/dime.png");
    public static final MoneyRecord nickel = new MoneyRecord("Nickel", .05, "images/nickel.png");
    public static final MoneyRecord penny = new MoneyRecord("Penny", .01, "images/penny.png");

}