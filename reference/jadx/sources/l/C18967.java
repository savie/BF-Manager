package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ᩴ᩵ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98SV */
/* JADX INFO: loaded from: classes4.dex */
public final class C18967 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final byte[] f61414 = {0, 0, 1};

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f61415;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f61416;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f61417;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f61418;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f61419;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43668() {
        this.f61419 = false;
        this.f61418 = 0;
        this.f61415 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m43670(int i, int i2) {
        int i3 = this.f61415;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            throw new IllegalStateException();
                        }
                        if (i == 179 || i == 181) {
                            this.f61418 -= i2;
                            this.f61419 = false;
                            return true;
                        }
                    } else if ((i & 240) != 32) {
                        C0303.m1848("Unexpected start code value");
                        m43668();
                    } else {
                        this.f61417 = this.f61418;
                        this.f61415 = 4;
                    }
                } else if (i > 31) {
                    C0303.m1848("Unexpected start code value");
                    m43668();
                } else {
                    this.f61415 = 3;
                }
            } else if (i != 181) {
                C0303.m1848("Unexpected start code value");
                m43668();
            } else {
                this.f61415 = 2;
            }
        } else if (i == 176) {
            this.f61415 = 1;
            this.f61419 = true;
        }
        m43669(0, 3, f61414);
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43669(int i, int i2, byte[] bArr) {
        if (this.f61419) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f61416;
            int length = bArr2.length;
            int i4 = this.f61418 + i3;
            if (length < i4) {
                this.f61416 = Arrays.copyOf(bArr2, i4 * 2);
            }
            System.arraycopy(bArr, i, this.f61416, this.f61418, i3);
            this.f61418 += i3;
        }
    }
}
