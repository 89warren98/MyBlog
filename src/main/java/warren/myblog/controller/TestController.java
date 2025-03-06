package warren.myblog.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import warren.myblog.common.Result;
import warren.myblog.common.UserThreadLocal;
import warren.myblog.pojo.SysUser;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public Result test(){
        // 直接从 UserThreadLocal 获取当前登录用户
        SysUser sysUser = UserThreadLocal.get();
        System.out.println(sysUser);
        return Result.success(null);
    }
}