package com.example.regionsdirectory.service.impl;

import com.example.regionsdirectory.mapper.RegionMapper;
import com.example.regionsdirectory.model.Region;
import com.example.regionsdirectory.service.RegionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionServiceImpl implements RegionService {

    private final RegionMapper regionMapper;

    public RegionServiceImpl(RegionMapper regionMapper) {
        this.regionMapper = regionMapper;
    }

    @Override
    public List<Region> getAllRegions() {
        return regionMapper.getAllRegions();
    }

    @Override
    public Region getRegionById(int id) {
        return regionMapper.getRegionById(id);
    }

    @Override
    public void createRegion(Region newRegion) {
        regionMapper.createRegion(newRegion);
    }

    @Override
    public void updateRegionById(int id, Region updatedRegion) {
        regionMapper.updateRegionById(id, updatedRegion);
    }

    @Override
    public void deleteRegionById(int id) {
        regionMapper.deleteRegionById(id);
    }
}