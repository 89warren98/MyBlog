package warren.myblog.vo;

public class ArticleBodyVo {

    private String content;

    public ArticleBodyVo() {
    }

    public ArticleBodyVo(String content) {
        this.content = content;
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

    public String toString() {
        return "ArticleBodyVo{content = " + content + "}";
    }
}