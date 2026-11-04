package l;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩹ۘۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: V2DV */
/* JADX INFO: loaded from: classes.dex */
public final class C23290 extends AbstractC3152 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f75451;

    public C23290(AbstractC3152... abstractC3152Arr) {
        ArrayList arrayList = new ArrayList();
        this.f75451 = arrayList;
        C23654.of((Object[]) abstractC3152Arr).filter(new C19060(4)).forEach(new C18755(1, arrayList));
    }

    @Override // l.AbstractC3152
    /* JADX INFO: renamed from: ۙ */
    public final int mo3683(CharSequence charSequence, int i, StringWriter stringWriter) {
        Iterator it = this.f75451.iterator();
        while (it.hasNext()) {
            int iMo3683 = ((AbstractC3152) it.next()).mo3683(charSequence, i, stringWriter);
            if (iMo3683 != 0) {
                return iMo3683;
            }
        }
        return 0;
    }
}
