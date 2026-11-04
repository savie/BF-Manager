package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩷᩵᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 98SV */
/* JADX INFO: loaded from: classes.dex */
public final class C22287 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final byte[] f72161 = {0, 0, 1};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f72162;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f72163;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f72164;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f72165;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f72166;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50349() {
        this.f72165 = false;
        this.f72163 = 0;
        this.f72166 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m50351(int i, int i2) {
        int i3 = this.f72166;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            throw new IllegalStateException();
                        }
                        if (i == 179 || i == 181) {
                            this.f72163 -= i2;
                            this.f72165 = false;
                            return true;
                        }
                    } else if ((i & 240) != 32) {
                        C1896.m6517("Unexpected start code value");
                        m50349();
                    } else {
                        this.f72164 = this.f72163;
                        this.f72166 = 4;
                    }
                } else if (i > 31) {
                    C1896.m6517("Unexpected start code value");
                    m50349();
                } else {
                    this.f72166 = 3;
                }
            } else if (i != 181) {
                C1896.m6517("Unexpected start code value");
                m50349();
            } else {
                this.f72166 = 2;
            }
        } else if (i == 176) {
            this.f72166 = 1;
            this.f72165 = true;
        }
        m50350(0, 3, f72161);
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50350(int i, int i2, byte[] bArr) {
        if (this.f72165) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f72162;
            int length = bArr2.length;
            int i4 = this.f72163 + i3;
            if (length < i4) {
                this.f72162 = Arrays.copyOf(bArr2, i4 * 2);
            }
            System.arraycopy(bArr, i, this.f72162, this.f72163, i3);
            this.f72163 += i3;
        }
    }
}
