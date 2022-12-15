package gestionPayement;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import gestionClient.Client;
import operationClient.Commande;

@objid ("6b4aaaee-a260-4fd0-9409-8ed5f5a786b7")
public class Facture {
    @objid ("4316bb7f-6b9c-42f1-9b6e-322ae8b9998a")
    private int id;

    @objid ("044edc3b-2305-4468-a973-3ef5464dfde8")
    private Client client;

    @objid ("ce8f49d3-7e75-41a3-b0a9-9416c1e1a83e")
    private Commande commande;

    @objid ("ee1d3b15-63ba-4b42-8288-f31b7bb24add")
    int getId() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.id;
    }

    @objid ("e4664dce-2b77-4cc6-bf14-63cdbb982831")
    Client getClient() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.client;
    }

    @objid ("e7ad5cd7-089d-44e5-a5f2-c9cbf9c70ca7")
    void setClient(Client value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.client = value;
    }

}
