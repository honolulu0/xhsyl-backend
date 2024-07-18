package com.weid.note.service.impl;

import java.util.List;
import com.weid.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.weid.note.mapper.NoteCommentMapper;
import com.weid.note.domain.NoteComment;
import com.weid.note.service.INoteCommentService;

/**
 * 评论管理Service业务层处理
 * 
 * @author weid
 * @date 2024-07-18
 */
@Service
public class NoteCommentServiceImpl implements INoteCommentService 
{
    @Autowired
    private NoteCommentMapper noteCommentMapper;

    /**
     * 查询评论管理
     * 
     * @param id 评论管理主键
     * @return 评论管理
     */
    @Override
    public NoteComment selectNoteCommentById(Long id)
    {
        return noteCommentMapper.selectNoteCommentById(id);
    }

    /**
     * 查询评论管理列表
     * 
     * @param noteComment 评论管理
     * @return 评论管理
     */
    @Override
    public List<NoteComment> selectNoteCommentList(NoteComment noteComment)
    {
        return noteCommentMapper.selectNoteCommentList(noteComment);
    }

    /**
     * 新增评论管理
     * 
     * @param noteComment 评论管理
     * @return 结果
     */
    @Override
    public int insertNoteComment(NoteComment noteComment)
    {
        noteComment.setCreateTime(DateUtils.getNowDate());
        return noteCommentMapper.insertNoteComment(noteComment);
    }

    /**
     * 修改评论管理
     * 
     * @param noteComment 评论管理
     * @return 结果
     */
    @Override
    public int updateNoteComment(NoteComment noteComment)
    {
        return noteCommentMapper.updateNoteComment(noteComment);
    }

    /**
     * 批量删除评论管理
     * 
     * @param ids 需要删除的评论管理主键
     * @return 结果
     */
    @Override
    public int deleteNoteCommentByIds(Long[] ids)
    {
        return noteCommentMapper.deleteNoteCommentByIds(ids);
    }

    /**
     * 批量删除评论管理
     *
     * @param ids 需要删除的评论管理主键
     * @return 结果
     */
    @Override
    public int deleteNoteCommentByUserId(String userId)
    {
        return noteCommentMapper.deleteNoteCommentByUserId(userId);
    }

    /**
     * 删除评论管理信息
     * 
     * @param id 评论管理主键
     * @return 结果
     */
    @Override
    public int deleteNoteCommentById(Long id)
    {
        return noteCommentMapper.deleteNoteCommentById(id);
    }
}
