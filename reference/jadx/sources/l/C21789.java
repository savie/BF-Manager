package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩸᩵ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: R8JP */
/* JADX INFO: loaded from: classes4.dex */
public final class C21789 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final byte[] f70572 = {0, 0, 1};

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f70573;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f70574;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f70575;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f70576;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48548() {
        this.f70576 = false;
        this.f70575 = 0;
        this.f70573 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m48550(int i, int i2) {
        if (this.f70576) {
            int i3 = this.f70575 - i2;
            this.f70575 = i3;
            if (this.f70573 == 0 && i == 181) {
                this.f70573 = i3;
            } else {
                this.f70576 = false;
                return true;
            }
        } else if (i == 179) {
            this.f70576 = true;
        }
        m48549(0, 3, f70572);
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48549(int i, int i2, byte[] bArr) {
        if (this.f70576) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f70574;
            int length = bArr2.length;
            int i4 = this.f70575 + i3;
            if (length < i4) {
                this.f70574 = Arrays.copyOf(bArr2, i4 * 2);
            }
            System.arraycopy(bArr, i, this.f70574, this.f70575, i3);
            this.f70575 += i3;
        }
    }
}
