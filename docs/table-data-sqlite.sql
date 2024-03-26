CREATE TABLE user (
	id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, -- COMMENT 'id'
	user_name TEXT UNIQUE NOT NULL, -- COMMENT '名稱'
	password INT NOT NULL, -- COMMENT '密碼'
	create_by TEXT NOT NULL, -- COMMENT '創建人'
	create_time DATETIME DEFAULT CURRENT_TIMESTAMP NOT NULL, -- COMMENT '創建時間'
	update_by TEXT NOT NULL, -- COMMENT '更新人'
	update_time DATETIME DEFAULT CURRENT_TIMESTAMP NOT NULL -- COMMENT '更新時間'
);

INSERT INTO user (user_name, password, create_by, update_by) VALUES ('test', 'test', 'system', 'system');
INSERT INTO user (user_name, password, create_by, update_by) VALUES ('test1', 'test1', 'system', 'system');
INSERT INTO user (user_name, password, create_by, update_by) VALUES ('test2', 'test2', 'system', 'system');
INSERT INTO user (user_name, password, create_by, update_by) VALUES ('test3', 'test3', 'system', 'system');
INSERT INTO user (user_name, password, create_by, update_by) VALUES ('test4', 'test4', 'system', 'system');
INSERT INTO user (user_name, password, create_by, update_by) VALUES ('test5', 'test5', 'system', 'system');
INSERT INTO user (user_name, password, create_by, update_by) VALUES ('test6', 'test6', 'system', 'system');
INSERT INTO user (user_name, password, create_by, update_by) VALUES ('test7', 'test7', 'system', 'system');
INSERT INTO user (user_name, password, create_by, update_by) VALUES ('test8', 'test8', 'system', 'system');
INSERT INTO user (user_name, password, create_by, update_by) VALUES ('test9', 'test9', 'system', 'system');

CREATE TABLE sys_prop (
	id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, -- COMMENT 'id'
	system TEXT NOT NULL, -- COMMENT '系統代碼'
	name TEXT NOT NULL, -- COMMENT '屬性名'
	value TEXT NOT NULL -- COMMENT '屬性值'
);

INSERT INTO sys_prop (system, name, value) VALUES ('GLOBAL', 'url.google', 'https://www.google.com/');
INSERT INTO sys_prop (system, name, value) VALUES ('GLOBAL', 'url.youtube', 'https://www.youtube.com/');