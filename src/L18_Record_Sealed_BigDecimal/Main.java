package L18_Record_Sealed_BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product(
                "Laptop",
                new BigDecimal("1500.50"),
                "AZN"
        );

        System.out.println(p1);
        System.out.println(p1.isExpensive());

        BigDecimal price1 = new BigDecimal("15.50");
        BigDecimal price2 = new BigDecimal("24.75");
        System.out.println(price1.add(price2));

        BigDecimal balance = new BigDecimal("1000.00");
        BigDecimal payment = new BigDecimal("275.50");
        System.out.println(balance.subtract(payment));

        BigDecimal price = new BigDecimal("12.50");
        BigDecimal quantity = new BigDecimal("4");
        System.out.println(price.multiply(quantity));

        BigDecimal total = new BigDecimal("100.00");
        BigDecimal people = new BigDecimal("4");
        System.out.println(total.divide(people, 2, RoundingMode.HALF_UP));

        BigDecimal balance2 = new BigDecimal("150.00");
        BigDecimal required = new BigDecimal("100.00");
        if (balance2.compareTo(required)>0) System.out.println("Enough balance");
        if (balance2.compareTo(required)<0) System.out.println("Not enough balance");
        if (balance2.compareTo(required)==0) System.out.println("Exact balance");

        BigDecimal price4 = new BigDecimal("120.50");
        BigDecimal price5 = new BigDecimal("99.99");
        BigDecimal price6 = new BigDecimal("150.75");
        System.out.println(price4.max(price5).max(price6));
        System.out.println(price4.min(price5).min(price6));

        BigDecimal difference = new BigDecimal("-125.50");
        System.out.println(difference.abs());

        BigDecimal amount = new BigDecimal("250.00");
        System.out.println(amount.negate());

        BigDecimal price7 = new BigDecimal("125.575");
        System.out.println(price7.setScale(2, RoundingMode.UP));
        System.out.println(price7.setScale(2, RoundingMode.DOWN));
        System.out.println(price7.setScale(2, RoundingMode.HALF_UP));
        System.out.println(price7.setScale(2, RoundingMode.HALF_DOWN));
        System.out.println(price7.setScale(2, RoundingMode.HALF_EVEN));


    }

}
