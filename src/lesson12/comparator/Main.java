package lesson12.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Laptop", 2500, 4.7, 5));
        products.add(new Product("Mouse", 40, 4.9, 100));
        products.add(new Product("Keyboard", 80, 4.5, 40));
        products.add(new Product("Monitor", 600, 4.8, 10));
        products.add(new Product("Phone", 1800, 4.6, 0));

        products.sort(getComparator(SortType.PRICE_ASC));
        products.forEach(System.out::println);
        System.out.println("-------------------------------------------------------");
        products.sort(getComparator(SortType.PRICE_DESC));
        products.forEach(System.out::println);
        System.out.println("-------------------------------------------------------");
        products.sort(getComparator(SortType.NAME_ASC));
        products.forEach(System.out::println);
        System.out.println("-------------------------------------------------------");
        products.sort(getComparator(SortType.NAME_DESC));
        products.forEach(System.out::println);
    }

    public static Comparator<Product> getComparator(SortType sortType) {

        return switch (sortType) {

            case PRICE_ASC -> Comparator.comparing(Product::getPrice);

            case PRICE_DESC -> Comparator.comparing(Product::getPrice)
                    .reversed();

            case NAME_ASC -> Comparator.comparing(Product::getName);

            case NAME_DESC -> Comparator.comparing(Product::getName)
                    .reversed();

            case RATING_DESC -> Comparator.comparing(Product::getRating)
                    .reversed();

            case STOCK_DESC -> Comparator.comparing(Product::getStock)
                    .reversed();
        };
    }


}
