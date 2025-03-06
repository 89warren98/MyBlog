package warren.myblog.vo.Params;

import lombok.Data;

/*
 * author: Warren
 */

/**
 * 分页参数类
 */
public class PageParams {
    private int page=1;
    private int pagesize=10;

    /**
     * 这是后面添加的两个属性,如果不添加的话,进入对应的分类标签,会查询到全部的文章而不是在当前分类下的文章
     */
    private  Long categoryId;
    private Long TagId;

    private String year;

    private String month;

    public PageParams() {
    }

    public PageParams(int page, int pagesize, Long categoryId, Long TagId, String year, String month) {
        this.page = page;
        this.pagesize = pagesize;
        this.categoryId = categoryId;
        this.TagId = TagId;
        this.year = year;
        this.month = month;
    }

    public String getMonth(){
        if (this.month != null && this.month.length() == 1){
            return "0"+this.month;
        }
        return this.month;
    }

    /**
     * 获取
     * @return page
     */
    public int getPage() {
        return page;
    }

    /**
     * 设置
     * @param page
     */
    public void setPage(int page) {
        this.page = page;
    }

    /**
     * 获取
     * @return pagesize
     */
    public int getPagesize() {
        return pagesize;
    }

    /**
     * 设置
     * @param pagesize
     */
    public void setPagesize(int pagesize) {
        this.pagesize = pagesize;
    }

    /**
     * 获取
     * @return categoryId
     */
    public Long getCategoryId() {
        return categoryId;
    }

    /**
     * 设置
     * @param categoryId
     */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 获取
     * @return TagId
     */
    public Long getTagId() {
        return TagId;
    }

    /**
     * 设置
     * @param TagId
     */
    public void setTagId(Long TagId) {
        this.TagId = TagId;
    }

    /**
     * 获取
     * @return year
     */
    public String getYear() {
        return year;
    }

    /**
     * 设置
     * @param year
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * 设置
     * @param month
     */
    public void setMonth(String month) {
        this.month = month;
    }

    public String toString() {
        return "PageParams{page = " + page + ", pagesize = " + pagesize + ", categoryId = " + categoryId + ", TagId = " + TagId + ", year = " + year + ", month = " + month + "}";
    }
}
