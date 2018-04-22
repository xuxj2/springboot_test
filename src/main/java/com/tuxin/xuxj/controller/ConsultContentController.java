package com.tuxin.xuxj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tuxin.xuxj.bean.ConsultContent;
import com.tuxin.xuxj.service.ConsultContentService;

@Controller
public class ConsultContentController {
	
	@Autowired
	private ConsultContentService  consultContentService;
	@RequestMapping("/queryContent")
	public @ResponseBody List<ConsultContent> queryContent(ModelMap contentMap){
		List<ConsultContent> list = consultContentService.queryContent();
		
		
		return list;
		
	}

}
