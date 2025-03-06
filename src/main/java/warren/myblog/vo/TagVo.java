package warren.myblog.vo;

/*
 * author: Warren
 */
import lombok.Data;

/**
 * 标签前端视图对象
 */
public class TagVo {

    private Long id;

    private String tagName;

    public TagVo() {
    }

    public TagVo(Long id, String tagName) {
        this.id = id;
        this.tagName = tagName;
    }

    /**
     * 获取
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取
     * @return tagName
     */
    public String getTagName() {
        return tagName;
    }

    /**
     * 设置
     * @param tagName
     */
    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String toString() {
        return "TagVo{id = " + id + ", tagName = " + tagName + "}";
    }
}