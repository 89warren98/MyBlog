package warren.myblog.vo.Params;

/*
 * author: Warren
 */
public class LoginParams {
    private String account;
    private  String password;

    public LoginParams() {
    }

    public LoginParams(String account, String password) {
        this.account = account;
        this.password = password;
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

    public String toString() {
        return "LoginParams{account = " + account + ", password = " + password + "}";
    }
}
