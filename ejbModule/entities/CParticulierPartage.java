package entities;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.*;

@Entity
public class CParticulierPartage extends Compte implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long code;
	private ArrayList<Client> list = null;
	private static final long serialVersionUID = 1L;

	public CParticulierPartage() {
		super();
		ArrayList<Client> list = new ArrayList<Client>();
	}

	public Long getCode() {
		return code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public ArrayList<Client> getList() {
		return list;
	}

	public void setList(ArrayList<Client> list) {
		this.list = list;
	}

	@Override
	public void add(Observateur o) {
		listO.add(o);
		
	}

	@Override
	public void remove(Observateur o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyO() {
		// TODO Auto-generated method stub
		
	}

	
   
}
