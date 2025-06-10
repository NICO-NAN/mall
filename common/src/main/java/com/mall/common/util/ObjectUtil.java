package com.mall.common.util;

public class ObjectUtil {
    public static boolean allNotNull(Object... values) {
        if (values == null) {
            return false;
        } else {
            Object[] var1 = values;
            int var2 = values.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                Object val = var1[var3];
                if (val == null) {
                    return false;
                }
            }
            return true;
        }
    }
}
