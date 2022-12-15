package operationClient;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import gestionClient.Client;
import gestionDesRepasEtBoissons.Boisson;
import gestionDesRepasEtBoissons.Menu;
import gestionDesRepasEtBoissons.Plat;

@objid ("3443ea33-02a6-46d2-9d0e-9c67d74b91cb")
public class Panier {
    @objid ("65874f9b-5873-4446-8fa2-424895209fbf")
    private int id;

    @objid ("5642a23e-e7ab-46ac-b047-98c2dedcf3f1")
    private int qtn_plat;

    @objid ("af184176-d6c1-4893-a474-d61e368704e4")
    private float PrixT;

    @objid ("9fbb4234-ef75-4df0-a164-022ee93191fd")
    private Client client;

    @objid ("ab8ad985-b5a2-46c3-8379-3fb6b2bc9681")
    private List<Boisson> boissons = new ArrayList<Boisson> ();

    @objid ("42a9b6c3-9776-4618-92ed-9fcc79eb4ed4")
    private List<Plat> plats = new ArrayList<Plat> ();

    @objid ("cd893db3-f318-4c0c-ad04-9b8c44f2e977")
    private List<Menu> menus = new ArrayList<Menu> ();

    @objid ("9d0a3f95-4a18-49ad-89e4-7503d1258ad0")
    public void calculPrixAPayer(Plat plat, Integer quantite) {
    }

    @objid ("7022de55-5a48-45d8-8971-1789d0cad048")
    int getId() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.id;
    }

    @objid ("a07c8515-03da-4862-af46-8ae94fc5e071")
    Client getClient() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.client;
    }

    @objid ("703df53d-f20d-412c-bc28-08f32faeae00")
    void setClient(Client value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.client = value;
    }

    @objid ("29993264-bae9-4be8-9087-4e822e216a12")
    List<Boisson> getBoissons() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.boissons;
    }

    @objid ("c0d73779-2093-4387-ab9a-d2f22cf3cf09")
    void setBoissons(List<Boisson> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.boissons = value;
    }

    @objid ("42570a86-ffae-499f-8ca9-3a19e0da108d")
    List<Plat> getPlats() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.plats;
    }

    @objid ("fa365e17-8a9c-4063-8dcb-9a2154dc212c")
    void setPlats(List<Plat> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.plats = value;
    }

    @objid ("f6fd8fc8-a7d2-4530-9e14-45d43e775453")
    List<Menu> getMenus() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.menus;
    }

    @objid ("669708b1-b579-479f-8a04-0cf731b08b0f")
    void setMenus(List<Menu> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.menus = value;
    }

}
