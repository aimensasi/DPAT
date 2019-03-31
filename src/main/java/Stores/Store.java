package Stores;

import java.util.concurrent.atomic.AtomicInteger;

public class Store {

	private static final AtomicInteger mIdCount = new AtomicInteger(0);

	private Integer mId;
	private String mName;
	private String type;

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
