package warren.myblog.pojo;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;


public class SysUser {

    private Long id;

    private String account;

    private Integer admin;

    private String avatar;

    @TableField(fill = FieldFill.INSERT)
    private String createDate;

    private Integer deleted;

    private String email;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private String lastLogin;

    private String mobilePhoneNumber;

    private String nickname;

    private String password;

    private String salt;

    private String status;


    public SysUser() {
    }

    public SysUser(Long id, String account, Integer admin, String avatar, String createDate, Integer deleted, String email, String lastLogin, String mobilePhoneNumber, String nickname, String password, String salt, String status) {
        this.id = id;
        this.account = account;
        this.admin = admin;
        this.avatar = avatar;
        this.createDate = createDate;
        this.deleted = deleted;
        this.email = email;
        this.lastLogin = lastLogin;
        this.mobilePhoneNumber = mobilePhoneNumber;
        this.nickname = nickname;
        this.password = password;
        this.salt = salt;
        this.status = status;
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
     * @return admin
     */
    public Integer getAdmin() {
        return admin;
    }

    /**
     * 设置
     * @param admin
     */
    public void setAdmin(Integer admin) {
        this.admin = admin;
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
     * @return deleted
     */
    public Integer getDeleted() {
        return deleted;
    }

    /**
     * 设置
     * @param deleted
     */
    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    /**
     * 获取
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取
     * @return lastLogin
     */
    public String getLastLogin() {
        return lastLogin;
    }

    /**
     * 设置
     * @param lastLogin
     */
    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }

    /**
     * 获取
     * @return mobilePhoneNumber
     */
    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    /**
     * 设置
     * @param mobilePhoneNumber
     */
    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
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
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return salt
     */
    public String getSalt() {
        return salt;
    }

    /**
     * 设置
     * @param salt
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }

    /**
     * 获取
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    public String toString() {
        return "SysUser{id = " + id + ", account = " + account + ", admin = " + admin + ", avatar = " + avatar + ", createDate = " + createDate + ", deleted = " + deleted + ", email = " + email + ", lastLogin = " + lastLogin + ", mobilePhoneNumber = " + mobilePhoneNumber + ", nickname = " + nickname + ", password = " + password + ", salt = " + salt + ", status = " + status + "}";
    }
}
