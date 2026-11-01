package l;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.ᩴᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AIE */
/* JADX INFO: loaded from: classes4.dex */
public final class C18929 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f61244;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f61248 = new AtomicInteger(0);

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Object f61246 = new Object();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC13783 f61245 = new ConcurrentMapC13783();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AtomicLong f61249 = new AtomicLong();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C0583 f61247 = new C0583();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m43601(C18929 c18929) {
        c18929.f61244--;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m43604(C18929 c18929) {
        c18929.f61244++;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC13783 m43607() {
        return this.f61245;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger m43609() {
        return this.f61248;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C0583 m43608() {
        return this.f61247;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AtomicLong m43606() {
        return this.f61249;
    }

    public final String toString() {
        return "ObjectDeque [idleObjects=" + this.f61247 + ", createCount=" + this.f61248 + ", allObjects=" + this.f61245 + ", numInterested=" + this.f61249 + "]";
    }
}
