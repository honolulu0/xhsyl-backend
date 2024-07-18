-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('评论管理', '2008', '1', 'note_comment', 'note/note_comment/index', 1, 0, 'C', '0', '0', 'note:note_comment:list', '#', 'admin', sysdate(), '', null, '评论管理菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('评论管理查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'note:note_comment:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('评论管理新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'note:note_comment:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('评论管理修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'note:note_comment:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('评论管理删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'note:note_comment:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('评论管理导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'note:note_comment:export',       '#', 'admin', sysdate(), '', null, '');