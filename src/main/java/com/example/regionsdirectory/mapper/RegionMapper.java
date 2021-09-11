package com.example.regionsdirectory.mapper;

import com.example.regionsdirectory.model.Region;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface RegionMapper {

    @Select("select * from region")
    List<Region> getAllRegions();

    @Select("select * from region where id=#{id}")
    Region getRegionById(int id);

    @Insert("insert into region(name, short_name) values (#{name}, #{shortName})")
    @SelectKey(statement = "select last_insert_id()", keyProperty = "id", before = false,
            resultType = Integer.class)
    Region createRegion(Region newRegion);

    @Update("update region set name=#{name}, short_name=#{shortName} where id=#{id}")
    Region updateRegionById(int id, Region updatedRegion);

    @Delete("delete from region where id=#{id}")
    Region deleteRegionById(int id);
}
