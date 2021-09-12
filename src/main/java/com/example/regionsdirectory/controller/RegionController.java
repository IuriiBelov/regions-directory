package com.example.regionsdirectory.controller;

import com.example.regionsdirectory.model.Region;
import com.example.regionsdirectory.service.RegionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("regions")
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
    public ResponseEntity<?> createNewRegion(@RequestBody Region newRegion) {
        try {
            regionService.createRegion(newRegion);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<?> updateRegionById(@PathVariable int id,
                                                  @RequestBody Region updatedRegion) {
        try {
            regionService.updateRegionById(id, updatedRegion);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteRegionById(@PathVariable int id) {
        try {
            regionService.deleteRegionById(id);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
