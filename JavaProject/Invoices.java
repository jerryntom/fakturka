package Fakturka.JavaProject;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Invoices {
    public ArrayList<Invoice> invoices_database = new ArrayList<Invoice>(100);

    public int load_invoices_database(String database_filename) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(database_filename))) {
            // Read all invoices from the file
            while (true) {
                try {
                    Invoice invoice = (Invoice) objectInputStream.readObject();
                    invoices_database.add(invoice);
                } 
                catch (EOFException e) {
                    // Reached the end of the file - EOF char
                    break;
                } 
                catch (IOException | ClassNotFoundException e) {
                    System.err.println("Error reading object from file " + database_filename + ": " + e.getMessage());
                    return -3;
                }
            }
        } 
        catch (FileNotFoundException e) {
            System.err.println("Error: File " + database_filename + " not found: " + e.getMessage());
            return -1;
        } 
        catch (IOException e) {
            System.err.println("Error: Unable to read file " + database_filename + ": " + e.getMessage());
            return -2;
        }

        return 0; // Success
    }
    
    public int save_invoices_database(String database_filename) {
    // Try to open the database file for writing
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(database_filename))) {
            // Write all invoices to the file
            for (Invoice invoice : invoices_database) {
                objectOutputStream.writeObject(invoice);
            }
        } 
        catch (FileNotFoundException e) {
            System.err.println("Error: Cannot create file " + database_filename);
            return -4;
        } 
        catch (IOException e) {
            System.err.println("Error: Unable to write to file " + database_filename);
            return -5;
        }

        return 0; // Success
    }

    public Invoice find_invoice(int NIP, String date_of_creation) {
        return null;
    }

    public int add_invoice_to_database(Invoice invoice) {
        invoices_database.add(invoice);
        return 0;
    }

    public int remove_invoice_from_database(String invoice_id) {
        return 0;
    }   
}