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
import service.logic.UserMusicServiceLogic;

@WebServlet("/favoriteList.do")
public class FavoriteList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		UserMusicService service = new UserMusicServiceLogic();
		HttpSession session = request.getSession();
		User user = (User)session.getAttribute("loginedId");
		List<Music> list = service.findMusicsByUser(user.getLoginId());
		request.setAttribute("musicList", list);
		request.getRequestDispatcher("myList.jsp").forward(request, response);
	}

}
