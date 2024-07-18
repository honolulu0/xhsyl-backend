package com.weid.note.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.weid.note.mapper.NoteKeywordMapper;
import com.weid.note.domain.NoteKeyword;
import com.weid.note.service.INoteKeywordService;

/**
 * 关键词管理Service业务层处理
 * 
 * @author weid
 * @date 2024-05-21
 */
@Service
public class NoteKeywordServiceImpl implements INoteKeywordService 
{
    @Autowired
    private NoteKeywordMapper noteKeywordMapper;

    /**
     * 查询关键词管理
     * 
     * @param id 关键词管理主键
     * @return 关键词管理
     */
    @Override
    public NoteKeyword selectNoteKeywordById(Long id)
    {
        return noteKeywordMapper.selectNoteKeywordById(id);
    }

    /**
     * 查询关键词管理列表
     * 
     * @param noteKeyword 关键词管理
     * @return 关键词管理
     */
    @Override
    public List<NoteKeyword> selectNoteKeywordList(NoteKeyword noteKeyword)
    {
        return noteKeywordMapper.selectNoteKeywordList(noteKeyword);
    }

    /**
     * 新增关键词管理
     * 
     * @param noteKeyword 关键词管理
     * @return 结果
     */
    @Override
    public int insertNoteKeyword(NoteKeyword noteKeyword)
    {
        return noteKeywordMapper.insertNoteKeyword(noteKeyword);
    }

    /**
     * 修改关键词管理
     * 
     * @param noteKeyword 关键词管理
     * @return 结果
     */
    @Override
    public int updateNoteKeyword(NoteKeyword noteKeyword)
    {
        return noteKeywordMapper.updateNoteKeyword(noteKeyword);
    }

    /**
     * 批量删除关键词管理
     * 
     * @param ids 需要删除的关键词管理主键
     * @return 结果
     */
    @Override
    public int deleteNoteKeywordByIds(Long[] ids)
    {
        return noteKeywordMapper.deleteNoteKeywordByIds(ids);
    }

    /**
     * 删除关键词管理信息
     * 
     * @param id 关键词管理主键
     * @return 结果
     */
    @Override
    public int deleteNoteKeywordById(Long id)
    {
        return noteKeywordMapper.deleteNoteKeywordById(id);
    }
}
