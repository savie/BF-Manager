package l;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۜܳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: LAYC */
/* JADX INFO: loaded from: classes2.dex */
public final class C6821 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static C2587 f22985;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final int f22986;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC1176 f22987;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC1176 f22988;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final long f22989;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final int f22990;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final long f22991 = C16265.m38430("kotlinx.coroutines.scheduler.resolution.ns", 100000, 1, C17492.FOREVER_NS);

    static {
        int iM38428 = C16265.m38428();
        if (iM38428 < 2) {
            iM38428 = 2;
        }
        f22990 = C16265.m38429(iM38428, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        f22986 = C16265.m38429(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f22989 = TimeUnit.SECONDS.toNanos(C16265.m38430("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, C17492.FOREVER_NS));
        f22985 = C2587.f10171;
        f22988 = new C13172(0);
        f22987 = new C13172(1);
    }
}
