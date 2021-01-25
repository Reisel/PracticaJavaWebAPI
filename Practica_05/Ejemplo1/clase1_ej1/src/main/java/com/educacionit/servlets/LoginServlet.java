/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.educacionit.servlets;

import com.educacionit.client.UsuarioFacebook;
import com.educacionit.entities.Usuario;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.codehaus.jettison.json.JSONException;


public class LoginServlet extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
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
            sesion.setAttribute("error", "El usuario es invalido");
            response.sendRedirect("index.jsp");
        }
        
    }
    
    
     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession sesion = request.getSession();
        String accion = request.getParameter("accion");
        
        if("logout".equals(accion)) {
            sesion.invalidate();
            response.sendRedirect("index.jsp");
            return;
        }
        
        String token = request.getParameter("access_token");
        
        if(!token.equals("")) {
            try {
                Usuario usuario = UsuarioFacebook.getUsuario(token);
                sesion.setAttribute("user", usuario);
                sesion.setAttribute("error", "");
                response.sendRedirect("bienvenido.jsp");
                
            } catch (JSONException ex) {
                Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    
    private ArrayList<Usuario> dameUsuarios() {
        ArrayList<Usuario> usuarios = new ArrayList();
        Usuario u1 = new Usuario();
        u1.setApellido("Sanchez");
        u1.setNombre("Reisel");
        u1.setUsername("Reisel");
        u1.setPassword("racely03");
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
