package gestion des repas et boissons;

import java.util.ArrayList;
import java.util.List;
import Gestion employers.Cuisinier;
import Gestion employers.Serveur;
import Gestion employers.webmaster;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("22a95825-fe02-444d-86d7-986bb4b5adc6")
public class Plat {
    @objid ("b75cfbec-8580-4314-9c59-2ee2bc6020b4")
    private int id_plat;

    @objid ("6b9e4323-01fc-407e-b8ad-32040f68b7b2")
    private String nom;

    @objid ("12c1ad67-82d2-4f65-a231-c56d2a7583ea")
    private String desription;

    @objid ("25f5798e-eff1-48c0-b5dc-6645a0e09d6b")
    private String imagePlat;

    @objid ("47d107b0-ea39-4c24-8b57-9be9b042363f")
    public int prixTTC;

    @objid ("ff34c6d4-0ca2-4920-a5fd-76e0f93490e3")
    public int cout;

    @objid ("aa4a125e-8d9d-41c3-847d-4451158be504")
    public Serveur estServit;

    @objid ("e4c40eb7-fe0a-4e19-8dde-a54ce9c1a6ab")
    public List<Cuisinier> cuisinier = new ArrayList<Cuisinier> ();

    @objid ("8d613c86-5aed-4110-9758-06b4c91828e2")
    public webmaster webmaster;

    @objid ("a7e877b4-8f39-4020-97c9-82bda876a365")
    int getId_plat() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.id_plat;
    }

    @objid ("38a72ae0-ec0c-4c8a-baff-ad9bb3e5661c")
    void setId_plat(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.id_plat = value;
    }

    @objid ("1eb0241b-b0c5-426e-87fd-e2f0a12ce20d")
    String getNom() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.nom;
    }

    @objid ("9380daba-f18c-4ae0-8abe-5fc0043308bb")
    void setNom(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.nom = value;
    }

    @objid ("7ab4d6b4-8a5b-4486-a8ec-4fb460c8942b")
    String getDesription() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.desription;
    }

    @objid ("e1d6b2bd-a70a-469b-ae38-76cc10f0eafa")
    void setDesription(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.desription = value;
    }

    @objid ("89db3dfe-e551-4d06-b3dc-871e89872fc6")
    String getImagePlat() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.imagePlat;
    }

    @objid ("2fa66f47-8984-4b6c-a400-71a035cbfc95")
    void setImagePlat(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.imagePlat = value;
    }

}
