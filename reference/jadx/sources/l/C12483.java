package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۨܺ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes4.dex */
public final class C12483 extends AbstractC4280 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC4280 f40082;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f40083;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List f40084;

    public C12483(String str, AbstractC4280 abstractC4280, ArrayList arrayList) {
        this.f40083 = str;
        this.f40082 = abstractC4280;
        this.f40084 = arrayList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f40083);
        String str = " extends ";
        AbstractC4280 abstractC4280 = this.f40082;
        if (abstractC4280 != null) {
            sb.append(" extends ");
            sb.append(abstractC4280);
            str = " & ";
        }
        List<AbstractC4280> list = this.f40084;
        if (list != null) {
            for (AbstractC4280 abstractC4281 : list) {
                sb.append(str);
                sb.append(abstractC4281);
                str = " & ";
            }
        }
        return sb.toString();
    }
}
