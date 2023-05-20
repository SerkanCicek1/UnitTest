package Day3.Mocking.Sample2;

public class ShoppingCartService {

    private ProductManager productManager ;

    public ShoppingCartService(ProductManager productManager) {
        this.productManager = productManager;
    }

    // !!! test edilecek metod
    public boolean addProductToCart(String productId) {

        int stockstatus = productManager.getStockStatus(productId);

        if(stockstatus > 0 ) {
            productManager.decreaseStock(productId); // stock -1 --->  stock +1
            return true ;
        } else {
            return false;
        }

    }
}