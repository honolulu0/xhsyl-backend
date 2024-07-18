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
import com.weid.note.domain.Note;
import com.weid.note.service.INoteService;
import com.weid.common.utils.poi.ExcelUtil;
import com.weid.common.core.page.TableDataInfo;

/**
 * 笔记管理Controller
 * 
 * @author weid
 * @date 2024-05-21
 */
@RestController
@RequestMapping("/note/noteData")
public class NoteController extends BaseController
{
    @Autowired
    private INoteService noteService;

    /**
     * 查询笔记管理列表
     */
    @PreAuthorize("@ss.hasPermi('note:noteData:list')")
    @GetMapping("/list")
    public TableDataInfo list(Note note)
    {
        startPage();
        List<Note> list = noteService.selectNoteList(note);
        return getDataTable(list);
    }

    /**
     * 导出笔记管理列表
     */
    @PreAuthorize("@ss.hasPermi('note:noteData:export')")
    @Log(title = "笔记管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Note note)
    {
        List<Note> list = noteService.selectNoteList(note);
        ExcelUtil<Note> util = new ExcelUtil<Note>(Note.class);
        util.exportExcel(response, list, "笔记管理数据");
    }

    /**
     * 获取笔记管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('note:noteData:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(noteService.selectNoteById(id));
    }

    /**
     * 新增笔记管理
     */
    @PreAuthorize("@ss.hasPermi('note:noteData:add')")
    @Log(title = "笔记管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Note note)
    {
        return toAjax(noteService.insertNote(note));
    }

    /**
     * 修改笔记管理
     */
    @PreAuthorize("@ss.hasPermi('note:noteData:edit')")
    @Log(title = "笔记管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Note note)
    {
        return toAjax(noteService.updateNote(note));
    }

    /**
     * 删除笔记管理
     */
    @PreAuthorize("@ss.hasPermi('note:noteData:remove')")
    @Log(title = "笔记管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(noteService.deleteNoteByIds(ids));
    }
}
