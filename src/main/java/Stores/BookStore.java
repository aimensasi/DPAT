package Stores;

public class BookStore extends StoreBuilder{

	@Override
	public void setName(String name) {
		store.setName(name);
	}

	@Override
	public void setType() {
		store.setType(StoreType.BookStore.toString());
	}
}
