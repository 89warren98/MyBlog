package warren.myblog.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;
import warren.myblog.pojo.Article;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class MyMetaObjectHandler implements MetaObjectHandler {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");

    @Override
    public void insertFill(MetaObject metaObject) {
        String currentTime = LocalDateTime.now().format(FORMATTER);
        this.strictInsertFill(metaObject, "createDate", String.class, currentTime);
        this.strictInsertFill(metaObject, "lastLogin", String.class, currentTime);
        // 先检查 weight 是否已经有值
        Object weightValue = this.getFieldValByName("weight", metaObject);
        if (weightValue == null) {
            this.setFieldValByName("weight", Article.Article_Common, metaObject);
        }
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        String currentTime = LocalDateTime.now().format(FORMATTER);
        this.strictUpdateFill(metaObject, "lastLogin", String.class, currentTime);
    }
}
