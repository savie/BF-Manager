package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۘ᩻᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 68N9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4519 extends AbstractC19435 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f16100;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final AbstractC19435[] f16101;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean f16102;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String[] f16103;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f16104;

    public C4519(String str, boolean z, boolean z2, String[] strArr, AbstractC19435[] abstractC19435Arr) {
        super("CTOC");
        this.f16100 = str;
        this.f16102 = z;
        this.f16104 = z2;
        this.f16103 = strArr;
        this.f16101 = abstractC19435Arr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4519.class == obj.getClass()) {
            C4519 c4519 = (C4519) obj;
            if (this.f16102 == c4519.f16102 && this.f16104 == c4519.f16104 && C17359.equals(this.f16100, c4519.f16100) && Arrays.equals(this.f16103, c4519.f16103) && Arrays.equals(this.f16101, c4519.f16101)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((((this.f16102 ? 1 : 0) + 527) * 31) + (this.f16104 ? 1 : 0)) * 31;
        String str = this.f16100;
        return i + (str != null ? str.hashCode() : 0);
    }
}
