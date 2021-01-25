package com.educacionit.servlets;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.educacionit.entities.Usuario;

public class LoginServlet extends HttpServlet{
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException{
	
		HttpSession sesion = request.getSession();
		String accion = request.getParameter("accion");
		
		if("logout".equals(accion)) {
			sesion.invalidate();
			response.sendRedirect("index.jsp");
			return;
		}
		
		ArrayList<Usuario> usuarios = dameUsuarios();
		
		String username = request.getParameter("username");
		String pass = request.getParameter("password");
	
		boolean encontro = false;
		for(Usuario usuario : usuarios) {
			if (usuario.getUsername().equals(username) && usuario.getPassword().equals(pass)) {
				sesion.setAttribute("user", usuario);
				encontro = true;
				break;
			}
		}
		
		if (encontro) {
			sesion.setAttribute("error", "");
			response.sendRedirect("bienvenido.jsp");
		} else {
			sesion.setAttribute("error", "El usuarios es invalido");
			response.sendRedirect("index.jsp");
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
	
	@Override
	public String getServletInfo() {
		return "Short description";
	}
	
	private ArrayList<Usuario> dameUsuarios(){
		
		ArrayList<Usuario> usuarios = new ArrayList();
		
		Usuario u1 = new Usuario();
		u1.setApellido("Perez");
		u1.setNombre("Luis");
		u1.setUsername("luisperez");
		u1.setPassword("123");
		usuarios.add(u1);
		
		Usuario u2 = new Usuario();
		u2.setApellido("Ibarra");
		u2.setNombre("Rafael");
		u2.setUsername("rdi");
		u2.setPassword("123456");
		usuarios.add(u2);
		
		Usuario u3 = new Usuario();
		u3.setApellido("Flores");
		u3.setNombre("Maria");
		u3.setUsername("maflores");
		u3.setPassword("abc123");
		usuarios.add(u3);
		
		return usuarios;
	}
}
