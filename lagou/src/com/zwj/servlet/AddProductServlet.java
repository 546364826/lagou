package com.zwj.servlet;

import com.zwj.Service.Impl.ProductServiceImpl;
import com.zwj.entity.Product;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class AddProductServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private String savePath;
    private ServletContext sc;

    public void init(ServletConfig config) {
        savePath="upload";          // 项目下用于存放图片的文件夹
        sc = config.getServletContext(); // 获取上下文
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        ProductServiceImpl productService = new ProductServiceImpl();
//        String posters = request.getParameter("posters");
//        String name = request.getParameter("name");
//        String address = request.getParameter("address");
//        String Introduction = request.getParameter("Introduction");
        Map<String, String> map=new HashMap<>();   // 用于存储表单非二进制流部分
        String pasters = null;
        boolean isMultipart = ServletFileUpload.isMultipartContent(request);// 检查输入请求是否为multipart表单数据。
        if (isMultipart == true) {   // 如果是二进制流形式的表单
            FileItemFactory factory = new DiskFileItemFactory();// 通过它来解析请求。执行解析后，所有的表单项目都保存在一个List中。
            ServletFileUpload upload = new ServletFileUpload(factory);
            List<FileItem> items = null;
            File savedFile = null;

            try {
                items = upload.parseRequest(request);
            } catch (FileUploadException e) {
                e.printStackTrace();
            }
            Iterator<FileItem> itr = items.iterator();
            while (itr.hasNext()) {
                FileItem item =  itr.next();

                if (item.isFormField()) {//检测是否为普通表单 如果是普通表单项目，将其名字与对应的value值放入map中。
                    String fieldName = item.getFieldName();
                    map.put(fieldName, item.getString("UTF-8"));//获取表单value时确定数据格式，如果不写，有中文的话会乱码

                } else {   //如果是提交的图片
                    File fullFile = new File(item.getName()); //获取提交的文件
                    savedFile = new File(sc.getRealPath("/") + savePath, fullFile.getName()); //在项目下新建该文件，
                    try {
                        item.write(savedFile); //写入文件
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    pasters = savedFile.getPath();
                }
            }
        }
        Product product = new Product(pasters, map.get("name"), map.get("address"), map.get("Introduction"));
        boolean result = productService.AddProduct(product);
        if (result == true) {
            response.sendRedirect("company5.jsp");
        } else {
            response.sendRedirect("company4.jsp");
        }
    }
}
