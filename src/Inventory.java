public class Inventory implements Comparable<Inventory>
{
    private String item;
    private int qty;
    private float price;

    public Inventory(String item, int qty, float price)
    {
        this.item = item;
        this.qty = qty;
        this.price = price;
    }

    public String getItem()
    {
        return item;
    }

    public float getTotal()
    {
        return qty * price;
    }

    public String toString()
    {
        return "===================\nItem: " + item + "\n" + "Quantity: " + qty + "\n"
                + "Price: " + price + "\n====================\n";
    }

    public String toCSVString()
    {
        return item + "," + qty + "," + price;
    }

    @Override
    public int compareTo(Inventory obj)
    {
        return this.item.compareTo(obj.getItem());
    }
}