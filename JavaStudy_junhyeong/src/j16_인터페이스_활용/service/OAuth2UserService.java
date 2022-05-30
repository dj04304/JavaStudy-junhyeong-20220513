package j16_인터페이스_활용.service;

/*
 * 카카오 등 통합 회원가입 시스템
 */

public class OAuth2UserService implements UserService{

	@Override
	public void create() {
		System.out.println("Kakao 계정 정보로 회원가입.");
		
	}

	@Override
	public void read() {
		System.out.println("Kakao 계정 정보가 포함된 자회사 정보 가져오기.");
		
	}

	@Override
	public void update() {
		System.out.println("Kakao 계정 정보를 유지하며 자회사 정보 수정하기,");
		
	}

	@Override
	public void delete() {
		System.out.println("자회서 계정과 Kakao계정 동기화 해제.");
		
	}

}
