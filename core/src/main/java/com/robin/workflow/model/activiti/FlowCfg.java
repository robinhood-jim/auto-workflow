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
import java.sql.Timestamp;

@Table(name = "t_flow_cfg")
@Data
public class FlowCfg extends BaseObject {
    /**
	  * @Fields serialVersionUID : TODO
	  */
	
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 工作流名称
     */
    private String name;

    /**
     * activiti 流程key
     */
    private String code;

    @Column(name = "flow_pic")
    private String flowPic;
    
    /**
     * 分组id
     */
    @Column(name = "flowgroup_id")
    private Long flowGroupId;

    private String description;

    /**
     * 排序
     */
    @Column(name = "seq_no")
    private Integer seqNo;

    /**
     * 1-固定流 2-自由流
     */
    private String type;

    private String version;

    @Column(name = "deployment_id")
    private Long deploymentId;

    /**
     * 0-草稿 1-发布
     */
    private String status;

    /**
     * 租户id
     */
    @Column(name = "corp_id")
    private Long corpId;

    private Long creator;

    
    @Column(name = "create_time")
    private Timestamp createTime;

    
    private Long modifier;

    
    @Column(name = "modify_time")
    private Timestamp modifyTime;

    /**
     * 流程配置json
     */
    @Column(name = "input_json")
    private String inputJson;

    /**
     * 表单json
     */
    @Column(name = "form_json")
    private String formJson;

    /**
     * bpmn定义
     */
    @Column(name = "bpmn_xml")
    private String bpmnXml;
    
    /**
     * 最终审批人
     */
    @Column(name = "last_auditor")
    private Long lastAuditor;
}