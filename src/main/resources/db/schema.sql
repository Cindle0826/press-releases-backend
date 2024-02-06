-- CREATE DATABASE
CREATE DATABASE IF NOT EXISTS press_releases;

SELECT DATABASE();
use press_releases;
-- CREATE TABLE

CREATE TABLE IF NOT EXISTS sideMenu
(
    id              INT PRIMARY KEY AUTO_INCREMENT,
    name            NVARCHAR(20) NOT NULL,
    url             NVARCHAR(100),
    page_permission INT(1)
);

CREATE TABLE IF NOT EXISTS sideMenuChildren
(
    id         INT PRIMARY KEY AUTO_INCREMENT,
    name       NVARCHAR(20) NOT NULL,
    url        NVARCHAR(100),
    sideMenuID INT
);

-- insert sideMenu

INSERT INTO sideMenu (id, name, url, page_permission)
VALUES (1, 'Home', 'home', 1);

INSERT INTO sideMenu (id, name, url, page_permission)
VALUES (2, 'User Manage', null, null);

INSERT INTO sideMenu (id, name, url, page_permission)
VALUES (3, 'User Rights Manage', null, null);

-- insert children

INSERT INTO sideMenuChildren (id, name, url, sideMenuID)
VALUES (1, 'User List', 'user-manage/list', 2);

INSERT INTO sideMenuChildren (id, name, url, sideMenuID)
VALUES (2, 'Role List', 'right-manage/role/list', 3);

INSERT INTO sideMenuChildren (id, name, url, sideMenuID)
VALUES (3, 'Right List', 'right-manage/right/list', 3);