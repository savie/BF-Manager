package l;

import java.util.logging.Logger;

/* JADX INFO: renamed from: l.᩶᩸᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 99PI */
/* JADX INFO: loaded from: classes4.dex */
public final class C20446 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f66282 = 0;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final Logger f66284 = Logger.getLogger(C20446.class.getName());

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final int[] f66283 = new int[0];

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C2806[] f66287 = new C2806[0];

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C19741[] f66280 = new C19741[0];

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C7040[] f66285 = new C7040[0];

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final C16213[] f66279 = new C16213[0];

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C21151[] f66288 = new C21151[0];

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final ConcurrentMapC13783 f66286 = new ConcurrentMapC13783();

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static volatile C14139 f66281 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23539 m46245(EnumC12167 enumC12167) {
        int i = C14139.f46400;
        int i2 = C14097.f46275;
        C15424 c15424 = C1001.f4676;
        if (f66281 == null) {
            synchronized (C20446.class) {
                if (f66281 == null) {
                    try {
                        C4818 c4818M13398 = C4818.m13398();
                        c4818M13398.m13400(C1001.f4676);
                        f66281 = C14139.m34180("\n\u001d\u0018æ\u0007\"\u0003Ê>\u0000*\u0013\b\u0001\u0010\u0002\u0018\u0002 \u0003(\u00010\u0002Ê>\u0004\b\u0001\u0010\u0001\n\u001d\u0018ç\u0007\"\u0003Ê>\u0000*\u0013\b\u0002\u0010\u0001\u0018\u0001 \u0002(\u00010\u0001Ê>\u0004\b\u0000\u0010\u0001\n\u001d\u0018è\u0007\"\u0013\b\u0001\u0010\u0001\u0018\u0001 \u0002(\u00010\u0001Ê>\u0004\b\u0000\u0010\u0001*\u0003Ê>\u0000 æ\u0007(è\u0007".getBytes(C9779.f33480), c4818M13398);
                    } catch (Exception e) {
                        throw new AssertionError(e);
                    }
                }
            }
        }
        C14139 c14139 = f66281;
        if (enumC12167.getNumber() < c14139.m34186().getNumber()) {
            throw new IllegalArgumentException("Edition " + enumC12167 + " is lower than the minimum supported edition " + c14139.m34186() + "!");
        }
        if (enumC12167.getNumber() > c14139.m34185().getNumber()) {
            throw new IllegalArgumentException("Edition " + enumC12167 + " is greater than the maximum supported edition " + c14139.m34185() + "!");
        }
        C4965 c4965 = null;
        for (C4965 c4966 : c14139.m34187()) {
            if (c4966.m13772().getNumber() > enumC12167.getNumber()) {
                break;
            }
            c4965 = c4966;
        }
        if (c4965 == null) {
            throw new IllegalArgumentException("Edition " + enumC12167 + " does not have a valid default FeatureSet!");
        }
        C19305 builder = c4965.m13770().toBuilder();
        builder.m44291(c4965.m13771());
        return builder.build();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23539 m46246(C23539 c23539) {
        C23539 c235310 = (C23539) f66286.putIfAbsent(Integer.valueOf(c23539.hashCode()), c23539);
        return c235310 == null ? c23539 : c235310;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m46243(C9158 c9158, C2806 c2806, String str) {
        if (c2806 != null) {
            return c2806.mo8523() + '.' + str;
        }
        String strM23482 = c9158.m23482();
        if (strM23482.isEmpty()) {
            return str;
        }
        return strM23482 + '.' + str;
    }
}
