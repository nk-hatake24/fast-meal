package gestionPayement;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import Adresse;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("1e57fa2a-a570-4270-876c-baa1d68734a2")
public class Banque {
    @objid ("5cced9e2-7ae8-44a9-9b1f-f643d71bdc89")
    private int id;

    @objid ("5ff174e7-dbc6-40ec-b431-7f5d2bcaf4b7")
    private int numeroCompte;

    @objid ("dcdc0611-59eb-491f-8818-a9271f6192d4")
    private Date dateValidite;

    @objid ("8421e934-d2ee-4dfc-9295-a2c3c93471fa")
    private char[] nom;

    @objid ("d5faadf0-a9e7-484f-a1c5-31c6003b88bc")
    private List<Adresse> adresses = new ArrayList<Adresse> ();

    @objid ("faa81f34-6f30-4523-9da8-2e51e21a5d19")
    int getId() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.id;
    }

    @objid ("2996558c-435c-4202-ae66-e31cc85f8617")
    int getNumeroCompte() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.numeroCompte;
    }

    @objid ("0c2b9f81-df5b-4ebb-b356-bb6d07843382")
    void setNumeroCompte(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.numeroCompte = value;
    }

    @objid ("519d0010-9c56-49ed-89a6-a87d5012e6c4")
    Date getDateValidite() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.dateValidite;
    }

    @objid ("fe3f8e07-fe64-4a18-b314-ed14ec2ebc2d")
    void setDateValidite(Date value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.dateValidite = value;
    }

    @objid ("815ae24d-a8aa-4ac6-b7d1-1a17901737b9")
    char[] getNom() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.nom;
    }

    @objid ("fcce8330-be02-4936-8666-934f4520cc71")
    void setNom(char[] value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.nom = value;
    }

    @objid ("56268dbe-863e-4057-84ee-96555c043a64")
    List<Adresse> getAdresses() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.adresses;
    }

    @objid ("a1358060-8748-4373-84f2-543f5adbcfff")
    void setAdresses(List<Adresse> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.adresses = value;
    }

}
