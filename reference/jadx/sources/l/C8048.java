package l;

/* JADX INFO: renamed from: l.۠۠۠, reason: contains not printable characters */
/* JADX INFO: compiled from: LA1Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C8048 implements InterfaceC7778 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f28189;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m21180() {
        return this.f28189;
    }

    @Override // l.InterfaceC7778
    /* JADX INFO: renamed from: ۙ */
    public final int mo1805(int i, int i2, byte[] bArr) {
        C4850.m13549(i, bArr);
        this.f28189 = C4850.m13549(i + 4, bArr);
        C4850.m13549(i + 8, bArr);
        C4850.m13549(i + 12, bArr);
        int i3 = i + 16;
        int i4 = i2 - 16;
        byte[] bArr2 = new byte[i4];
        if (i4 > 0) {
            System.arraycopy(bArr, i3, bArr2, 0, i4);
        }
        return i3 - i;
    }
}
