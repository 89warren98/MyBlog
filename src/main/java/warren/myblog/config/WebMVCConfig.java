package warren.myblog.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import warren.myblog.common.LoginInterceptor;
import warren.myblog.common.UserThreadLocal;

@Configuration
public class WebMVCConfig implements WebMvcConfigurer {

    @Autowired
    private LoginInterceptor loginInterceptor;

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // 如果仅需允许 http://localhost:8080，可以在这里指定
        // 如果需要允许多个域名，可以多次调用 allowedOrigins 或改用 allowedOriginPatterns
        registry.addMapping("/**")
                // 允许前端的域名（端口）
                .allowedOrigins("http://localhost:8080")
                // 允许的 HTTP 方法
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                // 允许携带的请求头，这里使用 * 可以匹配所有
                .allowedHeaders("*")
                // 是否允许跨域携带 Cookie、Authorization 等凭证信息
                .allowCredentials(true);
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 配置需要登录才能访问的接口
        registry.addInterceptor(loginInterceptor)
                .addPathPatterns("/test",
                        "/comments/create/change",
                        "/articles/publish",
// 当时没有加这个"/comments/delete,导致删除评论时总是显示未登录.
// 解释:接口不会经过登录拦截器。这样，UserThreadLocal
//就不会被设置，导致在删除操作时 UserThreadLocal.get() 返回 null，从而出现“未登录”的错误
                        "/comments/delete",
                        "/articles/deleteBatch"
                );
    }
}
