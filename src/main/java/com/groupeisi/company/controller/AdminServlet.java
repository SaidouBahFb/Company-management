package com.groupeisi.company.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.groupeisi.company.dto.AccountUserDto;

/**
 * Servlet implementation class AdminServlet
 */
@WebServlet(name = "admin", value = "/admin")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Logger logger = LoggerFactory.getLogger(LoginServlet.class);
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<AccountUserDto> users = new ArrayList<AccountUserDto>();
		users.add(new AccountUserDto(1L, "seck@gmail.com", true));
		users.add(new AccountUserDto(2L, "ngor@gmail.com", false));
		users.add(new AccountUserDto(3L, "cherif@gmail.com", true));
		users.add(new AccountUserDto(4L, "seydou@gmail.com", false));
		
	    logger.info("User list size: {}", users.size());
	    for (int i = 0; i < users.size(); i++) {
	        AccountUserDto user = users.get(i);
	        logger.info("User {} details: ID={}, Email={}, State={}", i+1, user.getId(), user.getEmail(), user.isState());
	    }
	    
		request.setAttribute("userList", users);
		
		
		request.getRequestDispatcher("WEB-INF/jsp/admin/users.jsp").forward(request, response);
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
