package com.weid.note.mapper;

import java.util.List;
import com.weid.note.domain.NoteKeyword;

/**
 * 关键词管理Mapper接口
 * 
 * @author weid
 * @date 2024-05-21
 */
public interface NoteKeywordMapper 
{
    /**
     * 查询关键词管理
     * 
     * @param id 关键词管理主键
     * @return 关键词管理
     */
    public NoteKeyword selectNoteKeywordById(Long id);

    /**
     * 查询关键词管理列表
     * 
     * @param noteKeyword 关键词管理
     * @return 关键词管理集合
     */
    public List<NoteKeyword> selectNoteKeywordList(NoteKeyword noteKeyword);

    /**
     * 新增关键词管理
     * 
     * @param noteKeyword 关键词管理
     * @return 结果
     */
    public int insertNoteKeyword(NoteKeyword noteKeyword);

    /**
     * 修改关键词管理
     * 
     * @param noteKeyword 关键词管理
     * @return 结果
     */
    public int updateNoteKeyword(NoteKeyword noteKeyword);

    /**
     * 删除关键词管理
     * 
     * @param id 关键词管理主键
     * @return 结果
     */
    public int deleteNoteKeywordById(Long id);

    /**
     * 批量删除关键词管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteNoteKeywordByIds(Long[] ids);
}
