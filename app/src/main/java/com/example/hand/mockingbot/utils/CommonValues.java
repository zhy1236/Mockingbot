package com.example.hand.mockingbot.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Oliver on 2016/9/13.
 */

public class CommonValues {
//    public static final String BASE_TEST_HOST = "http://10.211.55.174:9090/project-mg-app/app"; //本地环境
//    public static final String BASE_TEST_HOST = "http://192.168.11.198:8084/project-mg-app/app";//测试环境
    public static final String BASE_TEST_HOST  = "http://edb2.hand-china.com:8088/project-mg-app/app"; //正式环境

    public static String currentHost = BASE_TEST_HOST;

    /**
     * 登陆
     */
    public static final String LOGIN = currentHost + "/login";

    /**
     * 收到日志列表
     * userId,dailyTime,state
     * dailyTime 查询日期
     * state 0:查询日报
     * state 1:未提交日报人员
     * pageNo 1 页数
     * pageSize 10 每页条目数
     */
    public static final String JOURNAL_LIST = currentHost + "/daily/selectAllDaily?";

    /**
     * 日志概略信息
     */
    public static final String JOURNAL_DETAIL = currentHost + "/daily/dailyDetail";

    /**
     * 我发出的日报
     * userId,startTime,endTime,pageNo,pageSize,
     */
    public static final String MY_JOURNAL = currentHost + "/daily/selectMyDaily?";

    /**
     * 日报界面子控件图标及名称
     */
    public static final String JOURNAL_DAILY_STATISTICAL = currentHost + "/daily/getDailyStatistical?";

    /**
     * 查看日报详情
     * get方法
     */
    public static final String GET_COMMENT = currentHost + "/daily/comment?";

    /**
     * 添加查看日报人
     * userId,dailyId
     */
    public static final String ADD_DAILYSEE = currentHost + "/daily/dailySee?";

    /**
     * 评论
     * userId,dailyId,content,isReadFlag = 0
     * post
     */
    public static final String COMMENT = currentHost + "/daily/addComment";

    /**
     * 发日报
     * userId
     * finfshWork 已完成工作
     * unfinishWork 未完成工作
     * coordinationWork 需协调工作
     * remark 备注
     * enclosureUrl 关联的附件
     * submitDate 当天时间
     * isAfterPayment 是否补交 补交传1  发起传0
     */
    public static final String NEW_JOURNAL = currentHost + "/daily/addDaily";

    /**
     * 修改日报
     *
     */
    public static final String UPDATE_DAILY = currentHost + "/daily/updateDaily";

    /**
     * 上传附件
     */
    public static final String UP_LOAD_ATTAUCHMENT = currentHost + "/daily/uploadAttachment";

    /**
     * 下载附件
     */
    public static final String DOWN_ATTAUCHMENT = currentHost + "/daily/downloadAttachment?";

    /**
     * 获取所有对我的评论
     * userId
     */
    public static final String GET_ALL_COMMENT= currentHost + "/daily/getDailyComment";

    public static Map<String,Object> getmap(){
        Map<String, Object> param = new HashMap<>();
        param.put("userId",HandApp.getLoginEntity().getResult().getData().getId());
        return param;
    }
}