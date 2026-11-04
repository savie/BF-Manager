package l;

/* JADX INFO: renamed from: l.ܳۡܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37CJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C15238 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f49716;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f49717;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f49718;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f49719;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f49720;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f49721;

    public C15238(int i, int i2, int i3, int i4, int i5) {
        this.f49719 = i;
        this.f49717 = i2;
        this.f49721 = i3;
        this.f49716 = i4;
        this.f49720 = i5;
        this.f49718 = (i == -1 && i5 == -1) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15238 m36580(int i, int i2, int i3, int i4) {
        if (i2 != -1 && i2 < i) {
            i--;
        }
        int i5 = i;
        if (i4 != -1 && i4 < i3) {
            i3--;
        }
        int i6 = i3;
        return new C15238(i2, i5, i6, i5 == i6 ? i5 : -1, i4);
    }
}
