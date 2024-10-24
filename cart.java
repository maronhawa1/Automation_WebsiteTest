public class cart {
    String name,description;
    int price,quantity,total;
    public cart(String name, int price,int quantity,int total){
        this.name=name;

        this.price=price;
        this.quantity=quantity;
        this.total=total;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getTotal() {
        return total;
    }

}
