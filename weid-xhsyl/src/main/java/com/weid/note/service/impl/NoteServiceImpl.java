package com.weid.note.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.weid.note.mapper.NoteMapper;
import com.weid.note.domain.Note;
import com.weid.note.service.INoteService;

/**
 * 笔记管理Service业务层处理
 * 
 * @author weid
 * @date 2024-05-21
 */
@Service
public class NoteServiceImpl implements INoteService 
{
    @Autowired
    private NoteMapper noteMapper;

    /**
     * 查询笔记管理
     * 
     * @param id 笔记管理主键
     * @return 笔记管理
     */
    @Override
    public Note selectNoteById(Long id)
    {
        return noteMapper.selectNoteById(id);
    }

    /**
     * 查询笔记管理列表
     * 
     * @param note 笔记管理
     * @return 笔记管理
     */
    @Override
    public List<Note> selectNoteList(Note note)
    {
        return noteMapper.selectNoteList(note);
    }

    /**
     * 新增笔记管理
     * 
     * @param note 笔记管理
     * @return 结果
     */
    @Override
    public int insertNote(Note note)
    {
        return noteMapper.insertNote(note);
    }

    /**
     * 修改笔记管理
     * 
     * @param note 笔记管理
     * @return 结果
     */
    @Override
    public int updateNote(Note note)
    {
        return noteMapper.updateNote(note);
    }

    /**
     * 批量删除笔记管理
     * 
     * @param ids 需要删除的笔记管理主键
     * @return 结果
     */
    @Override
    public int deleteNoteByIds(Long[] ids)
    {
        return noteMapper.deleteNoteByIds(ids);
    }

    /**
     * 删除笔记管理信息
     * 
     * @param id 笔记管理主键
     * @return 结果
     */
    @Override
    public int deleteNoteById(Long id)
    {
        return noteMapper.deleteNoteById(id);
    }
}
