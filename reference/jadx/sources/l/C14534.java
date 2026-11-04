package l;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ܰۤۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAYC */
/* JADX INFO: loaded from: classes4.dex */
public final class C14534 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC6332 f45722;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static C3348 f45723;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final String f45724;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final long f45725;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC6332 f45726;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final int f45727;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final int f45728;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final long f45729;

    static {
        String strM34276 = C14117.m34276("kotlinx.coroutines.scheduler.default.name");
        if (strM34276 == null) {
            strM34276 = "DefaultDispatcher";
        }
        f45724 = strM34276;
        f45725 = C14117.m34275("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, C25227.FOREVER_NS);
        int iM34279 = C14117.m34279();
        if (iM34279 < 2) {
            iM34279 = 2;
        }
        f45728 = C14117.m34274(iM34279, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        f45727 = C14117.m34274(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f45729 = TimeUnit.SECONDS.toNanos(C14117.m34275("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, C25227.FOREVER_NS));
        f45723 = C3348.f10934;
        f45726 = new C24232(0);
        f45722 = new C24232(1);
    }
}
