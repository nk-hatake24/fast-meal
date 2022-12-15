import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import Adresse;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("b4420942-ee27-4a84-b851-1a8cf4cecea2")
public abstract class Personne {
    @objid ("b18de8b7-4dc3-44f3-a4c5-c96b042f12b1")
    protected int id;

    @objid ("507ca51e-4f44-48ee-87f0-fe67244302fa")
    protected char[] nom;

    @objid ("6299cd6e-31ca-4ae3-babf-8f8c235a78ac")
    protected char[] prenom;

    @objid ("6b96a4f1-a850-4706-b4c3-2e5cf768cb21")
    protected char[] telephone;

    @objid ("9ed76282-3987-433d-ba6c-7fe1b4c3ea24")
    protected char[] motPasse;

    @objid ("1ea545de-4292-4725-bd65-3b1b9a17a79e")
    protected char[] email;

    @objid ("5d51cd73-4c77-4bf8-95e6-1e2ca829674e")
    protected Date dateNais;

    @objid ("25e3e064-6897-4dd5-9ffe-fbfa830e2c9e")
    protected List<Adresse> adresses = new ArrayList<Adresse> ();

    @objid ("419300ed-d771-475d-a0ad-f72fda9d0798")
    protected Adresse adresseNaissance;

    @objid ("d567369f-c4a5-4ab3-9f1f-72109297244b")
    char[] getMotPasse() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.motPasse;
    }

    @objid ("32603e91-e358-4aa7-9e9d-2c0ff08ec5da")
    void setMotPasse(char[] value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.motPasse = value;
    }

    @objid ("71b802d8-a4b0-41db-825d-080dc6327f08")
    char[] getNom() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.nom;
    }

    @objid ("e0a7bfa2-2003-41ad-8b59-cfc98172371d")
    void setNom(char[] value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.nom = value;
    }

    @objid ("b89dbfb5-ee44-4316-b42b-e2bbbb969c1c")
    void setPrenom(char[] value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.prenom = value;
    }

    @objid ("25544563-c9da-47e4-8f54-358d60b5c12b")
    char[] getTelephone() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.telephone;
    }

    @objid ("c4f910c2-94e8-4357-b693-16c5f3b23c2c")
    void setTelephone(char[] value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.telephone = value;
    }

    @objid ("16d2112e-1abf-4ed7-a406-dde2e5c8dd59")
    char[] getEmail() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.email;
    }

    @objid ("c1fbbd8c-b997-4b49-a9e0-02bde3b3207e")
    void setEmail(char[] value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.email = value;
    }

    @objid ("e33900c9-5414-400b-a812-767a62dbf981")
    int getId() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.id;
    }

    @objid ("f97f1354-973b-4ebb-8a84-d0f5a70d6ca7")
    char[] getPrenom() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.prenom;
    }

    @objid ("4afdc8e6-2bd4-4f7e-8429-6daeba6a2690")
    Date getDateNais() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.dateNais;
    }

    @objid ("bd892ff6-4412-4db7-b892-9896bc657500")
    void setDateNais(Date value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.dateNais = value;
    }

    @objid ("f5152ca1-38b1-40f3-8b7f-9905b89ffef8")
    List<Adresse> getAdresses() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.adresses;
    }

    @objid ("85f6fa95-11b1-4b79-884c-56f89448ae7a")
    void setAdresses(List<Adresse> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.adresses = value;
    }

    @objid ("d9556096-c873-46fc-b8e8-1e57da8a1127")
    void addAdresses(Adresse value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.adresses.push(value);
    }

}
