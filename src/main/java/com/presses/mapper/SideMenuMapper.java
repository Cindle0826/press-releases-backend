package com.presses.mapper;

import com.presses.pojo.SideMenu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SideMenuMapper {
    public List<SideMenu> findSideMenuAll();
}
