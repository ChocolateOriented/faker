package com.lijx.cat.entity;

import java.util.Date;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 * Created by jxli on 2018/9/22.
 */
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class AuditingEntity {
  @CreatedBy
  private String createBy;
  @CreatedDate
  private Date createTime;
  @LastModifiedBy
  private String updateBy;
  @LastModifiedDate
  private Date updateTime;

  public String getCreateBy() {
    return createBy;
  }

  public void setCreateBy(String createBy) {
    this.createBy = createBy;
  }

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  public String getUpdateBy() {
    return updateBy;
  }

  public void setUpdateBy(String updateBy) {
    this.updateBy = updateBy;
  }

  public Date getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(Date updateTime) {
    this.updateTime = updateTime;
  }

  @Override
  public String toString() {
    return "AuditingEntity{" +
        "createBy='" + createBy + '\'' +
        ", createTime=" + createTime +
        ", updateBy='" + updateBy + '\'' +
        ", updateTime=" + updateTime +
        '}';
  }
}
