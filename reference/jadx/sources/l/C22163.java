package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩹۠۬, reason: contains not printable characters */
/* JADX INFO: compiled from: W6LP */
/* JADX INFO: loaded from: classes.dex */
public final class C22163 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f72489;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f72490;

    public C22163() {
        throw null;
    }

    public C22163(ArrayList arrayList, ArrayList arrayList2) {
        this.f72489 = arrayList;
        this.f72490 = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C22163)) {
            return false;
        }
        C22163 c22163 = (C22163) obj;
        return C13638.equals(this.f72489, c22163.f72489) && C13638.equals(this.f72490, c22163.f72490);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f72490) + (C13638.hashCode(this.f72489) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f72489, this.f72490};
        String[] strArrSplit = "directories;files".length() == 0 ? new String[0] : "directories;files".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C22163.class, sb, "[");
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
