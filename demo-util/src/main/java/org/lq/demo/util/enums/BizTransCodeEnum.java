/**
 * 
 *汇付天下有限公司
 * Copyright (c) 2006-2018 ChinaPnR,Inc.All Rights Reserved.
 */
package org.lq.demo.util.enums;

/**
 * 交易码组成
 * 2位系统号+2位流程或模块+4位异常码
 * 系统号：01:pnrpay系统 02:PA 03:钱三  04:加密机系统 99:自己系统
 * 流程:11:调用接口
 * 模块:01:facade层校验  02：数据库相关 03:容器参数  04:交易流程异常 05:中间件工具异常
 * 
 * 
 */
public enum BizTransCodeEnum {
    
    SUCCESS("00000000","成功"),
   
    ;
    
    private String resultCode;
    
    private String resultDesc;
    
    private BizTransCodeEnum(String resultCode,String resultDesc) {
        this.resultCode=resultCode;
        this.resultDesc=resultDesc;
    }

    public String getResultCode() {
        return resultCode;
    }

    public String getResultDesc() {
        return resultDesc;
    }

    
   
    
}
