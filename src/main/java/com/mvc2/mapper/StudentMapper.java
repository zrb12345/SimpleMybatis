package com.mvc2.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mvc2.domain.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

/**
 * 学生表 数据层
 * 
 * @author xiaochao
 */
@Mapper
public interface StudentMapper extends BaseMapper
{
    /**
     * 通过学生ID删除学生
     * 
     * @param StudentId 学生ID
     * @return 结果
     */
     int deleteStudentById(Long StudentId);

    /**
     * 通过学生ID查询学生
     *
     * @param StudentId 学生ID
     * @return 结果
     */
    Student getStudentById(long StudentId);
    int addStudent(HashMap<String,Object> map);

    List<Student> selectLike(String wildName);

    List<Student> selectStudentsPage(HashMap<String,Integer> map);
}
