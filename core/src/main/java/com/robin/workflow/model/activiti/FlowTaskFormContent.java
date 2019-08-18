package com.robin.workflow.model.activiti;

import com.robin.core.base.model.BaseObject;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * <p>Project:  zhcx_flow</p>
 * <p>
 * <p>Description:com.zhcx.flow.model.activiti</p>
 * <p>
 * <p>Copyright: Copyright (c) 2017 create at 2017年05月02日</p>
 * <p>
 * <p>Company: zhcx_DEV</p>
 *
 * @author robinjim
 * @version 1.0
 */
@Entity
@Table(name = "t_flow_taskformcontent")
public class FlowTaskFormContent extends BaseObject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "proc_inst_id")
    private Long processInstId;
    @Column(name = "task_id")
    private Long taskId;
    @Column
    private String content;
    @Column(name = "tenant_id")
    private String tenantId;
    @Column(name = "dept_id")
    private String deptId;
    @Column(name = "create_time")
    private Timestamp createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProcessInstId() {
        return processInstId;
    }

    public void setProcessInstId(Long processInstId) {
        this.processInstId = processInstId;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }
}
