-- 数据库SQL操作
-- 创建数据库
CREATE DATABASE IF NOT EXISTS `testSql` DEFAULT CHARACTER  SET utf8;
-- 创建数据表
CREATE TABLE `user`(
  `id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'id',
  `username` VARCHsexAR(20) NOT NULL DEFAULT '' COMMENT '用户名',
  `sex` ENUM('男','女','保密') NOT NULL DEFAULT '保密' COMMENT '性别',
  `addr` VARCHAR(100) NOT NULL DEFAULT '' COMMENT '地区',
  `age` INT(10) NOT NULL DEFAULT 0 COMMENT '年龄'
  PRIMARY KEY (`id`)
)ENGINE=InnoDB CHARACTER SET = utf8;
-- 修改数据表（字段/类型）
ALTER TABLE ...
-- 删除数据表
DROP TABLE ...

-- 查询记录
SELECT * FROM `user`;
-- 添加记录
INSERT ... VALUE ... 
-- 修改记录
UPDATE ... SET
-- 删除记录
DELETE FROM ...

-- 子查询  (子查询结果)
-- 有EXIXTS子查询 通过查询结果判断是否执行前端查询

CREATE TABLE cate(
  id SMALLINT UNSIGNED AUTO_INCREMENT KEY,
  cateName VARCHAR(100) NOT NULL UNIQUE,
  pId SMALLINT UNSIGNED NOT NULL DEFAULT 0
)ENGINE=InnoDB CHARACTER SET = utf8;

-- 查询所有分类，得到父分类
select s.id,s.cateName as sCateName,p.cateName as pCateName
from cate as s 
left join cate as p
on s.pId=p.id; 
-- 查询所有分类及其子分类
select p.id,p.cateName as pCateName,s.cateName as sCateName
from cate as s 
right join cate as p
on s.pId=p.id; 
-- 查询所有分类并得到子分类的数目
select p.id,p.cateName as pCateName,count(s.cateName) as count
from cate as s 
right join cate as p
on s.pId=p.id
group by p.cateName
order by id;

-- 使用函数cell 。。。