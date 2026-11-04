package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۤۘܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 71N5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10612 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f33696;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f33697;

    public C10612(int i, int i2) {
        this.f33696 = i;
        this.f33697 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C10612.class == obj.getClass()) {
            C10612 c10612 = (C10612) obj;
            if (this.f33696 == c10612.f33696 && this.f33697 == c10612.f33697) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f33696 * 31) + this.f33697;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        sb.append(this.f33696);
        sb.append(", ");
        return C12669.m31437(this.f33697, l.d, sb);
    }
}
