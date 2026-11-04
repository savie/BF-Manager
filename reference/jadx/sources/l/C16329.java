package l;

import bin.mt.json.JSON;
import com.alipay.sdk.m.y.l;
import java.nio.charset.StandardCharsets;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ܶ᩶ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6V4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16329 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f53005;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f53006;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f53007;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String f53008;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f53009;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f53010;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f53011;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f53012;

    public C16329(String str, String str2, boolean z, boolean z2, int i, int i2, int i3, int i4) {
        this.f53012 = str;
        this.f53008 = str2;
        this.f53006 = z;
        this.f53005 = z2;
        this.f53007 = i;
        this.f53011 = i2;
        this.f53010 = i3;
        this.f53009 = i4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16329)) {
            return false;
        }
        C16329 c16329 = (C16329) obj;
        return this.f53006 == c16329.f53006 && this.f53005 == c16329.f53005 && this.f53007 == c16329.f53007 && this.f53011 == c16329.f53011 && this.f53010 == c16329.f53010 && this.f53009 == c16329.f53009 && C17359.equals(this.f53012, c16329.f53012) && C17359.equals(this.f53008, c16329.f53008);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f53008) + C24966.m55771((((((((((((this.f53006 ? 1231 : 1237) * 31) + (this.f53005 ? 1231 : 1237)) * 31) + this.f53007) * 31) + this.f53011) * 31) + this.f53010) * 31) + this.f53009) * 31, 31, this.f53012);
    }

    public final String toString() {
        Object[] objArr = {this.f53012, this.f53008, Boolean.valueOf(this.f53006), Boolean.valueOf(this.f53005), Integer.valueOf(this.f53007), Integer.valueOf(this.f53011), Integer.valueOf(this.f53010), Integer.valueOf(this.f53009)};
        String[] strArrSplit = "encoding;pattern;regex;caseSensitive;contextBefore;contextAfter;limit;maxChars".length() == 0 ? new String[0] : "encoding;pattern;regex;caseSensitive;contextBefore;contextAfter;limit;maxChars".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C16329.class, sb, "[");
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
    public final int m38755() {
        return this.f53011;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m38757() {
        return this.f53010;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String m38758() {
        return this.f53008;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m38759() {
        return this.f53009;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m38760() {
        return this.f53007;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m38756(String str) {
        return C15022.m36182(C15022.m36179().digest(JSON.object().add("encoding", str).add("pattern", this.f53008).add("regex", this.f53006).add("case", this.f53005).add("before", this.f53007).add("after", this.f53011).add("limit", this.f53010).add("chars", this.f53009).toString().getBytes(StandardCharsets.UTF_8)));
    }
}
