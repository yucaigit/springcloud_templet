package com.lyzd.client.mapper;

import com.lyzd.entity.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface DeptMapper {

    public List<Dept> getAll();
}
