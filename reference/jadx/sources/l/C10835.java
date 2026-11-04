package l;

import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ۤۧ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 28II */
/* JADX INFO: loaded from: classes3.dex */
public final class C10835 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f34319;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f34320;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final byte[] f34321 = new byte[10];

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f34322;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f34323;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f34324;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f34325;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27561() {
        this.f34322 = false;
        this.f34320 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27562(InterfaceC19502 interfaceC19502) {
        if (this.f34322) {
            return;
        }
        int i = 0;
        byte[] bArr = this.f34321;
        interfaceC19502.mo10069(0, 10, bArr);
        interfaceC19502.mo10076();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b = bArr[7];
            if ((b & UTF8.S_ERR) == 186) {
                i = 40 << (7 & (bArr[((b & 255) == 187 ? 1 : 0) != 0 ? '\t' : '\b'] >> 4));
            }
        }
        if (i == 0) {
            return;
        }
        this.f34322 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27563(InterfaceC22024 interfaceC22024, long j, int i, int i2, int i3, C4870 c4870) {
        C20782.m47567("TrueHD chunk samples must be contiguous in the sample queue.", this.f34324 <= i2 + i3);
        if (this.f34322) {
            int i4 = this.f34320;
            int i5 = i4 + 1;
            this.f34320 = i5;
            if (i4 == 0) {
                this.f34323 = j;
                this.f34319 = i;
                this.f34325 = 0;
            }
            this.f34325 += i2;
            this.f34324 = i3;
            if (i5 >= 16) {
                m27564(interfaceC22024, c4870);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27564(InterfaceC22024 interfaceC22024, C4870 c4870) {
        if (this.f34320 > 0) {
            interfaceC22024.mo14383(this.f34323, this.f34319, this.f34325, this.f34324, c4870);
            this.f34320 = 0;
        }
    }
}
