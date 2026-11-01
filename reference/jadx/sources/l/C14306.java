package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ܳۙ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: A70P */
/* JADX INFO: loaded from: classes4.dex */
public final class C14306 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C14306 f46870 = new C14306(null, null);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5838 f46871;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C5838 f46872;

    public /* synthetic */ C14306(C5838 c5838, C5838 c5839, int i) {
        this(c5838, c5839);
    }

    public C14306(C5838 c5838, C5838 c5839) {
        this.f46871 = c5838;
        this.f46872 = c5839;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C14306)) {
            return false;
        }
        C14306 c14306 = (C14306) obj;
        return C13638.equals(this.f46871, c14306.f46871) && C13638.equals(this.f46872, c14306.f46872);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f46872) + (C13638.hashCode(this.f46871) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f46871, this.f46872};
        String[] strArrSplit = "left;right".length() == 0 ? new String[0] : "left;right".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C14306.class, sb, "[");
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
}
