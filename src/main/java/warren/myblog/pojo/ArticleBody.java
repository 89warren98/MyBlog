package warren.myblog.pojo;

public class ArticleBody {

    private Long id;
    private String content;
    private String contentHtml;
    private Long articleId;

    public ArticleBody() {
    }

    public ArticleBody(Long id, String content, String contentHtml, Long articleId) {
        this.id = id;
        this.content = content;
        this.contentHtml = contentHtml;
        this.articleId = articleId;
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
     * @return contentHtml
     */
    public String getContentHtml() {
        return contentHtml;
    }

    /**
     * 设置
     * @param contentHtml
     */
    public void setContentHtml(String contentHtml) {
        this.contentHtml = contentHtml;
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

    public String toString() {
        return "ArticleBody{id = " + id + ", content = " + content + ", contentHtml = " + contentHtml + ", articleId = " + articleId + "}";
    }
}