package Fakturka.JavaProject;

import java.util.ArrayList;
import java.util.Objects;

public class Clients {
    private ArrayList<ClientProfile> clients_database = new ArrayList<ClientProfile>(100);

    public int load_clients_database(String database_filename) {
        return 0;
    }

    public int save_clients_database(String database_filename) {
        return 0;
    }

    public ClientProfile find_client(String NIP) {
        return null;
    }

    public int add_client_to_database(ClientProfile client_profile) {
        return 0;
    }

    public int remove_client_from_database(String NIP) {
        try {
            for (int i = 0; i < clients_database.size(); i++) {
                ClientProfile client = clients_database.get(i);
                if (Objects.equals(client.get_client_data().get(0), NIP)) {
                    // Remove the client from the database
                    clients_database.remove(i);
                }
            }
            // Save the updated client database
            save_clients_database("invoices");
            return 0; // Success
        }
        catch (Exception e) {
            System.err.println("Error removing client from database");
            e.printStackTrace();
            return -1; // Failure
        }
    }
}
