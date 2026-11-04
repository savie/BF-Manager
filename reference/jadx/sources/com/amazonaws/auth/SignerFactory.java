package com.amazonaws.auth;

import com.amazonaws.internal.config.InternalConfig;
import l.ConcurrentMapC17249;

/* JADX INFO: loaded from: classes.dex */
public final class SignerFactory {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final ConcurrentMapC17249 f152;

    static {
        ConcurrentMapC17249 concurrentMapC17249 = new ConcurrentMapC17249();
        f152 = concurrentMapC17249;
        concurrentMapC17249.put("QueryStringSignerType", QueryStringSigner.class);
        concurrentMapC17249.put("AWS4SignerType", AWS4Signer.class);
        concurrentMapC17249.put("NoOpSignerType", NoOpSigner.class);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m217(Class cls, String str) {
        f152.put(str, cls);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static Signer m218(String str, String str2) {
        return m216(str, str2);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Signer m219(String str, String str2) {
        return m216(InternalConfig.Factory.m283().m281(str, str2).m284(), str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Signer m216(String str, String str2) {
        Class cls = (Class) f152.get(str);
        if (cls == null) {
            throw new IllegalArgumentException();
        }
        try {
            Signer signer = (Signer) cls.newInstance();
            if (signer instanceof ServiceAwareSigner) {
                ((ServiceAwareSigner) signer).setServiceName(str2);
            }
            return signer;
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Cannot create an instance of ".concat(cls.getName()), e);
        } catch (InstantiationException e2) {
            throw new IllegalStateException("Cannot create an instance of ".concat(cls.getName()), e2);
        }
    }
}
