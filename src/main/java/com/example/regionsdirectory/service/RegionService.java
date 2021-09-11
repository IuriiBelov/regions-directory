package com.example.regionsdirectory.service;

import com.example.regionsdirectory.model.Region;

import java.util.List;

public interface RegionService {

    List<Region> getAllRegions();

    Region getRegionById(int id);

    int createRegion(Region newRegion);

    int updateRegionById(int id, Region updatedRegion);

    int deleteRegionById(int id);
}
