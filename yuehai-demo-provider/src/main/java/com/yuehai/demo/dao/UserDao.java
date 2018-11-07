package com.yuehai.demo.dao;

import com.yuehai.demo.entity.UserBean;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by zhaoyuehai 2018/8/31
 */
@Mapper
public interface UserDao {

    /**
     * 插入操作
     *
     * @param user user
     * @return 1：成功 受影响的行数
     */
    @Insert("insert into tb_user(user_name,password,email,nick_name,phone) values(#{userName},#{password},#{email},#{nickName},#{phone})")
    @Options(useGeneratedKeys = true, keyColumn = "uid", keyProperty = "uid")
    Long insert(UserBean user);

    /**
     * 删除操作
     *
     * @param uid 主键id
     * @return 1：成功  0：失败
     */
    @Delete("delete from tb_user where uid=#{uid}")
    Long delete(long uid);

    /**
     * 更新操作
     *
     * @param user user
     * @return 受影响的行数
     */
    @Update("update tb_user set user_name=#{userName},password=#{password},email=#{email},nick_name=#{nickName},phone=#{phone} where uid=#{uid}")
    Long update(UserBean user);

    /**
     * 查询所有
     *
     * @return 元素列表
     */
    @Select("select uid,user_name as userName,password,email,nick_name as nickName,phone from tb_user")
    List<UserBean> selectAll();

    /**
     * 根据主键查询单个元素
     *
     * @param uid 主键id
     * @return 元素
     */
    @Select("select uid,user_name as userName,password,email,nick_name as nickName,phone from tb_user where uid =#{uid}")
    UserBean selectById(long uid);

}
