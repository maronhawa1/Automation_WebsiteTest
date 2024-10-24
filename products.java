public class products {
String nameofprod;
int price;
Boolean isAvailbale;
String brand;
int quantityToCart;
products(String nameofprod,int price,boolean isAvailbale,String brand,int quantityToCart){
    this.nameofprod=nameofprod;
    this.price=price;
    this.isAvailbale=isAvailbale;
    this.brand=brand;
    this.quantityToCart=quantityToCart;
}
    public String getNameofprod() {
        return this.nameofprod;
    }
    public int getPrice() {
        return this.price;
    }
    public boolean getIsAvailable() {
        return this.isAvailbale;

    }
    public String getBrand() {
        return this.brand;
    }
   /* public int getQuantityToCart() {
        return this.quantityToCart;

    }*/
    public int addToCart(int num){
    if (num<0){
        System.out.println("You cant add to cart quantity under 0");
    }
    return  this.quantityToCart=num;
    }














}
