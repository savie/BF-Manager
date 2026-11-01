package l;

/* JADX INFO: renamed from: l.ۖ᩷᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 37CJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C2786 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f10614;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f10615;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f10616;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f10617;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f10618;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f10619;

    public C2786(int i, int i2, int i3, int i4, int i5) {
        this.f10616 = i;
        this.f10617 = i2;
        this.f10614 = i3;
        this.f10615 = i4;
        this.f10618 = i5;
        this.f10619 = (i == -1 && i5 == -1) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2786 m8458(int i, int i2, int i3, int i4) {
        if (i2 != -1 && i2 < i) {
            i--;
        }
        int i5 = i;
        if (i4 != -1 && i4 < i3) {
            i3--;
        }
        int i6 = i3;
        return new C2786(i2, i5, i6, i5 == i6 ? i5 : -1, i4);
    }
}
