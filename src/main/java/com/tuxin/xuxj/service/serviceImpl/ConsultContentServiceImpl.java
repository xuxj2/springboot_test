package com.tuxin.xuxj.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tuxin.xuxj.bean.ConsultContent;
import com.tuxin.xuxj.bean.ConsultContentExample;
import com.tuxin.xuxj.dao.ConsultContentMapper;
import com.tuxin.xuxj.service.ConsultContentService;

@Service
public class ConsultContentServiceImpl  implements  ConsultContentService{
	@Autowired
	private ConsultContentMapper consultContentMapper;


	public List<ConsultContent> queryContent(){
		ConsultContentExample example = new ConsultContentExample();
//		example.setCount(8);
//		example.setLimitStart(0);
		ConsultContentExample.Criteria  criteria=  example.createCriteria();
		criteria.andIdEqualTo(2);
		
		
		ConsultContentExample.Criteria  criteria2=  example.createCriteria();
		criteria2.andIdEqualTo(3);
		List<ConsultContent> list = consultContentMapper.selectByExample(example);
		
		return list;
		
		
		
	}
	
	

}
