package lesson12;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("Haci");
        System.out.println(name.get());
//
        String name1 = null;
        Optional<String> nameOptional = Optional.ofNullable(name1);
        System.out.println(nameOptional);
//
        Optional<String> isPresent = Optional.empty();
        System.out.println(isPresent.isPresent());
//
        Optional<String> name2 = Optional.of("Sahil");
        if (name2.isPresent())
            System.out.println(name2.get());
//
        Optional ifPresejnt = Optional.ofNullable(null);
        ifPresejnt.ifPresent(System.out::println);
//
        Optional<String> empty = Optional.empty();
        empty.ifPresentOrElse(System.out::println, () -> System.out.println("no value"));
//
        Optional<String> orElse = Optional.empty();
        String orElseString = orElse.orElse("Unknown");
        System.out.println(orElseString);

//
        Optional<String> optional = Optional.empty();
        String result = optional.orElseGet(() -> "Generated");
        System.out.println(result);
//
        Optional<String> orElseThrow = Optional.of("null");
        String resultOrElseThrow = orElseThrow.orElseThrow(
                () -> new RuntimeException("Not Found")
        );
//
        Optional<String> optionalStartsWith =
                Optional.of("Java");
        Optional<String> resultStartsWith =
                optionalStartsWith.filter(s -> s.startsWith("J"));
        System.out.println(result);
//
        Optional<String> city = Optional.of("baku");
        Optional<String> upper = city.map(String::toUpperCase);
        System.out.println(upper.get());
//
        Optional<String> first = Optional.empty();
        Optional<String> second = Optional.of("Default");
        Optional<String> resultOr =
                first.or(() -> second);
        System.out.println(resultOr);
//
        Optional<String> a = Optional.of("Java");
        Optional<String> b = Optional.of("Java");
        System.out.println(a.equals(b));
//
        Optional<String> nameHashCode = Optional.of("Java");
        System.out.println(nameHashCode.hashCode());
        Optional<String> nameHashCode2 = Optional.empty();
        System.out.println(nameHashCode2.hashCode());
    }
}
