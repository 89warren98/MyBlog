package warren.myblog.pojo;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;

public class Comment {

    private Long id;

    private String content;

    @TableField(fill = FieldFill.INSERT)
    private String createDate;

    private Long articleId;

    private Long commentatorId;

    private Long parentId;

    private Long toUid;

    private Integer level;


    public Comment() {
    }

    public Comment(Long id, String content, String createDate, Long articleId, Long commentatorId, Long parentId, Long toUid, Integer level) {
        this.id = id;
        this.content = content;
        this.createDate = createDate;
        this.articleId = articleId;
        this.commentatorId = commentatorId;
        this.parentId = parentId;
        this.toUid = toUid;
        this.level = level;
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
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
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

    /**
     * 获取
     * @return articleId
     */
    public Long getArticleId() {
        return articleId;
    }

    /**
     * 设置
     * @param articleId
     */
    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    /**
     * 获取
     * @return commentatorId
     */
    public Long getCommentatorId() {
        return commentatorId;
    }

    /**
     * 设置
     * @param commentatorId
     */
    public void setCommentatorId(Long commentatorId) {
        this.commentatorId = commentatorId;
    }

    /**
     * 获取
     * @return parentId
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * 设置
     * @param parentId
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取
     * @return toUid
     */
    public Long getToUid() {
        return toUid;
    }

    /**
     * 设置
     * @param toUid
     */
    public void setToUid(Long toUid) {
        this.toUid = toUid;
    }

    /**
     * 获取
     * @return level
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 设置
     * @param level
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    public String toString() {
        return "Comment{id = " + id + ", content = " + content + ", createDate = " + createDate + ", articleId = " + articleId + ", commentatorId = " + commentatorId + ", parentId = " + parentId + ", toUid = " + toUid + ", level = " + level + "}";
    }
}