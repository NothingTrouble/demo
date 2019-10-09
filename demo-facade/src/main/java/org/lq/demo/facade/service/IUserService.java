package org.lq.demo.facade.service;

import org.lq.demo.facade.req.UserReqDTO;
import org.lq.demo.facade.resp.UserRespDTO;

public interface IUserService {
	
	/**
	 * 
	 * @param userReqDTO
	 * @return
	 */
	public UserRespDTO sayHello(UserReqDTO userReqDTO);

}
