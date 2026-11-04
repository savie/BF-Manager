package l;

import android.net.Uri;
import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.֨ۖۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: K74T */
/* JADX INFO: loaded from: classes3.dex */
public final class C0867 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f3244;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f3245;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f3246;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Uri f3247;

    public C0867(Uri uri, String str, long j, long j2) {
        this.f3247 = uri;
        this.f3244 = str;
        this.f3245 = j;
        this.f3246 = j2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0867)) {
            return false;
        }
        C0867 c0867 = (C0867) obj;
        return this.f3245 == c0867.f3245 && this.f3246 == c0867.f3246 && C17359.equals(this.f3247, c0867.f3247) && C17359.equals(this.f3244, c0867.f3244);
    }

    public final int hashCode() {
        long j = this.f3245;
        long j2 = this.f3246;
        return C17359.hashCode(this.f3244) + ((C17359.hashCode(this.f3247) + (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f3247, this.f3244, Long.valueOf(this.f3245), Long.valueOf(this.f3246)};
        String[] strArrSplit = "uri;cacheKey;offset;length".length() == 0 ? new String[0] : "uri;cacheKey;offset;length".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C0867.class, sb, "[");
        for (int i = 0; i < strArrSplit.length; i++) {
            sb.append(strArrSplit[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != strArrSplit.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8889 m3535(InterfaceC15670 interfaceC15670) {
        return new C8889(this.f3245, this.f3246, this.f3247, interfaceC15670, this.f3244);
    }
}
