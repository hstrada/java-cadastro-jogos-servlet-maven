package br.senai.sp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.senai.sp.dao.JogoDao;
import br.senai.sp.model.Jogo;

/**
 * Servlet implementation class AdicionarLivroServlet
 */
@WebServlet("/administrador/adicionarJogo")
public class AdicionarJogoServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String nome = req.getParameter("nome");
		String desenvolvedor = req.getParameter("desenvolvedor");
		String genero = req.getParameter("genero");

		Jogo jogo = new Jogo();
		jogo.setNome(nome);
		jogo.setDesenvolvedor(desenvolvedor);
		jogo.setGenero(genero);

		JogoDao jogoDAO = new JogoDao();
		jogoDAO.salva(jogo);

		RequestDispatcher rd = req.getRequestDispatcher("/administrador/jogo-adicionado.jsp");
		rd.forward(req, resp);

	}

}
