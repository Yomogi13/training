package com.example.demo.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * 
 * HPに関するコントローラクラスです
 * 
 *
 */
@Controller
public class WebController {
	
	/**
	 * 
	 * @param model ビューに渡すモデルオブジェクト
	 * @return index画面のHTMLファイル名
	 */

	@GetMapping(value = "/test/")
	public String index(Model model) {
		
		model.addAttribute("message", "ようこそ");
		model.addAttribute("datetime", LocalDateTime.now());
		return "index";

	}
}
