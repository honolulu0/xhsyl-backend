package com.weid.note.mapper;

import java.util.List;
import com.weid.note.domain.NoteComment;

/**
 * 评论管理Mapper接口
 * 
 * @author weid
 * @date 2024-07-18
 */
public interface NoteCommentMapper 
{
    /**
     * 查询评论管理
     * 
     * @param id 评论管理主键
     * @return 评论管理
     */
    public NoteComment selectNoteCommentById(Long id);

    /**
     * 查询评论管理列表
     * 
     * @param noteComment 评论管理
     * @return 评论管理集合
     */
    public List<NoteComment> selectNoteCommentList(NoteComment noteComment);

    /**
     * 新增评论管理
     * 
     * @param noteComment 评论管理
     * @return 结果
     */
    public int insertNoteComment(NoteComment noteComment);

    /**
     * 修改评论管理
     * 
     * @param noteComment 评论管理
     * @return 结果
     */
    public int updateNoteComment(NoteComment noteComment);

    /**
     * 删除评论管理
     * 
     * @param id 评论管理主键
     * @return 结果
     */
    public int deleteNoteCommentById(Long id);

    /**
     * 批量删除评论管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteNoteCommentByIds(Long[] ids);

    /**
     * 批量删除评论管理
     *
     * @param userId 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteNoteCommentByUserId(String userId);
}
