package l;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩻ᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: V2DV */
/* JADX INFO: loaded from: classes.dex */
public final class C23868 extends AbstractC14696 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f77134 = new ArrayList();

    public C23868(AbstractC14696... abstractC14696Arr) {
        for (AbstractC14696 abstractC14696 : abstractC14696Arr) {
            if (abstractC14696 != null) {
                this.f77134.add(abstractC14696);
            }
        }
    }

    @Override // l.AbstractC14696
    /* JADX INFO: renamed from: ۙ */
    public final int mo4663(CharSequence charSequence, int i, StringWriter stringWriter) {
        Iterator it = this.f77134.iterator();
        while (it.hasNext()) {
            int iMo4663 = ((AbstractC14696) it.next()).mo4663(charSequence, i, stringWriter);
            if (iMo4663 != 0) {
                return iMo4663;
            }
        }
        return 0;
    }
}
