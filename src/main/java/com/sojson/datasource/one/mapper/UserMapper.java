package com.sojson.datasource.one.mapper;

import com.sojson.datasource.common.model.WysAdminTable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserMapper {
    public List<WysAdminTable> selectAll();
}
