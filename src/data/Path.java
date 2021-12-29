package data;

public enum Path {
	Person("D:\\JavaTest\\Gundol\\src\\data\\Person.dat"),
	WEAPON("data\\Weapon.dat");

	private String path;

	private Path(String path) {
		this.path = path;
	}

	public String getPath() {
		return path;
	}
}
