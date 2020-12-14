package com.wisdom.agriculture.service.impl;


import com.wisdom.agriculture.domain.PortData;
import com.wisdom.agriculture.repository.PortRepository;
import com.wisdom.agriculture.service.PortService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.Executor;

/**
 * create by ledendary-666
 * 2018/10/20 0020 21:14
 * <p>
 * 对串口操作的类
 */

@Service
@EnableScheduling//任务定时，此注解必加
//@EnableAsync
public class PortServiceImpl implements PortService {

    @Autowired
    private PortRepository portRepository;

    @Override
    public PortData showPortData(PortData portData) {
        return null;
    }

    @Override
    public PortData insertPortData() {
        return null;
    }

    @Override
    public PortData deleteOneData(Integer portId) {
        return null;
    }

    @Override
    public List<PortData> selectAll() {
        return null;
    }

    @Override
    public PortData findMaxId() {
        return portRepository.findMaxId();
    }

    @Override
    public PortData findById(Integer portId) {
        return portRepository.findById(portId).get();
    }
}


