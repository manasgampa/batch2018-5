package net.antra1;

public final class ImmutableEx {

	private final int id;
	private final String name;
	
	public ImmutableEx(int id, String name) {
		
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	
}
