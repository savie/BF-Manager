package l;

import bin.mt.json.JSON;
import com.alipay.sdk.m.y.l;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.۠ܶ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: P6V4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8258 extends AbstractC17535 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String f28710;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f28711;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f28712;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f28713;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f28714;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean f28715;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f28716;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f28717;

    public C8258(boolean z, int i, int i2, int i3, int i4, boolean z2, String str, String str2) {
        this.f28711 = str;
        this.f28710 = str2;
        this.f28715 = z;
        this.f28712 = z2;
        this.f28714 = i;
        this.f28716 = i2;
        this.f28713 = i3;
        this.f28717 = i4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8258)) {
            return false;
        }
        C8258 c8258 = (C8258) obj;
        return this.f28715 == c8258.f28715 && this.f28712 == c8258.f28712 && this.f28714 == c8258.f28714 && this.f28716 == c8258.f28716 && this.f28713 == c8258.f28713 && this.f28717 == c8258.f28717 && C13638.equals(this.f28711, c8258.f28711) && C13638.equals(this.f28710, c8258.f28710);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f28710) + C0589.m2789((((((((((((this.f28715 ? 1231 : 1237) * 31) + (this.f28712 ? 1231 : 1237)) * 31) + this.f28714) * 31) + this.f28716) * 31) + this.f28713) * 31) + this.f28717) * 31, 31, this.f28711);
    }

    public final String toString() {
        Object[] objArr = {this.f28711, this.f28710, Boolean.valueOf(this.f28715), Boolean.valueOf(this.f28712), Integer.valueOf(this.f28714), Integer.valueOf(this.f28716), Integer.valueOf(this.f28713), Integer.valueOf(this.f28717)};
        String[] strArrSplit = "encoding;pattern;regex;caseSensitive;contextBefore;contextAfter;limit;maxChars".length() == 0 ? new String[0] : "encoding;pattern;regex;caseSensitive;contextBefore;contextAfter;limit;maxChars".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C8258.class, sb, "[");
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

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String m21651() {
        return this.f28710;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m21652() {
        return this.f28713;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m21653() {
        return this.f28716;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m21655() {
        return this.f28714;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m21656() {
        return this.f28717;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m21654(String str) {
        return C22253.m49424(C22253.m49421().digest(JSON.object().add("encoding", str).add("pattern", this.f28710).add("regex", this.f28715).add("case", this.f28712).add("before", this.f28714).add("after", this.f28716).add("limit", this.f28713).add("chars", this.f28717).toString().getBytes(StandardCharsets.UTF_8)));
    }
}
