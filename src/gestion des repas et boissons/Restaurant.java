package gestion des repas et boissons;

import java.util.ArrayList;
import java.util.List;
import Gestion employers.Employer;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import gestion Client.Client;

@objid ("ad5d04d2-8327-423c-966d-4de4d553c1a3")
public class Restaurant {
    @objid ("86249898-f82e-4f02-9f36-95c815e5f0c6")
    private int id_restau;

    @objid ("d23b1110-06ea-4b72-afd5-425c76c5e7ab")
    private String nom;

    @objid ("db6006b9-f63a-45f1-b045-dbc339224148")
    public Menu menu;

    @objid ("973bcd96-3ee4-4138-b4a0-5f9a8b016b02")
    public List<Client> client = new ArrayList<Client> ();

    @objid ("de59b944-7081-4d20-b948-cd83467e82f7")
    public List<Employer> travailler = new ArrayList<Employer> ();

    @objid ("e514f77c-5816-417b-a131-8f573f510759")
    public List<Boisson> boisson = new ArrayList<Boisson> ();

}
