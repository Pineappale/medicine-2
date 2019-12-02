package com.jlu.medicine.serviceImp;

import com.jlu.medicine.entry.TPerson;
import com.jlu.medicine.mapper.TPersonMapper;
import com.jlu.medicine.service.test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.soap.Addressing;

/**
 * @PackageName: com.jlu.medicine.serviceImp
 * @ClassName: testimp
 * @Description:
 * @author: 张大伟
 * @date: 2019/11/29 20:01
 **/
@Service
public class testimp implements test {

    @Autowired
    private TPersonMapper userMapper;
    @Override
    public TPerson select(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
