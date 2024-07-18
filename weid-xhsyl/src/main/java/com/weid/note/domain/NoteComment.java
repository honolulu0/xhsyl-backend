package com.weid.note.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.weid.common.annotation.Excel;
import com.weid.common.core.domain.BaseEntity;

/**
 * 评论管理对象 note_comment
 * 
 * @author weid
 * @date 2024-07-18
 */
public class NoteComment extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;


    /** 关键词ID */
    @Excel(name = "关键词ID")
    private Long keywordId;

    /** 关键词 */
    @Excel(name = "关键词")
    private String keyword;

    /** 笔记ID */
    @Excel(name = "笔记ID")
    private String noteId;

    /** 标题 */
    @Excel(name = "标题")
    private String title;


    /** 评论ID */
    @Excel(name = "评论ID")
    private String commentId;

    /** 评论内容 */
    @Excel(name = "评论内容")
    private String comment;

    /** 喜欢 */
    @Excel(name = "喜欢")
    private String likeCount;

    /** 子评论数量 */
    @Excel(name = "子评论数量")
    private String subCommentCount;

    /** 位置 */
    @Excel(name = "位置")
    private String ipLocation;

    /** 用户ID */
    @Excel(name = "用户ID")
    private String userId;

    /** 用户昵称 */
    @Excel(name = "用户昵称")
    private String nickname;

    /** 头像 */
    @Excel(name = "头像")
    private String image;

    /** 被评论的ID */
    @Excel(name = "被评论的ID")
    private String targetCommentId;

    /** 上次使用时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "上次使用时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date lastUseTime;

    /** 审核状态 */
    @Excel(name = "审核状态")
    private String reviewStatus;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setNoteId(String noteId) 
    {
        this.noteId = noteId;
    }

    public String getNoteId() 
    {
        return noteId;
    }
    public void setCommentId(String commentId) 
    {
        this.commentId = commentId;
    }

    public String getCommentId() 
    {
        return commentId;
    }
    public void setComment(String comment) 
    {
        this.comment = comment;
    }

    public String getComment() 
    {
        return comment;
    }
    public void setLikeCount(String likeCount) 
    {
        this.likeCount = likeCount;
    }

    public String getLikeCount() 
    {
        return likeCount;
    }
    public void setSubCommentCount(String subCommentCount) 
    {
        this.subCommentCount = subCommentCount;
    }

    public String getSubCommentCount() 
    {
        return subCommentCount;
    }
    public void setIpLocation(String ipLocation) 
    {
        this.ipLocation = ipLocation;
    }

    public String getIpLocation() 
    {
        return ipLocation;
    }
    public void setUserId(String userId) 
    {
        this.userId = userId;
    }

    public String getUserId() 
    {
        return userId;
    }
    public void setNickname(String nickname) 
    {
        this.nickname = nickname;
    }

    public String getNickname() 
    {
        return nickname;
    }
    public void setImage(String image) 
    {
        this.image = image;
    }

    public String getImage() 
    {
        return image;
    }
    public void setTargetCommentId(String targetCommentId) 
    {
        this.targetCommentId = targetCommentId;
    }

    public String getTargetCommentId() 
    {
        return targetCommentId;
    }
    public void setLastUseTime(Date lastUseTime) 
    {
        this.lastUseTime = lastUseTime;
    }

    public Date getLastUseTime() 
    {
        return lastUseTime;
    }
    public void setReviewStatus(String reviewStatus) 
    {
        this.reviewStatus = reviewStatus;
    }

    public String getReviewStatus() 
    {
        return reviewStatus;
    }


    public Long getKeywordId() {
        return keywordId;
    }

    public void setKeywordId(Long keywordId) {
        this.keywordId = keywordId;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("keywordId", keywordId)
                .append("keyword", keyword)
                .append("noteId", noteId)
                .append("title", title)
                .append("commentId", commentId)
                .append("comment", comment)
                .append("likeCount", likeCount)
                .append("subCommentCount", subCommentCount)
                .append("ipLocation", ipLocation)
                .append("userId", userId)
                .append("nickname", nickname)
                .append("image", image)
                .append("targetCommentId", targetCommentId)
                .append("lastUseTime", lastUseTime)
                .append("reviewStatus", reviewStatus)
                .toString();
    }
}
