package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۖ᩹ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes2.dex */
public final class C2819 extends AbstractC23282 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC23282 f10699;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final List f10700;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List f10701;

    public C2819(ArrayList arrayList, AbstractC23282 abstractC23282, ArrayList arrayList2) {
        this.f10700 = arrayList;
        this.f10699 = abstractC23282;
        this.f10701 = arrayList2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        AbstractC23282.m51359(sb, "<", this.f10700, ">");
        AbstractC23282 abstractC23282 = this.f10699;
        if (abstractC23282 != null) {
            sb.append(" extends ");
            sb.append(abstractC23282);
        }
        AbstractC23282.m51359(sb, " implements ", this.f10701, "");
        return sb.toString();
    }
}
