package com.presses.service;

import com.presses.pojo.SideMenu;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PressReleaseService {
    public List<SideMenu> findAll();
}
