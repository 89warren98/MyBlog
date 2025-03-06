package warren.myblog.pojo;



public class Tag {

    private Long id;

    private String avatar;

    private String tagName;

    public Tag() {
    }

    public Tag(Long id, String avatar, String tagName) {
        this.id = id;
        this.avatar = avatar;
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
     * @return avatar
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * 设置
     * @param avatar
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
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
        return "Tag{id = " + id + ", avatar = " + avatar + ", tagName = " + tagName + "}";
    }
}