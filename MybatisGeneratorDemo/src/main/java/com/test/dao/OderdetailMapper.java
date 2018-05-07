package com.test.dao;

import com.test.bean.Oderdetail;
import com.test.bean.OderdetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OderdetailMapper {
    long countByExample(OderdetailExample example);

    int deleteByExample(OderdetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Oderdetail record);

    int insertSelective(Oderdetail record);

    List<Oderdetail> selectByExample(OderdetailExample example);

    Oderdetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Oderdetail record, @Param("example") OderdetailExample example);

    int updateByExample(@Param("record") Oderdetail record, @Param("example") OderdetailExample example);

    int updateByPrimaryKeySelective(Oderdetail record);

    int updateByPrimaryKey(Oderdetail record);
}