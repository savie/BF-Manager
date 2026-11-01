package l;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.֨ۙۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: M8FO */
/* JADX INFO: loaded from: classes2.dex */
public final class C0888 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f3587;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f3588;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int[] f3589;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f3590;

    public C0888(C12884 c12884, String str, String str2, List list, String str3) {
        this.f3588 = c12884.m31942(str);
        this.f3590 = c12884.m31942(str2);
        this.f3589 = new int[list.size()];
        this.f3587 = c12884.m31942(str3);
        for (int i = 0; i < list.size(); i++) {
            this.f3589[i] = c12884.m31942(((CharSequence) list.get(i)).toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0888.class == obj.getClass()) {
            C0888 c0888 = (C0888) obj;
            if (this.f3588 == c0888.f3588 && this.f3590 == c0888.f3590 && this.f3587 == c0888.f3587 && Arrays.equals(this.f3589, c0888.f3589)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.f3589) + (((this.f3588 * 31) + this.f3590) * 31)) * 31) + this.f3587;
    }
}
