package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.۬ۗ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: R8JP */
/* JADX INFO: loaded from: classes4.dex */
public final class C13578 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final byte[] f43125 = {0, 0, 1};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f43126;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f43127;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f43128;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f43129;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33285() {
        this.f43128 = false;
        this.f43127 = 0;
        this.f43129 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m33287(int i, int i2) {
        if (this.f43128) {
            int i3 = this.f43127 - i2;
            this.f43127 = i3;
            if (this.f43129 == 0 && i == 181) {
                this.f43129 = i3;
            } else {
                this.f43128 = false;
                return true;
            }
        } else if (i == 179) {
            this.f43128 = true;
        }
        m33286(0, 3, f43125);
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33286(int i, int i2, byte[] bArr) {
        if (this.f43128) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f43126;
            int length = bArr2.length;
            int i4 = this.f43127 + i3;
            if (length < i4) {
                this.f43126 = Arrays.copyOf(bArr2, i4 * 2);
            }
            System.arraycopy(bArr, i, this.f43126, this.f43127, i3);
            this.f43127 += i3;
        }
    }
}
