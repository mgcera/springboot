package com.phoenix.am.assets.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.phoenix.am.assets.domain.Asset;

@RestController
public class AssetController {
	
	private static List<Asset> assets = new ArrayList<Asset>();

	@RequestMapping("/")
	public List<Asset> getAssets(){
		createAssets();
		return assets;
	}
	
	private void createAssets(){
		assets.add(new Asset("server001", "101", "compute"));
		assets.add(new Asset("server002", "102", "compute"));
		assets.add(new Asset("storgae001", "201", "storage"));
		assets.add(new Asset("storage002", "201", "storage"));
	}
	
}
