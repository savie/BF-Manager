package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.֡ۧ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes2.dex */
public final class C0372 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f1843;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List f1844;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f1845;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f1846;

    public /* synthetic */ C0372(int i, String str, String str2, ArrayList arrayList) {
        this(i, str, str2, (List) arrayList);
    }

    public C0372(int i, String str, String str2, List list) {
        this.f1845 = str;
        this.f1843 = str2;
        this.f1844 = list;
        this.f1846 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0372)) {
            return false;
        }
        C0372 c0372 = (C0372) obj;
        return this.f1846 == c0372.f1846 && C13638.equals(this.f1845, c0372.f1845) && C13638.equals(this.f1843, c0372.f1843) && C13638.equals(this.f1844, c0372.f1844);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f1844) + C0589.m2789(C0589.m2789(this.f1846 * 31, 31, this.f1845), 31, this.f1843);
    }

    public final String toString() {
        Object[] objArr = {this.f1845, this.f1843, this.f1844, Integer.valueOf(this.f1846)};
        String[] strArrSplit = "mediaIdentity;playbackPositionKey;actions;checkedIndex".length() == 0 ? new String[0] : "mediaIdentity;playbackPositionKey;actions;checkedIndex".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C0372.class, sb, "[");
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

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m2101() {
        return this.f1845;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m2102() {
        return this.f1844;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m2103() {
        return this.f1846;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String m2104() {
        return this.f1843;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0372 m2100(String str, String str2) {
        return new C0372(-1, str, str2, Collections.EMPTY_LIST);
    }
}
