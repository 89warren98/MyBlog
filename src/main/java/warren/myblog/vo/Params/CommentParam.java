package warren.myblog.vo.Params;

public class CommentParam {

    private Long articleId;

    private String content;

    private Long parent;

    private Long toUserId;

    public CommentParam() {
    }

    public CommentParam(Long articleId, String content, Long parent, Long toUserId) {
        this.articleId = articleId;
        this.content = content;
        this.parent = parent;
        this.toUserId = toUserId;
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
     * @return parent
     */
    public Long getParent() {
        return parent;
    }

    /**
     * 设置
     * @param parent
     */
    public void setParent(Long parent) {
        this.parent = parent;
    }

    /**
     * 获取
     * @return toUserId
     */
    public Long getToUserId() {
        return toUserId;
    }

    /**
     * 设置
     * @param toUserId
     */
    public void setToUserId(Long toUserId) {
        this.toUserId = toUserId;
    }

    public String toString() {
        return "CommentParam{articleId = " + articleId + ", content = " + content + ", parent = " + parent + ", toUserId = " + toUserId + "}";
    }
}