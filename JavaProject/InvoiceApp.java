package Fakturka.JavaProject;
import java.util.ArrayList;

public class InvoiceApp {
    private ArrayList<String> config_data = new ArrayList<String>();
    private static Invoices invoices = new Invoices();
    private static Employees employees = new Employees();

    public static void main(String[] args) {
        System.out.println("Test odczytu / zapisu (baza faktur)");

        ClientProfile client1 = new ClientProfile(
                "PL123456218",
                "POL1",
                "ul. Sloneczna 12 21-500 Biala Podlaska",
                "+48500300200",
                "Mateusz",
                "Kowal"),
                client2 = new ClientProfile(
                "PL123456230",
                "POL2",
                "ul. Podrzeczna 33 21-500 Biala Podlaska",
                "+48512531599",
                "Mariusz",
                "Kowalski");
        Invoice invoice1 = new Invoice(client1, null, null, "2024/BBB/10", "15/01/2024"),
                invoice2 = new Invoice(client2, null, null, "2024/KKK/1", "15/01/2024");

// save to file
        invoices.add_invoice_to_database(invoice1);
        invoices.add_invoice_to_database(invoice2);
        invoices.save_invoices_database("invoices");

// load from file and read first

        invoices.load_invoices_database("invoices");

        System.out.println("|DANE FAKTURA 1|");
        invoices.invoices_database.get(0).get_invoice_data();

        System.out.println("|DANE FAKTURA 2|");
        invoices.invoices_database.get(1).get_invoice_data();

        System.out.println("Test przebiegl pomyslnie!");
    }

    public int update_config_data() {
        return 0;
    }

    public int log_in() {
        return 0;
    }

    public int log_out() {
        return 0;
    }
}
