package com.weid.note.mapper;

import java.util.List;
import com.weid.note.domain.NoteModel;

/**
 * 笔记模板管理Mapper接口
 * 
 * @author weid
 * @date 2024-05-22
 */
public interface NoteModelMapper 
{
    /**
     * 查询笔记模板管理
     * 
     * @param id 笔记模板管理主键
     * @return 笔记模板管理
     */
    public NoteModel selectNoteModelById(Long id);

    /**
     * 查询笔记模板管理列表
     * 
     * @param noteModel 笔记模板管理
     * @return 笔记模板管理集合
     */
    public List<NoteModel> selectNoteModelList(NoteModel noteModel);

    /**
     * 新增笔记模板管理
     * 
     * @param noteModel 笔记模板管理
     * @return 结果
     */
    public int insertNoteModel(NoteModel noteModel);

    /**
     * 修改笔记模板管理
     * 
     * @param noteModel 笔记模板管理
     * @return 结果
     */
    public int updateNoteModel(NoteModel noteModel);

    /**
     * 删除笔记模板管理
     * 
     * @param id 笔记模板管理主键
     * @return 结果
     */
    public int deleteNoteModelById(Long id);

    /**
     * 批量删除笔记模板管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteNoteModelByIds(Long[] ids);
}
