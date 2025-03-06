package warren.myblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import warren.myblog.common.Result;
import warren.myblog.service.CommentsService;
import warren.myblog.vo.Params.CommentParam;

/*
 * author: Warren
 */
@RestController
@RequestMapping("/comments")
public class CommentsController {

    @Autowired
    private CommentsService commentsService;

    /**
     * 根据文章id查询评论列表
     * @param id
     * @return
     */
    @GetMapping("/article/{id}")
    public Result comments(@PathVariable("id") Long id){
        return commentsService.CommentsByArticlId(id);
    }

    /**
     * 评论功能
     * @param commentParam
     * @return
     */
    @PostMapping("/create/change")
    public Result comment(@RequestBody CommentParam commentParam){
        return commentsService.comment(commentParam);
    }
}
