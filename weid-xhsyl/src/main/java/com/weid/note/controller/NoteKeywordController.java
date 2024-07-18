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
import com.weid.note.domain.NoteKeyword;
import com.weid.note.service.INoteKeywordService;
import com.weid.common.utils.poi.ExcelUtil;
import com.weid.common.core.page.TableDataInfo;

/**
 * 关键词管理Controller
 * 
 * @author weid
 * @date 2024-05-21
 */
@RestController
@RequestMapping("/note/noteKeyword")
public class NoteKeywordController extends BaseController
{
    @Autowired
    private INoteKeywordService noteKeywordService;

    /**
     * 查询关键词管理列表
     */
    @PreAuthorize("@ss.hasPermi('note:noteKeyword:list')")
    @GetMapping("/list")
    public TableDataInfo list(NoteKeyword noteKeyword)
    {
        startPage();
        List<NoteKeyword> list = noteKeywordService.selectNoteKeywordList(noteKeyword);
        return getDataTable(list);
    }

    /**
     * 导出关键词管理列表
     */
    @PreAuthorize("@ss.hasPermi('note:noteKeyword:export')")
    @Log(title = "关键词管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, NoteKeyword noteKeyword)
    {
        List<NoteKeyword> list = noteKeywordService.selectNoteKeywordList(noteKeyword);
        ExcelUtil<NoteKeyword> util = new ExcelUtil<NoteKeyword>(NoteKeyword.class);
        util.exportExcel(response, list, "关键词管理数据");
    }

    /**
     * 获取关键词管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('note:noteKeyword:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(noteKeywordService.selectNoteKeywordById(id));
    }

    /**
     * 新增关键词管理
     */
    @PreAuthorize("@ss.hasPermi('note:noteKeyword:add')")
    @Log(title = "关键词管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody NoteKeyword noteKeyword)
    {
        return toAjax(noteKeywordService.insertNoteKeyword(noteKeyword));
    }

    /**
     * 修改关键词管理
     */
    @PreAuthorize("@ss.hasPermi('note:noteKeyword:edit')")
    @Log(title = "关键词管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody NoteKeyword noteKeyword)
    {
        return toAjax(noteKeywordService.updateNoteKeyword(noteKeyword));
    }

    /**
     * 删除关键词管理
     */
    @PreAuthorize("@ss.hasPermi('note:noteKeyword:remove')")
    @Log(title = "关键词管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(noteKeywordService.deleteNoteKeywordByIds(ids));
    }
}
