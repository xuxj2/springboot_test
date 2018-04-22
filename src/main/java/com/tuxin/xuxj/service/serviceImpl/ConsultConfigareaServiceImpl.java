package com.tuxin.xuxj.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tuxin.xuxj.bean.ConsultConfigarea;
import com.tuxin.xuxj.dao.ConsultConfigareaMapper;
import com.tuxin.xuxj.service.ConsultConfigareaService;
@Service
public class ConsultConfigareaServiceImpl implements ConsultConfigareaService {
	@Autowired
	private ConsultConfigareaMapper  consultConfigareaMapperDao;
	
	public ConsultConfigarea get(){

      ConsultConfigarea c  = consultConfigareaMapperDao.selectByPrimaryKey("100");
        return c;
        
		
	}

}
