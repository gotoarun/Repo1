package com.app;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Demo1Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello great World"
				+ "Come on up RCB");
	}
}
