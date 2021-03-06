package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domain.Music;
import domain.User;
import service.UserMusicService;
import service.UserService;
import service.logic.UserMusicServiceLogic;
import service.logic.UserServiceLogic;

@WebServlet("/addFavorite.do")
public class MyListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		UserMusicService service = new UserMusicServiceLogic();
		HttpSession session = request.getSession(false);
		if(session == null || session.getAttribute("loginedId") == null){
			response.sendRedirect("login.do");
		}else{
			User user = (User)session.getAttribute("loginedId");
			int musicId = Integer.parseInt(request.getParameter("musicId"));
			service.register(user.getLoginId(), musicId);
			response.sendRedirect("favoriteList.do");
		}
	}
}
