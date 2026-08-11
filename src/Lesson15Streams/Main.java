package Lesson15Streams;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        TransactionService service = new TransactionService();
        /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
        Transaction t1 = new Transaction(1,
                "Haci",
                TransactionType.TRANSFER,
                800, Priority.NORMAL,
                1
        );
        Transaction t2 = new Transaction(2,
                "Sahil",
                TransactionType.WITHDRAW,
                2300, Priority.URGENT,
                2
        );
        Transaction t3 = new Transaction(3,
                "Xeqani",
                TransactionType.PAYMENT,
                1500, Priority.URGENT,
                3
        );
        Transaction t4 = new Transaction(4,
                "Senan",
                TransactionType.PAYMENT,
                500, Priority.NORMAL,
                4
        );
        /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
        service.addTransaction(t1);
        service.addTransaction(t2);
        service.addTransaction(t3);
        service.addTransaction(t4);
        /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
        service.processTransactions();
        /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        service.showHistory();
        /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
        System.out.println("1000 den boyuk emeliyyatlar~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        List<Transaction> above1000 = service.findAboveAmount(1000);
        above1000.forEach(System.out::println);
        /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
        System.out.println("Ancaq TRANSFER emeliyyatlar~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        List<Transaction> listTransfer = service.findTransfers();
        listTransfer.forEach(System.out::println);
        /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
        System.out.println("Meblege gore artan sira~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        List<Transaction> listSortByAmount = service.sortByAmount();
        listSortByAmount.forEach(System.out::println);
        /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
        System.out.println("Total emeliyyat meblegi~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(service.getTotalAmount());
        /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
        System.out.println("En boyuk emeliyyat~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Optional<Transaction> largestTransaction = service.getLargestTransaction();
        largestTransaction.ifPresent(System.out::println);
        /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
        System.out.println("Tarixceye baxmaq Version2~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        service.browseHistory();


    }
}
