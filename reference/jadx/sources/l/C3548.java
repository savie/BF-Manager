package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۗ᩺ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 68N9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3548 extends AbstractC22370 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean f13062;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f13063;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f13064;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String[] f13065;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC22370[] f13066;

    public C3548(String str, boolean z, boolean z2, String[] strArr, AbstractC22370[] abstractC22370Arr) {
        super("CTOC");
        this.f13064 = str;
        this.f13063 = z;
        this.f13062 = z2;
        this.f13065 = strArr;
        this.f13066 = abstractC22370Arr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3548.class == obj.getClass()) {
            C3548 c3548 = (C3548) obj;
            if (this.f13063 == c3548.f13063 && this.f13062 == c3548.f13062 && C13638.equals(this.f13064, c3548.f13064) && Arrays.equals(this.f13065, c3548.f13065) && Arrays.equals(this.f13066, c3548.f13066)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((((this.f13063 ? 1 : 0) + 527) * 31) + (this.f13062 ? 1 : 0)) * 31;
        String str = this.f13064;
        return i + (str != null ? str.hashCode() : 0);
    }
}
