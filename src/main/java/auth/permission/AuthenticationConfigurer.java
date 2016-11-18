package auth.permission;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import app.dao.UserDAO;
import app.entity.User;

@Component
public class AuthenticationConfigurer implements AuthenticationProvider {
	private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationConfigurer.class);

	private final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

	@Autowired
	private HttpServletRequest request;

	@Autowired
	private UserDAO userRepository;

	private UsernamePasswordAuthenticationToken authenticateDataBase(Authentication authentication)
			throws AuthenticationException {
		String name = authentication.getName();
		String rawPassword = authentication.getCredentials().toString();
		List<User> users = userRepository.findByLogin(name, new PageRequest(0, 100)).getContent();

		if (users.isEmpty())
			throw new UsernameNotFoundException("Usuário não encontrado!");

		User user = users.get(0);
		if (passwordEncoder.matches(rawPassword, user.getPassword())) {
			org.springframework.security.core.userdetails.User userDetails = new org.springframework.security.core.userdetails.User(
					user.getName(), user.getPassword(), false, false, false, false, null);
			UsernamePasswordAuthenticationToken userToken = new UsernamePasswordAuthenticationToken(userDetails,
					user.getPassword(), null);
			userToken.setDetails(userDetails);

			HttpSession session = request.getSession();
			session.setAttribute("theme", (user.getTheme() != null) ? user.getTheme() : "");

			return userToken;
		} else {
			throw new BadCredentialsException("Usuário ou senha incorreta!");
		}
	}

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		return authenticateDataBase(authentication);
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return authentication.equals(UsernamePasswordAuthenticationToken.class);
	}

}
