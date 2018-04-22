package com.tuxin.xuxj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tuxin.xuxj.bean.ConsultConfigarea;
import com.tuxin.xuxj.service.ConsultConfigareaService;
import com.tuxin.xuxj.service.serviceImpl.ConsultConfigareaServiceImpl;

@Controller
public class XuxjController {
	@Autowired
	private ConsultConfigareaService  consultConfigareaService;
	
	@RequestMapping("/queryArea")
	public @ResponseBody ConsultConfigarea queryArea(){
		ConsultConfigarea  areaList = consultConfigareaService.get();
		return areaList;
	}

}
