package arquillian;

public class Passenger {

	private String identifier;
	private String name;

	public Passenger(String identifier, String name) {
		super();
		this.identifier = identifier;
		this.name = name;
	}

	public String getIdentifier() {
		return identifier;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Passenger " + getName() + " with identifier: "
				+ getIdentifier();
	}

}
