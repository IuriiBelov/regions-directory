package com.example.regionsdirectory.service;

import com.example.regionsdirectory.model.Region;

import java.util.List;

public interface RegionService {

    List<Region> getAllRegions();

    Region getRegionById(int id);

    Region createRegion(Region newRegion);

    Region updateRegionById(int id, Region updatedRegion);

    Region deleteRegionById(int id);
}
