package MemberClass;

public class Person {
	private int code;
	private String id;
	private String passWord;
	private String rank;
	private String name;
	private String enList;
	private String tel;
	private String birth;
	private String grade;

	public Person() {
		this(0, "Not input value id", "Not input value passWord", "Not input value rank", "Not input value name",
				"Not input value enList", "Not input value tel", "Not input value birth", "Not input value grade");
	}

	public Person(int code, String id, String passWord, String rank, String name, String enList, String tel,
			String birth, String grade) {
		this.code = code;
		this.id = id;
		this.passWord = passWord;
		this.rank = rank;
		this.name = name;
		this.enList = enList;
		this.tel = tel;
		this.birth = birth;
		this.grade = grade;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEnList() {
		return enList;
	}

	public void setEnList(String enList) {
		this.enList = enList;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "code=" + code
				+ "\nid=" + id
				+ "\npassword=" + passWord
				+ "\nname=" + name
				+ "\ntel=" + tel
				+ "\nbirth=" + birth
				+ "\nrank=" + rank
				+ "\ngrade=" + grade
				+ "\nenList=" + enList;
	}
	
	public String memberJoinView() {
		return "이름 : " + name + "\n계급 : " + rank + "\n아이디 : " + id + "\n패스워드 : "
				+ passWord.replaceAll("[a-zA-Z0-9\"!@#$%\"]", "*") + "\n생년월일 : " + birth + "\n전화번호 : " + tel + "\n입대일 : " + enList;

	}
}
