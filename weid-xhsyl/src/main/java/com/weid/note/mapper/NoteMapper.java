package com.weid.note.mapper;

import java.util.List;
import com.weid.note.domain.Note;

/**
 * 笔记管理Mapper接口
 * 
 * @author weid
 * @date 2024-05-21
 */
public interface NoteMapper 
{
    /**
     * 查询笔记管理
     * 
     * @param id 笔记管理主键
     * @return 笔记管理
     */
    public Note selectNoteById(Long id);

    /**
     * 查询笔记管理列表
     * 
     * @param note 笔记管理
     * @return 笔记管理集合
     */
    public List<Note> selectNoteList(Note note);

    /**
     * 新增笔记管理
     * 
     * @param note 笔记管理
     * @return 结果
     */
    public int insertNote(Note note);

    /**
     * 修改笔记管理
     * 
     * @param note 笔记管理
     * @return 结果
     */
    public int updateNote(Note note);

    /**
     * 删除笔记管理
     * 
     * @param id 笔记管理主键
     * @return 结果
     */
    public int deleteNoteById(Long id);

    /**
     * 批量删除笔记管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteNoteByIds(Long[] ids);
}
