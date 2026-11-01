package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.۬᩹ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes4.dex */
public final class C13404 extends AbstractC23282 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC23282 f44365;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f44366;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List f44367;

    public C13404(String str, AbstractC23282 abstractC23282, ArrayList arrayList) {
        this.f44366 = str;
        this.f44365 = abstractC23282;
        this.f44367 = arrayList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f44366);
        String str = " extends ";
        AbstractC23282 abstractC23282 = this.f44365;
        if (abstractC23282 != null) {
            sb.append(" extends ");
            sb.append(abstractC23282);
            str = " & ";
        }
        List<AbstractC23282> list = this.f44367;
        if (list != null) {
            for (AbstractC23282 abstractC23283 : list) {
                sb.append(str);
                sb.append(abstractC23283);
                str = " & ";
            }
        }
        return sb.toString();
    }
}
