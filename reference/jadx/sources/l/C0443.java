package l;

import android.window.BackEvent;

/* JADX INFO: renamed from: l.֡ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: C9BS */
/* JADX INFO: loaded from: classes2.dex */
public final class C0443 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final float f2032;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float f2033;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final float f2034;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f2035;

    public C0443(BackEvent backEvent) {
        C13465.m32966(backEvent, "backEvent");
        C20200 c20200 = C20200.f65550;
        float fM45654 = c20200.m45654(backEvent);
        float fM45651 = c20200.m45651(backEvent);
        float fM45652 = c20200.m45652(backEvent);
        int iM45655 = c20200.m45655(backEvent);
        this.f2034 = fM45654;
        this.f2032 = fM45651;
        this.f2033 = fM45652;
        this.f2035 = iM45655;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final float m2269() {
        return this.f2032;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m2268() {
        return this.f2033;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m2270() {
        return this.f2035;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f2034 + ", touchY=" + this.f2032 + ", progress=" + this.f2033 + ", swipeEdge=" + this.f2035 + '}';
    }
}
