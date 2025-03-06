package warren.myblog.vo.Params;

public class ArticleBodyParam {

    private String content;

    private String contentHtml;

    public ArticleBodyParam() {
    }

    public ArticleBodyParam(String content, String contentHtml) {
        this.content = content;
        this.contentHtml = contentHtml;
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

    public String toString() {
        return "ArticleBodyParam{content = " + content + ", contentHtml = " + contentHtml + "}";
    }
}