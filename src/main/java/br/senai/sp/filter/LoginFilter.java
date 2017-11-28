package br.senai.sp.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.senai.sp.model.Usuario;

@WebFilter("/administrador/*")
public class LoginFilter implements Filter {

	public void destroy() {
		System.out.println("Destruindo a nossa seção.");

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpSession session = ((HttpServletRequest) request).getSession();
		Usuario usuario = (Usuario) session.getAttribute("session_usuario");

		if (usuario == null) {
			((HttpServletResponse) response).sendRedirect("/java-cadastro-jogos-servlet-maven/login.jsp");
		}
		chain.doFilter(request, response);
	}

	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("Criando a nossa seção.");

	}

}
