package com.milestone_5_edapp.service;

import java.util.List;

import com.milestone_5_edapp.model.ElectronicsDevice;



public interface ElectronicsDeviceService {
	
	ElectronicsDevice saveElectronicsDevice(ElectronicsDevice emp);
	
	List<ElectronicsDevice> getAllElectronicsDevice();
	
	ElectronicsDevice getElectronicsDeviceById(long id);
	
	void deleteElectronicsDeviceById(long id);

}
