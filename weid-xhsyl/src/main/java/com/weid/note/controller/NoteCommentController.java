package com.weid.note.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.weid.common.annotation.Log;
import com.weid.common.core.controller.BaseController;
import com.weid.common.core.domain.AjaxResult;
import com.weid.common.enums.BusinessType;
import com.weid.note.domain.NoteComment;
import com.weid.note.service.INoteCommentService;
import com.weid.common.utils.poi.ExcelUtil;
import com.weid.common.core.page.TableDataInfo;

/**
 * 评论管理Controller
 * 
 * @author weid
 * @date 2024-07-18
 */
@RestController
@RequestMapping("/note/note_comment")
public class NoteCommentController extends BaseController
{
    @Autowired
    private INoteCommentService noteCommentService;

    /**
     * 查询评论管理列表
     */
    @PreAuthorize("@ss.hasPermi('note:note_comment:list')")
    @GetMapping("/list")
    public TableDataInfo list(NoteComment noteComment)
    {
        startPage();
        List<NoteComment> list = noteCommentService.selectNoteCommentList(noteComment);
        return getDataTable(list);
    }

    /**
     * 导出评论管理列表
     */
    @PreAuthorize("@ss.hasPermi('note:note_comment:export')")
    @Log(title = "评论管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, NoteComment noteComment)
    {
        List<NoteComment> list = noteCommentService.selectNoteCommentList(noteComment);
        ExcelUtil<NoteComment> util = new ExcelUtil<NoteComment>(NoteComment.class);
        util.exportExcel(response, list, "评论管理数据");
    }

    /**
     * 获取评论管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('note:note_comment:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(noteCommentService.selectNoteCommentById(id));
    }

    /**
     * 新增评论管理
     */
    @PreAuthorize("@ss.hasPermi('note:note_comment:add')")
    @Log(title = "评论管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody NoteComment noteComment)
    {
        return toAjax(noteCommentService.insertNoteComment(noteComment));
    }

    /**
     * 修改评论管理
     */
    @PreAuthorize("@ss.hasPermi('note:note_comment:edit')")
    @Log(title = "评论管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody NoteComment noteComment)
    {
        return toAjax(noteCommentService.updateNoteComment(noteComment));
    }

    /**
     * 删除评论管理
     */
    @PreAuthorize("@ss.hasPermi('note:note_comment:remove')")
    @Log(title = "评论管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(noteCommentService.deleteNoteCommentByIds(ids));
    }

    /**
     * 删除指定用户所有评论
     */
    @PreAuthorize("@ss.hasPermi('note:note_comment:remove')")
    @Log(title = "评论管理", businessType = BusinessType.DELETE)
	@DeleteMapping("userId/{userId}")
    public AjaxResult removeByUserId(@PathVariable String userId)
    {
        return toAjax(noteCommentService.deleteNoteCommentByUserId(userId));
    }
}
