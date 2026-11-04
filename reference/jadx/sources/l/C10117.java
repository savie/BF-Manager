package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۢ۫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes4.dex */
public final class C10117 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List f32386;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f32387;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f32388;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f32389;

    public /* synthetic */ C10117(int i, String str, String str2, ArrayList arrayList) {
        this(i, str, str2, (List) arrayList);
    }

    public C10117(int i, String str, String str2, List list) {
        this.f32387 = str;
        this.f32389 = str2;
        this.f32386 = list;
        this.f32388 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10117)) {
            return false;
        }
        C10117 c10117 = (C10117) obj;
        return this.f32388 == c10117.f32388 && C17359.equals(this.f32387, c10117.f32387) && C17359.equals(this.f32389, c10117.f32389) && C17359.equals(this.f32386, c10117.f32386);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f32386) + C24966.m55771(C24966.m55771(this.f32388 * 31, 31, this.f32387), 31, this.f32389);
    }

    public final String toString() {
        Object[] objArr = {this.f32387, this.f32389, this.f32386, Integer.valueOf(this.f32388)};
        String[] strArrSplit = "mediaIdentity;playbackPositionKey;actions;checkedIndex".length() == 0 ? new String[0] : "mediaIdentity;playbackPositionKey;actions;checkedIndex".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C10117.class, sb, "[");
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
    public final List m26074() {
        return this.f32386;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m26075() {
        return this.f32387;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m26076() {
        return this.f32389;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m26077() {
        return this.f32388;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10117 m26073(String str, String str2) {
        return new C10117(-1, str, str2, Collections.EMPTY_LIST);
    }
}
