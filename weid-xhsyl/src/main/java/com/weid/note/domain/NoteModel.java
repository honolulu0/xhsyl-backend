package com.weid.note.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.weid.common.annotation.Excel;
import com.weid.common.core.domain.BaseEntity;

/**
 * 笔记模板管理对象 note_model
 * 
 * @author weid
 * @date 2024-05-22
 */
public class NoteModel extends BaseEntity
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

    /** 笔记类型 */
    @Excel(name = "笔记类型")
    private String modelType;

    /** 标题 */
    @Excel(name = "标题")
    private String title;

    /** 内容 */
    @Excel(name = "内容")
    private String content;

    /** 媒体资源 */
    @Excel(name = "媒体资源")
    private String mediaResources;

    /** AT的人 */
    @Excel(name = "AT的人")
    private String ats;

    /** 话题标签 */
    @Excel(name = "话题标签")
    private String topics;

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
    public void setModelType(String modelType) 
    {
        this.modelType = modelType;
    }

    public String getModelType() 
    {
        return modelType;
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
    public void setMediaResources(String mediaResources) 
    {
        this.mediaResources = mediaResources;
    }

    public String getMediaResources() 
    {
        return mediaResources;
    }
    public void setAts(String ats) 
    {
        this.ats = ats;
    }

    public String getAts() 
    {
        return ats;
    }
    public void setTopics(String topics) 
    {
        this.topics = topics;
    }

    public String getTopics() 
    {
        return topics;
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
            .append("modelType", getModelType())
            .append("title", getTitle())
            .append("content", getContent())
            .append("mediaResources", getMediaResources())
            .append("ats", getAts())
            .append("topics", getTopics())
            .append("creatTime", getCreatTime())
            .append("lastUseTime", getLastUseTime())
            .toString();
    }
}
