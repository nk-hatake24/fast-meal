import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import gestionClient.Client;

@objid ("9bc9853a-ec5e-4d14-bce2-cc3eef935ff6")
public class Adresse {
    @objid ("c37c0965-4ed8-46c5-b7b5-9a1e335bd227")
    private int id;

    @objid ("0d94368e-5795-4f03-9b24-d3bdc8e6601a")
    private String rue;

    @objid ("e7a86421-2d0f-4fdf-871b-1f0b5094d2ec")
    private String codePostal;

    @objid ("857395ea-aec2-480c-9e8c-453ebbba6598")
    private List<Client> client = new ArrayList<Client> ();

    @objid ("d8ed6c4a-6dae-419f-aca4-f92a3a467f89")
    int getId() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.id;
    }

    @objid ("2eddd734-8067-4537-aad4-f77722bb336b")
    String getRue() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.rue;
    }

    @objid ("3fe3939f-3d42-4c15-bfaf-3af1e5311259")
    void setRue(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.rue = value;
    }

    @objid ("5cb297d3-d474-4061-b19f-71d8067c9abf")
    String getCodePostal() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.codePostal;
    }

    @objid ("eecb4637-f2a9-413c-8f54-e5db63d70578")
    void setCodePostal(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.codePostal = value;
    }
    

}
