package warren.myblog.vo.Params;

import warren.myblog.vo.CategoryVo;
import warren.myblog.vo.TagVo;

import java.util.List;

public class ArticleParam {

    private Long id;

    private ArticleBodyParam body;

    private CategoryVo category;

    private String summary;

    private List<TagVo> tags;

    private String title;

    public ArticleParam() {
    }

    public ArticleParam(Long id, ArticleBodyParam body, CategoryVo category, String summary, List<TagVo> tags, String title) {
        this.id = id;
        this.body = body;
        this.category = category;
        this.summary = summary;
        this.tags = tags;
        this.title = title;
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
     * @return body
     */
    public ArticleBodyParam getBody() {
        return body;
    }

    /**
     * 设置
     * @param body
     */
    public void setBody(ArticleBodyParam body) {
        this.body = body;
    }

    /**
     * 获取
     * @return category
     */
    public CategoryVo getCategory() {
        return category;
    }

    /**
     * 设置
     * @param category
     */
    public void setCategory(CategoryVo category) {
        this.category = category;
    }

    /**
     * 获取
     * @return summary
     */
    public String getSummary() {
        return summary;
    }

    /**
     * 设置
     * @param summary
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * 获取
     * @return tags
     */
    public List<TagVo> getTags() {
        return tags;
    }

    /**
     * 设置
     * @param tags
     */
    public void setTags(List<TagVo> tags) {
        this.tags = tags;
    }

    /**
     * 获取
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    public String toString() {
        return "ArticleParam{id = " + id + ", body = " + body + ", category = " + category + ", summary = " + summary + ", tags = " + tags + ", title = " + title + "}";
    }
}