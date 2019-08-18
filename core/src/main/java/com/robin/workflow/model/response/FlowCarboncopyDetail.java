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

import javax.persistence.*;
import java.util.Date;
@Data
@Table(name = "t_flow_carboncopy_detail")
public class FlowCarboncopyDetail extends BaseObject {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 流程实例id
     */
    @Column(name = "instance_id")
    private Long instanceId;

    /**
     * 抄送人
     */
    @Column(name = "send_user")
    private Long sendUser;

    /**
     * 抄送内容
     */
    private String detail;

    @Column(name = "create_time")
    private Date createTime;

    private Long creator;
    
    /**
     * 企业id
     */
    private Long corpId;
}