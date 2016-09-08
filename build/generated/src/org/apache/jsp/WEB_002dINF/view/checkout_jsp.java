package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class checkout_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/WEB-INF/tags/layout.tag");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_form_method_commandName_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_hidden_path_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_select_path;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_option_value;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_spring_message_text_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_form_method_commandName_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_hidden_path_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_url_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_select_path = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_option_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_spring_message_text_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_form_form_method_commandName_action.release();
    _jspx_tagPool_form_hidden_path_nobody.release();
    _jspx_tagPool_c_url_var_value_nobody.release();
    _jspx_tagPool_form_select_path.release();
    _jspx_tagPool_form_option_value.release();
    _jspx_tagPool_spring_message_text_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      //  t:layout
      org.apache.jsp.tag.web.layout_tag _jspx_th_t_layout_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.layout_tag.class) : new org.apache.jsp.tag.web.layout_tag();
      _jspx_th_t_layout_0.setJspContext(_jspx_page_context);
      javax.servlet.jsp.tagext.JspFragment _jspx_temp0 = new checkout_jspHelper( 0, _jspx_page_context, _jspx_th_t_layout_0, null);
      _jspx_th_t_layout_0.setHeader(_jspx_temp0);
      javax.servlet.jsp.tagext.JspFragment _jspx_temp1 = new checkout_jspHelper( 1, _jspx_page_context, _jspx_th_t_layout_0, null);
      _jspx_th_t_layout_0.setFooter(_jspx_temp1);
      _jspx_th_t_layout_0.setJspBody(new checkout_jspHelper( 2, _jspx_page_context, _jspx_th_t_layout_0, null));
      _jspx_th_t_layout_0.doTag();
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${purchase.products}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("pr");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("        <tr>\n");
          out.write("            <td class=\"text\"><h5>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pr.product.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h5></td>\n");
          out.write("            <td class=\"text\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pr.product.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("            <td class=\"text\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pr.product.unitPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" PLN / ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pr.product.unit}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("            <td class=\"number\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pr.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("           <td class=\"number\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pr.quantity*pr.product.unitPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("        </tr>\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_url_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_c_url_0.setVar("checkoutAction");
    _jspx_th_c_url_0.setValue("/purchase/create");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_var_value_nobody.reuse(_jspx_th_c_url_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_url_var_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }

  private boolean _jspx_meth_form_hidden_0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:hidden
    org.springframework.web.servlet.tags.form.HiddenInputTag _jspx_th_form_hidden_0 = (org.springframework.web.servlet.tags.form.HiddenInputTag) _jspx_tagPool_form_hidden_path_nobody.get(org.springframework.web.servlet.tags.form.HiddenInputTag.class);
    _jspx_th_form_hidden_0.setPageContext(_jspx_page_context);
    _jspx_th_form_hidden_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_hidden_0.setPath("id");
    int[] _jspx_push_body_count_form_hidden_0 = new int[] { 0 };
    try {
      int _jspx_eval_form_hidden_0 = _jspx_th_form_hidden_0.doStartTag();
      if (_jspx_th_form_hidden_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_hidden_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_hidden_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_hidden_0.doFinally();
      _jspx_tagPool_form_hidden_path_nobody.reuse(_jspx_th_form_hidden_0);
    }
    return false;
  }

  private boolean _jspx_meth_form_hidden_1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:hidden
    org.springframework.web.servlet.tags.form.HiddenInputTag _jspx_th_form_hidden_1 = (org.springframework.web.servlet.tags.form.HiddenInputTag) _jspx_tagPool_form_hidden_path_nobody.get(org.springframework.web.servlet.tags.form.HiddenInputTag.class);
    _jspx_th_form_hidden_1.setPageContext(_jspx_page_context);
    _jspx_th_form_hidden_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_hidden_1.setPath("stage");
    int[] _jspx_push_body_count_form_hidden_1 = new int[] { 0 };
    try {
      int _jspx_eval_form_hidden_1 = _jspx_th_form_hidden_1.doStartTag();
      if (_jspx_th_form_hidden_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_hidden_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_hidden_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_hidden_1.doFinally();
      _jspx_tagPool_form_hidden_path_nobody.reuse(_jspx_th_form_hidden_1);
    }
    return false;
  }

  private boolean _jspx_meth_form_hidden_2(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:hidden
    org.springframework.web.servlet.tags.form.HiddenInputTag _jspx_th_form_hidden_2 = (org.springframework.web.servlet.tags.form.HiddenInputTag) _jspx_tagPool_form_hidden_path_nobody.get(org.springframework.web.servlet.tags.form.HiddenInputTag.class);
    _jspx_th_form_hidden_2.setPageContext(_jspx_page_context);
    _jspx_th_form_hidden_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_hidden_2.setPath("nettocost");
    int[] _jspx_push_body_count_form_hidden_2 = new int[] { 0 };
    try {
      int _jspx_eval_form_hidden_2 = _jspx_th_form_hidden_2.doStartTag();
      if (_jspx_th_form_hidden_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_hidden_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_hidden_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_hidden_2.doFinally();
      _jspx_tagPool_form_hidden_path_nobody.reuse(_jspx_th_form_hidden_2);
    }
    return false;
  }

  private boolean _jspx_meth_form_hidden_3(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:hidden
    org.springframework.web.servlet.tags.form.HiddenInputTag _jspx_th_form_hidden_3 = (org.springframework.web.servlet.tags.form.HiddenInputTag) _jspx_tagPool_form_hidden_path_nobody.get(org.springframework.web.servlet.tags.form.HiddenInputTag.class);
    _jspx_th_form_hidden_3.setPageContext(_jspx_page_context);
    _jspx_th_form_hidden_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_hidden_3.setPath("bruttocost");
    int[] _jspx_push_body_count_form_hidden_3 = new int[] { 0 };
    try {
      int _jspx_eval_form_hidden_3 = _jspx_th_form_hidden_3.doStartTag();
      if (_jspx_th_form_hidden_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_hidden_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_hidden_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_hidden_3.doFinally();
      _jspx_tagPool_form_hidden_path_nobody.reuse(_jspx_th_form_hidden_3);
    }
    return false;
  }

  private boolean _jspx_meth_form_hidden_4(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:hidden
    org.springframework.web.servlet.tags.form.HiddenInputTag _jspx_th_form_hidden_4 = (org.springframework.web.servlet.tags.form.HiddenInputTag) _jspx_tagPool_form_hidden_path_nobody.get(org.springframework.web.servlet.tags.form.HiddenInputTag.class);
    _jspx_th_form_hidden_4.setPageContext(_jspx_page_context);
    _jspx_th_form_hidden_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_hidden_4.setPath("purchaseDt");
    int[] _jspx_push_body_count_form_hidden_4 = new int[] { 0 };
    try {
      int _jspx_eval_form_hidden_4 = _jspx_th_form_hidden_4.doStartTag();
      if (_jspx_th_form_hidden_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_hidden_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_hidden_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_hidden_4.doFinally();
      _jspx_tagPool_form_hidden_path_nobody.reuse(_jspx_th_form_hidden_4);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_option_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_option_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_0 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_text_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_0.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_option_0);
    _jspx_th_spring_message_0.setText((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_spring_message_0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_0 = _jspx_th_spring_message_0.doStartTag();
      if (_jspx_th_spring_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_0.doFinally();
      _jspx_tagPool_spring_message_text_nobody.reuse(_jspx_th_spring_message_0);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_1 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_text_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_1.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_spring_message_1.setText("dalej");
    int[] _jspx_push_body_count_spring_message_1 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_1 = _jspx_th_spring_message_1.doStartTag();
      if (_jspx_th_spring_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_1.doFinally();
      _jspx_tagPool_spring_message_text_nobody.reuse(_jspx_th_spring_message_1);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_2(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_2 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_text_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_2.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_spring_message_2.setText("anuluj");
    int[] _jspx_push_body_count_spring_message_2 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_2 = _jspx_th_spring_message_2.doStartTag();
      if (_jspx_th_spring_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_2.doFinally();
      _jspx_tagPool_spring_message_text_nobody.reuse(_jspx_th_spring_message_2);
    }
    return false;
  }

  private class checkout_jspHelper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public checkout_jspHelper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public void invoke0( JspWriter out ) 
      throws Throwable
    {
      HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
      HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp", out, false);
      return;
    }
    public void invoke1( JspWriter out ) 
      throws Throwable
    {
      out.write("<p id=\"copyright\">Copyright by Joanna Sosnowska</p>");
      return;
    }
    public void invoke2( JspWriter out ) 
      throws Throwable
    {
      out.write("\n");
      out.write("        <h3>Wybierz formę dostawy:</h3>\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("        <th width=\"120\">Nazwa</th>\n");
      out.write("        <th width=\"120\">Opis</th>\n");
      out.write("        <th width=\"50\">Cena </th>\n");
      out.write("        <th width=\"60\">Ilość</th>\n");
      out.write("         <th width=\"60\">Należność</th>\n");
      out.write("    </tr>\n");
      out.write("        ");
      if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\n");
      out.write("        <tr><td colspan=\"2\">Koszt bez dostawy: </td><td colspan=\"2\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${purchase.nettocost}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td></tr>\n");
      out.write("   \n");
      out.write("        </table>\n");
      out.write("        ");
      if (_jspx_meth_c_url_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\n");
      out.write("       \n");
      out.write("        ");
      //  form:form
      org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_form_0 = (org.springframework.web.servlet.tags.form.FormTag) _jspx_tagPool_form_form_method_commandName_action.get(org.springframework.web.servlet.tags.form.FormTag.class);
      _jspx_th_form_form_0.setPageContext(_jspx_page_context);
      _jspx_th_form_form_0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_form_form_0.setAction((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${checkoutAction}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      _jspx_th_form_form_0.setMethod("post");
      _jspx_th_form_form_0.setCommandName("purchase");
      int[] _jspx_push_body_count_form_form_0 = new int[] { 0 };
      try {
        int _jspx_eval_form_form_0 = _jspx_th_form_form_0.doStartTag();
        if (_jspx_eval_form_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("            ");
            if (_jspx_meth_form_hidden_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("\n");
            out.write("            ");
            if (_jspx_meth_form_hidden_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("\n");
            out.write("            ");
            if (_jspx_meth_form_hidden_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("\n");
            out.write("            ");
            if (_jspx_meth_form_hidden_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("\n");
            out.write("              ");
            if (_jspx_meth_form_hidden_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("\n");
            out.write("            ");
            //  form:select
            org.springframework.web.servlet.tags.form.SelectTag _jspx_th_form_select_0 = (org.springframework.web.servlet.tags.form.SelectTag) _jspx_tagPool_form_select_path.get(org.springframework.web.servlet.tags.form.SelectTag.class);
            _jspx_th_form_select_0.setPageContext(_jspx_page_context);
            _jspx_th_form_select_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
            _jspx_th_form_select_0.setPath("transport");
            int[] _jspx_push_body_count_form_select_0 = new int[] { 0 };
            try {
              int _jspx_eval_form_select_0 = _jspx_th_form_select_0.doStartTag();
              if (_jspx_eval_form_select_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\n");
                  out.write("                ");
                  //  c:forEach
                  org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
                  _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
                  _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_select_0);
                  _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${transportOptions}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
                  _jspx_th_c_forEach_1.setVar("item");
                  int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
                  try {
                    int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
                    if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      do {
                        out.write("\n");
                        out.write("                    ");
                        //  form:option
                        org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_option_0 = (org.springframework.web.servlet.tags.form.OptionTag) _jspx_tagPool_form_option_value.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                        _jspx_th_form_option_0.setPageContext(_jspx_page_context);
                        _jspx_th_form_option_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
                        _jspx_th_form_option_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.value}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
                        int[] _jspx_push_body_count_form_option_0 = new int[] { 0 };
                        try {
                          int _jspx_eval_form_option_0 = _jspx_th_form_option_0.doStartTag();
                          if (_jspx_eval_form_option_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_form_option_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_push_body_count_form_option_0[0]++;
                              _jspx_th_form_option_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_form_option_0.doInitBody();
                            }
                            do {
                              if (_jspx_meth_spring_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_option_0, _jspx_page_context, _jspx_push_body_count_form_option_0))
                              return;
                              int evalDoAfterBody = _jspx_th_form_option_0.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                            if (_jspx_eval_form_option_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                              out = _jspx_page_context.popBody();
                              _jspx_push_body_count_form_option_0[0]--;
                          }
                          if (_jspx_th_form_option_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            throw new SkipPageException();
                          }
                        } catch (Throwable _jspx_exception) {
                          while (_jspx_push_body_count_form_option_0[0]-- > 0)
                            out = _jspx_page_context.popBody();
                          _jspx_th_form_option_0.doCatch(_jspx_exception);
                        } finally {
                          _jspx_th_form_option_0.doFinally();
                          _jspx_tagPool_form_option_value.reuse(_jspx_th_form_option_0);
                        }
                        out.write("\n");
                        out.write("                ");
                        int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
                        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                          break;
                      } while (true);
                    }
                    if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      throw new SkipPageException();
                    }
                  } catch (Throwable _jspx_exception) {
                    while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_c_forEach_1.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_c_forEach_1.doFinally();
                    _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
                  }
                  out.write("\n");
                  out.write("            ");
                  int evalDoAfterBody = _jspx_th_form_select_0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_form_select_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                throw new SkipPageException();
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_select_0[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_select_0.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_select_0.doFinally();
              _jspx_tagPool_form_select_path.reuse(_jspx_th_form_select_0);
            }
            out.write("<br/>\n");
            out.write("                            <input type=\"submit\" name=\"dalej\" value=\"");
            if (_jspx_meth_spring_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("\" class=\"success\"/>\n");
            out.write("            <input type=\"submit\" name=\"anuluj\" value=\"");
            if (_jspx_meth_spring_message_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("\"/>\n");
            out.write("        ");
            int evalDoAfterBody = _jspx_th_form_form_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_form_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          throw new SkipPageException();
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_form_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_form_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_form_0.doFinally();
        _jspx_tagPool_form_form_method_commandName_action.reuse(_jspx_th_form_form_0);
      }
      out.write("\n");
      out.write("    ");
      return;
    }
    public void invoke( java.io.Writer writer )
      throws JspException
    {
      JspWriter out = null;
      if( writer != null ) {
        out = this.jspContext.pushBody(writer);
      } else {
        out = this.jspContext.getOut();
      }
      try {
        switch( this.discriminator ) {
          case 0:
            invoke0( out );
            break;
          case 1:
            invoke1( out );
            break;
          case 2:
            invoke2( out );
            break;
        }
      }
      catch( Throwable e ) {
        if (e instanceof SkipPageException)
            throw (SkipPageException) e;
        throw new JspException( e );
      }
      finally {
        if( writer != null ) {
          this.jspContext.popBody();
        }
      }
    }
  }
}
