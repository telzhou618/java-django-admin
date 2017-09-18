package com.github.foreyer;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.github.foreyer.core.controller.CrudController;
import com.github.foreyer.core.view.Form;
import com.github.foreyer.core.view.FormMap;

public class ModelParseInterceptor extends HandlerInterceptorAdapter {

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub

		if (handler instanceof HandlerMethod) {

			HandlerMethod handlerMethod = (HandlerMethod) handler;
			Object ctr = handlerMethod.getBean();
			if(ctr instanceof CrudController){
				Type type = ctr.getClass().getGenericSuperclass();
				ParameterizedType pt = (ParameterizedType) type;
				Type[] ts = pt.getActualTypeArguments(); //泛型中的参数
				Class<?> c = (Class<?>) ts[0]; //第一个参数
				Form form = FormMap.getForm(c.getSimpleName());
				request.setAttribute("form", form);
			}
			request.setAttribute("forms",FormMap.getForms());
			request.setAttribute("active", request.getParameter("active"));
			System.out.println("xxx");
		}

	}

}
