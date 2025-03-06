package warren.myblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import warren.myblog.common.Result;
import warren.myblog.service.TagService;

/*
 * author: Warren
 */
@RestController
@RequestMapping("/tags")
public class TagController {
    @Autowired
    private TagService tagService;

    /**
     * 获取最热标签,前六条
     *
     * @return
     */
    @GetMapping("/hot")
    public Result getHots() {
        int tagNumber = 6;
        return tagService.getHotTags(tagNumber);
    }

    /**
     * 查询所有标签
     * @return
     */
    @GetMapping
    public Result findAll() {
        return tagService.findAll();
    }

    /**
     * 导航-查询所有标签的详细信息
     * @return
     */
    @GetMapping("/detail")
    public Result findAllDetails() {
        return tagService.findAllDetails();
    }

    /**
     * 实现点击标签可以查询到所有的文章
     * @param id
     * @return
     */
    @GetMapping("/detail/{id}")
    public Result findAllDetailsById(@PathVariable("id")Long id) {
        return tagService.  findAllDetailsById(id);
    }
}
