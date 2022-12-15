import java.util.Date;
import Gestion employers.Serveur;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("b7dab6b4-3015-4354-bbde-e2c925193786")
public class ServirPlat {
    @objid ("c51adf68-d7b1-4bc5-aec2-2980658bb380")
    private Date date;

    @objid ("0e1221f1-a590-496e-9d2c-6c56c444143f")
    private String heureService;

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

    @objid ("37488ce0-b007-4e60-bd5c-3e6b6e8be6cd")
    void setAttribute(Serveur value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.Attribute = value;
    }

}
