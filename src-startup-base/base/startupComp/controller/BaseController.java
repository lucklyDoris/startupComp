package base.startupComp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.ModelAttribute;

@Scope("prototype")
public class BaseController<T>{
	
	private static Logger logger = Logger.getLogger(BaseController.class); 
	
	protected HttpServletRequest request;  
    protected HttpSession session;  
    protected HttpServletResponse response;  
    
      
    @ModelAttribute  
    public void setReqAndRes(HttpServletRequest request, HttpServletResponse response){  
        this.request = request;  
        this.response = response; 
        this.session = request.getSession();
    }  
	
	public static void logBefore(Logger logger, String interfaceName){
		logger.info("");
		logger.info("start");
		logger.info(interfaceName);
	}
	
	public static void logAfter(Logger logger){
		logger.info("end");
		logger.info("");
	}
	
    public void printJson(String json){
    	response.setContentType("application/json;charset=utf-8");
        response.setHeader("Cache-Control", "no-cache");
        PrintWriter pw;
		try {
			logger.info("异步返回json数据开始："+json);
			pw = response.getWriter();
			pw.print(json);
			pw.flush();
			pw.close();
			logger.info("异步返回json数据结束："+json);
		} catch (IOException e) {
			logger.error("异步返回json数据异常："+e.getMessage());
			e.printStackTrace();
		}
    }
}
