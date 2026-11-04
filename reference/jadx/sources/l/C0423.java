package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.֡۫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes3.dex */
public final class C0423 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC17576 f1968;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C14902 f1969;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean f1970;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f1971;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final List f1972;

    public /* synthetic */ C0423(C14902 c14902, List list, boolean z, EnumC17576 enumC17576, String str, int i) {
        this(c14902, list, z, enumC17576, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0423)) {
            return false;
        }
        C0423 c0423 = (C0423) obj;
        return this.f1970 == c0423.f1970 && C17359.equals(this.f1969, c0423.f1969) && C17359.equals(this.f1972, c0423.f1972) && C17359.equals(this.f1968, c0423.f1968) && C17359.equals(this.f1971, c0423.f1971);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f1971) + ((C17359.hashCode(this.f1968) + ((C17359.hashCode(this.f1972) + ((C17359.hashCode(this.f1969) + ((this.f1970 ? 1231 : 1237) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f1969, this.f1972, Boolean.valueOf(this.f1970), this.f1968, this.f1971};
        String[] strArrSplit = "mediaItem;subtitleMatches;subtitleMatchesResolved;externalSubtitleMode;externalSubtitlePath".length() == 0 ? new String[0] : "mediaItem;subtitleMatches;subtitleMatchesResolved;externalSubtitleMode;externalSubtitlePath".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C0423.class, sb, "[");
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
    public final EnumC17576 m2226() {
        return this.f1968;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C14902 m2227() {
        return this.f1969;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m2228() {
        return this.f1970;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final List m2229() {
        return this.f1972;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m2230() {
        return this.f1971;
    }

    public C0423(C14902 c14902, List list, boolean z, EnumC17576 enumC17576, String str) {
        List listUnmodifiableList = C4681.unmodifiableList(new ArrayList(list));
        this.f1969 = c14902;
        this.f1972 = listUnmodifiableList;
        this.f1970 = z;
        this.f1968 = enumC17576;
        this.f1971 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0423 m2225(C14902 c14902, List list, boolean z) {
        return new C0423(c14902, list, z, EnumC17576.NONE, null);
    }
}
