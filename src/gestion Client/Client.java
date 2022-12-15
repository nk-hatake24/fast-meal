package gestion Client;

import java.util.ArrayList;
import java.util.List;
import Adresse;
import Personne;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import gestion des repas et boissons.Plat;
import operation Client.Commande;

@objid ("720c913f-7285-42f6-9da2-e379dcddee93")
public class Client extends Personne {
    @objid ("3ba85ffe-1310-42f0-80eb-fd352e277a01")
    private float solde;

    @objid ("7443ada7-fac3-4f84-9009-38d287f780df")
    private int panier = panier;

    @objid ("3eda76f7-cc67-4d4b-b8a5-e02a66cdc430")
    private List<Adresse> adresse = new ArrayList<Adresse> ();

    @objid ("951312fd-db6a-4618-9ef6-3a2225be9d49")
    public void commander(Plat p1) {
    }

    @objid ("e1704a8d-6e84-4fdf-98d6-a169521c3606")
    public void modifierCommande(Commande cmd) {
    }

    @objid ("703a17ea-83b7-4258-8d4c-cae9ad8de09b")
    public void annulerCmd(Commande cmd) {
    }

    @objid ("d1c2310e-3d69-4035-a2fb-35e5d1a57b18")
    float getSolde() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.solde;
    }

    @objid ("4f5ff917-6a79-4775-a13f-4cd14118d296")
    void setSolde(float value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.solde = value;
    }

    @objid ("5c411537-a9ad-47b7-9b70-6871adeefe93")
    public void ajoutPanier(int id_produit, int qte) {
    }

    @objid ("2161bb09-366f-4443-868c-34013e705917")
    public void seConnecter(String email, String motPasse) {
    }

    @objid ("4a8ef3e5-fa9e-417f-80f5-a3fb1671875c")
    int getPanier() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.panier;
    }

    @objid ("e8c1cdaf-ea7f-48fb-a2bc-4d09cdb5f396")
    List<Adresse> getAdresse() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.adresse;
    }

    @objid ("5f625c58-6973-44af-9e6d-5bfdd6a72ba4")
    void setAdresse(List<Adresse> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.adresse = value;
    }

    @objid ("1bc20376-97d4-497c-aaf3-20df9e441ec1")
    public Client(String nom, String prenom, String email, String password, date dateNaiss, String telPers) {
    	this.nom = nom;
    	this.prenom = prenom;
    	this.email = email;
    	this.motPasse = password;
    	this.dateNaiss = dateNaiss;
    	this.telPers = telPers;
    }

}
