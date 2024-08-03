package com.hrms.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hrms.model.RegisterModel;
import com.hrms.model.Topic;
import com.hrms.service.UserService;
import com.hrms.service.UserServiceImpl;

public class UserController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        String userName = request.getParameter("userName");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        String mobile = request.getParameter("mobileNumber"); // Change to long
        String[] topicParams = request.getParameterValues("topic");
        HashSet<Topic> topics = new HashSet<>();

        if (topicParams != null) {
            for (String topic : topicParams) {
                topics.add(new Topic(topic));
            }
        }

        // Parse the date parameter
        String registerDateString = request.getParameter("registerDate");
        Date registerDate = null;
        try {
            registerDate = dateFormat.parse(registerDateString);
        } catch (ParseException e) {
            e.printStackTrace();
            out.print("Invalid date format.");
            return;
        }

        String parentContact = request.getParameter("parentContact");

        RegisterModel model = new RegisterModel();
        model.setUserName(userName);
        model.setEmail(email);
        model.setAddress(address);
        model.setMobileNumber(mobile); // Use long
        model.setTopics(topics);
        model.setRegisterDate(registerDate);
        model.setParentContact(parentContact);

        out.print(model);
        System.out.println(model);

        // Create an object to service navigation
        UserService userService = new UserServiceImpl();
        int registerValue = userService.registerUser(model);
        System.out.println(registerValue);

        response.sendRedirect("userList.jsp");
    }
}
