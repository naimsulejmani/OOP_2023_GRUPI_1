

package introduction.summary;


//mundet me pas importe

import java.math.BigDecimal;

public class Product {
    private BigDecimal price;
    private int number;

    public int getNumber() {
        return number;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = BigDecimal.valueOf(price);
    }

}








