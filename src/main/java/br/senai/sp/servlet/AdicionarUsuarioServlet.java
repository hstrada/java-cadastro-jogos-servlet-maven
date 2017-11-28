package br.senai.sp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.senai.sp.dao.UsuarioDAO;
import br.senai.sp.model.Usuario;


@WebServlet("/administrador/adicionarUsuario")
public class AdicionarUsuarioServlet {
		
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String usuario = req.getParameter("usuario");
		String senha = req.getParameter("senha");
		
		Usuario u = new Usuario();
		u.setUsuario(usuario);
		u.setSenha(senha);
		
		UsuarioDAO usuarioDao = new UsuarioDAO();
		usuarioDao.salva(u);

		RequestDispatcher rd = req.getRequestDispatcher("/administrador/usuario-adicionado.jsp");
		rd.forward(req, resp);

	}

}
