package Stores;

public class GameStore extends StoreBuilder{

	@Override
	public void setName(String name) {
		store.setName(name);
	}

	@Override
	public void setType() {
		store.setType(StoreType.GameStore.toString());
	}
}
