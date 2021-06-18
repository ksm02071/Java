package CMExample;

// 부모 클래스

public class GameAdmin {
	
	String rewords; // 보상지급
	boolean userInfo;  // 유저 정보 읽기 권한
	boolean serverOnOff;// 서버 온 오프 권한
	
	public String setRewords(String rewords) {
		return this.rewords = rewords;
	}
	
	public void gameMasterPermissions(boolean userInfo , boolean serverOnOff) {
		this.userInfo = userInfo;
		this.serverOnOff = serverOnOff;
	}
}

//OO게임회사에서  성실하게 일하는 A씨가 있다
//A씨의 상사인 B씨는 더이상 게임관리자 일을 할수 없게 되어
//부하직원인 A씨에게 게임관리자 권한을 부여하기로 하였다
//이에 맞는 상속 클래스를 작성해볼 것
