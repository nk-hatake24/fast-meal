import java.util.Date;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("5ac5a8fb-3fd4-488a-b172-44ba91d86a79")
public class CuisinePlat {
    @objid ("53073198-8f43-4fd1-a4cf-3678d7fb97cb")
    private Date dateCuison;

    @objid ("24f694e9-17d1-4233-aef7-c2148b91a4b1")
    private String heureCuison;

    @objid ("686bc7ed-1115-4382-b325-5752783cae36")
    Date getDateCuison() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.dateCuison;
    }

    @objid ("b11bee6b-fd44-4fd3-adf8-2118d298fd75")
    void setDateCuison(Date value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.dateCuison = value;
    }

    @objid ("669271aa-d74d-47da-87de-d653186cd23f")
    String getHeureCuison() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.heureCuison;
    }

    @objid ("666df68c-3a9c-4963-b184-40253001ea6e")
    void setHeureCuison(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.heureCuison = value;
    }

}
