package Factory;


import Stores.StoreType;

public interface AbstractFactory<T> {

	public T create(StoreType type);
}
