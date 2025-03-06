package warren.myblog.vo;

public class UserVo {

    private String nickname;

    private String avatar;

    private Long id;

    public UserVo() {
    }

    public UserVo(String nickname, String avatar, Long id) {
        this.nickname = nickname;
        this.avatar = avatar;
        this.id = id;
    }

    /**
     * 获取
     * @return nickname
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设置
     * @param nickname
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
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

    public String toString() {
        return "UserVo{nickname = " + nickname + ", avatar = " + avatar + ", id = " + id + "}";
    }
}
