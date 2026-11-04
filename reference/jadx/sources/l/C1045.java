package l;

import java.util.LinkedList;

/* JADX INFO: renamed from: l.֨۠ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5SH */
/* JADX INFO: loaded from: classes2.dex */
public final class C1045 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9247 f3767;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f3768;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C1045 f3769;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f3770;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C1045 f3771;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public LinkedList f3766 = new LinkedList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f3765 = -1;

    public C1045(C9247 c9247, int i, int i2) {
        this.f3767 = c9247;
        this.f3769 = null;
        this.f3771 = null;
        this.f3768 = i;
        this.f3770 = i2;
        this.f3769 = null;
        this.f3771 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3947(C1045 c1045) {
        C1045 c1046 = this.f3769;
        c1046.f3771 = c1045;
        c1045.f3769 = c1046;
        this.f3769 = c1045;
        c1045.f3771 = this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1045 m3946(int i) {
        C1045 c1045 = new C1045(this.f3767, i, this.f3770);
        c1045.f3765 = this.f3765;
        c1045.f3766.addAll(this.f3766);
        C1045 c1046 = this.f3771;
        c1046.f3769 = c1045;
        c1045.f3771 = c1046;
        this.f3771 = c1045;
        c1045.f3769 = this;
        this.f3770 = i;
        return c1045;
    }
}
