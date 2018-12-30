package entities;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class CProfessionnel extends Compte implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long code;
	protected Client client ;
	private String NomEntreprise;
	private static final long serialVersionUID = 1L;

	public CProfessionnel() {
		super();
	}

	public Long getCode() {
		return code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public String getNomEntreprise() {
		return NomEntreprise;
	}

	public void setNomEntreprise(String nomEntreprise) {
		NomEntreprise = nomEntreprise;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public void add(Observateur o) {
		listO.add(o);
		
	}

	@Override
	public void remove(Observateur o) {
		listO.remove(o);
		
	}

	@Override
	public void notifyO() {
		// TODO Auto-generated method stub
		
	}
	 
}
