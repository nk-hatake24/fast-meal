import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import Gestion employers.Serveur;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import gestionDesRepasEtBoissons.Boisson;
import gestionDesRepasEtBoissons.Menu;

@objid ("b7dab6b4-3015-4354-bbde-e2c925193786")
public class Service {
    @objid ("c51adf68-d7b1-4bc5-aec2-2980658bb380")
    private Date date;

    @objid ("0e1221f1-a590-496e-9d2c-6c56c444143f")
    private String heure;

    @objid ("7fe35661-264e-48ac-b11e-f47d01e84a12")
    private int id;

    @objid ("1e2239eb-1c9c-4806-971a-cca80153a354")
    private Serveur serveur;

    @objid ("7886857f-f210-4837-abc4-a9725bd465b3")
    public Boisson boisson;

    @objid ("a1da46f4-fade-415a-980a-6b8f01dc1d14")
    private List<Menu> menus = new ArrayList<Menu> ();

    @objid ("2681a117-5fa5-45a1-be31-ef07411d869a")
    private List<platCuisiné> plats = new ArrayList<platCuisiné> ();

    @objid ("7fb2fed3-bc52-449e-8b43-06864ac3af49")
    Date getDate() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.date;
    }

    @objid ("fbcc7eec-a249-457a-ac4c-97254a5429da")
    void setDate(Date value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.date = value;
    }

    @objid ("27dbda50-12ed-4096-acf3-b2c2c57f115b")
    String getHeureService() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.heureService;
    }

    @objid ("ef3b0924-7efa-4f43-a7ea-39ecf78b4f69")
    void setHeureService(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.heureService = value;
    }

    @objid ("505a8881-28ee-4f70-bff8-7c147bd1d52b")
    int getId() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.id;
    }

    @objid ("79f7312e-4115-4eff-b049-61d124d6c519")
    List<platCuisiné> getPlats() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.plats;
    }

    @objid ("3c1aa2fb-9be1-40d6-a614-59ee9d398564")
    void setPlats(List<platCuisiné> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.plats = value;
    }

}
