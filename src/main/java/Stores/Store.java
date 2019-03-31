package Stores;

import java.util.concurrent.atomic.AtomicInteger;

public class Store {

	private static final AtomicInteger mIdCount = new AtomicInteger(0);

	private Integer mId;
	private String mName;

	public Store() {
		mId = mIdCount.incrementAndGet();
	}

	public Integer getId() {
		return mId;
	}

	public String getName() {
		return mName;
	}

	public void setName(String name) {
		mName = name;
	}

}
