package cn.microboat.util;

import cn.hutool.core.util.IdUtil;

/**
 * @author zhouwei
 */
public class SnowFlakeID {

    public static String getSnowFlakeId() {
        String nextIdStr = IdUtil.getSnowflake().nextIdStr();
        System.out.println("雪花算法：" + nextIdStr);
        return nextIdStr;
    }
}
