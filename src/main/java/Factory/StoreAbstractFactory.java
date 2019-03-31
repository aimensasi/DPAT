package Factory;

import Stores.*;

public class StoreAbstractFactory implements AbstractFactory<Store>{

	private static final StoreAbstractFactory mStoreAbstractFactory = new StoreAbstractFactory();

	public static StoreAbstractFactory getInstance(){
		return mStoreAbstractFactory;
	}

	private StoreAbstractFactory(){}



	@Override
	public Store create(StoreType type) {
		Store store = null;

		switch (type){
			case BookStore:
				store = new BookStore();
				break;
			case GameStore:
				store = new GameStore();
				break;
			case FoodStore:
				store = new FoodStore();
				break;
		}

		return store;
	}
}
