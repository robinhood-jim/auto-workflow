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
package com.robin.workflow.model.response;

import com.robin.core.base.model.BaseObject;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
/**
  * @ClassName: FlowCarboncopy
 */
@Table(name = "t_flow_carboncopy")
@Data
public class FlowCarboncopy extends BaseObject {
	private static final long serialVersionUID = 1L;

	@Id
    private Long id;

    /**
     * 流程id
     */
    @Column(name = "flow_id")
    private Long flowId;

    /**
     * 抄送人, 以,分割
     */
    private String sender;
    
    /**
     * 抄送人名字（对应抄送人id顺序）
     */
    @Column(name = "senders_name")
    private String sendersName;

    /**
     * 1-启动发 2-结束发 3-启动结束都发
     */
    private Short event;

    /**
     * 创建人
     */
    private Long creator;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 企业id
     */
    @Column(name = "corp_id")
    private Long corpId;

    private Long modifier;

    @Column(name = "modify_time")
    private Date modifyTime;
}