package exam4_1;

public class Member {
	private int memId;
	private String memName;
	private String memPasswd;
	private String memDate;
	private String memGender;
	private String memIntro;

	public int getMemId() {
		return memId;
	}

	public void setMemId(int memId) {
		this.memId = memId;
	}

	public String getMemName() {
		return memName;
	}

	public void setMemName(String memName) {
		this.memName = memName;
	}

	public String getMemPasswd() {
		return memPasswd;
	}

	public void setMemPasswd(String memPasswd) {
		this.memPasswd = memPasswd;
	}

	public String getMemDate() {
		return memDate;
	}

	public void setMemDate(String memDate) {
		this.memDate = memDate;
	}

	public String getMemGender() {
		return memGender;
	}

	public void setMemGender(String memGender) {
		this.memGender = memGender;
	}

	public String getMemIntro() {
		return memIntro;
	}

	public void setMemIntro(String memIntro) {
		this.memIntro = memIntro;
	}

	@Override
	public String toString() {
		return "회원목록 : 회원아이디 = " + memId + ", 회원이름 = " + memName + ", 비밀번호 = " + memPasswd + ",  가입일 = " + memDate
				+ ", 성별 = " + memGender + ", 자기소개 = " + memIntro + "]";
	}

	
}
