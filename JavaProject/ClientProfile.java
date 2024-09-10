package Fakturka.JavaProject;

import java.util.ArrayList;

public class ClientProfile implements java.io.Serializable {
    private String NIP;
    private String company_name;
    private String address;
    private String tel_number;
    private String owner_firstname;
    private String owner_lastname;

    public ClientProfile(String NIP, String company_name, String address, String tel_number,
                         String owner_firstname, String owner_lastname) {
        this.NIP = NIP;
        this.company_name = company_name;
        this.address = address;
        this.tel_number = tel_number;
        this.owner_firstname = owner_firstname;
        this.owner_lastname = owner_lastname;
    }

    public int save_to_clients_database(Clients clients_database) {
        return 0;
    }

    public ArrayList<String> get_client_data() {
        // Create an ArrayList to store the client data
        ArrayList<String> clientData = new ArrayList<String>();

        clientData.add("NIP: " + NIP);
        clientData.add("Company name: " + company_name);
        clientData.add("Address: " + address);
        clientData.add("Tel number: " + tel_number);
        clientData.add("Owner firstname: " + owner_firstname);
        clientData.add("Owner lastname: " + owner_lastname);

        // Print the client data
        for (String dataItem : clientData) {
            System.out.println(dataItem);
        }

        // Return the client data
        return clientData;
    }

    public int update_client_data() {
        return 0;
    }
}
