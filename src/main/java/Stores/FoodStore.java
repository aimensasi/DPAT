package Stores;

public class FoodStore extends StoreBuilder{

	@Override
	public void setName(String name) {
		store.setName(name);
	}

	@Override
	public void setType() {
		store.setType(StoreType.FoodStore.toString());
	}
}
