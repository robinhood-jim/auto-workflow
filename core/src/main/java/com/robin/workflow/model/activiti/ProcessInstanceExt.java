package com.robin.workflow.model.activiti;

import com.robin.core.base.model.BaseObject;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Table(name = "t_process_instance")
@Data
public class ProcessInstanceExt extends BaseObject {
    /**
	  * @Fields serialVersionUID : TODO
	  */
	
	private static final long serialVersionUID = 1L;

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
     * 1-运行 2-完成
     */
    private String status;

    /**
     * 创建人
     */
    private Long creator;
    
    private String creatorName;

    @Column(name = "create_time")
    private Date createTime;

    private Long modifier;

    @Column(name = "modify_time")
    private Date modifyTime;
}