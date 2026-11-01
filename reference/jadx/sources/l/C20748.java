package l;

/* JADX INFO: renamed from: l.᩷۠۠, reason: contains not printable characters */
/* JADX INFO: compiled from: M9VY */
/* JADX INFO: loaded from: classes5.dex */
public final class C20748 implements InterfaceC15810, InterfaceC20043 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int[] f67506;

    @Override // l.InterfaceC15810, l.InterfaceC20043
    /* JADX INFO: renamed from: ۙ */
    public final int mo1804() {
        return 2;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int[] m46750() {
        return this.f67506;
    }

    @Override // l.InterfaceC20478
    /* JADX INFO: renamed from: ۙ */
    public final int mo1806(int i, byte[] bArr) {
        int[] iArr = this.f67506;
        C4850.m13546(iArr != null ? iArr.length : 0L, i, bArr);
        int i2 = i + 2;
        int[] iArr2 = this.f67506;
        if (iArr2 != null) {
            for (int i3 : iArr2) {
                C4850.m13546(i3, i2, bArr);
                i2 += 2;
            }
        }
        return i2 - i;
    }

    @Override // l.InterfaceC7778
    /* JADX INFO: renamed from: ۙ */
    public final int mo1805(int i, int i2, byte[] bArr) {
        int iM13545 = C4850.m13545(i, bArr);
        int i3 = i + 2;
        this.f67506 = new int[iM13545];
        for (int i4 = 0; i4 < iM13545; i4++) {
            this.f67506[i4] = C4850.m13545(i3, bArr);
            i3 += 2;
        }
        return i3 - i;
    }

    @Override // l.InterfaceC20478
    public final int size() {
        int[] iArr = this.f67506;
        return (iArr != null ? iArr.length * 2 : 0) + 4;
    }
}
