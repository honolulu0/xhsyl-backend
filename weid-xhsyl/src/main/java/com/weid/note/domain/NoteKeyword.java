package com.weid.note.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.weid.common.annotation.Excel;
import com.weid.common.core.domain.BaseEntity;

/**
 * 关键词管理对象 note_keyword
 * 
 * @author weid
 * @date 2024-05-21
 */
public class NoteKeyword extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 关键词 */
    @Excel(name = "关键词")
    private String keyword;

    /** 采集页数 */
    @Excel(name = "采集页数")
    private Long allPage;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date creatTime;

    /** 上次使用 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "上次使用", width = 30, dateFormat = "yyyy-MM-dd")
    private Date lastUseTime;

    /** 标签 */
    @Excel(name = "标签")
    private String tag;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setKeyword(String keyword) 
    {
        this.keyword = keyword;
    }

    public String getKeyword() 
    {
        return keyword;
    }
    public void setAllPage(Long allPage) 
    {
        this.allPage = allPage;
    }

    public Long getAllPage() 
    {
        return allPage;
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
    public void setTag(String tag) 
    {
        this.tag = tag;
    }

    public String getTag() 
    {
        return tag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("keyword", getKeyword())
            .append("allPage", getAllPage())
            .append("creatTime", getCreatTime())
            .append("lastUseTime", getLastUseTime())
            .append("tag", getTag())
            .toString();
    }
}
