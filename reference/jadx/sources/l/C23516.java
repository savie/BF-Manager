package l;

/* JADX INFO: renamed from: l.᩹ۧ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: E8NW */
/* JADX INFO: loaded from: classes.dex */
public final class C23516 implements InterfaceC11581 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f75997;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f75998;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f75999;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f76000;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f76001;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f76002;

    @Override // l.InterfaceC11581
    public final int getType() {
        return 1752331379;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23516 m52697(C21287 c21287) {
        int iM48483 = c21287.m48483();
        c21287.m48503(12);
        c21287.m48483();
        int iM48484 = c21287.m48483();
        int iM48485 = c21287.m48483();
        c21287.m48503(4);
        int iM48486 = c21287.m48483();
        int iM48487 = c21287.m48483();
        c21287.m48503(4);
        return new C23516(iM48483, iM48484, iM48485, iM48486, iM48487, c21287.m48483());
    }

    public C23516(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f76000 = i;
        this.f76002 = i2;
        this.f76001 = i3;
        this.f75997 = i4;
        this.f75999 = i5;
        this.f75998 = i6;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m52698() {
        int i = this.f76000;
        if (i == 1935960438) {
            return 2;
        }
        if (i == 1935963489) {
            return 1;
        }
        if (i == 1937012852) {
            return 3;
        }
        C1896.m6517("Found unsupported streamType fourCC: " + Integer.toHexString(i));
        return -1;
    }
}
