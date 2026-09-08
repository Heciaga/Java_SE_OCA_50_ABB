package L18_Record_Sealed_BigDecimal;

import java.math.BigDecimal;

public record Product(String name,
                      BigDecimal price,
                      String currency) {
    public Product {
        if (name == null || name.isBlank()) {
            throw new NullPointerException("name is null");
        }
        if (price == null || price.compareTo(BigDecimal.ZERO) <= 0) {
            throw new NullPointerException("price is null");
        }
        if (!"AZN".equals(currency)
                && !"USD".equals(currency)
                && !"EUR".equals(currency)) {
            throw new IllegalArgumentException("Invalid currency");
        }
    }

    Boolean isExpensive() {
        return price.compareTo(BigDecimal.valueOf(1000)) > 0;
    }
}
