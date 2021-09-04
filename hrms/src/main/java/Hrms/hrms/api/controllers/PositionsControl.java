package Hrms.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Hrms.hrms.business.abstracts.PositionsService;
import Hrms.hrms.entities.concretes.Positions;


@RestController
@RequestMapping("/api/positions")
public class PositionsControl {
	
	
	private PositionsService positionsService;
	
	
	@Autowired
	public PositionsControl(PositionsService positionsService) {
		super();
		this.positionsService = positionsService;
	}


	@GetMapping("/getall")
	public List<Positions> getAll(){
		return this.positionsService.getAll();
	}

}