package entities;

import java.util.ArrayList;
import java.util.Date;

public abstract class Compte implements Observable {
	protected double solde;
	protected Date dateCreation;
	protected ArrayList<Observateur> listO = new ArrayList<Observateur>();
	
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	
}
