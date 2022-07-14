package com.milestone_5_edapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.milestone_5_edapp.model.ElectronicsDevice;
import com.milestone_5_edapp.service.ElectronicsDeviceService;

@RestController
public class ElectronicsDeviceController {

	@Autowired
	private ElectronicsDeviceService eds;

	public ElectronicsDeviceController(ElectronicsDeviceService eds) {
		super();
		this.eds = eds;
	}
	
	
	@GetMapping("/electronicsdevices")
	public java.util.List<ElectronicsDevice> getAllEmployees(){
		return (java.util.List<ElectronicsDevice>) this.eds.getAllElectronicsDevice();
	}
	
	@GetMapping("/electronicsdevices/{id}")
	public ElectronicsDevice getemEmployeeById(@PathVariable("id") String id) {
		return this.eds.getElectronicsDeviceById(Long.parseLong(id));
	}
	
	@PostMapping("/electronicsdevices")
	public ResponseEntity<ElectronicsDevice> saveEmployee(@RequestBody ElectronicsDevice ed){
		return new ResponseEntity<ElectronicsDevice>(eds.saveElectronicsDevice(ed),HttpStatus.CREATED);
	}
		
		@DeleteMapping("/electronicsdevices/{id}")
		public ResponseEntity<HttpStatus> deleteEmployeeById(@PathVariable String id) {
			try {
				this.eds.deleteElectronicsDeviceById(Long.parseLong(id));
				return new ResponseEntity<>(HttpStatus.OK);
			}
			catch(Exception e) {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		
	}
	
}
