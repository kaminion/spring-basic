package t_tok03;

// Advice : 부가기능을 담당하는 모듈(commit 등) 관점
public class LoggingAdvice {

	// 이전 관점
	public void beforeAdvice()
	{
		System.out.println("메서드 실행전 로그 출력");
	}
	
	public void beforeBuyConfirm()
	{
		System.out.println("@@@@구매 전 아이템 확인은 필수입니다 @@@@");
	}
	
}
