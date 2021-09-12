package com.example.regionsdirectory.service;

import com.example.regionsdirectory.model.Region;

import java.util.List;

public interface RegionService {

    List<Region> getAllRegions();

    Region getRegionById(int id);

    void createRegion(Region newRegion);

    void updateRegionById(int id, Region updatedRegion);

    void deleteRegionById(int id);
}
