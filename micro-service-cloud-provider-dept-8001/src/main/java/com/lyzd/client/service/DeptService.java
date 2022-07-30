package com.lyzd.client.service;

import com.lyzd.entity.Dept;
import org.springframework.stereotype.Service;

import java.util.List;


public interface DeptService {
    public List<Dept> getAll();
}
