package warren.myblog.vo;

/*
 * author: Warren
 */
public class LoginUserVo {

    private Long id;

    private String account;

    private String nickname;

    private String avatar;

    public LoginUserVo() {
    }

    public LoginUserVo(Long id, String account, String nickname, String avatar) {
        this.id = id;
        this.account = account;
        this.nickname = nickname;
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

    /**
     * 获取
     * @return account
     */
    public String getAccount() {
        return account;
    }

    /**
     * 设置
     * @param account
     */
    public void setAccount(String account) {
        this.account = account;
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

    public String toString() {
        return "LoginUserVo{id = " + id + ", account = " + account + ", nickname = " + nickname + ", avatar = " + avatar + "}";
    }
}
