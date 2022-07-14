package com.milestone_5_edapp.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.milestone_5_edapp.model.ElectronicsDevice;
import com.milestone_5_edapp.repository.ElectronicsDeviceRepository;
import com.milestone_5_edapp.service.ElectronicsDeviceService;

@Service
public class ElectronicsDeviceServiceImpl implements ElectronicsDeviceService {
	
	
	private ElectronicsDeviceRepository edr;
	

	public ElectronicsDeviceServiceImpl(ElectronicsDeviceRepository edr) {
		super();
		this.edr = edr;
	}

	@Override
	public ElectronicsDevice saveElectronicsDevice(ElectronicsDevice ed) {
		return edr.save(ed);
	}

	@Override
	public List<ElectronicsDevice> getAllElectronicsDevice() {
		 return edr.findAll();
	}

	@Override
	public ElectronicsDevice getElectronicsDeviceById(long id) {
		java.util.Optional<ElectronicsDevice> optional = edr.findById(id);
		ElectronicsDevice ed = null;
		if (optional.isPresent()) {
			ed = optional.get();
		} else {
			throw new RuntimeException(" Electronics Device is not found for id :: " + id);
		}
		return ed;
	}

	@Override
	public void deleteElectronicsDeviceById(long id) {
		this.edr.deleteById(id);
		
	}

}
