package com.wyc.web.action.base;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 所有控制器基类
 */
public abstract class GenericController {

	private long executeTime = 0L; // action执行时间,纳秒
	private String sessionId;

	private HttpServletRequest request;
	private HttpServletResponse response;

	public static final String LOGIN_SESSION = "loginSession";

	/**
	 * 验证码标识
	 */
	public static final String AUTH_CODE = "authCode";

	protected static final String ADD = "add";
	protected static final String EDIT = "edit";
	protected static final String LIST = "list";
	protected static final String INDEX = "index";
	protected static final String CREATE = "create";
	protected static final String UPDATE = "update";
	protected static final String DESTORY = "destory";

	@InitBinder
	public void initBinder(WebDataBinder binder) {
	}

	public HttpServletRequest getRequest() {
		return request;
	}

	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

	public HttpServletResponse getResponse() {
		return response;
	}

	public void setResponse(HttpServletResponse response) {
		this.response = response;
	}

	public Object getCurrentSession() {
		return getSessionAttribute(LOGIN_SESSION);
	}

	public void setCurrentSession(Object currentSession) {
		setSessionAttribute(LOGIN_SESSION, currentSession);
	}

	public void removeCurrentSession() {
		getSession().removeAttribute(LOGIN_SESSION);
	}

	public String getContextPath() {
		return getRequest().getContextPath();
	}

	public ServletContext getServletContext() {
		return getSession().getServletContext();
	}

	public void setSessionAttribute(String key, Object value) {
		getSession().setAttribute(key, value);
	}

	public Object getSessionAttribute(String key) {
		return getSession().getAttribute(key);
	}

	public HttpSession getSession() {
		return getRequest().getSession();
	}

	public double getExecuteTime() {
		return 0;
	}

	public void setExecuteTime() {
		this.executeTime = System.nanoTime();
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

}
