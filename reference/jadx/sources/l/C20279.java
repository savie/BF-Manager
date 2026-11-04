package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩵ۗۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28U3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20279 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f65098;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C16549 f65099;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int[] f65100;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f65101;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean[] f65102;

    public C20279(C16549 c16549, boolean z, int[] iArr, boolean[] zArr) {
        int i = c16549.f53567;
        this.f65101 = i;
        boolean z2 = false;
        C20782.m47565(i == iArr.length && i == zArr.length);
        this.f65099 = c16549;
        if (z && i > 1) {
            z2 = true;
        }
        this.f65098 = z2;
        this.f65100 = (int[]) iArr.clone();
        this.f65102 = (boolean[]) zArr.clone();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16549 m46540() {
        return this.f65099;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15648 m46539(int i) {
        return this.f65099.m39194(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m46541(int i, boolean z) {
        int i2 = this.f65100[i];
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m46542() {
        for (boolean z : this.f65102) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m46545() {
        for (int i = 0; i < this.f65100.length; i++) {
            if (m46541(i, false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m46544(int i) {
        return this.f65102[i];
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m46543() {
        return this.f65099.f53565;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C20279.class == obj.getClass()) {
            C20279 c20279 = (C20279) obj;
            if (this.f65098 == c20279.f65098 && this.f65099.equals(c20279.f65099) && Arrays.equals(this.f65100, c20279.f65100) && Arrays.equals(this.f65102, c20279.f65102)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f65102) + ((Arrays.hashCode(this.f65100) + (((this.f65099.hashCode() * 31) + (this.f65098 ? 1 : 0)) * 31)) * 31);
    }

    static {
        C7116.m19499(0);
        C7116.m19499(1);
        C7116.m19499(3);
        C7116.m19499(4);
    }
}
