package warren.myblog.vo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import java.util.List;

public class CommentVo  {

    //防止前端精度损失
    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;

    //评论的人
    private UserVo commentator;

    private String content;

    private List<CommentVo> childrens;

    private String createDate;

    private Integer level;
    //给谁评论
    private UserVo toUser;


    public CommentVo() {
    }

    public CommentVo(Long id, UserVo commentator, String content, List<CommentVo> childrens, String createDate, Integer level, UserVo toUser) {
        this.id = id;
        this.commentator = commentator;
        this.content = content;
        this.childrens = childrens;
        this.createDate = createDate;
        this.level = level;
        this.toUser = toUser;
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
     * @return commentator
     */
    public UserVo getCommentator() {
        return commentator;
    }

    /**
     * 设置
     * @param commentator
     */
    public void setCommentator(UserVo commentator) {
        this.commentator = commentator;
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
     * @return childrens
     */
    public List<CommentVo> getChildrens() {
        return childrens;
    }

    /**
     * 设置
     * @param childrens
     */
    public void setChildrens(List<CommentVo> childrens) {
        this.childrens = childrens;
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
     * @return level
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 设置
     * @param level
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * 获取
     * @return toUser
     */
    public UserVo getToUser() {
        return toUser;
    }

    /**
     * 设置
     * @param toUser
     */
    public void setToUser(UserVo toUser) {
        this.toUser = toUser;
    }

    public String toString() {
        return "CommentVo{id = " + id + ", commentator = " + commentator + ", content = " + content + ", childrens = " + childrens + ", createDate = " + createDate + ", level = " + level + ", toUser = " + toUser + "}";
    }
}
