package com.fy.service;
import com.fy.domain.Record;
import com.fy.domain.User;
import entity.PageResult;

/**
 * 借阅记录接口
 */
public interface RecordService {
    //新增借阅记录
    Integer addRecord(Record record);
//查询借阅记录
PageResult searchRecords(Record record, User user, Integer pageNum, Integer pageSize);
}
