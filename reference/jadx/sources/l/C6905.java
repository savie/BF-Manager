package l;

import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.ۜۙܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: FIQP */
/* JADX INFO: loaded from: classes3.dex */
public final class C6905 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final BooleanSupplier f22889;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final byte[][] f22890 = {new byte[16384], new byte[16384]};

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int[] f22891 = {-1, -1};

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f22892;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC22808 f22893;

    public C6905(InterfaceC22808 interfaceC22808, BooleanSupplier booleanSupplier) {
        this.f22893 = interfaceC22808;
        this.f22889 = booleanSupplier;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m19158(int i, int i2, byte[] bArr) {
        if (i2 <= 16384) {
            m19157(i, i2, bArr);
            return;
        }
        BooleanSupplier booleanSupplier = this.f22889;
        C13616.m33366(booleanSupplier);
        this.f22893.mo2790(i, bArr, 0, i2);
        C13616.m33366(booleanSupplier);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19157(int i, int i2, byte[] bArr) {
        int i3;
        int i4 = 0;
        while (i4 < i2) {
            C13616.m33366(this.f22889);
            int i5 = (i / 16384) * 16384;
            int[] iArr = this.f22891;
            if (iArr[0] == i5) {
                i3 = 0;
            } else {
                i3 = 1;
                if (iArr[1] != i5) {
                    i3 = -1;
                }
            }
            byte[][] bArr2 = this.f22890;
            if (i3 < 0) {
                i3 = this.f22892;
                this.f22892 = i3 ^ 1;
                byte[] bArr3 = bArr2[i3];
                InterfaceC22808 interfaceC22808 = this.f22893;
                interfaceC22808.mo2790(i5, bArr3, 0, Math.min(16384, interfaceC22808.length() - i5));
                iArr[i3] = i5;
            }
            int i6 = i - i5;
            int iMin = Math.min(i2 - i4, 16384 - i6);
            System.arraycopy(bArr2[i3], i6, bArr, i4, iMin);
            i += iMin;
            i4 += iMin;
        }
    }
}
