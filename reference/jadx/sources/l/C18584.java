package l;

import android.window.BackEvent;

/* JADX INFO: renamed from: l.ܿ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: C9BS */
/* JADX INFO: loaded from: classes4.dex */
public final class C18584 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float f60371;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final float f60372;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f60373;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final float f60374;

    public C18584(BackEvent backEvent) {
        C15243.m36590(backEvent, "backEvent");
        C21568 c21568 = C21568.f68920;
        float fM49051 = c21568.m49051(backEvent);
        float fM49053 = c21568.m49053(backEvent);
        float fM49050 = c21568.m49050(backEvent);
        int iM49052 = c21568.m49052(backEvent);
        this.f60372 = fM49051;
        this.f60374 = fM49053;
        this.f60371 = fM49050;
        this.f60373 = iM49052;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final float m43164() {
        return this.f60374;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m43163() {
        return this.f60371;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m43165() {
        return this.f60373;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f60372 + ", touchY=" + this.f60374 + ", progress=" + this.f60371 + ", swipeEdge=" + this.f60373 + '}';
    }
}
