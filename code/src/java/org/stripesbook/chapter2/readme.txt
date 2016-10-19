Chapter 2 contains no runnable code samples.

The web.xml configuration listed in chapter 2 is as follows:

    <?xml version="1.0" encoding="UTF-8"?>
    <web-app xmlns="http://java.sun.com/xml/ns/javaee" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd" version="3.0">

        <filter>
            <display-name>Stripes Filter</display-name>
            <filter-name>StripesFilter</filter-name>
            <filter-class>
                    net.sourceforge.stripes.controller.StripesFilter
            </filter-class>
            <init-param>
                <param-name>ActionResolver.Packages</param-name>
                <param-value>
                    org.stripesbook.chapter1,
                    org.stripesbook.chapter2,
                    org.stripesbook.chapterX...
                    org.stripesbook.chapter15
                </param-value>
            </init-param>
        </filter> 

        <filter-mapping>
            <filter-name>StripesFilter</filter-name>
            <url-pattern>*.jsp</url-pattern>
            <dispatcher>REQUEST</dispatcher>
        </filter-mapping>

        <filter-mapping>
            <filter-name>StripesFilter</filter-name>
            <servlet-name>StripesDispatcher</servlet-name>
            <dispatcher>REQUEST</dispatcher>
        </filter-mapping>

        <servlet>
            <servlet-name>StripesDispatcher</servlet-name>
            <servlet-class>
                    net.sourceforge.stripes.controller.DispatcherServlet
            </servlet-class>
            <load-on-startup>1</load-on-startup>
        </servlet>

        <servlet-mapping>
            <servlet-name>StripesDispatcher</servlet-name>
            <url-pattern>*.action</url-pattern>
        </servlet-mapping>
        <servlet-mapping>
            <servlet-name>StripesDispatcher</servlet-name>
            <url-pattern>/action/*</url-pattern>
        </servlet-mapping>

    </web-app>