/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-12-21 08:25:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Product_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<title>Sản phẩm</title>\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"hinh/python.jpg\" type=\"image/x-icon\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("<script src=\"js/jquery-3.5.1.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\r\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"js/jsproducts.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/css.css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body \r\n");
      out.write("\t");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("data-spy=\"scroll\" data-target=\"#nav1\" data-offset=\"50\">\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"container-fluid\" style=\"padding: 70px 0px 0px 0px;\">\r\n");
      out.write("\t\t<nav\r\n");
      out.write("\t\t\tclass=\"navbar navbar-expand-sm bg-dark justify-content-center fixed-top\"\r\n");
      out.write("\t\t\tid=\"nav1\">\r\n");
      out.write("\t\t\t<ul class=\"navbar-nav\" id=\"uln\">\r\n");
      out.write("\t\t\t\t<a class=\"navbar-brand\" href=\"#\"> <img src=\"hinh/htch_image.png\"\r\n");
      out.write("\t\t\t\t\tstyle=\"width: 40px;\">\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><span>Hệ thống:</span><br> <span>Cửa\r\n");
      out.write("\t\t\t\t\t\thàng bán lẻ</span></li>\r\n");
      out.write("\t\t\t\t<a class=\"navbar-brand\" href=\"#\"> <img\r\n");
      out.write("\t\t\t\t\tsrc=\"hinh/phonehead_image.png\" style=\"width: 40px;\">\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><span>Hotline mua hàng:</span><br> <span>Gọi\r\n");
      out.write("\t\t\t\t\t\tngay: 1900100</span></li>\r\n");
      out.write("\t\t\t\t<a class=\"navbar-brand\" href=\"#\"> <img src=\"hinh/user_image.png\"\r\n");
      out.write("\t\t\t\t\tstyle=\"width: 40px;\">\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<form action=\"phone\" style=\"padding-left: 10%; position: relative;\">\r\n");
      out.write("\t\t\t\t<div class=\"input-group mb-3\" id=\"formtk\">\r\n");
      out.write("\t\t\t\t\t<input id=\"myInput\" class=\"form-control\" type=\"text\"\r\n");
      out.write("\t\t\t\t\t\tplaceholder=\"Tìm kiếm sản phẩm..\" name=\"txtTimkiem\">\r\n");
      out.write("\t\t\t\t\t<div class=\"input-group-append\">\r\n");
      out.write("\t\t\t\t\t\t<button class=\"btn btn-light \" type=\"submit\">Go</button>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<ul class=\"listSP bg-light\" id=\"myList\">\r\n");
      out.write("\t\t\t\t\t<li id=\"litest\"><img\r\n");
      out.write("\t\t\t\t\t\tsrc=\"hinh/samsung-galaxy-s20-plus-400x460-fix-400x460.png\"><a\r\n");
      out.write("\t\t\t\t\t\thref=\"Html/html20.html\">Samsung Galaxy S20+</a></li>\r\n");
      out.write("\t\t\t\t\t<li><img src=\"hinh/oppo-a92.jpg\"><a\r\n");
      out.write("\t\t\t\t\t\thref=\"Html/htmlA92.html\">OPPO A92</a></li>\r\n");
      out.write("\t\t\t\t\t<li><img src=\"hinh/iphone-11.jpg\"><a\r\n");
      out.write("\t\t\t\t\t\thref=\"Html/htmliphone11.html\">iPhone 11 64GB</a></li>\r\n");
      out.write("\t\t\t\t\t<li><img src=\"hinh/xiaomi-redmi-note-9s.jpg\"><a\r\n");
      out.write("\t\t\t\t\t\thref=\"Html/htmlredmi9s.html\">Xiaomi Redmi Note 9S </a></li>\r\n");
      out.write("\t\t\t\t\t<li><img src=\"hinh/oppo-a52-spec-720x333.jpg\"><a\r\n");
      out.write("\t\t\t\t\t\thref=\"Html/htmlA52.html\">OPPO A52</a></li>\r\n");
      out.write("\t\t\t\t\t<li><img src=\"hinh/nokia-53-den-600x600-400x400.jpg\"><a\r\n");
      out.write("\t\t\t\t\t\thref=\"Html/htmlnokia5.3.html\">Nokia 5.3</a></li>\r\n");
      out.write("\t\t\t\t\t<li><img src=\"hinh/realme-6i-trang-600-200x200.jpg\"><a\r\n");
      out.write("\t\t\t\t\t\thref=\"Html/htmlredmi6i.html\">Realme 6i</a></li>\r\n");
      out.write("\t\t\t\t\t<li><img src=\"hinh/samsung-galaxy-fold-black-400x400.jpg\"><a\r\n");
      out.write("\t\t\t\t\t\thref=\"Html/htmlgalaxyford.html\">Samsung Galaxy Fold</a></li>\r\n");
      out.write("\t\t\t\t\t<li><img src=\"hinh/iphone-11-pro-max-512gb-gold-400x400.jpg\"><a\r\n");
      out.write("\t\t\t\t\t\thref=\"Html/htmliphone11pro.html\">iPhone 11 Pro Max 512GB</a></li>\r\n");
      out.write("\t\t\t\t\t<li><img src=\"hinh/iphone-11-pro-256gb-black-400x400.jpg\"><a\r\n");
      out.write("\t\t\t\t\t\thref=\"Html/htmliphone256.html\">iPhone 11 Pro Max 256GB</a></li>\r\n");
      out.write("\t\t\t\t\t<li><img\r\n");
      out.write("\t\t\t\t\t\tsrc=\"hinh/samsung-galaxy-z-flip-den-600x600-400x400.jpg\"><a\r\n");
      out.write("\t\t\t\t\t\thref=\"Html/htmlgalaxyz.html\">Samsung Galaxy Z Flip</a></li>\r\n");
      out.write("\t\t\t\t\t<li><img src=\"hinh/iphone-11-pro-256gb-black-400x400.jpg\"><a\r\n");
      out.write("\t\t\t\t\t\thref=\"Html/htmliphone256.html\">iPhone 11 Pro 256GB</a></li>\r\n");
      out.write("\t\t\t\t\t<li><img src=\"hinh/iphone-11-pro-max-green-400x400.jpg\"><a\r\n");
      out.write("\t\t\t\t\t\thref=\"Html/htmliphone256.html\">iPhone 11 Pro Max 64GB</a></li>\r\n");
      out.write("\t\t\t\t\t<li><img src=\"hinh/iphone-xs-max-256gb-white-400x400.jpg\"><a\r\n");
      out.write("\t\t\t\t\t\thref=\"Html/htmliphone256.html\">iPhone Xs Max 256GB</a></li>\r\n");
      out.write("\t\t\t\t\t<li><img\r\n");
      out.write("\t\t\t\t\t\tsrc=\"hinh/samsung-galaxy-s20-ultra-600x600-1-400x400.jpg\"><a\r\n");
      out.write("\t\t\t\t\t\thref=\"Html/html20.html\">Samsung Galaxy S20 Ultra</a></li>\r\n");
      out.write("\t\t\t\t\t<li><img\r\n");
      out.write("\t\t\t\t\t\tsrc=\"hinh/samsung-galaxy-note-10-plus-blue-400x400.jpg\"><a\r\n");
      out.write("\t\t\t\t\t\thref=\"Html/html20.html\">Samsung Galaxy Note 10+</a></li>\r\n");
      out.write("\t\t\t\t\t<li><img src=\"hinh/iphone-xs-max-gold-400x400.jpg\"><a\r\n");
      out.write("\t\t\t\t\t\thref=\"Html/htmliphone11pro.html\">iPhone Xs Max 64GB</a></li>\r\n");
      out.write("\t\t\t\t\t<li><img src=\"hinh/iphone-11-256gb-black-400x400.jpg\"><a\r\n");
      out.write("\t\t\t\t\t\thref=\"Html/htmliphone11.html\">iPhone 11 256GB</a></li>\r\n");
      out.write("\t\t\t\t\t<li><img src=\"hinh/iphone-xs-max-256gb-white-400x400.jpg\"><a\r\n");
      out.write("\t\t\t\t\t\thref=\"Html/html20.html\">iPhone Xs 256GB</a></li>\r\n");
      out.write("\t\t\t\t\t<li><img src=\"hinh/huawei-p40-pro-600x600-3-400x400.jpg\"><a\r\n");
      out.write("\t\t\t\t\t\thref=\"Html/html20.html\">Huawei P40 Pro</a></li>\r\n");
      out.write("\t\t\t\t\t<li><img src=\"hinh/oppo-find-x2-blue-600x600-400x400.jpg\"><a\r\n");
      out.write("\t\t\t\t\t\thref=\"Html/html20.html\">OPPO Find X2</a></li>\r\n");
      out.write("\t\t\t\t\t<li><img src=\"hinh/blackberry-key2-4-400x400.jpg\"><a\r\n");
      out.write("\t\t\t\t\t\thref=\"Html/html20.html\">BlackBerry KEY2 </a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<nav class=\"navbar bg-dark justify-content-center\" id=\"nav2\">\r\n");
      out.write("\t\t\t\t<ul class=\"nav \" id=\"reponsive\">\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"About\">TRANG\r\n");
      out.write("\t\t\t\t\t\t\tCHỦ</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\"\r\n");
      out.write("\t\t\t\t\t\thref=\"Home\">GIỚI THIỆU</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\"\r\n");
      out.write("\t\t\t\t\t\thref=\"phone\">SẢN PHẨM</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">TIN TỨC</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\" id=\"logo\"><a class=\"nav-link\"\r\n");
      out.write("\t\t\t\t\t\thref=\"Html/Home.html\"><img\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"height: 80px; border-radius: 50px; margin: 0 10px;\"\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"hinh/python.jpg\"></a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">DỊCH VỤ</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">NHƯỢNG\r\n");
      out.write("\t\t\t\t\t\t\tQUYỀN </a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"LichSuController\">THANH\r\n");
      out.write("\t\t\t\t\t\t\tTOÁN</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"Admin\">ADMIN</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</nav>\r\n");
      out.write("\t\t\t<section>\r\n");
      out.write("\t\t\t\t<div class=\"filter\">\r\n");
      out.write("\t\t\t\t\t<div class=\"row\" style=\"padding: 0px 15px;\">\r\n");
      out.write("\t\t\t\t\t\t<table class=\"table table-bordered\">\r\n");
      out.write("\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"row\" id=\"lc\">\r\n");
      out.write("\t\t\t\t\t\t<p style=\"padding-right: 10px;\">Chọn mức giá:</p>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\">Dưới 2 triệu</a> <a href=\"#\">từ 2 - 4 triệu</a> <a\r\n");
      out.write("\t\t\t\t\t\t\tid=\"4_7\" href=\"#\">từ 4 - 8 triệu</a> <a href=\"#\">từ 8 - 15\r\n");
      out.write("\t\t\t\t\t\t\ttriệu</a> <a id=\"15_\" href=\"#\">trên 15 triệu</a> <input\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"margin: 5px 5px 0px 0px;\" type=\"checkbox\"> <a\r\n");
      out.write("\t\t\t\t\t\t\thref=\"#\">Mới</a> <input style=\"margin: 5px 5px 0px 0px;\"\r\n");
      out.write("\t\t\t\t\t\t\ttype=\"checkbox\"> <a href=\"#\">Trả góp 0%</a> <input\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"margin: 5px 5px 0px 0px;\" type=\"checkbox\"> <a\r\n");
      out.write("\t\t\t\t\t\t\thref=\"#\">Độc quyền</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<ul class=\"homeproduct\" id=\"homeproduct\">\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</section>\r\n");
      out.write("\t\t\t<footer class=\"navbar navbar-expand-sm bg-dark\" id=\"footer\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-1 \">\r\n");
      out.write("\t\t\t\t\t<a> <img src=\"hinh/python.jpg\">\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-2\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#\">Chính sách bảo hành</a> <br> <a href=\"#\">Chính\r\n");
      out.write("\t\t\t\t\t\tsách đổi trả</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-2\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#\">Hướng dẫn mua online</a> <br> <a href=\"#\">Nội\r\n");
      out.write("\t\t\t\t\t\tquy cửa hàng</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-2\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#\">Phương thức thanh toán</a> <br> <a href=\"#\">Phương\r\n");
      out.write("\t\t\t\t\t\tthức vận chuyển</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-1\"></div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-3\" id=\"imgf\">\r\n");
      out.write("\t\t\t\t\t<a href=\"\"><img src=\"hinh/fb.png\"> </a> <a href=\"\"><img\r\n");
      out.write("\t\t\t\t\t\tsrc=\"hinh/tw.png\"> </a> <a href=\"\"><img src=\"hinh/y.png\">\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</footer>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent(null);
    // /WEB-INF/view/Product.jsp(22,1) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("language");
    // /WEB-INF/view/Product.jsp(22,1) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/view/Product.jsp(22,1) '${khachhang.getHoten()}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${khachhang.getHoten()}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/view/Product.jsp(22,1) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setScope("session");
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /WEB-INF/view/Product.jsp(44,3) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty khachhang}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t<li class=\"nav-item\"><span><a href=\"Login\">Đăng\r\n");
        out.write("\t\t\t\t\t\t\t\tnhập</a></span></li>\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent(null);
    // /WEB-INF/view/Product.jsp(48,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty khachhang}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t<ul>\r\n");
        out.write("\t\t\t\t\t\t<li class=\"nav-item\" style=\"color: yellow;\">Hello, ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${language }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("</li>\r\n");
        out.write("\t\t\t\t\t\t<li class=\"nav-item\"><span><a href=\"KiemTra?kiemtra=0\">Đăng\r\n");
        out.write("\t\t\t\t\t\t\t\t\tXuất</a></span></li>\r\n");
        out.write("\t\t\t\t\t</ul>\r\n");
        out.write(">\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/view/Product.jsp(148,8) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/view/Product.jsp(148,8) '${loai}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${loai}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/view/Product.jsp(148,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("c");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t<td id=\"samsung\t\"><a href=\"phone?maloai=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${c.maloai}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\" class=\"\"><img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${c.anhloai}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\" /></a></td>\r\n");
          out.write("\t\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent(null);
    // /WEB-INF/view/Product.jsp(168,6) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/view/Product.jsp(168,6) '${phone}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${phone}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/view/Product.jsp(168,6) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("c");
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t<li class=\"item\"><a href=\"Html/htmlA92.html\"> <img\r\n");
          out.write("\t\t\t\t\t\t\t\t\twidth=\"180\" height=\"180\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${c.anh}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<h3>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${c.tendienthoai}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</h3>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<div class=\"price\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<strong value>6.990.000₫</strong>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"add?makh=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${khachhang.getMakh()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("&tendienthoai=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${c.tendienthoai}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("$&gia=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${c.gia}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("&anh=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${c.anh}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("&madienthoai=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${c.madienthoai}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">Đặt mua</a>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<div class=\"promo noimage\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<p>Tặng 2 suất mua Đồng hồ thời trang giảm 40% (kh&#244;ng\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t&#225;p dụng th&#234;m khuyến m&#227;i kh&#225;c)</p>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</div> <label class=\"installment\">Trả góp 0%</label>\r\n");
          out.write("\t\t\t\t\t\t\t</a></li>\r\n");
          out.write("\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }
}
