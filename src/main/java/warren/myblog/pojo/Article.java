package warren.myblog.pojo;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;


public class Article {

    public static final int Article_TOP = 1;

    public static final int Article_Common = 0;

    private Long id;

    private String title;

    private String summary;
    //评论数
    private Integer commentCounts;
    //浏览量
    private Integer viewCounts;

    /**
     * 作者id
     */
    private Long authorId;
    /**
     * 内容id
     */
    private Long bodyId;
    /**
     * 类别id
     */
    private Long categoryId;

    /**
     * 置顶
     */
    private Integer weight = Article_Common;


    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private String createDate;

    public Article() {
    }

    public Article(Long id, String title, String summary, Integer commentCounts, Integer viewCounts, Long authorId, Long bodyId, Long categoryId, Integer weight, String createDate) {
        this.id = id;
        this.title = title;
        this.summary = summary;
        this.commentCounts = commentCounts;
        this.viewCounts = viewCounts;
        this.authorId = authorId;
        this.bodyId = bodyId;
        this.categoryId = categoryId;
        this.weight = weight;
        this.createDate = createDate;
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
     * @return authorId
     */
    public Long getAuthorId() {
        return authorId;
    }

    /**
     * 设置
     * @param authorId
     */
    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    /**
     * 获取
     * @return bodyId
     */
    public Long getBodyId() {
        return bodyId;
    }

    /**
     * 设置
     * @param bodyId
     */
    public void setBodyId(Long bodyId) {
        this.bodyId = bodyId;
    }

    /**
     * 获取
     * @return categoryId
     */
    public Long getCategoryId() {
        return categoryId;
    }

    /**
     * 设置
     * @param categoryId
     */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 获取
     * @return weight
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * 设置
     * @param weight
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * 获取
     * @return createDate
     */
    public String getCreateDate() {
        return createDate;
    }

    /**
     * 设置
     * @param createDate
     */
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String toString() {
        return "Article{Article_TOP = " + Article_TOP + ", Article_Common = " + Article_Common + ", id = " + id + ", title = " + title + ", summary = " + summary + ", commentCounts = " + commentCounts + ", viewCounts = " + viewCounts + ", authorId = " + authorId + ", bodyId = " + bodyId + ", categoryId = " + categoryId + ", weight = " + weight + ", createDate = " + createDate + "}";
    }
}
