package com.pms.backend.service;
import com.pms.backend.entity.AssetClass;
import java.util.List;

public interface AssetClassService {
    List<AssetClass> getAllAssetClasses();
    AssetClass getAssetClassById(Long id);

}
