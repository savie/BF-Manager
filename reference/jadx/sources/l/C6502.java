package l;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۜۗ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: OAR3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6502 extends AbstractC22025 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f21914;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22731 f21915;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f21916;

    public C6502(C22731 c22731, long j) {
        this.f21915 = c22731;
        this.f21914 = j;
    }

    @Override // l.AbstractC22025
    /* JADX INFO: renamed from: ۨ */
    public final EnumC14970 mo10851() {
        return this.f21916 < this.f21914 ? EnumC14970.STORED : EnumC14970.INITIAL;
    }

    @Override // l.AbstractC22025
    /* JADX INFO: renamed from: ۙ */
    public final int mo10850(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4 = 0;
        if (i2 == 0) {
            return 0;
        }
        int iMin = (int) Math.min(this.f21914 - this.f21916, i2);
        while (i4 < iMin) {
            C22731 c22731 = this.f21915;
            if (c22731.f74056.m40233() > 0) {
                byte bM50395 = (byte) C22731.m50395(c22731, 8);
                c22731.f74053.m3468(bM50395);
                bArr[i + i4] = bM50395;
                i3 = 1;
            } else {
                int i5 = i + i4;
                int i6 = c22731.f74057.read(bArr, i5, iMin - i4);
                if (i6 == -1) {
                    throw new EOFException("Truncated Deflate64 Stream");
                }
                C0857 c0857 = c22731.f74053;
                for (int i7 = i5; i7 < i5 + i6; i7++) {
                    c0857.m3468(bArr[i7]);
                }
                i3 = i6;
            }
            this.f21916 += (long) i3;
            i4 += i3;
        }
        return iMin;
    }

    @Override // l.AbstractC22025
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo10852() {
        return this.f21916 < this.f21914;
    }

    @Override // l.AbstractC22025
    /* JADX INFO: renamed from: ۙ */
    public final int mo10849() {
        return (int) Math.min(this.f21914 - this.f21916, this.f21915.f74056.m40236() / 8);
    }
}
