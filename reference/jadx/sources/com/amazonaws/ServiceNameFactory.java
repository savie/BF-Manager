package com.amazonaws;

import com.amazonaws.internal.config.HttpClientConfig;
import com.amazonaws.internal.config.InternalConfig;

/* JADX INFO: loaded from: classes.dex */
public enum ServiceNameFactory {
    ;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m195(String str) {
        HttpClientConfig httpClientConfigM280 = InternalConfig.Factory.m283().m280(str);
        if (httpClientConfigM280 == null) {
            return null;
        }
        return httpClientConfigM280.m279();
    }
}
