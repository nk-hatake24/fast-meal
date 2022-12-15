import java.util.Date;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("5f28b37e-4dcd-4f2c-b51a-e22c335cdc5b")
public class Restaut_embauche {
    @objid ("371249dd-37b6-496f-9576-703dbe01488a")
    private Date dateEmboche;

    @objid ("cbaef7d7-4fac-477c-aa36-b7d7a899010d")
    private String poste;

    @objid ("f26731f0-3d3b-4b1a-acee-93485f1b0e43")
    private int id;

    @objid ("93dd15bf-ea9e-4b9c-aabd-5b39ecdf854d")
    String getPoste() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.poste;
    }

    @objid ("186619b6-ee37-403a-8629-6c970dfbb835")
    void setPoste(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.poste = value;
    }

    @objid ("1951f72e-eeff-482a-8ee0-b41c92b01249")
    int getId() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.id;
    }

    @objid ("7c1752fb-b2b1-4a34-833d-c70457b79cc9")
    void setId(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.id = value;
    }

}
