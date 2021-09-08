package com.example.regionsdirectory.controller;

import com.example.regionsdirectory.model.Region;
import com.example.regionsdirectory.service.RegionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RegionController {

    private final RegionService regionService;

    public RegionController(RegionService regionService) {
        this.regionService = regionService;
    }

    @GetMapping
    public ResponseEntity<List<Region>> getAllRegions() {
        return new ResponseEntity<>(regionService.getAllRegions(), HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Region> getRegionById(@PathVariable int id) {
        return new ResponseEntity<>(regionService.getRegionById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Region> createNewRegion(@RequestBody Region newRegion) {
        return new ResponseEntity<>(regionService.createRegion(newRegion), HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<Region> updateRegionById(@PathVariable int id,
                                                  @RequestBody Region updatedRegion) {
        return new ResponseEntity<>(regionService.updateRegionById(id, updatedRegion), HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Region> deleteRegionById(@PathVariable int id) {
        return new ResponseEntity<>(regionService.deleteRegionById(id), HttpStatus.OK);
    }
}
