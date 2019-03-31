package Stores;

abstract public class StoreBuilder {

	protected Store store;

	public Store getStore() {
		return store;
	}

	public void build() {
		this.store = new Store();
	}

	public abstract void setName(String name);
	public abstract void setType();

}
