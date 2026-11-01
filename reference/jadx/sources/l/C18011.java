package l;

import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: l.ᩳۧ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes4.dex */
public final class C18011 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f57606;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Thread f57607;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C21539 f57608;

    public C18011(C21539 c21539) {
        this.f57608 = c21539;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m41955(C18011 c18011, Thread thread) {
        boolean z;
        synchronized (c18011) {
            c18011.f57607 = thread;
            z = !c18011.f57606;
        }
        return z;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m41957(C18011 c18011) {
        synchronized (c18011) {
            Thread.interrupted();
            c18011.f57607 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m41954(C18011 c18011) {
        synchronized (c18011) {
            if (c18011.f57606) {
                return;
            }
            c18011.f57606 = true;
            Thread thread = c18011.f57607;
            if (thread != null) {
                thread.interrupt();
            }
            C10148 c10148M48256 = c18011.f57608.m48256();
            ExecutorService executorService = C4716.f16632;
            c10148M48256.m25794();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C21539 m41956(C18011 c18011) {
        return c18011.f57608;
    }
}
