package j21_익명클래스;

import java.util.Collection;
import java.util.List;

public class GrantedAuthorityImpl implements GrantedAuthority{

	@Override
	public Collection<String> getRoles(List<String> roles) {
		return roles;
	}

}
