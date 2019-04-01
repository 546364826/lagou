package com.zwj.servlet;


import com.zwj.Service.Impl.PresonServiceImpl;
import com.zwj.entity.Preson;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.web.bind.annotation.SessionAttribute;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class AddPresonServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private String savePath;
    private ServletContext sc;

    public void init(ServletConfig config) {
        savePath="preson";          // 项目下用于存放图片的文件夹
        sc = config.getServletContext(); // 获取上下文
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       this.doPost(request, response);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        Map<String, String> map=new HashMap<>();   // 用于存储表单非二进制流部分
        String headpic = null;
        HttpSession session = request.getSession();
        boolean isMultipart = ServletFileUpload.isMultipartContent(request);// 检查输入请求是否为multipart表单数据。
        if (isMultipart == true) {   // 如果是二进制流形式的表单
            FileItemFactory factorys = new DiskFileItemFactory();// 通过它来解析请求。执行解析后，所有的表单项目都保存在一个List中。
            ServletFileUpload uploads = new ServletFileUpload(factorys);
            List<FileItem> item = null;
            File savedFile = null;

            try {
                item = uploads.parseRequest(request);
            } catch (FileUploadException e) {
                e.printStackTrace();
            }
            Iterator<FileItem> itr = item.iterator();
            while (itr.hasNext()) {
                FileItem items =  itr.next();

                if (items.isFormField()) {
                    //检测是否为普通表单 如果是普通表单项目，将其名字与对应的value值放入map中。
                    String fieldName = items.getFieldName();
                    map.put(fieldName, items.getString("UTF-8"));//获取表单value时确定数据格式，如果不写，有中文的话会乱码
                    session.setAttribute(fieldName,items.getString("UTF-8"));
                } else {
                    //如果是提交的图片
                    File fullFile = new File(items.getName());
                    //获取提交的文件
                    savedFile = new File(sc.getRealPath("/") + savePath, fullFile.getName()); //在项目下新建该文件，
                    try {
                        items.write(savedFile); //写入文件
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    headpic = savedFile.getPath();
                    session.setAttribute("headpic",headpic);
                }
            }
        }
//        HttpSession Session = request.getSession(false);
//        String emails = (String)Session.getAttribute("email");
//        System.out.println(emails);
        Preson preson = new Preson(map.get("loginemail"),map.get("name"),map.get("sex") , map.get("degree"),map.get("hands") ,map.get("phone"),map.get("email"),map.get("idea"),headpic);




        PresonServiceImpl presonService = new PresonServiceImpl();
        boolean result = presonService.addPreson(preson);
        if (result == true) {
            response.sendRedirect("indexlogin.jsp");
        } else {
            response.sendRedirect("resume.jsp");
        }
    }
}
