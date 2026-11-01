package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.֫۠ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28U3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1693 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean[] f6701;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f6702;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int[] f6703;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C17216 f6704;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f6705;

    public C1693(C17216 c17216, boolean z, int[] iArr, boolean[] zArr) {
        int i = c17216.f54864;
        this.f6705 = i;
        boolean z2 = false;
        C2023.m6507(i == iArr.length && i == zArr.length);
        this.f6704 = c17216;
        if (z && i > 1) {
            z2 = true;
        }
        this.f6702 = z2;
        this.f6703 = (int[]) iArr.clone();
        this.f6701 = (boolean[]) zArr.clone();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17216 m5615() {
        return this.f6704;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7648 m5614(int i) {
        return this.f6704.m40159(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m5616(int i, boolean z) {
        int i2 = this.f6703[i];
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m5617() {
        for (boolean z : this.f6701) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m5613() {
        for (int i = 0; i < this.f6703.length; i++) {
            if (m5616(i, false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m5619(int i) {
        return this.f6701[i];
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m5618() {
        return this.f6704.f54866;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1693.class == obj.getClass()) {
            C1693 c1693 = (C1693) obj;
            if (this.f6702 == c1693.f6702 && this.f6704.equals(c1693.f6704) && Arrays.equals(this.f6703, c1693.f6703) && Arrays.equals(this.f6701, c1693.f6701)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f6701) + ((Arrays.hashCode(this.f6703) + (((this.f6704.hashCode() * 31) + (this.f6702 ? 1 : 0)) * 31)) * 31);
    }

    static {
        C17983.m41806(0);
        C17983.m41806(1);
        C17983.m41806(3);
        C17983.m41806(4);
    }
}
