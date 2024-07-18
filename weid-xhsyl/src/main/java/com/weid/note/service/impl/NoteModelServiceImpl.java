package com.weid.note.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.weid.note.mapper.NoteModelMapper;
import com.weid.note.domain.NoteModel;
import com.weid.note.service.INoteModelService;

/**
 * 笔记模板管理Service业务层处理
 * 
 * @author weid
 * @date 2024-05-22
 */
@Service
public class NoteModelServiceImpl implements INoteModelService 
{
    @Autowired
    private NoteModelMapper noteModelMapper;

    /**
     * 查询笔记模板管理
     * 
     * @param id 笔记模板管理主键
     * @return 笔记模板管理
     */
    @Override
    public NoteModel selectNoteModelById(Long id)
    {
        return noteModelMapper.selectNoteModelById(id);
    }

    /**
     * 查询笔记模板管理列表
     * 
     * @param noteModel 笔记模板管理
     * @return 笔记模板管理
     */
    @Override
    public List<NoteModel> selectNoteModelList(NoteModel noteModel)
    {
        return noteModelMapper.selectNoteModelList(noteModel);
    }

    /**
     * 新增笔记模板管理
     * 
     * @param noteModel 笔记模板管理
     * @return 结果
     */
    @Override
    public int insertNoteModel(NoteModel noteModel)
    {
        return noteModelMapper.insertNoteModel(noteModel);
    }

    /**
     * 修改笔记模板管理
     * 
     * @param noteModel 笔记模板管理
     * @return 结果
     */
    @Override
    public int updateNoteModel(NoteModel noteModel)
    {
        return noteModelMapper.updateNoteModel(noteModel);
    }

    /**
     * 批量删除笔记模板管理
     * 
     * @param ids 需要删除的笔记模板管理主键
     * @return 结果
     */
    @Override
    public int deleteNoteModelByIds(Long[] ids)
    {
        return noteModelMapper.deleteNoteModelByIds(ids);
    }

    /**
     * 删除笔记模板管理信息
     * 
     * @param id 笔记模板管理主键
     * @return 结果
     */
    @Override
    public int deleteNoteModelById(Long id)
    {
        return noteModelMapper.deleteNoteModelById(id);
    }
}
