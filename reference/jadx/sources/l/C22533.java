package l;

import org.bouncycastle.crypto.generators.Poly1305KeyGenerator;

/* JADX INFO: renamed from: l.᩸ۗ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: R1SU */
/* JADX INFO: loaded from: classes.dex */
public final class C22533 implements InterfaceC12836 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f72879;

    public C22533(int i) {
        this.f72879 = i;
    }

    @Override // l.InterfaceC12836
    /* JADX INFO: renamed from: ۙ */
    public final int mo14458(int i, int i2, byte[] bArr) {
        int i3 = (i2 + i) - 4;
        int i4 = i;
        while (i4 <= i3) {
            if ((bArr[i4] & Poly1305KeyGenerator.R_MASK_LOW_2) == 72 && (bArr[i4 + 3] & 3) == 1) {
                C21338.m48565(i4, ((C21338.m48563(i4, bArr) + (-((this.f72879 + i4) - i))) & 67108860) | 1207959553, bArr);
            }
            i4 += 4;
        }
        int i5 = i4 - i;
        this.f72879 += i5;
        return i5;
    }
}
