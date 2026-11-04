package l;

import android.graphics.PointF;
import android.view.View;

/* JADX INFO: renamed from: l.ۢ֨᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: A65W */
/* JADX INFO: loaded from: classes3.dex */
public final class C9783 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f31537;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f31538;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final View f31539;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f31540;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f31541;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f31542;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f31543;

    public C9783(View view) {
        this.f31539 = view;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m25519(PointF pointF) {
        this.f31538 = Math.round(pointF.x);
        int iRound = Math.round(pointF.y);
        this.f31541 = iRound;
        int i = this.f31540 + 1;
        this.f31540 = i;
        if (i == this.f31542) {
            C11319.m28607(this.f31539, this.f31538, iRound, this.f31543, this.f31537);
            this.f31540 = 0;
            this.f31542 = 0;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25518(PointF pointF) {
        this.f31543 = Math.round(pointF.x);
        int iRound = Math.round(pointF.y);
        this.f31537 = iRound;
        int i = this.f31542 + 1;
        this.f31542 = i;
        if (this.f31540 == i) {
            C11319.m28607(this.f31539, this.f31538, this.f31541, this.f31543, iRound);
            this.f31540 = 0;
            this.f31542 = 0;
        }
    }
}
