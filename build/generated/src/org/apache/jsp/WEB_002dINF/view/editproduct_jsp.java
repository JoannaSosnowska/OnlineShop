package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class editproduct_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/WEB-INF/tags/layout.tag");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_input_size_readonly_path_disabled_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_errors_path_class_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_form_method_commandName_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_label_path;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_options_items_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_hidden_path_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_input_type_size_path_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_select_path;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_spring_message_text_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_form_input_size_readonly_path_disabled_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_errors_path_class_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_form_method_commandName_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_label_path = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_options_items_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_hidden_path_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_input_type_size_path_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_url_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_select_path = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_spring_message_text_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_form_input_size_readonly_path_disabled_nobody.release();
    _jspx_tagPool_form_errors_path_class_nobody.release();
    _jspx_tagPool_form_form_method_commandName_action.release();
    _jspx_tagPool_form_label_path.release();
    _jspx_tagPool_form_options_items_nobody.release();
    _jspx_tagPool_form_hidden_path_nobody.release();
    _jspx_tagPool_form_input_type_size_path_nobody.release();
    _jspx_tagPool_c_url_var_value_nobody.release();
    _jspx_tagPool_form_select_path.release();
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
      javax.servlet.jsp.tagext.JspFragment _jspx_temp0 = new editproduct_jspHelper( 0, _jspx_page_context, _jspx_th_t_layout_0, null);
      _jspx_th_t_layout_0.setHeader(_jspx_temp0);
      javax.servlet.jsp.tagext.JspFragment _jspx_temp1 = new editproduct_jspHelper( 1, _jspx_page_context, _jspx_th_t_layout_0, null);
      _jspx_th_t_layout_0.setFooter(_jspx_temp1);
      _jspx_th_t_layout_0.setJspBody(new editproduct_jspHelper( 2, _jspx_page_context, _jspx_th_t_layout_0, null));
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

  private boolean _jspx_meth_c_url_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_c_url_0.setVar("editAction");
    _jspx_th_c_url_0.setValue("/product/edit");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_var_value_nobody.reuse(_jspx_th_c_url_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_url_var_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }

  private boolean _jspx_meth_form_label_0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:label
    org.springframework.web.servlet.tags.form.LabelTag _jspx_th_form_label_0 = (org.springframework.web.servlet.tags.form.LabelTag) _jspx_tagPool_form_label_path.get(org.springframework.web.servlet.tags.form.LabelTag.class);
    _jspx_th_form_label_0.setPageContext(_jspx_page_context);
    _jspx_th_form_label_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_label_0.setPath("id");
    int[] _jspx_push_body_count_form_label_0 = new int[] { 0 };
    try {
      int _jspx_eval_form_label_0 = _jspx_th_form_label_0.doStartTag();
      if (_jspx_eval_form_label_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                ");
          if (_jspx_meth_spring_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_label_0, _jspx_page_context, _jspx_push_body_count_form_label_0))
            return true;
          out.write("\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_form_label_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_label_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_label_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_label_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_label_0.doFinally();
      _jspx_tagPool_form_label_path.reuse(_jspx_th_form_label_0);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_label_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_label_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_0 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_text_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_0.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_label_0);
    _jspx_th_spring_message_0.setText("Id");
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

  private boolean _jspx_meth_form_input_0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_0 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_size_readonly_path_disabled_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_0.setPageContext(_jspx_page_context);
    _jspx_th_form_input_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_input_0.setPath("id");
    _jspx_th_form_input_0.setReadonly(true);
    _jspx_th_form_input_0.setSize("50");
    _jspx_th_form_input_0.setDisabled(true);
    int[] _jspx_push_body_count_form_input_0 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_0 = _jspx_th_form_input_0.doStartTag();
      if (_jspx_th_form_input_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_0.doFinally();
      _jspx_tagPool_form_input_size_readonly_path_disabled_nobody.reuse(_jspx_th_form_input_0);
    }
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

  private boolean _jspx_meth_form_label_1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:label
    org.springframework.web.servlet.tags.form.LabelTag _jspx_th_form_label_1 = (org.springframework.web.servlet.tags.form.LabelTag) _jspx_tagPool_form_label_path.get(org.springframework.web.servlet.tags.form.LabelTag.class);
    _jspx_th_form_label_1.setPageContext(_jspx_page_context);
    _jspx_th_form_label_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_label_1.setPath("title");
    int[] _jspx_push_body_count_form_label_1 = new int[] { 0 };
    try {
      int _jspx_eval_form_label_1 = _jspx_th_form_label_1.doStartTag();
      if (_jspx_eval_form_label_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          if (_jspx_meth_spring_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_label_1, _jspx_page_context, _jspx_push_body_count_form_label_1))
            return true;
          int evalDoAfterBody = _jspx_th_form_label_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_label_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_label_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_label_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_label_1.doFinally();
      _jspx_tagPool_form_label_path.reuse(_jspx_th_form_label_1);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_label_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_label_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_1 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_text_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_1.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_label_1);
    _jspx_th_spring_message_1.setText("Nazwa");
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

  private boolean _jspx_meth_form_input_1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_1 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_type_size_path_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_1.setPageContext(_jspx_page_context);
    _jspx_th_form_input_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_input_1.setDynamicAttribute(null, "type", new String("text"));
    _jspx_th_form_input_1.setPath("title");
    _jspx_th_form_input_1.setSize("50");
    int[] _jspx_push_body_count_form_input_1 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_1 = _jspx_th_form_input_1.doStartTag();
      if (_jspx_th_form_input_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_1.doFinally();
      _jspx_tagPool_form_input_type_size_path_nobody.reuse(_jspx_th_form_input_1);
    }
    return false;
  }

  private boolean _jspx_meth_form_label_2(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:label
    org.springframework.web.servlet.tags.form.LabelTag _jspx_th_form_label_2 = (org.springframework.web.servlet.tags.form.LabelTag) _jspx_tagPool_form_label_path.get(org.springframework.web.servlet.tags.form.LabelTag.class);
    _jspx_th_form_label_2.setPageContext(_jspx_page_context);
    _jspx_th_form_label_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_label_2.setPath("categoryName");
    int[] _jspx_push_body_count_form_label_2 = new int[] { 0 };
    try {
      int _jspx_eval_form_label_2 = _jspx_th_form_label_2.doStartTag();
      if (_jspx_eval_form_label_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          if (_jspx_meth_spring_message_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_label_2, _jspx_page_context, _jspx_push_body_count_form_label_2))
            return true;
          int evalDoAfterBody = _jspx_th_form_label_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_label_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_label_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_label_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_label_2.doFinally();
      _jspx_tagPool_form_label_path.reuse(_jspx_th_form_label_2);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_2(javax.servlet.jsp.tagext.JspTag _jspx_th_form_label_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_label_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_2 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_text_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_2.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_label_2);
    _jspx_th_spring_message_2.setText("Kategoria");
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

  private boolean _jspx_meth_form_select_0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:select
    org.springframework.web.servlet.tags.form.SelectTag _jspx_th_form_select_0 = (org.springframework.web.servlet.tags.form.SelectTag) _jspx_tagPool_form_select_path.get(org.springframework.web.servlet.tags.form.SelectTag.class);
    _jspx_th_form_select_0.setPageContext(_jspx_page_context);
    _jspx_th_form_select_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_select_0.setPath("categoryName");
    int[] _jspx_push_body_count_form_select_0 = new int[] { 0 };
    try {
      int _jspx_eval_form_select_0 = _jspx_th_form_select_0.doStartTag();
      if (_jspx_eval_form_select_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    ");
          if (_jspx_meth_form_options_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_select_0, _jspx_page_context, _jspx_push_body_count_form_select_0))
            return true;
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
    return false;
  }

  private boolean _jspx_meth_form_options_0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_select_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_select_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:options
    org.springframework.web.servlet.tags.form.OptionsTag _jspx_th_form_options_0 = (org.springframework.web.servlet.tags.form.OptionsTag) _jspx_tagPool_form_options_items_nobody.get(org.springframework.web.servlet.tags.form.OptionsTag.class);
    _jspx_th_form_options_0.setPageContext(_jspx_page_context);
    _jspx_th_form_options_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_select_0);
    _jspx_th_form_options_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${categories}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_form_options_0 = new int[] { 0 };
    try {
      int _jspx_eval_form_options_0 = _jspx_th_form_options_0.doStartTag();
      if (_jspx_th_form_options_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_options_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_options_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_options_0.doFinally();
      _jspx_tagPool_form_options_items_nobody.reuse(_jspx_th_form_options_0);
    }
    return false;
  }

  private boolean _jspx_meth_form_label_3(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:label
    org.springframework.web.servlet.tags.form.LabelTag _jspx_th_form_label_3 = (org.springframework.web.servlet.tags.form.LabelTag) _jspx_tagPool_form_label_path.get(org.springframework.web.servlet.tags.form.LabelTag.class);
    _jspx_th_form_label_3.setPageContext(_jspx_page_context);
    _jspx_th_form_label_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_label_3.setPath("description");
    int[] _jspx_push_body_count_form_label_3 = new int[] { 0 };
    try {
      int _jspx_eval_form_label_3 = _jspx_th_form_label_3.doStartTag();
      if (_jspx_eval_form_label_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          if (_jspx_meth_spring_message_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_label_3, _jspx_page_context, _jspx_push_body_count_form_label_3))
            return true;
          int evalDoAfterBody = _jspx_th_form_label_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_label_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_label_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_label_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_label_3.doFinally();
      _jspx_tagPool_form_label_path.reuse(_jspx_th_form_label_3);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_3(javax.servlet.jsp.tagext.JspTag _jspx_th_form_label_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_label_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_3 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_text_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_3.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_label_3);
    _jspx_th_spring_message_3.setText("Opis");
    int[] _jspx_push_body_count_spring_message_3 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_3 = _jspx_th_spring_message_3.doStartTag();
      if (_jspx_th_spring_message_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_3.doFinally();
      _jspx_tagPool_spring_message_text_nobody.reuse(_jspx_th_spring_message_3);
    }
    return false;
  }

  private boolean _jspx_meth_form_input_2(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_2 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_type_size_path_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_2.setPageContext(_jspx_page_context);
    _jspx_th_form_input_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_input_2.setDynamicAttribute(null, "type", new String("text"));
    _jspx_th_form_input_2.setPath("description");
    _jspx_th_form_input_2.setSize("50");
    int[] _jspx_push_body_count_form_input_2 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_2 = _jspx_th_form_input_2.doStartTag();
      if (_jspx_th_form_input_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_2.doFinally();
      _jspx_tagPool_form_input_type_size_path_nobody.reuse(_jspx_th_form_input_2);
    }
    return false;
  }

  private boolean _jspx_meth_form_label_4(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:label
    org.springframework.web.servlet.tags.form.LabelTag _jspx_th_form_label_4 = (org.springframework.web.servlet.tags.form.LabelTag) _jspx_tagPool_form_label_path.get(org.springframework.web.servlet.tags.form.LabelTag.class);
    _jspx_th_form_label_4.setPageContext(_jspx_page_context);
    _jspx_th_form_label_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_label_4.setPath("unitPrice");
    int[] _jspx_push_body_count_form_label_4 = new int[] { 0 };
    try {
      int _jspx_eval_form_label_4 = _jspx_th_form_label_4.doStartTag();
      if (_jspx_eval_form_label_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          if (_jspx_meth_spring_message_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_label_4, _jspx_page_context, _jspx_push_body_count_form_label_4))
            return true;
          int evalDoAfterBody = _jspx_th_form_label_4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_label_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_label_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_label_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_label_4.doFinally();
      _jspx_tagPool_form_label_path.reuse(_jspx_th_form_label_4);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_4(javax.servlet.jsp.tagext.JspTag _jspx_th_form_label_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_label_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_4 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_text_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_4.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_label_4);
    _jspx_th_spring_message_4.setText("Cena jednostkowa");
    int[] _jspx_push_body_count_spring_message_4 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_4 = _jspx_th_spring_message_4.doStartTag();
      if (_jspx_th_spring_message_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_4.doFinally();
      _jspx_tagPool_spring_message_text_nobody.reuse(_jspx_th_spring_message_4);
    }
    return false;
  }

  private boolean _jspx_meth_form_input_3(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_3 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_type_size_path_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_3.setPageContext(_jspx_page_context);
    _jspx_th_form_input_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_input_3.setDynamicAttribute(null, "type", new String("text"));
    _jspx_th_form_input_3.setPath("unitPrice");
    _jspx_th_form_input_3.setSize("50");
    int[] _jspx_push_body_count_form_input_3 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_3 = _jspx_th_form_input_3.doStartTag();
      if (_jspx_th_form_input_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_3.doFinally();
      _jspx_tagPool_form_input_type_size_path_nobody.reuse(_jspx_th_form_input_3);
    }
    return false;
  }

  private boolean _jspx_meth_form_label_5(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:label
    org.springframework.web.servlet.tags.form.LabelTag _jspx_th_form_label_5 = (org.springframework.web.servlet.tags.form.LabelTag) _jspx_tagPool_form_label_path.get(org.springframework.web.servlet.tags.form.LabelTag.class);
    _jspx_th_form_label_5.setPageContext(_jspx_page_context);
    _jspx_th_form_label_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_label_5.setPath("unit");
    int[] _jspx_push_body_count_form_label_5 = new int[] { 0 };
    try {
      int _jspx_eval_form_label_5 = _jspx_th_form_label_5.doStartTag();
      if (_jspx_eval_form_label_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("Jednostka");
          int evalDoAfterBody = _jspx_th_form_label_5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_label_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_label_5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_label_5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_label_5.doFinally();
      _jspx_tagPool_form_label_path.reuse(_jspx_th_form_label_5);
    }
    return false;
  }

  private boolean _jspx_meth_form_input_4(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_4 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_type_size_path_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_4.setPageContext(_jspx_page_context);
    _jspx_th_form_input_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_input_4.setDynamicAttribute(null, "type", new String("text"));
    _jspx_th_form_input_4.setPath("unit");
    _jspx_th_form_input_4.setSize("50");
    int[] _jspx_push_body_count_form_input_4 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_4 = _jspx_th_form_input_4.doStartTag();
      if (_jspx_th_form_input_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_4.doFinally();
      _jspx_tagPool_form_input_type_size_path_nobody.reuse(_jspx_th_form_input_4);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_5(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_5 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_text_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_5.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_spring_message_5.setText("Zapisz zmiany");
    int[] _jspx_push_body_count_spring_message_5 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_5 = _jspx_th_spring_message_5.doStartTag();
      if (_jspx_th_spring_message_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_5.doFinally();
      _jspx_tagPool_spring_message_text_nobody.reuse(_jspx_th_spring_message_5);
    }
    return false;
  }

  private class editproduct_jspHelper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public editproduct_jspHelper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
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
      out.write("        ");
      if (_jspx_meth_c_url_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\n");
      out.write("        <h3>Edytuj dane produktu</h3>\n");
      out.write("         ");
      //  form:form
      org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_form_0 = (org.springframework.web.servlet.tags.form.FormTag) _jspx_tagPool_form_form_method_commandName_action.get(org.springframework.web.servlet.tags.form.FormTag.class);
      _jspx_th_form_form_0.setPageContext(_jspx_page_context);
      _jspx_th_form_form_0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_form_form_0.setAction((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${editAction}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      _jspx_th_form_form_0.setMethod("post");
      _jspx_th_form_form_0.setCommandName("product");
      int[] _jspx_push_body_count_form_form_0 = new int[] { 0 };
      try {
        int _jspx_eval_form_form_0 = _jspx_th_form_form_0.doStartTag();
        if (_jspx_eval_form_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("            ");
            if (_jspx_meth_form_label_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("\n");
            out.write("            ");
            if (_jspx_meth_form_input_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("\n");
            out.write("            ");
            if (_jspx_meth_form_hidden_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("<br/>\n");
            out.write("            ");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_errors_0 = (org.springframework.web.servlet.tags.form.ErrorsTag) _jspx_tagPool_form_errors_path_class_nobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_errors_0.setPageContext(_jspx_page_context);
            _jspx_th_form_errors_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
            _jspx_th_form_errors_0.setPath("title");
            _jspx_th_form_errors_0.setDynamicAttribute(null, "class", new String("errorlist"));
            int[] _jspx_push_body_count_form_errors_0 = new int[] { 0 };
            try {
              int _jspx_eval_form_errors_0 = _jspx_th_form_errors_0.doStartTag();
              if (_jspx_th_form_errors_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                throw new SkipPageException();
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_errors_0[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_errors_0.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_errors_0.doFinally();
              _jspx_tagPool_form_errors_path_class_nobody.reuse(_jspx_th_form_errors_0);
            }
            out.write("<br/>\n");
            out.write("             ");
            if (_jspx_meth_form_label_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("<br/>");
            if (_jspx_meth_form_input_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("<br/>\n");
            out.write("            ");
            if (_jspx_meth_form_label_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("<br/>\n");
            out.write("            ");
            if (_jspx_meth_form_select_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("<br/>\n");
            out.write("            ");
            if (_jspx_meth_form_label_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("<br/>");
            if (_jspx_meth_form_input_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("<br/>\n");
            out.write("            ");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_errors_1 = (org.springframework.web.servlet.tags.form.ErrorsTag) _jspx_tagPool_form_errors_path_class_nobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_errors_1.setPageContext(_jspx_page_context);
            _jspx_th_form_errors_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
            _jspx_th_form_errors_1.setPath("unitPrice");
            _jspx_th_form_errors_1.setDynamicAttribute(null, "class", new String("errorlist"));
            int[] _jspx_push_body_count_form_errors_1 = new int[] { 0 };
            try {
              int _jspx_eval_form_errors_1 = _jspx_th_form_errors_1.doStartTag();
              if (_jspx_th_form_errors_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                throw new SkipPageException();
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_errors_1[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_errors_1.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_errors_1.doFinally();
              _jspx_tagPool_form_errors_path_class_nobody.reuse(_jspx_th_form_errors_1);
            }
            out.write("<br/>            \n");
            out.write("            ");
            if (_jspx_meth_form_label_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("<br/>");
            if (_jspx_meth_form_input_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("<br/>\n");
            out.write("            ");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_errors_2 = (org.springframework.web.servlet.tags.form.ErrorsTag) _jspx_tagPool_form_errors_path_class_nobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_errors_2.setPageContext(_jspx_page_context);
            _jspx_th_form_errors_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
            _jspx_th_form_errors_2.setPath("unit");
            _jspx_th_form_errors_2.setDynamicAttribute(null, "class", new String("errorlist"));
            int[] _jspx_push_body_count_form_errors_2 = new int[] { 0 };
            try {
              int _jspx_eval_form_errors_2 = _jspx_th_form_errors_2.doStartTag();
              if (_jspx_th_form_errors_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                throw new SkipPageException();
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_errors_2[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_errors_2.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_errors_2.doFinally();
              _jspx_tagPool_form_errors_path_class_nobody.reuse(_jspx_th_form_errors_2);
            }
            out.write("<br/>            \n");
            out.write("            ");
            if (_jspx_meth_form_label_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("<br/>");
            if (_jspx_meth_form_input_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("<br/>\n");
            out.write("            <input type=\"submit\" value=\"");
            if (_jspx_meth_spring_message_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
              return;
            out.write("\" class=\"success\"/>\n");
            out.write("            \n");
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
