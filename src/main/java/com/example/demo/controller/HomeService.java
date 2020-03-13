package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class HomeService {

	private List<Home> home = new ArrayList<>(Arrays.asList(
			new Home("1","Shrikant","UI Developer"),
			new Home("2","Yashwant","Backend Developer"),
			new Home("3","Suraj","DevOps Developer"),
			new Home("4","Prem","DB Developer")			
			));
	
	public List<Home> getAllData() {
		return home;
	}
	
	public Home getData(String id){
		return home.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	
	public void addData(Home homes) {
		home.add(homes);
	}
	
	public void updateData(String id, Home homes) {
		for(int i = 0; i < home.size(); i++) {
			Home h = home.get(i);
			if(h.getId().equals(id)) {
				home.set(i, homes);
				return;
			}
		}
	}

	public void deleteData(String id) {
		home.removeIf(i -> i.getId().equals(id));
		
	}

}
