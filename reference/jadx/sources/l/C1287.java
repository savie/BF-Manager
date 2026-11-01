package l;

/* JADX INFO: renamed from: l.֨ᩳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: U7Z2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1287 implements InterfaceC4109 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f5536 = 1;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f5537 = 0;

    @Override // l.InterfaceC4109
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4615(long j) {
        this.f5536 = j & 65535;
        this.f5537 = (j >> 16) & 65535;
    }

    @Override // l.InterfaceC4109
    public final void reset() {
        this.f5536 = 1L;
        this.f5537 = 0L;
    }

    @Override // l.InterfaceC4109
    public final long getValue() {
        return (this.f5537 << 16) | this.f5536;
    }

    @Override // l.InterfaceC4109
    public final void update(byte[] bArr, int i, int i2) {
        if (i2 == 1) {
            long j = this.f5536 + ((long) (bArr[i] & 255));
            long j2 = this.f5537 + j;
            this.f5536 = j % 65521;
            this.f5537 = j2 % 65521;
            return;
        }
        int i3 = i2 / 5552;
        int i4 = i2 % 5552;
        while (true) {
            int i5 = i3 - 1;
            if (i3 <= 0) {
                break;
            }
            int i6 = 5552;
            while (true) {
                int i7 = i6 - 1;
                if (i6 > 0) {
                    long j3 = this.f5536 + ((long) (bArr[i] & 255));
                    this.f5536 = j3;
                    this.f5537 += j3;
                    i++;
                    i6 = i7;
                }
            }
            this.f5536 %= 65521;
            this.f5537 %= 65521;
            i3 = i5;
        }
        while (true) {
            int i8 = i4 - 1;
            if (i4 > 0) {
                long j4 = this.f5536 + ((long) (bArr[i] & 255));
                this.f5536 = j4;
                this.f5537 += j4;
                i++;
                i4 = i8;
            } else {
                this.f5536 %= 65521;
                this.f5537 %= 65521;
                return;
            }
        }
    }
}
