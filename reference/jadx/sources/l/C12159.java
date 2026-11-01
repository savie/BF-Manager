package l;

import org.bouncycastle.crypto.generators.Poly1305KeyGenerator;

/* JADX INFO: renamed from: l.۫ۘۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1SU */
/* JADX INFO: loaded from: classes4.dex */
public final class C12159 implements InterfaceC10748 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f40696;

    public C12159(int i) {
        this.f40696 = i;
    }

    @Override // l.InterfaceC10748
    /* JADX INFO: renamed from: ۙ */
    public final int mo1309(int i, int i2, byte[] bArr) {
        int i3 = (i2 + i) - 4;
        int i4 = i;
        while (i4 <= i3) {
            if ((bArr[i4] & Poly1305KeyGenerator.R_MASK_LOW_2) == 72 && (bArr[i4 + 3] & 3) == 1) {
                C2641.m8153(i4, ((C2641.m8149(i4, bArr) + (-((this.f40696 + i4) - i))) & 67108860) | 1207959553, bArr);
            }
            i4 += 4;
        }
        int i5 = i4 - i;
        this.f40696 += i5;
        return i5;
    }
}
