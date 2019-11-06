package com.example.demo;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface DictMapper {
    List<DictType> listAllDictTypes();
    List<DictItem> listAllDictItemsByType(String dictType);
}
