package com.presses.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SideMenu {
    private int id;
    private String name;
    private String url;
    private int page_permission;
    private List<SideMenuChildren> children;

    /**
     * 設計 靜態內部類
     * 如果該類需要再外部使用的話可以設計為 non static
     * 反之如果只會在內部使用則必須設計為 static class
     */
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    static class SideMenuChildren {
        private int id;
        private String name;
        private String url;
        private int sideMenuId;
    }
}



