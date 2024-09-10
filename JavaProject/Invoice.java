package Fakturka.JavaProject;

import java.util.ArrayList;

public class Invoice implements java.io.Serializable {
    private ClientProfile client;
    private ArrayList<ArrayList<String>> products_data = new ArrayList<ArrayList<String>>();
    private ArrayList<String> company_data = new ArrayList<String>();
    private String invoice_id;
    private String date_of_creation;

    public Invoice(ClientProfile client, ArrayList<ArrayList<String>> products_data,
                   ArrayList<String> company_data, String invoice_id, String date_of_creation) {
        this.client = client;
        this.products_data = products_data;
        this.company_data = company_data;
        this.invoice_id = invoice_id;
        this.date_of_creation = date_of_creation;
    }

    public int save_to_invoices_database(Invoices invoices_database) {
        return 0;
    }

    public ArrayList<String> get_invoice_data() {
        client.get_client_data();
        System.out.println("Invoice ID: " + invoice_id);
        System.out.println("Date of creation: " + date_of_creation);
        return null;
    }

    public int export_invoice_to_pdf() {
        return 0;
    }

    public int update_invoice_data() {
        return 0;
    }
}