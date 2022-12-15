package gestion des repas et boissons;

import java.util.ArrayList;
import java.util.List;
import Gestion employers.webmaster;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("35a55d38-1a81-4193-82e7-f6f42f3cabac")
public class Menu {
    @objid ("27289966-051b-4172-8230-1e2655c2a6e5")
    private int id;

    @objid ("400e9f8c-1f52-412e-9df8-f4f523c4ab38")
    private String datePublic;

    @objid ("d66ade91-f778-4151-a92d-6f21f74b78d9")
    public List<Plat> contenir = new ArrayList<Plat> ();

    @objid ("305a1fff-5ff2-49ea-b308-5fa509289664")
    public webmaster webmaster;

    @objid ("80e26dc0-f4f0-4671-8466-c0ad00db8073")
    int getId() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.id;
    }

    @objid ("f75cf1e6-2f04-4cbe-810e-a38bb755dd29")
    void setId(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.id = value;
    }

    @objid ("e47904b4-69d1-4f72-9bb1-0535a3993438")
    String getDatePublic() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.datePublic;
    }

    @objid ("5cdacc77-384c-4733-ab1c-12a733ef9dc5")
    void setDatePublic(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.datePublic = value;
    }

}
