package warren.myblog.pojo;

public class ArticleTag {

    private Long id;

    private Long articleId;

    private Long tagId;

    public ArticleTag() {
    }

    public ArticleTag(Long id, Long articleId, Long tagId) {
        this.id = id;
        this.articleId = articleId;
        this.tagId = tagId;
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
     * @return tagId
     */
    public Long getTagId() {
        return tagId;
    }

    /**
     * 设置
     * @param tagId
     */
    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    public String toString() {
        return "ArticleTag{id = " + id + ", articleId = " + articleId + ", tagId = " + tagId + "}";
    }
}