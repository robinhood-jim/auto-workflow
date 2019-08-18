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
package com.robin.workflow.core.comm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonConst {
    public enum AuditType{
        //单人审批
        TYPE_SINGLE("0"),
        //多人审批,全部通过
        TYPE_MUTLIALL("1"),
        //多人审批,单人通过
        TYPE_MULTISINGLE("2");
        private String value;
        private AuditType(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(this.value);
        }

    }
    public enum NodeType{
        TYPE_START("0"),
        TYPE_END("1"),
        TYPE_APPLY("2"),
        TYPE_AUDIT("3"),
        TYPE_MUTEX("4"),//汇集
        TYPE_EXCLUSIVE("5");//互斥
        private String value;
        private NodeType(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(this.value);
        }
    }
    
    public enum AssigneeType{
        ASSIGNEE_TYPE_USER("0"),//用户
        ASSIGNEE_TYPE_GROUP("1"),//组
    	ASSIGNEE_TYPE_END("2"),//结束节点
    	ASSIGNEE_TYPE_MUTLIALL("3"),//多人会签展示
    	ASSIGNEE_TYPE_MUTLICOMPLETE("4"),//多人会签未完成
    	ASSIGNEE_TYPE_MUTLISINGLE("5");//多人会签一人审批
        private String value;
        private AssigneeType(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(this.value);
        }
    }
    public enum SSOLogin{
        REDIS_DB_LOGIN("2"),
        SESSION_USER("user");
        private String value;
        private SSOLogin(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(this.value);
        }
    }
    
    public enum DynamicForm{
        FORM_TYPE_STRING("1"),
        FORM_TYPE_INTEGR("2"),
        FORM_TYPE_DATE("3"),
        FORM_TYPE_CURRENCY("4");
        private String value;
        private DynamicForm(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(this.value);
        }
    }
    public enum TaskStatus{
        STATUS_WAIT("0"),
        STATUS_FINISH("1");
        private String value;
        private TaskStatus(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(this.value);
        }
    }
    
    /**
      * @ClassName: TaskStepStatus
      * @Description: t_process_step 表中的 status 记录  0- 提交申请   1-申请通过 2-申请驳回 3 撤回
      * @date 2017年5月11日 上午10:03:21
     */
    public enum ProcessStepStatus{
        APPLAY("0"), 
        PASS("1"),
    	TURN("2"),
    	DRAWBACK("3");
    	private String value;
       
        private ProcessStepStatus(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(this.value);
        }
        
    	public String getValue() {
    		return value;
    	}

    }
    
    /**
     * @ClassName: ProcessInsStatus
     * @Description: t_process_instance 0 审核中  1 已审批   2 驳回
     * @date 2017年5月11日 上午10:03:21
    */
   public enum ProcessInsStatus{
	   WAITFOR("0","审核中"),
//	   RUNNING("3","审核中"),
       PASS("1","已同意"),
   	   TURN("2","被驳回"),
	   DRAWBACK("3","已撤回");
       private final String value;
       private final String name;
       private  ProcessInsStatus(String value,String name) {
           this.value = value;
           this.name = name;
       }

       @Override
       public String toString() {
           return String.valueOf(this.value);
       }
       
       public final String getValue(){
    	   return value;
       }
       
       public final String getName(){
    	   return name;
       }
       
       public static final String getNameByValue(String value){
    	   if(ProcessInsStatus.WAITFOR.getValue().equals(value)){
    		   return ProcessInsStatus.WAITFOR.getName();
    	   }else if(ProcessInsStatus.PASS.getValue().equals(value)){
    		   return ProcessInsStatus.PASS.getName();
    	   }else if(ProcessInsStatus.TURN.getValue().equals(value)){
    		   return ProcessInsStatus.TURN.getName();
    	   }else if(ProcessInsStatus.DRAWBACK.getValue().equals(value)){
    		   return ProcessInsStatus.DRAWBACK.getName();
    	   }
    	   return null;
       }
   }
    
    
    public enum Stauts{
        STATUS_WORK("1","启用"),
        STATUS_UNWORK("0","停用");
    	
        private String value;
    	private String name;
        
    	private Stauts(String value,String name) {
            this.value=value;
            this.name=name;
        }

		public String getName() {
			return name;
		}


		public String getValue() {
			return value;
		}

    }
    
   public static final String RESP_FALSE = "false";
   
   public static final String RESP_TRUE = "true";
   
   public static final String SAVE = "save";
   
   public static final String UPDATE = "update";
   public static final String TYPE_VACATION="1";
   public static final String ACTIVITYID_APPLY="apply";
   
   /**
     * @ClassName: FlowType
     * @Description: 流程类型 1-固定流 2-自由流
     * @date 2017年5月19日 下午5:52:42
    */
   public enum FlowType{
       FIX("1"),
	   FREE("2");
	   private String value;
	   private FlowType(String value){
	      this.value = value;
	   }
	
	   public String getValue() {
		  return value;
	   }
   }
   
   /**
     * @ClassName: FlowCondition
     * @Description: 流程条件分支条件设置
     * @date 2017年5月22日 下午4:32:13
    */
   public enum FlowCondition{
	   	NUMBER("number"),
	   	SELECTFIELD("singleSelect"),
	   	MONEY("money");
	   
	    private String value;
	    
	    private FlowCondition(String value){
		      this.value = value;
		}
	    
	    public String getValue(){
	    	return value;
	    }
	   
		static Set<String> conditions = new HashSet<String>(Arrays.asList(
				NUMBER.getValue(), 
				SELECTFIELD.getValue(),
				MONEY.getValue())
		);
		
		
		public static boolean isBelong(String value){
			return conditions.contains(value);
		}
   }
   public enum CarbonCopyType{
       TYPE_START("1"),
       TYPE_END("2"),
       TYPE_STARTANDEND("3");
       private String value;
       private CarbonCopyType(String value){
           this.value = value;
       }

       public String getValue(){
           return value;
       }
       @Override
       public String toString() {
           return String.valueOf(this.value);
       }

   }
   public static final String VALID="1";
   public static final String INVALID="0";
   public static final String NOTAUTHORIZE="-1";
   
   
	
	/*
	 * 我发起的
	 */
	public  static final String ISTARTED = "1";
	/*
	 * 待我审批的
	 */
	public  static final String WAITMETODO  = "2";
	/*
	 * 抄送给我的
	 */
	public  static final String COPYTOME = "3";
	public static final int WEB_SESSION_CACHE_DB_ID=2;

    public final static String CACHE_ROLE_PREFIX_KEY = "role";
}
