/*
 * Copyright (c) 2019,robinjim(robinjim@126.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.robin.workflow.model.activiti;

import com.robin.core.base.model.BaseObject;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Table(name = "t_process_step")
public class ProcessStep extends BaseObject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 流程id
     */
    @Column(name = "flow_id")
    private Long flowId;

    /**
     * 流程实例id
     */
    @Column(name = "proc_inst_id")
    private Long procInstId;

    /**
     * 租户id
     */
    @Column(name = "corp_id")
    private Long corpId;

    /**
     * 步骤id
     */
    @Column(name = "step_id")
    private Long stepId;

    /**
     * 任务id
     */
    @Column(name = "task_id")
    private Long taskId;

    /**
     * 0- 提交申请   1-申请通过 2-申请驳回
     */
    private String status;

    /**
     * 参与者id
     */
    private Long assignee;
    
    /**
     * 员工名称
     */
    private String assigneeName;

    /**
     * 职位组
     */
    @Column(name = "candidate_group")
    private String candidateGroup;

    private Long creator;

    @Column(name = "create_time")
    private Date createTime;

    private Long modifier;

    @Column(name = "modify_time")
    private Date modifyTime;
    /**
     * form表单值
     */
    private String content;
}