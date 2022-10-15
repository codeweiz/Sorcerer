package cn.microboat.util;

import com.google.common.collect.ImmutableList;

/**
 * @author zhouwei
 */
public class UnChangedList {
    private static final ImmutableList<String> INSTANCE = ImmutableList.<String>builder()
            .add("1").add("2").add("3")
            .build();

    public static ImmutableList<String> getInstance() {
        return INSTANCE;
    }
}
