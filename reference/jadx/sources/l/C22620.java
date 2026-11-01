package l;

import android.graphics.PointF;
import android.view.View;

/* JADX INFO: renamed from: l.᩹᩻ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: A65W */
/* JADX INFO: loaded from: classes.dex */
public final class C22620 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final View f73708;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f73709;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f73710;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f73711;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f73712;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f73713;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f73714;

    public C22620(View view) {
        this.f73708 = view;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m50145(PointF pointF) {
        this.f73712 = Math.round(pointF.x);
        int iRound = Math.round(pointF.y);
        this.f73711 = iRound;
        int i = this.f73714 + 1;
        this.f73714 = i;
        if (i == this.f73713) {
            C16000.m37979(this.f73708, this.f73712, iRound, this.f73709, this.f73710);
            this.f73714 = 0;
            this.f73713 = 0;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50144(PointF pointF) {
        this.f73709 = Math.round(pointF.x);
        int iRound = Math.round(pointF.y);
        this.f73710 = iRound;
        int i = this.f73713 + 1;
        this.f73713 = i;
        if (this.f73714 == i) {
            C16000.m37979(this.f73708, this.f73712, this.f73711, this.f73709, iRound);
            this.f73714 = 0;
            this.f73713 = 0;
        }
    }
}
