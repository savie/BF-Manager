package l;

import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: l.ۨ۫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes3.dex */
public final class C12355 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f39684;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public Thread f39685;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C20560 f39686;

    public C12355(C20560 c20560) {
        this.f39686 = c20560;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m30830(C12355 c12355, Thread thread) {
        boolean z;
        synchronized (c12355) {
            c12355.f39685 = thread;
            z = !c12355.f39684;
        }
        return z;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m30832(C12355 c12355) {
        synchronized (c12355) {
            Thread.interrupted();
            c12355.f39685 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30829(C12355 c12355) {
        synchronized (c12355) {
            if (c12355.f39684) {
                return;
            }
            c12355.f39684 = true;
            Thread thread = c12355.f39685;
            if (thread != null) {
                thread.interrupt();
            }
            C5516 c5516M47134 = c12355.f39686.m47134();
            ExecutorService executorService = C5261.f18541;
            c5516M47134.m16429();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C20560 m30831(C12355 c12355) {
        return c12355.f39686;
    }
}
