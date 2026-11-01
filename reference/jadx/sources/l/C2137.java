package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.֫᩺ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8R9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2137 extends AbstractC22370 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] f7806;

    public C2137(String str, byte[] bArr) {
        super(str);
        this.f7806 = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2137.class == obj.getClass()) {
            C2137 c2137 = (C2137) obj;
            if (this.f73049.equals(c2137.f73049) && Arrays.equals(this.f7806, c2137.f7806)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f7806) + C13958.m33812(527, 31, this.f73049);
    }
}
