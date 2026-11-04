package l;

import com.alipay.sdk.m.y.l;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.۠۫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes4.dex */
public final class C8626 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f28189;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final List f28190;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f28191;

    public /* synthetic */ C8626(String str, List list, int i, int i2) {
        this(i, str, list);
    }

    public C8626(int i, String str, List list) {
        this.f28191 = str;
        this.f28190 = list;
        this.f28189 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8626)) {
            return false;
        }
        C8626 c8626 = (C8626) obj;
        return this.f28189 == c8626.f28189 && C17359.equals(this.f28191, c8626.f28191) && C17359.equals(this.f28190, c8626.f28190);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f28190) + C24966.m55771(this.f28189 * 31, 31, this.f28191);
    }

    public final String toString() {
        Object[] objArr = {this.f28191, this.f28190, Integer.valueOf(this.f28189)};
        String[] strArrSplit = "mediaIdentity;options;checkedIndex".length() == 0 ? new String[0] : "mediaIdentity;options;checkedIndex".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C8626.class, sb, "[");
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
    public final int m23255() {
        return this.f28189;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final List m23256() {
        return this.f28190;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m23257() {
        return this.f28191;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8626 m23254(String str) {
        return new C8626(-1, str, Collections.EMPTY_LIST);
    }
}
