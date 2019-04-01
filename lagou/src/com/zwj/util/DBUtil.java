package com.zwj.util;

import java.sql.*;

import static com.zwj.DataSource.C3P0Demo.getDataSourceWithC3P0;

public class DBUtil {
    private static Connection conn =null;
    private static PreparedStatement pstmt = null;
    private static ResultSet rs = null;
    private static  boolean flag = true;
    //数据库连接
    public static Connection getConnection() throws SQLException {
        try {
            conn = getDataSourceWithC3P0().getConnection();
        } catch (ClassCastException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
//获取PreparedStatement对象的方法
    public static PreparedStatement createPreparedStatement(String sql, Object[] os) {
        try {
            pstmt = getConnection().prepareStatement(sql);
            if (os != null) {
                for (int i = 0; i < os.length; i++) {
                    pstmt.setObject(i + 1, os[i]);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pstmt;
    }

    //关闭数据库
    public static void closeAll(ResultSet rs, Statement pstmt, Connection conn) {
        try {
            if (rs != null) {
                rs.close();
            }
            if (pstmt != null) {
                pstmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //通用的增加，删除，修改方法
    public static boolean executeAddOrUodateOrDelete(String sql, Object[] os) {
        flag = true;
        try {
            pstmt = createPreparedStatement(sql, os);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            flag = false;
        }finally {
            closeAll(null,pstmt,conn);
        }
        return flag;
    }

    //通用的查询方法 返回结果集ResultSet对象
    public static ResultSet executeQuery(String sql, Object[] os) {
        try {
            pstmt = createPreparedStatement(sql, os);
            rs = pstmt.executeQuery();
        } catch (SQLException e) {
            System.out.println("SQLException" + e);
        } catch (Exception e) {
            System.out.println("Exception" + e);
        }
        return rs;
    }
}
