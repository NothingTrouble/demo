package org.lq.demo.facade.resp;

import java.io.Serializable;

import lombok.Data;

@Data
public class BaseRespDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7555361175514811455L;
	
	
	/**
	 * 返回码
	 */
	private String respCode;
	
	/**
	 * 返回描述
	 */
	private String respMsg;

}
