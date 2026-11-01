package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩴۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: YB7L */
/* JADX INFO: loaded from: classes4.dex */
public final class C18457 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC3062 f58816;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f58817 = new ArrayList();

    public C18457(AbstractC3062 abstractC3062) {
        this.f58816 = abstractC3062;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42805(InterfaceC5657 interfaceC5657) {
        this.f58816.mo9171(interfaceC5657);
        this.f58817.add(interfaceC5657);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42804() {
        ArrayList arrayList = this.f58817;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f58816.mo9172((InterfaceC5657) it.next());
        }
        arrayList.clear();
    }
}
