package gestionDesRepasEtBoissons;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("3c66293c-4eb4-4cad-9b07-3bd8dad56384")
public class Boisson {
    @objid ("1121f8b2-45c4-4f83-8188-fef56f9f6aa3")
    private int id;

    @objid ("95167bd8-2af2-41f4-bbfc-6d874694f585")
    private String nom;

    @objid ("9363d38b-ad55-4b99-9166-14ffc6c8b9de")
    private Date date_exp;

    @objid ("21fe9a12-4c1f-46c5-941b-4c17567b57eb")
    private String description;

    @objid ("7829eeae-90ea-4f96-893d-9fc03ae22aae")
    private String image;

    @objid ("2aed44f5-ccd1-4619-83a3-f76b5b3d07e4")
    private float prix;

    @objid ("e7002e33-10d9-4ca1-8847-5cdb71436184")
    private List<Restaurant> restaurants = new ArrayList<Restaurant> ();

    @objid ("12f0ba37-dcdf-4070-b836-7fead53bf2fb")
    String getNom() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.nom;
    }

    @objid ("0cc67eb7-a405-41c0-8a00-6959f2eb5712")
    void setNom(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.nom = value;
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

    @objid ("47899862-24f0-4ad3-b78f-1f4ad21c9ff6")
    String getImage() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.image;
    }

    @objid ("2161f09f-6bf5-49c6-b4bb-377eb0af5249")
    void setImage(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.image = value;
    }

    @objid ("3cdf0780-116d-4874-bd57-2ae929edc347")
    int getId() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.id;
    }

    @objid ("4e2d6248-372c-4deb-b76b-878ffdfa53e4")
    void setId(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.id = value;
    }

    @objid ("0536e194-9a10-48fb-9dcb-478d73666ad7")
    float getPrix() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.prix;
    }

    @objid ("4438fd91-7a0c-41af-ae8a-82f7cae9c8dc")
    void setPrix(float value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.prix = value;
    }

}
