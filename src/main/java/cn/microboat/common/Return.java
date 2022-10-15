package cn.microboat.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 公共返回类
 *
 * @author zhouwei
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Return<T> {

    /**
     * 是否成功
     * true 成功
     * false 失败
     */
    private Boolean success;

    /**
     * 返回数据
     */
    private T data;

    /**
     * 失败信息
     */
    private String error;

    public static <T> Return<T> succeed(T t) {
        return new Return<>(true, t, null);
    }
}
