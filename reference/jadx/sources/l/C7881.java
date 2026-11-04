package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.۟۫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes4.dex */
public final class C7881 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5929 f26219;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C1169 f26220;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final CharSequence f26221;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final EnumC19068 f26222;

    public C7881(EnumC19068 enumC19068, CharSequence charSequence, C1169 c1169, C5929 c5929) {
        this.f26222 = enumC19068;
        this.f26221 = charSequence;
        this.f26220 = c1169;
        this.f26219 = c5929;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7881)) {
            return false;
        }
        C7881 c7881 = (C7881) obj;
        return C17359.equals(this.f26222, c7881.f26222) && C17359.equals(this.f26221, c7881.f26221) && C17359.equals(this.f26220, c7881.f26220) && C17359.equals(this.f26219, c7881.f26219);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f26219) + ((C17359.hashCode(this.f26220) + ((C17359.hashCode(this.f26221) + (C17359.hashCode(this.f26222) * 31)) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f26222, this.f26221, this.f26220, this.f26219};
        String[] strArrSplit = "type;title;trackOption;subtitleMatch".length() == 0 ? new String[0] : "type;title;trackOption;subtitleMatch".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C7881.class, sb, "[");
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
    public final C5929 m21421() {
        return this.f26219;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C1169 m21422() {
        return this.f26220;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final EnumC19068 m21423() {
        return this.f26222;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final CharSequence m21424() {
        return this.f26221;
    }
}
