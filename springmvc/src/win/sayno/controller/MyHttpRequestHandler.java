package win.sayno.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpRequestHandler;

public class MyHttpRequestHandler implements HttpRequestHandler {

	@Override
	public void handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		arg0.setAttribute("message", "ÏûÏ¢");
		arg0.getRequestDispatcher("/WEB-INF/jsp/index.jsp").forward(arg0, arg1);
	}

}
