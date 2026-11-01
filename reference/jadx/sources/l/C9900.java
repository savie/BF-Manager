package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۢ᩺ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: M8II */
/* JADX INFO: loaded from: classes4.dex */
public final class C9900 extends AbstractC22370 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final AbstractC22370[] f33829;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f33830;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long f33831;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f33832;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f33833;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f33834;

    public C9900(String str, int i, int i2, long j, long j2, AbstractC22370[] abstractC22370Arr) {
        super("CHAP");
        this.f33833 = str;
        this.f33834 = i;
        this.f33830 = i2;
        this.f33831 = j;
        this.f33832 = j2;
        this.f33829 = abstractC22370Arr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C9900.class == obj.getClass()) {
            C9900 c9900 = (C9900) obj;
            if (this.f33834 == c9900.f33834 && this.f33830 == c9900.f33830 && this.f33831 == c9900.f33831 && this.f33832 == c9900.f33832 && C13638.equals(this.f33833, c9900.f33833) && Arrays.equals(this.f33829, c9900.f33829)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((((((this.f33834 + 527) * 31) + this.f33830) * 31) + ((int) this.f33831)) * 31) + ((int) this.f33832)) * 31;
        String str = this.f33833;
        return i + (str != null ? str.hashCode() : 0);
    }
}
