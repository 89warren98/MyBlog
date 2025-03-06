package warren.myblog.vo;

/*
 * author: Warren
 */
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import java.util.Date;
import java.util.List;


/**
 * 文章前端视图对象
 */
public class ArticleVo {
    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;

    private String title;

    private String summary;

    private Integer commentCounts;

    private Integer viewCounts;

    private int weight;
    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm", timezone = "GMT+8")
    private Date createDate; // 直接使用 Date，前端自动变成 "yyyy-MM-dd HH:mm"

    private String author;

   private ArticleBodyVo body;

    private List<TagVo> tags;

    private CategoryVo category;


    private List<CategoryVo> categorys;


    public ArticleVo() {
    }

    public ArticleVo(Long id, String title, String summary, Integer commentCounts, Integer viewCounts, int weight, Date createDate, String author, ArticleBodyVo body, List<TagVo> tags, CategoryVo category, List<CategoryVo> categorys) {
        this.id = id;
        this.title = title;
        this.summary = summary;
        this.commentCounts = commentCounts;
        this.viewCounts = viewCounts;
        this.weight = weight;
        this.createDate = createDate;
        this.author = author;
        this.body = body;
        this.tags = tags;
        this.category = category;
        this.categorys = categorys;
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
     * @return commentCounts
     */
    public Integer getCommentCounts() {
        return commentCounts;
    }

    /**
     * 设置
     * @param commentCounts
     */
    public void setCommentCounts(Integer commentCounts) {
        this.commentCounts = commentCounts;
    }

    /**
     * 获取
     * @return viewCounts
     */
    public Integer getViewCounts() {
        return viewCounts;
    }

    /**
     * 设置
     * @param viewCounts
     */
    public void setViewCounts(Integer viewCounts) {
        this.viewCounts = viewCounts;
    }

    /**
     * 获取
     * @return weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * 设置
     * @param weight
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * 获取
     * @return createDate
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置
     * @param createDate
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取
     * @return author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * 设置
     * @param author
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * 获取
     * @return body
     */
    public ArticleBodyVo getBody() {
        return body;
    }

    /**
     * 设置
     * @param body
     */
    public void setBody(ArticleBodyVo body) {
        this.body = body;
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
     * @return categorys
     */
    public List<CategoryVo> getCategorys() {
        return categorys;
    }

    /**
     * 设置
     * @param categorys
     */
    public void setCategorys(List<CategoryVo> categorys) {
        this.categorys = categorys;
    }

    public String toString() {
        return "ArticleVo{id = " + id + ", title = " + title + ", summary = " + summary + ", commentCounts = " + commentCounts + ", viewCounts = " + viewCounts + ", weight = " + weight + ", createDate = " + createDate + ", author = " + author + ", body = " + body + ", tags = " + tags + ", category = " + category + ", categorys = " + categorys + "}";
    }
}
