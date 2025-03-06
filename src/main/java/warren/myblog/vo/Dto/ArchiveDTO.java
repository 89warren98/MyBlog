package warren.myblog.vo.Dto;

/**
 * 归档dto
 */
public class ArchiveDTO {
    private Integer year;
    private Integer month;
    private Integer count;

    public ArchiveDTO() {
    }

    public ArchiveDTO(Integer year, Integer month, Integer count) {
        this.year = year;
        this.month = month;
        this.count = count;
    }

    /**
     * 获取
     * @return year
     */
    public Integer getYear() {
        return year;
    }

    /**
     * 设置
     * @param year
     */
    public void setYear(Integer year) {
        this.year = year;
    }

    /**
     * 获取
     * @return month
     */
    public Integer getMonth() {
        return month;
    }

    /**
     * 设置
     * @param month
     */
    public void setMonth(Integer month) {
        this.month = month;
    }

    /**
     * 获取
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    /**
     * 设置
     * @param count
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    public String toString() {
        return "ArchiveDTO{year = " + year + ", month = " + month + ", count = " + count + "}";
    }

}
