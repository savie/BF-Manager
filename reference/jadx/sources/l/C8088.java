package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.۠ۢۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6PY */
/* JADX INFO: loaded from: classes3.dex */
public final class C8088 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12895 f28339;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List f28340;

    public C8088() {
        throw null;
    }

    public C8088(ArrayList arrayList, C12895 c12895) {
        this.f28340 = arrayList;
        this.f28339 = c12895;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8088)) {
            return false;
        }
        C8088 c8088 = (C8088) obj;
        return C13638.equals(this.f28340, c8088.f28340) && C13638.equals(this.f28339, c8088.f28339);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f28339) + (C13638.hashCode(this.f28340) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f28340, this.f28339};
        String[] strArrSplit = "tokens;root".length() == 0 ? new String[0] : "tokens;root".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C8088.class, sb, "[");
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
