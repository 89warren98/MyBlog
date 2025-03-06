package warren.myblog.vo;

public class CategoryVo {

    private Long id;

    private String avatar;

    private String categoryName;

    public CategoryVo() {
    }

    public CategoryVo(Long id, String avatar, String categoryName) {
        this.id = id;
        this.avatar = avatar;
        this.categoryName = categoryName;
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
     * @return categoryName
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * 设置
     * @param categoryName
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String toString() {
        return "CategoryVo{id = " + id + ", avatar = " + avatar + ", categoryName = " + categoryName + "}";
    }
}