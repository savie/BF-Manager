package l;

import android.window.BackEvent;

/* JADX INFO: renamed from: l.᩶ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: C9BS */
/* JADX INFO: loaded from: classes4.dex */
public final class C20200 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C20200 f65550 = new C20200();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final float m45651(BackEvent backEvent) {
        C13465.m32966(backEvent, "backEvent");
        return backEvent.getTouchY();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m45652(BackEvent backEvent) {
        C13465.m32966(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final float m45654(BackEvent backEvent) {
        C13465.m32966(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m45655(BackEvent backEvent) {
        C13465.m32966(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final BackEvent m45653(float f, float f2, float f3, int i) {
        return new BackEvent(f, f2, f3, i);
    }
}
