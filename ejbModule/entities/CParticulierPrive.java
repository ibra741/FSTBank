package entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
public class CParticulierPrive extends Compte implements Serializable  {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long code;
	protected Client client ;
	private static final long serialVersionUID = 1L;

	public CParticulierPrive() {
		super();
	}

	public Long getCode() {
		return code;
	}

	public void setCode(Long code) {
		this.code = code;
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
