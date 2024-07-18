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
import com.weid.note.domain.NoteModel;
import com.weid.note.service.INoteModelService;
import com.weid.common.utils.poi.ExcelUtil;
import com.weid.common.core.page.TableDataInfo;

/**
 * 笔记模板管理Controller
 * 
 * @author weid
 * @date 2024-05-22
 */
@RestController
@RequestMapping("/note/note_model")
public class NoteModelController extends BaseController
{
    @Autowired
    private INoteModelService noteModelService;

    /**
     * 查询笔记模板管理列表
     */
    @PreAuthorize("@ss.hasPermi('note:note_model:list')")
    @GetMapping("/list")
    public TableDataInfo list(NoteModel noteModel)
    {
        startPage();
        List<NoteModel> list = noteModelService.selectNoteModelList(noteModel);
        return getDataTable(list);
    }

    /**
     * 导出笔记模板管理列表
     */
    @PreAuthorize("@ss.hasPermi('note:note_model:export')")
    @Log(title = "笔记模板管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, NoteModel noteModel)
    {
        List<NoteModel> list = noteModelService.selectNoteModelList(noteModel);
        ExcelUtil<NoteModel> util = new ExcelUtil<NoteModel>(NoteModel.class);
        util.exportExcel(response, list, "笔记模板管理数据");
    }

    /**
     * 获取笔记模板管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('note:note_model:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(noteModelService.selectNoteModelById(id));
    }

    /**
     * 新增笔记模板管理
     */
    @PreAuthorize("@ss.hasPermi('note:note_model:add')")
    @Log(title = "笔记模板管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody NoteModel noteModel)
    {
        return toAjax(noteModelService.insertNoteModel(noteModel));
    }

    /**
     * 修改笔记模板管理
     */
    @PreAuthorize("@ss.hasPermi('note:note_model:edit')")
    @Log(title = "笔记模板管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody NoteModel noteModel)
    {
        return toAjax(noteModelService.updateNoteModel(noteModel));
    }

    /**
     * 删除笔记模板管理
     */
    @PreAuthorize("@ss.hasPermi('note:note_model:remove')")
    @Log(title = "笔记模板管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(noteModelService.deleteNoteModelByIds(ids));
    }
}
