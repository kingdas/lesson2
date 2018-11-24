package com.yc.user;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yc.group.GroupDao;
import com.yc.group.GroupDaoImpl;
import com.yc.group.GroupModel;

//�Լ�д����
public class UserController extends HttpServlet {

	// TOMCAT���æ����doGet
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// ��������
		// System.out.println("doget");
		request.setCharacterEncoding("utf-8");
		String m = request.getParameter("m");
		if ("add".equals(m)) {
			add(request, response);
		} else if ("doAdd".equals(m)) {
			doAdd(request, response);
		} else if ("del".equals(m)) {
			del(request, response);
		} else if ("update".equals(m)) {
			update(request, response);
		} else if ("doUpdate".equals(m)) {
			doUpdate(request, response);
		} else {
			list(request, response);
		}
		System.out.println("get");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("post");
		doGet(req, resp);
	}

	// public static void main(String[] args) {
	// UserController uc = new UserController();// ����TOMCAT
	// try {
	// uc.doGet(null, null);
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// }

	UserDao userDao = new UserDaoImpl();
	GroupDao groupDao = new GroupDaoImpl();

	void update(HttpServletRequest request, HttpServletResponse response) {
		String ids = request.getParameter("id");
		int id = Integer.parseInt(ids);
		UserModel u = userDao.findById(id);
		request.setAttribute("u", u);
		List<GroupModel> gs = groupDao.findAll();
		request.setAttribute("gs", gs);
		try {
			request.getRequestDispatcher("userUpdate.jsp").forward(request,
					response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	void doUpdate(HttpServletRequest request, HttpServletResponse response) {
		String ids = request.getParameter("id");
		int id = 0;
		try {
			id = Integer.parseInt(ids);
		} catch (Exception e) {
			e.printStackTrace();
		}
		String name = request.getParameter("name");// ��ȡ��������
		String remark = request.getParameter("remark");
		String groupIdStr = request.getParameter("groupId");
		int groupId = Integer.parseInt(groupIdStr);// ת������
		UserModel u = new UserModel(id, name, remark, groupId);
		userDao.update(u);
		list(request, response);
	}

	void del(HttpServletRequest request, HttpServletResponse response) {
		String ids = request.getParameter("id");// ��ȡ��������
		int id = Integer.parseInt(ids);
		userDao.del(id);
		list(request, response);
	}

	void add(HttpServletRequest request, HttpServletResponse response) {
		List<GroupModel> gs = groupDao.findAll();
		request.setAttribute("gs", gs);
		try {
			request.getRequestDispatcher("userAdd.jsp").forward(request,
					response);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	void doAdd(HttpServletRequest request, HttpServletResponse response) {
		
		String rsn=	(String) request.getParameter("sn");
		String ssn=	(String) request.getSession().getAttribute("sn");
		if(!rsn.equals(ssn))
		{
			return ;
		} 
		request.getSession().removeAttribute("sn");
		String name = request.getParameter("name");// ��ȡ��������
		String remark = request.getParameter("remark");
		String groupIdStr = request.getParameter("groupId");
		int groupId = Integer.parseInt(groupIdStr);// ת������
		UserModel u = new UserModel(name, remark, groupId);
		userDao.add(u);
		list(request, response);
	}

	void list(HttpServletRequest req, HttpServletResponse resp) {
		List<UserModel> us = userDao.findAllAll();
		req.setAttribute("us", us);
		try {
			req.getRequestDispatcher("userList.jsp").forward(req, resp);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}