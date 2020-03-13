package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	String[] name = {"shrikant","kale"};
	
	@Autowired
	private HomeService homeService;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Home Controller");

	}
	@RequestMapping(method = RequestMethod.GET, value = "/hello", produces = MediaType.APPLICATION_JSON_VALUE)
	public String hello() {
		return this.name[0].concat(this.name[1]).toUpperCase();
	}
	
	@RequestMapping("/bye")
	public String bye() {
		return "Bye World";
		
	}
	@RequestMapping("/data")
	public List<Home> getAllLists() {
		return homeService.getAllData();
	}
	
	@RequestMapping("/data/{id}")
	public Home getlist(@PathVariable String id) {
		return homeService.getData(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value = "/data")
	public void addlist(@RequestBody Home homes) {
		homeService.addData(homes);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value = "/data/{id}")
	public void updatelist(@RequestBody Home homes, @PathVariable String id) {
		homeService.updateData(id,homes);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value = "/data/{id}")
	public void Deletelist(@PathVariable String id) {
		homeService.deleteData(id);
	}
}
