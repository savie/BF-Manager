package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۢ۫۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 778V */
/* JADX INFO: loaded from: classes3.dex */
public final class C9587 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float f32325;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final float f32326;

    public final int hashCode() {
        return Float.floatToIntBits(this.f32325) + (Float.floatToIntBits(this.f32326) * 31);
    }

    public C9587(float f, float f2) {
        this.f32326 = f;
        this.f32325 = f2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9587)) {
            return false;
        }
        C9587 c9587 = (C9587) obj;
        return this.f32326 == c9587.f32326 && this.f32325 == c9587.f32325;
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f32326), Float.valueOf(this.f32325)};
        String[] strArrSplit = "width;height".length() == 0 ? new String[0] : "width;height".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C9587.class, sb, "[");
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
    public final float m24460() {
        return this.f32326 / this.f32325;
    }
}
