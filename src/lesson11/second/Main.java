package lesson11.second;

public class Main {
    public static void main(String[] args) {
        Validator<String> notRmpty = (str) -> !str.isEmpty();
        Validator<Integer> checkAge = age -> age >= 18;
        Validator<String> email = mail -> mail.contains("@");

        ValidatorService.check("Salam", notRmpty);
        ValidatorService.check(13, checkAge);
        ValidatorService.check("zeynalovheci@gmail.com", email);
    }

}
