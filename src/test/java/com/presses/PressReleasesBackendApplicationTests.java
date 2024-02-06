package com.presses;

import com.presses.mapper.SideMenuMapper;
import com.presses.pojo.SideMenu;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class PressReleasesBackendApplicationTests {

    @Autowired
    private SideMenuMapper sideMenuMapper;

    @Test
    public void findSideMenuAll () {
        List<SideMenu> findAll = sideMenuMapper.findSideMenuAll();
        System.out.println("findAll 數據 => " + findAll);

    }
}
