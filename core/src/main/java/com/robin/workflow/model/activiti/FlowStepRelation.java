package com.robin.workflow.model.activiti;

import com.robin.core.base.model.BaseObject;

import javax.persistence.*;

/**
 * <p>Project:  zhcx_flow</p>
 * <p>
 * <p>Description:com.zhcx.flow.model.oa</p>
 * <p>
 * <p>Copyright: Copyright (c) 2017 create at 2017年04月17日</p>
 * <p>
 * <p>Company: zhcx_DEV</p>
 *
 * @author robinjim
 * @version 1.0
 */
@Entity
@Table(name = "t_flow_step_relation")
public class FlowStepRelation extends BaseObject {
   @Id
   @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(name = "flow_id")
    private Long flowId;
    @Column(name = "p_step_id")
    private Long pstepId;
    @Column(name = "step_id")
    private Long stepId;
    @Column(name = "trigger_condition")
    private String triggerCondition;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFlowId() {
        return flowId;
    }

    public void setFlowId(Long flowId) {
        this.flowId = flowId;
    }

    public Long getPstepId() {
        return pstepId;
    }

    public void setPstepId(Long pstepId) {
        this.pstepId = pstepId;
    }

    public Long getStepId() {
        return stepId;
    }

    public void setStepId(Long stepId) {
        this.stepId = stepId;
    }

    public String getTriggerCondition() {
        return triggerCondition;
    }

    public void setTriggerCondition(String triggerCondition) {
        this.triggerCondition = triggerCondition;
    }
}
