package l;

import com.alipay.sdk.m.y.l;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩹ۧ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes.dex */
public final class C22245 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f72713;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f72714;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final List f72715;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f72716;

    public /* synthetic */ C22245(String str, String str2, List list, int i, int i2) {
        this(i, str, str2, list);
    }

    public C22245(int i, String str, String str2, List list) {
        this.f72716 = str;
        this.f72713 = str2;
        this.f72715 = list;
        this.f72714 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C22245)) {
            return false;
        }
        C22245 c22245 = (C22245) obj;
        return this.f72714 == c22245.f72714 && C13638.equals(this.f72716, c22245.f72716) && C13638.equals(this.f72713, c22245.f72713) && C13638.equals(this.f72715, c22245.f72715);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f72715) + C0589.m2789(C0589.m2789(this.f72714 * 31, 31, this.f72716), 31, this.f72713);
    }

    public final String toString() {
        Object[] objArr = {this.f72716, this.f72713, this.f72715, Integer.valueOf(this.f72714)};
        String[] strArrSplit = "mediaIdentity;playbackPositionKey;options;checkedIndex".length() == 0 ? new String[0] : "mediaIdentity;playbackPositionKey;options;checkedIndex".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C22245.class, sb, "[");
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
    public final List m49379() {
        return this.f72715;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m49380() {
        return this.f72714;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m49381() {
        return this.f72716;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String m49382() {
        return this.f72713;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22245 m49378(String str, String str2) {
        return new C22245(-1, str, str2, Collections.EMPTY_LIST);
    }
}
