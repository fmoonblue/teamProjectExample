package fmoonblue.spring.web.user.impl;

import fmoonblue.spring.web.user.UserService;
import fmoonblue.spring.web.user.UserVO;

public class UserServiceImpl implements UserService {
	private UserDAO userDAO;

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	public UserVO getUser(UserVO vo) {

		return userDAO.getUser(vo);
	}
}
