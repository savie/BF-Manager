package l;

import com.alipay.sdk.m.y.l;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۧ۫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes4.dex */
public final class C11609 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f36440;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final List f36441;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f36442;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f36443;

    public /* synthetic */ C11609(String str, String str2, List list, int i, int i2) {
        this(i, str, str2, list);
    }

    public C11609(int i, String str, String str2, List list) {
        this.f36442 = str;
        this.f36443 = str2;
        this.f36441 = list;
        this.f36440 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11609)) {
            return false;
        }
        C11609 c11609 = (C11609) obj;
        return this.f36440 == c11609.f36440 && C17359.equals(this.f36442, c11609.f36442) && C17359.equals(this.f36443, c11609.f36443) && C17359.equals(this.f36441, c11609.f36441);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f36441) + C24966.m55771(C24966.m55771(this.f36440 * 31, 31, this.f36442), 31, this.f36443);
    }

    public final String toString() {
        Object[] objArr = {this.f36442, this.f36443, this.f36441, Integer.valueOf(this.f36440)};
        String[] strArrSplit = "mediaIdentity;playbackPositionKey;options;checkedIndex".length() == 0 ? new String[0] : "mediaIdentity;playbackPositionKey;options;checkedIndex".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C11609.class, sb, "[");
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
    public final int m29167() {
        return this.f36440;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final List m29168() {
        return this.f36441;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m29169() {
        return this.f36443;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m29170() {
        return this.f36442;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11609 m29166(String str, String str2) {
        return new C11609(-1, str, str2, Collections.EMPTY_LIST);
    }
}
