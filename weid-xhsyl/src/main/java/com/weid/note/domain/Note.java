package com.weid.note.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.weid.common.annotation.Excel;
import com.weid.common.core.domain.BaseEntity;

/**
 * 笔记管理对象 note
 * 
 * @author weid
 * @date 2024-07-18
 */
public class Note extends BaseEntity
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

    /** 发布时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "发布时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date releaseTime;

    /** 内容 */
    @Excel(name = "内容")
    private String content;

    /** 喜欢 */
    @Excel(name = "喜欢")
    private String likedCount;

    /** 作者ID */
    @Excel(name = "作者ID")
    private String authorId;

    /** 作者昵称 */
    @Excel(name = "作者昵称")
    private String author;

    /** 笔记类型 */
    @Excel(name = "笔记类型")
    private String modelType;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date creatTime;

    /** 上次使用时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "上次使用时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date lastUseTime;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setKeywordId(Long keywordId) 
    {
        this.keywordId = keywordId;
    }

    public Long getKeywordId() 
    {
        return keywordId;
    }
    public void setKeyword(String keyword) 
    {
        this.keyword = keyword;
    }

    public String getKeyword() 
    {
        return keyword;
    }
    public void setNoteId(String noteId) 
    {
        this.noteId = noteId;
    }

    public String getNoteId() 
    {
        return noteId;
    }
    public void setReleaseTime(Date releaseTime) 
    {
        this.releaseTime = releaseTime;
    }

    public Date getReleaseTime() 
    {
        return releaseTime;
    }
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }
    public void setLikedCount(String likedCount) 
    {
        this.likedCount = likedCount;
    }

    public String getLikedCount() 
    {
        return likedCount;
    }
    public void setAuthorId(String authorId) 
    {
        this.authorId = authorId;
    }

    public String getAuthorId() 
    {
        return authorId;
    }
    public void setAuthor(String author) 
    {
        this.author = author;
    }

    public String getAuthor() 
    {
        return author;
    }
    public void setModelType(String modelType) 
    {
        this.modelType = modelType;
    }

    public String getModelType() 
    {
        return modelType;
    }
    public void setCreatTime(Date creatTime) 
    {
        this.creatTime = creatTime;
    }

    public Date getCreatTime() 
    {
        return creatTime;
    }
    public void setLastUseTime(Date lastUseTime) 
    {
        this.lastUseTime = lastUseTime;
    }

    public Date getLastUseTime() 
    {
        return lastUseTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("keywordId", getKeywordId())
            .append("keyword", getKeyword())
            .append("noteId", getNoteId())
            .append("releaseTime", getReleaseTime())
            .append("title", getTitle())
            .append("content", getContent())
            .append("likedCount", getLikedCount())
            .append("authorId", getAuthorId())
            .append("author", getAuthor())
            .append("modelType", getModelType())
            .append("creatTime", getCreatTime())
            .append("lastUseTime", getLastUseTime())
            .toString();
    }
}
