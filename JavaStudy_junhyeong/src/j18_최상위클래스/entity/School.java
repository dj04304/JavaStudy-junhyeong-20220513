package j18_최상위클래스.entity;

import java.time.LocalDateTime;
import java.util.Objects;

//학교 정보
public class School {
	private String schoolName;//학교 이름
	private LocalDateTime schoolAnniversary; // 개교기념일
	private String  contactInformation; //연락처
	private int tuitionFee;	//등록금
	private int numberstudent; //학생 수
	private int schoolAddress; //학교 주소
	private String schoolType;//학교 유형
	
	//기본 생성자
	public School() {
		
	}

	//전체 생성자
	public School(String schoolName, LocalDateTime schoolAnniversary, String contactInformation, int tuitionFee,
			int numberstudent, int schoolAddress, String schoolType) {
		super();
		this.schoolName = schoolName;
		this.schoolAnniversary = schoolAnniversary;
		this.contactInformation = contactInformation;
		this.tuitionFee = tuitionFee;
		this.numberstudent = numberstudent;
		this.schoolAddress = schoolAddress;
		this.schoolType = schoolType;
	}

	//getter setter
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public LocalDateTime getSchoolAnniversary() {
		return schoolAnniversary;
	}

	public void setSchoolAnniversary(LocalDateTime schoolAnniversary) {
		this.schoolAnniversary = schoolAnniversary;
	}

	public String getContactInformation() {
		return contactInformation;
	}

	public void setContactInformation(String contactInformation) {
		this.contactInformation = contactInformation;
	}

	public int getTuitionFee() {
		return tuitionFee;
	}

	public void setTuitionFee(int tuitionFee) {
		this.tuitionFee = tuitionFee;
	}

	public int getNumberstudent() {
		return numberstudent;
	}

	public void setNumberstudent(int numberstudent) {
		this.numberstudent = numberstudent;
	}

	public int getSchoolAddress() {
		return schoolAddress;
	}

	public void setSchoolAddress(int schoolAddress) {
		this.schoolAddress = schoolAddress;
	}

	public String getSchoolType() {
		return schoolType;
	}

	public void setSchoolType(String schoolType) {
		this.schoolType = schoolType;
	}
	
	//hashCode
	@Override
	public int hashCode() {
		return Objects.hash(contactInformation, numberstudent, schoolAddress, schoolAnniversary, schoolName, schoolType,
				tuitionFee);
	}
	
	//equals()
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		School other = (School) obj;
		return Objects.equals(contactInformation, other.contactInformation) && numberstudent == other.numberstudent
				&& schoolAddress == other.schoolAddress && Objects.equals(schoolAnniversary, other.schoolAnniversary)
				&& Objects.equals(schoolName, other.schoolName) && Objects.equals(schoolType, other.schoolType)
				&& tuitionFee == other.tuitionFee;
	}

	//toString()
	@Override
	public String toString() {
		return "School [schoolName=" + schoolName + ", schoolAnniversary=" + schoolAnniversary + ", contactInformation="
				+ contactInformation + ", tuitionFee=" + tuitionFee + ", numberstudent=" + numberstudent
				+ ", schoolAddress=" + schoolAddress + ", schoolType=" + schoolType + "]";
	}
	
	 
	
}
