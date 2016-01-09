#spring-boot-test1
------------------------------------------------------------------- 
	Description: The test code for spring boot
	

#usage
	git clone https://github.com/john-deng/spring-boot-test1.git
	Open spring-boot-test1 from IDEA IDE, then run Application.java, you should be able to see below messages.
        
      .   ____          _            __ _ _
     /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
    ( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
     \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
      '  |____| .__|_| |_|_| |_\__, | / / / /
     =========|_|==============|___/=/_/_/_/
     :: Spring Boot ::        (v1.3.1.RELEASE)
    
    2016-01-09 16:15:26.561  INFO 10574 --- [           main] cn.vpclub.Application                    : Starting Application on Johns-MacBook-Pro.local with PID 10574 (/Users/johnd/workspace/test/spring-boot-test1/target/classes started by johnd in /Users/johnd/workspace/test)
    2016-01-09 16:15:26.565  INFO 10574 --- [           main] cn.vpclub.Application                    : No active profile set, falling back to default profiles: default
    2016-01-09 16:15:26.637  INFO 10574 --- [           main] ationConfigEmbeddedWebApplicationContext : Refreshing org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext@7ba18f1b: startup date [Sat Jan 09 16:15:26 CST 2016]; root of context hierarchy
    2016-01-09 16:15:27.688  INFO 10574 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Overriding bean definition for bean 'beanNameViewResolver' with a different definition: replacing [Root bean: class [null]; scope=; abstract=false; lazyInit=false; autowireMode=3; dependencyCheck=0; autowireCandidate=true; primary=false; factoryBeanName=org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration$WhitelabelErrorViewConfiguration; factoryMethodName=beanNameViewResolver; initMethodName=null; destroyMethodName=(inferred); defined in class path resource [org/springframework/boot/autoconfigure/web/ErrorMvcAutoConfiguration$WhitelabelErrorViewConfiguration.class]] with [Root bean: class [null]; scope=; abstract=false; lazyInit=false; autowireMode=3; dependencyCheck=0; autowireCandidate=true; primary=false; factoryBeanName=org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration$WebMvcAutoConfigurationAdapter; factoryMethodName=beanNameViewResolver; initMethodName=null; destroyMethodName=(inferred); defined in class path resource [org/springframework/boot/autoconfigure/web/WebMvcAutoConfiguration$WebMvcAutoConfigurationAdapter.class]]
    2016-01-09 16:15:28.292  INFO 10574 --- [           main] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat initialized with port(s): 8080 (http)
    2016-01-09 16:15:28.303  INFO 10574 --- [           main] o.apache.catalina.core.StandardService   : Starting service Tomcat
    2016-01-09 16:15:28.304  INFO 10574 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet Engine: Apache Tomcat/8.0.30
    2016-01-09 16:15:28.397  INFO 10574 --- [ost-startStop-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
    2016-01-09 16:15:28.397  INFO 10574 --- [ost-startStop-1] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 1764 ms
    2016-01-09 16:15:28.695  INFO 10574 --- [ost-startStop-1] o.s.b.c.e.ServletRegistrationBean        : Mapping servlet: 'dispatcherServlet' to [/]
    2016-01-09 16:15:28.699  INFO 10574 --- [ost-startStop-1] o.s.b.c.embedded.FilterRegistrationBean  : Mapping filter: 'characterEncodingFilter' to: [/*]
    2016-01-09 16:15:28.700  INFO 10574 --- [ost-startStop-1] o.s.b.c.embedded.FilterRegistrationBean  : Mapping filter: 'hiddenHttpMethodFilter' to: [/*]
    2016-01-09 16:15:28.700  INFO 10574 --- [ost-startStop-1] o.s.b.c.embedded.FilterRegistrationBean  : Mapping filter: 'httpPutFormContentFilter' to: [/*]
    2016-01-09 16:15:28.700  INFO 10574 --- [ost-startStop-1] o.s.b.c.embedded.FilterRegistrationBean  : Mapping filter: 'requestContextFilter' to: [/*]
    2016-01-09 16:15:28.954  INFO 10574 --- [           main] s.w.s.m.m.a.RequestMappingHandlerAdapter : Looking for @ControllerAdvice: org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext@7ba18f1b: startup date [Sat Jan 09 16:15:26 CST 2016]; root of context hierarchy
    2016-01-09 16:15:29.019  INFO 10574 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/user],methods=[GET],produces=[application/json]}" onto public cn.vpclub.User cn.vpclub.Controller.index(int,java.lang.String)
    2016-01-09 16:15:29.021  INFO 10574 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/]}" onto public java.lang.String cn.vpclub.Controller.home()
    2016-01-09 16:15:29.023  INFO 10574 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error]}" onto public org.springframework.http.ResponseEntity<java.util.Map<java.lang.String, java.lang.Object>> org.springframework.boot.autoconfigure.web.BasicErrorController.error(javax.servlet.http.HttpServletRequest)
    2016-01-09 16:15:29.023  INFO 10574 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error],produces=[text/html]}" onto public org.springframework.web.servlet.ModelAndView org.springframework.boot.autoconfigure.web.BasicErrorController.errorHtml(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)
    2016-01-09 16:15:29.048  INFO 10574 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/webjars/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
    2016-01-09 16:15:29.048  INFO 10574 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
    2016-01-09 16:15:29.085  INFO 10574 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**/favicon.ico] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
    2016-01-09 16:15:29.211  INFO 10574 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Registering beans for JMX exposure on startup
    2016-01-09 16:15:29.294  INFO 10574 --- [           main] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat started on port(s): 8080 (http)
    2016-01-09 16:15:29.301  INFO 10574 --- [           main] cn.vpclub.Application                    : Started Application in 3.322 seconds (JVM running for 4.109)
    
    After stated the application, use curl to check the below APIs,
    
    curl http://localhost:8080/user?id=3&name=John%20Deng
    
        {"name":"John Deng","id":3}
    
    curl http://localhost:8080/sendmail?to=john.deng@vpclub.cn&subject=About%20spring%20tutorial&body=Hi%20All,%20let%27s%20have%20a%20training
    
        Mail is sent to john.deng@vpclub.cn successfully!

