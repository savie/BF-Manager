package l;

import android.graphics.Bitmap;
import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ᩳ֡ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 892H */
/* JADX INFO: loaded from: classes5.dex */
public final class C17692 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Bitmap f56187;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final CharSequence f56188;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f56189;

    public C17692(String str, CharSequence charSequence, Bitmap bitmap) {
        this.f56189 = str;
        this.f56188 = charSequence;
        this.f56187 = bitmap;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17692)) {
            return false;
        }
        C17692 c17692 = (C17692) obj;
        return C13638.equals(this.f56189, c17692.f56189) && C13638.equals(this.f56188, c17692.f56188) && C13638.equals(this.f56187, c17692.f56187);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f56187) + ((C13638.hashCode(this.f56188) + (C13638.hashCode(this.f56189) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f56189, this.f56188, this.f56187};
        String[] strArrSplit = "id;label;icon".length() == 0 ? new String[0] : "id;label;icon".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C17692.class, sb, "[");
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
    public final CharSequence m41223() {
        return this.f56188;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Bitmap m41224() {
        return this.f56187;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m41225() {
        return this.f56189;
    }
}
