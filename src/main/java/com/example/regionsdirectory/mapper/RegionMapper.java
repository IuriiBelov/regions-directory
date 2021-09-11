package com.example.regionsdirectory.mapper;

import com.example.regionsdirectory.model.Region;
import org.apache.ibatis.annotations.*;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface RegionMapper {

    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "shortName", column = "short_name")
    })
    @Select("select * from region")
    @Cacheable("allRegions")
    List<Region> getAllRegions();

    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "shortName", column = "short_name")
    })
    @Select("select * from region where id=#{id}")
    @Cacheable("regionById")
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
