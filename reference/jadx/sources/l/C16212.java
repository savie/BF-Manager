package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܶܺ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes5.dex */
public final class C16212 extends AbstractC4280 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC4280 f52693;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final List f52694;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List f52695;

    public C16212(ArrayList arrayList, AbstractC4280 abstractC4280, ArrayList arrayList2) {
        this.f52694 = arrayList;
        this.f52693 = abstractC4280;
        this.f52695 = arrayList2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        AbstractC4280.m13642(sb, "<", this.f52694, ">");
        AbstractC4280 abstractC4280 = this.f52693;
        if (abstractC4280 != null) {
            sb.append(" extends ");
            sb.append(abstractC4280);
        }
        AbstractC4280.m13642(sb, " implements ", this.f52695, "");
        return sb.toString();
    }
}
