package com.amazonaws.auth;

import com.amazonaws.internal.config.InternalConfig;
import l.ConcurrentMapC13783;

/* JADX INFO: loaded from: classes.dex */
public final class SignerFactory {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final ConcurrentMapC13783 f162;

    static {
        ConcurrentMapC13783 concurrentMapC13783 = new ConcurrentMapC13783();
        f162 = concurrentMapC13783;
        concurrentMapC13783.put("QueryStringSignerType", QueryStringSigner.class);
        concurrentMapC13783.put("AWS4SignerType", AWS4Signer.class);
        concurrentMapC13783.put("NoOpSignerType", NoOpSigner.class);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m223(Class cls, String str) {
        f162.put(str, cls);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static Signer m224(String str, String str2) {
        return m222(str, str2);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Signer m225(String str, String str2) {
        return m222(InternalConfig.Factory.m289().m287(str, str2).m290(), str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Signer m222(String str, String str2) {
        Class cls = (Class) f162.get(str);
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
