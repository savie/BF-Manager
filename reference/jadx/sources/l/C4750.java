package l;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۙܺ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: B749 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4750 implements InterfaceC6942 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f16700;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f16701;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9836 f16702;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long f16703;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f16704;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] f16705;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC6942 f16706;

    public C4750(InterfaceC6942 interfaceC6942, byte[] bArr, int i, long j, C9836 c9836) {
        this.f16706 = interfaceC6942;
        this.f16705 = bArr;
        this.f16701 = i;
        this.f16703 = j;
        this.f16702 = c9836;
    }

    @Override // l.InterfaceC6942
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        C9836 c9836 = this.f16702;
        c9836.m24943();
        if (i2 != 0) {
            int i3 = this.f16704;
            long j = this.f16703;
            int i4 = this.f16701;
            if (i3 != i4) {
                int iMin = Math.min(i2, i4 - i3);
                int i5 = this.f16706.read(bArr, i, iMin);
                if (i5 == -1) {
                    if (this.f16704 < j) {
                        throw new EOFException("MPEG-TS preview source ended before declared length");
                    }
                } else {
                    if (i5 < 0 || i5 > iMin) {
                        throw new IOException("MPEG-TS data source returned an invalid read result");
                    }
                    if (i5 != 0) {
                        this.f16700 = 0;
                        System.arraycopy(bArr, i, this.f16705, this.f16704, i5);
                        this.f16704 += i5;
                        c9836.m24943();
                        return i5;
                    }
                    int i6 = this.f16700 + 1;
                    this.f16700 = i6;
                    if (i6 >= 16) {
                        throw new IOException("MPEG-TS data source returned too many zero-byte reads");
                    }
                }
            } else if (i3 < j) {
                throw new C11807(C8479.m22141(i4, "MPEG-TS preview scan budget was exhausted: "));
            }
            return -1;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m13123() {
        return this.f16704;
    }
}
