package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۛ᩻᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8R9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6757 extends AbstractC19435 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte[] f22558;

    public C6757(String str, byte[] bArr) {
        super(str);
        this.f22558 = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C6757.class == obj.getClass()) {
            C6757 c6757 = (C6757) obj;
            if (this.f62806.equals(c6757.f62806) && Arrays.equals(this.f22558, c6757.f22558)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f22558) + C12351.m30817(527, 31, this.f62806);
    }
}
