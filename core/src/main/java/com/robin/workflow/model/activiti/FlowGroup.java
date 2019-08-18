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

@Table(name = "t_flow_group")
@Data
public class FlowGroup extends BaseObject {
    /**
	  * @Fields serialVersionUID : TODO
	  */
	
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 分组名称
     */
    @Column(name = "group_name")
    private String groupName;

    /**
     * 备注
     */
    private String description;

    /**
     * 商户id
     */
    @Column(name = "corp_id")
    private Long corpId;

    private Long creator;

    @Column(name = "create_time")
    private Date createTime;

    private Long modifier;

    @Column(name = "modify_time")
    private Date modifyTime;

}