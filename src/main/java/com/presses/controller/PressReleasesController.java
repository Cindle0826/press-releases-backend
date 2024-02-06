package com.presses.controller;

import com.presses.mapper.SideMenuMapper;
import com.presses.pojo.SideMenu;
import com.presses.util.Result;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pressRelease")
@CrossOrigin(origins = "http://localhost:3000")
public class PressReleasesController {

    @Resource(name = "sideMenuMapper")
    private SideMenuMapper sideMenuMapper;

    @RequestMapping("sideMenuList")
    public Result<List<SideMenu>> sideMenu () {
        return Result.success(sideMenuMapper.findSideMenuAll());
    }
}
