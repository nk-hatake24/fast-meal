package gestion des repas et boissons;

import java.util.Date;
import Gestion employers.Serveur;
import Gestion employers.webmaster;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("3c66293c-4eb4-4cad-9b07-3bd8dad56384")
public class Boisson {
    @objid ("1121f8b2-45c4-4f83-8188-fef56f9f6aa3")
    private int id_bois;

    @objid ("95167bd8-2af2-41f4-bbfc-6d874694f585")
    private String nom_bois;

    @objid ("9363d38b-ad55-4b99-9166-14ffc6c8b9de")
    private Date date_exp;

    @objid ("21fe9a12-4c1f-46c5-941b-4c17567b57eb")
    private String description;

    @objid ("9f1aa4ca-3801-4205-9ff1-8d889c654454")
    private String image;

    @objid ("9a4d333d-abe6-49a2-8ff0-880e3d13b043")
    public Serveur sert;

    @objid ("d3ecdfe1-c02c-425c-91be-1f72f84e91d6")
    public webmaster webmaster;

    @objid ("12f0ba37-dcdf-4070-b836-7fead53bf2fb")
    String getNom_bois() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.nom_bois;
    }

    @objid ("0cc67eb7-a405-41c0-8a00-6959f2eb5712")
    void setNom_bois(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.nom_bois = value;
    }

    @objid ("0ee6344c-3dd7-40ad-bed9-46ffa6bb8b33")
    Date getDate_exp() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.date_exp;
    }

    @objid ("edd69fc7-794f-4281-9450-550916b48f21")
    void setDate_exp(Date value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.date_exp = value;
    }

    @objid ("0d3b687c-5c84-4bde-8ed4-bac912856092")
    String getDescription() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.description;
    }

    @objid ("fddebf10-2d64-4261-aaec-5b2fb264fd7b")
    void setDescription(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.description = value;
    }

    @objid ("6f21b58d-8c1c-4cec-aa0d-f1a010c29f7c")
    String getImage() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.image;
    }

    @objid ("c758aa46-fcc8-46be-870d-225dfb37c589")
    void setImage(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.image = value;
    }

}
