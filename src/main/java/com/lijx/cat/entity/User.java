package com.lijx.cat.entity;


import com.lijx.cat.enums.Role;
import com.lijx.cat.enums.UserStatus;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name = "t_user")
public class User extends AuditingEntity {
  @javax.persistence.Id
  private String Id;

  private Long organizationId;

  @Column(nullable = false)
  private String email;
  @Column(nullable = false)
  private String password;

  private String name;

  @Column(nullable = false)
  @Enumerated(EnumType.STRING)
  private UserStatus status;

  private String collectCycle;

  @Enumerated(EnumType.STRING)
  private Role role;//角色

  private Boolean autoDivision;//是否自动分案

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Role getRole() {
    return role;
  }

  public void setRole(Role role) {
    this.role = role;
  }

  public Long getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(Long organizationId) {
    this.organizationId = organizationId;
  }

  public String getId() {
    return Id;
  }

  public void setId(String id) {
    Id = id;
  }

  @Override
  public String toString() {
    return "User{" +
        "organizationId=" + organizationId +
        ", email='" + email + '\'' +
        ", name='" + name + '\'' +
        ", status=" + status +
        ", collectCycle='" + collectCycle + '\'' +
        ", role=" + role +
        ", autoDivision=" + autoDivision +
        "} " + super.toString();
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UserStatus getStatus() {
    return status;
  }

  public void setStatus(UserStatus status) {
    this.status = status;
  }

  public String getCollectCycle() {
    return collectCycle;
  }

  public void setCollectCycle(String collectCycle) {
    this.collectCycle = collectCycle;
  }

  public Boolean getAutoDivision() {
    return autoDivision;
  }

  public void setAutoDivision(Boolean autoDivision) {
    this.autoDivision = autoDivision;
  }

}
