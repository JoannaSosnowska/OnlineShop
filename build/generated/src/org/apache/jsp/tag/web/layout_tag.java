package org.apache.jsp.tag.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class layout_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sec_authorize_access;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public void setJspContext(JspContext ctx) {
    super.setJspContext(ctx);
    java.util.ArrayList<String> _jspx_nested = null;
    java.util.ArrayList<String> _jspx_at_begin = null;
    java.util.ArrayList<String> _jspx_at_end = null;
    this.jspContext = new org.apache.jasper.runtime.JspContextWrapper(ctx, _jspx_nested, _jspx_at_begin, _jspx_at_end, null);
  }

  public JspContext getJspContext() {
    return this.jspContext;
  }
  private javax.servlet.jsp.tagext.JspFragment header;
  private javax.servlet.jsp.tagext.JspFragment footer;

  public javax.servlet.jsp.tagext.JspFragment getHeader() {
    return this.header;
  }

  public void setHeader(javax.servlet.jsp.tagext.JspFragment header) {
    this.header = header;
  }

  public javax.servlet.jsp.tagext.JspFragment getFooter() {
    return this.footer;
  }

  public void setFooter(javax.servlet.jsp.tagext.JspFragment footer) {
    this.footer = footer;
  }

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  private void _jspInit(ServletConfig config) {
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _jspx_tagPool_c_set_var = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _jspx_tagPool_sec_authorize_access = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_url_value_nobody.release();
    _jspx_tagPool_c_set_var.release();
    _jspx_tagPool_sec_authorize_access.release();
  }

  public void doTag() throws JspException, java.io.IOException {
    PageContext _jspx_page_context = (PageContext)jspContext;
    HttpServletRequest request = (HttpServletRequest) _jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse) _jspx_page_context.getResponse();
    HttpSession session = _jspx_page_context.getSession();
    ServletContext application = _jspx_page_context.getServletContext();
    ServletConfig config = _jspx_page_context.getServletConfig();
    JspWriter out = jspContext.getOut();
    _jspInit(config);
    if( getHeader() != null ) {
      _jspx_page_context.setAttribute("header", getHeader());
}
    if( getFooter() != null ) {
      _jspx_page_context.setAttribute("footer", getFooter());
}

    try {
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Drogeria internetowa</title>\n");
      out.write("        <style>\n");
      out.write("            html {\n");
      out.write("          margin:0;\n");
      out.write("          padding:0;\n");
      out.write("          border:0;\n");
      out.write("        }\n");
      out.write("        body, div, span, object, iframe, h1, h2, h3, h4, h5, h6, p, blockquote, pre, a, abbr, acronym, address, code, del, dfn, em, img, q, dl, dt, dd, ol, ul, li, fieldset, form, label, legend, table, caption, tbody, tfoot, thead, tr, th, td, article, aside, dialog, figure, footer, header, hgroup, nav, section {margin:0;padding:0;border:0;font-weight:inherit;font-style:inherit;font-size:100%;font-family:inherit;vertical-align:baseline;}\n");
      out.write("article, aside, dialog, figure, footer, header, hgroup, nav, section {display:inline-block;}\n");
      out.write("\n");
      out.write("        body{\n");
      out.write("          font-size:75%;\n");
      out.write("          color:#222;\n");
      out.write("          background:#fff;\n");
      out.write("          font-family:\"Helvetica Neue\", Arial, Helvetica, sans-serif;\n");
      out.write("        }\n");
      out.write("        #header {\n");
      out.write("          border-bottom: 1px solid lightgray;\n");
      out.write("          text-align:center;\n");
      out.write("          padding-right:24px;\n");
      out.write("          margin-right:25px;\n");
      out.write("          width:100%;\n");
      out.write("        }\n");
      out.write("        #copyright{\n");
      out.write("            font-size: 10px;\n");
      out.write("            font-style: italic;\n");
      out.write("            color:#89a820;\n");
      out.write("        }\n");
      out.write("        #footer{\n");
      out.write("          text-align:left; \n");
      out.write("          margin-left: 50px;\n");
      out.write("        }\n");
      out.write("        #empty{\n");
      out.write("            width:30%;\n");
      out.write("            height:100%;\n");
      out.write("            float:left;\n");
      out.write("        }\n");
      out.write("        #main{\n");
      out.write("            width:70%;\n");
      out.write("            height:100%; \n");
      out.write("            float:left;\n");
      out.write("        }\n");
      out.write("        h1, h2, h3, h4, h5, h6 {font-weight:normal;color:#89a820; }\n");
      out.write("\n");
      out.write("        h1 {font-size:3em;line-height:1;margin-bottom:0.5em;}\n");
      out.write("        h2 {font-size:2em;margin-bottom:0.75em;}\n");
      out.write("        h3 {font-size:1.5em;line-height:1;margin-bottom:1em;}\n");
      out.write("        h4 {font-size:1.2em;line-height:1.25;margin-bottom:1.25em;}\n");
      out.write("        h5 {font-size:1em;font-weight:bold;margin-bottom:1.5em;}\n");
      out.write("        h6 {font-size:1em;font-weight:bold;}\n");
      out.write("        a {\n");
      out.write("          color:#89a820;\n");
      out.write("          text-decoration:underline;\n");
      out.write("          margin-left: 20px;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        #content-wrapper{\n");
      out.write("          padding-right:24px;\n");
      out.write("          margin-right:25px;\n");
      out.write("          margin-top: 30px;\n");
      out.write("          width:100%;\n");
      out.write("          min-height:500px;\n");
      out.write("          border-bottom: 1px solid lightgray;\n");
      out.write("        }\n");
      out.write("        ul#menu li{\n");
      out.write("            display:inline-block;\n");
      out.write("            list-style-type: none;\n");
      out.write("            padding-right: 20px;\n");
      out.write("            float: left;\n");
      out.write("        }\n");
      out.write("        ul#menu li a{\n");
      out.write("            color: #89a820;\n");
      out.write("            font-size: 20px;\n");
      out.write("            text-decoration: none;\n");
      out.write("        }\n");
      out.write("        ul#menu li a:hover{\n");
      out.write("            font-weight: bold;\n");
      out.write("            font-style: italic;\n");
      out.write("        }\n");
      out.write("        .alert, .error{\n");
      out.write("          padding:0.8em;\n");
      out.write("          margin-bottom:1em;\n");
      out.write("          border:2px solid #ddd;\n");
      out.write("          font-weight:bold;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        .alert{\n");
      out.write("           background:#acc262;\n");
      out.write("           color:#0f0f0f;\n");
      out.write("           border-color:#89a820;\n");
      out.write("        }\n");
      out.write("        .error{\n");
      out.write("          background:#fbe3e4;\n");
      out.write("          color:#8a1f11;\n");
      out.write("          border-color:#fbc2c4;\n");
      out.write("        }\n");
      out.write("        .errorlist { color: red; }\n");
      out.write("        .breadcrumbs{\n");
      out.write("          color:#89a820;\n");
      out.write("          font-weight: bold;\n");
      out.write("          font-size:1.1em;\n");
      out.write("          margin-bottom: 15px;\n");
      out.write("        }\n");
      out.write("        .small {\n");
      out.write("          font-size:.8em;\n");
      out.write("          margin-bottom:1.875em;\n");
      out.write("          line-height:1.875em;\n");
      out.write("        }\n");
      out.write("        .large {\n");
      out.write("          font-size:1.2em;\n");
      out.write("          line-height:2.5em;\n");
      out.write("          margin-bottom:1.25em;\n");
      out.write("        }\n");
      out.write("        /* LISTY */\n");
      out.write("        li ul, li ol {margin:0;}\n");
      out.write("        ul {\n");
      out.write("          list-style-type:none;\n");
      out.write("          margin:0 1.5em 1.5em 0;\n");
      out.write("          padding-left:1.5em;\n");
      out.write("        }\n");
      out.write("        /* TABELKI */\n");
      out.write("        table tr td{\n");
      out.write("          text-align: left;\n");
      out.write("          padding-top:10px;\n");
      out.write("          font-size: 1.2em;\n");
      out.write("        }\n");
      out.write("        table tr td.text{\n");
      out.write("          text-align: left;\n");
      out.write("          padding-top:5px;\n");
      out.write("        }\n");
      out.write("        table tr td.number{\n");
      out.write("          text-align: right;\n");
      out.write("          padding-top:5px;\n");
      out.write("        }\n");
      out.write("        table th{\n");
      out.write("            text-align: center;\n");
      out.write("            font-size: 1.5em;\n");
      out.write("        }\n");
      out.write("        /* FORMULARZE */\n");
      out.write("        label {font-weight:bold;}\n");
      out.write("        input[type=text], input[type=password], input.text, input.title, textarea, select {margin:0.5em 0;}\n");
      out.write("        input[type=text], input[type=password], input.text, input.title, textarea {background-color:#fff;border:1px solid #bbb;}\n");
      out.write("        input[type=text]:focus, input[type=password]:focus, input.text:focus, input.title:focus, textarea:focus {border-color:#666;}\n");
      out.write("        select {background-color:#fff;border-width:1px;border-style:solid;}\n");
      out.write("        input[type=text], input[type=password], input.text, input.title, textarea, select {margin:0.5em 0;}\n");
      out.write("        input.text, input.title {width:300px;padding:5px;}\n");
      out.write("        input.title {font-size:1.5em;}\n");
      out.write("        textarea {width:390px;height:250px;padding:5px;}\n");
      out.write("        form.inline {line-height:3;}\n");
      out.write("        form.inline p {margin-bottom:0;}\n");
      out.write("        .error, .alert, .notice, .success, .info {padding:0.8em;margin-bottom:1em;border:2px solid #ddd;}\n");
      out.write("        .error{background:#fbe3e4;color:#8a1f11;border-color:#fbc2c4;}\n");
      out.write("        .alert{background:#acc262; color:#0f0f0f; border-color:#89a820;}\n");
      out.write("        .notice {background:#fff6bf;color:#514721;border-color:#ffd324;}\n");
      out.write("        .success {background:#e6efc2;color:#264409;border-color:#c6d880;}\n");
      out.write("        .info {background:#d5edf8;color:#205791;border-color:#92cae4;}\n");
      out.write("        .error a{color:#8a1f11;}\n");
      out.write("        .alert a{color:#444d27;}\n");
      out.write("        .notice a {color:#514721;}\n");
      out.write("        .success a {color:#264409;}\n");
      out.write("        .info a {color:#205791;}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <br />\n");
      out.write("        <div id=\"header\">\n");
      out.write("           ");
      ((org.apache.jasper.runtime.JspContextWrapper) this.jspContext).syncBeforeInvoke();
      _jspx_sout = null;
      if (getHeader() != null) {
        getHeader().invoke(_jspx_sout);
      }
      out.write("\n");
      out.write("        </div>        \n");
      out.write("        <div id=\"content-wrapper\">\n");
      out.write("         \n");
      out.write("            <div id=\"empty\">\n");
      out.write("                ");
      if (_jspx_meth_sec_authorize_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            </div>\n");
      out.write("        <div id=\"main\">\n");
      out.write("           ");
      ((org.apache.jasper.runtime.JspContextWrapper) this.jspContext).syncBeforeInvoke();
      _jspx_sout = null;
      if (getJspBody() != null)
        getJspBody().invoke(_jspx_sout);
      out.write("        \n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"footer\">\n");
      out.write("           ");
      ((org.apache.jasper.runtime.JspContextWrapper) this.jspContext).syncBeforeInvoke();
      _jspx_sout = null;
      if (getFooter() != null) {
        getFooter().invoke(_jspx_sout);
      }
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch( Throwable t ) {
      if( t instanceof SkipPageException )
          throw (SkipPageException) t;
      if( t instanceof java.io.IOException )
          throw (java.io.IOException) t;
      if( t instanceof IllegalStateException )
          throw (IllegalStateException) t;
      if( t instanceof JspException )
          throw (JspException) t;
      throw new JspException(t);
    } finally {
      ((org.apache.jasper.runtime.JspContextWrapper) jspContext).syncEndTagFile();
      _jspDestroy();
    }
  }

  private boolean _jspx_meth_sec_authorize_0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  sec:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_authorize_0 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _jspx_tagPool_sec_authorize_access.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_sec_authorize_0.setPageContext(_jspx_page_context);
    _jspx_th_sec_authorize_0.setParent(null);
    _jspx_th_sec_authorize_0.setAccess("isAuthenticated()");
    int _jspx_eval_sec_authorize_0 = _jspx_th_sec_authorize_0.doStartTag();
    if (_jspx_eval_sec_authorize_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_c_set_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_sec_authorize_0, _jspx_page_context))
        return true;
      out.write("\n");
      out.write("      \n");
      out.write("                    <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${logoutAction}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("\" method=\"post\"> \n");
      out.write("                            <input type=\"hidden\" name=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${_csrf.parameterName}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${_csrf.token}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("\"/>\n");
      out.write("                            <input type=\"submit\" value=\"Wyloguj\" class=\"success\"/>\n");
      out.write("                    </form>\n");
      out.write("                    ");
    }
    if (_jspx_th_sec_authorize_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sec_authorize_access.reuse(_jspx_th_sec_authorize_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_sec_authorize_access.reuse(_jspx_th_sec_authorize_0);
    return false;
  }

  private boolean _jspx_meth_c_set_0(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_authorize_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sec_authorize_0);
    _jspx_th_c_set_0.setVar("logoutAction");
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_eval_c_set_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_set_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_c_set_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_set_0.doInitBody();
      }
      do {
        if (_jspx_meth_c_url_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_set_0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_c_set_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_set_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var.reuse(_jspx_th_c_set_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_set_var.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_url_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_set_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_set_0);
    _jspx_th_c_url_0.setValue("/j_spring_security_logout");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }
}
