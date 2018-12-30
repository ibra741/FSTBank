package entities;

public interface Observable {
	public void add(Observateur o);
	public void remove(Observateur o);
	public void notifyO();
}
