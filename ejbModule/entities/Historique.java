package entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
public class Historique implements Serializable ,Observateur{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private Compte compte;
	private Compte compte2;
	private double soldeTransaction;
	private double soldeTotal;
	private Date dateTransaction;
	
	private static final long serialVersionUID = 1L;

	public Historique() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	public Compte getCompte2() {
		return compte2;
	}

	public void setCompte2(Compte compte2) {
		this.compte2 = compte2;
	}

	public double getSoldeTransaction() {
		return soldeTransaction;
	}

	public void setSoldeTransaction(double soldeTransaction) {
		this.soldeTransaction = soldeTransaction;
	}

	public double getSoldeTotal() {
		return soldeTotal;
	}

	public void setSoldeTotal(double soldeTotal) {
		this.soldeTotal = soldeTotal;
	}

	public Date getDateTransaction() {
		return dateTransaction;
	}

	public void setDateTransaction(Date dateTransaction) {
		this.dateTransaction = dateTransaction;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
	
   
}
