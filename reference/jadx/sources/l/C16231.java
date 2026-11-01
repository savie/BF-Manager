package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ܺ᩹ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 71N5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16231 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f52359;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f52360;

    public C16231(int i, int i2) {
        this.f52359 = i;
        this.f52360 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C16231.class == obj.getClass()) {
            C16231 c16231 = (C16231) obj;
            if (this.f52359 == c16231.f52359 && this.f52360 == c16231.f52360) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f52359 * 31) + this.f52360;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        sb.append(this.f52359);
        sb.append(", ");
        return C12441.m30911(this.f52360, l.d, sb);
    }
}
