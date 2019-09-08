package cn.wt.handleexception.service.impl;

import cn.wt.handleexception.constants.ResultEnum;
import cn.wt.handleexception.exception.Assert;
import cn.wt.handleexception.service.IAssertTestService;
import org.springframework.stereotype.Service;

/**
 * @ClassName: AssertTestSerciveImpl
 * @Description: TODO
 * @Author jiaoxiangyu
 * @Date 2019/9/5
 * @Version 1.0
 * @Since JDK1.8
 */
@Service
public class AssertTestSerciveImpl implements IAssertTestService {
    
    /**
     * @title:  testServiceException
     * @description:  TODO
     * @param 
     * @return  void
     */
    @Override
    public void testServiceException() {
        Assert.isBlank("", ResultEnum.STRING_NULL);
    }
}
