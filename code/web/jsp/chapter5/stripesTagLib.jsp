<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld"%>

<html>
    <body>
        <p>The stripes tag libs are 95% form fields.  However, the &lt;stripes:link&gt; tag is not, and is very useful.</p>

        <p>Create a link to go to the next example:</p>

        &nbsp;&nbsp;&nbsp;
        <code>&lt;stripes:link beanclass=&quot;org.stripesbook.chapter5.JspExamplesActionBean&quot; event=&quot;form&quot;&gt;Next&lt;/stripes:link&gt;</code>
        Which produces this: <stripes:link beanclass="org.stripesbook.chapter5.JspExamplesActionBean" event="form">Next</stripes:link>

        <br />
        <br />

        <p>We can also take advantage of the getClass() method, which all Java objects have, and simply write:</p>

        &nbsp;&nbsp;&nbsp;
        <code>&lt;stripes:link beanclass=&quot;\${actionBean.class}&quot; event=&quot;form&quot;&gt;Next&lt;/stripes:link&gt;</code>
    </body>
</html>