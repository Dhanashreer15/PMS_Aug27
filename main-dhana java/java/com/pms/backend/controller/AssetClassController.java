package com.pms.backend.controller;

import com.pms.backend.entity.AssetClass;
import com.pms.backend.service.AssetClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/asset-classes")

public class AssetClassController {

    @Autowired
    private AssetClassService assetClassService;

    @GetMapping
    public List<AssetClass> getAllAssetClasses() {
        return assetClassService.getAllAssetClasses();
    }

    @GetMapping("/{id}")
    public AssetClass getAssetClassById(@PathVariable Long id) {
        return assetClassService.getAssetClassById(id);
    }
}
