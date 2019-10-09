package org.lq.demo.facade.req;

import lombok.Data;

@Data
public class UserReqDTO extends BaseReqDTO{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4523664957812927010L;

	private String userName;
	
	private String age;
	
	private String passWord;

}
