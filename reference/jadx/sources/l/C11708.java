package l;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۧܶܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAR3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11708 extends AbstractC15437 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f37882;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C25135 f37883;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f37884;

    public C11708(C25135 c25135, long j) {
        this.f37883 = c25135;
        this.f37882 = j;
    }

    @Override // l.AbstractC15437
    /* JADX INFO: renamed from: ۤ */
    public final EnumC16929 mo6928() {
        return this.f37884 < this.f37882 ? EnumC16929.STORED : EnumC16929.INITIAL;
    }

    @Override // l.AbstractC15437
    /* JADX INFO: renamed from: ۙ */
    public final int mo6927(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4 = 0;
        if (i2 == 0) {
            return 0;
        }
        int iMin = (int) Math.min(this.f37882 - this.f37884, i2);
        while (i4 < iMin) {
            C25135 c25135 = this.f37883;
            if (c25135.f81270.m44535() > 0) {
                byte bM56032 = (byte) C25135.m56032(c25135, 8);
                c25135.f81273.m32709(bM56032);
                bArr[i + i4] = bM56032;
                i3 = 1;
            } else {
                int i5 = i + i4;
                int i6 = c25135.f81274.read(bArr, i5, iMin - i4);
                if (i6 == -1) {
                    throw new EOFException("Truncated Deflate64 Stream");
                }
                C13200 c13200 = c25135.f81273;
                for (int i7 = i5; i7 < i5 + i6; i7++) {
                    c13200.m32709(bArr[i7]);
                }
                i3 = i6;
            }
            this.f37884 += (long) i3;
            i4 += i3;
        }
        return iMin;
    }

    @Override // l.AbstractC15437
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo6929() {
        return this.f37884 < this.f37882;
    }

    @Override // l.AbstractC15437
    /* JADX INFO: renamed from: ۙ */
    public final int mo6926() {
        return (int) Math.min(this.f37882 - this.f37884, this.f37883.f81270.m44536() / 8);
    }
}
