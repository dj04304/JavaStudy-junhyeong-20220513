package j19_제네릭;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data	//getter setter equals hashCode toString 한번에 묶어있음
public class CMRespDto<T> {
	private int code;
	private String msg;
	private T data; //자료형이 때에 따라서 유동적으로 바뀌었으면 한다. 그래서 우리는 제네릭을 사용한다.
}
