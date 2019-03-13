/**
 * aServiceImpl.java
 * Copyright 2019 .
 * All rights reserved.
 * Created on 2019-03-07 21:29
 */
package com.service.serviceImpl;

import com.mapper.ADao;
import com.service.AService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 文件的说明
 *
 * @author 杨凯
 * @version 1.0.0, 2019-03-07 21:29
 **/
@Service
public class AServiceImpl implements AService {
    @Resource
    private ADao aDao;

    public void pinfan() {

    }
}
