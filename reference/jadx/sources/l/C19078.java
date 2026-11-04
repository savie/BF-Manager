package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ᩳ۫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 970R */
/* JADX INFO: loaded from: classes5.dex */
public final class C19078 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10127 f61791;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f61792;

    public C19078(C10127 c10127, boolean z) {
        this.f61791 = c10127;
        this.f61792 = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C19078)) {
            return false;
        }
        C19078 c19078 = (C19078) obj;
        return this.f61792 == c19078.f61792 && C17359.equals(this.f61791, c19078.f61791);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f61791) + ((this.f61792 ? 1231 : 1237) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f61791, Boolean.valueOf(this.f61792)};
        String[] strArrSplit = "patches;removedPatternIdentity".length() == 0 ? new String[0] : "patches;removedPatternIdentity".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C19078.class, sb, "[");
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
    public final C10127 m44191() {
        return this.f61791;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m44192() {
        return this.f61792;
    }
}
