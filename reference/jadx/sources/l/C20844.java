package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩵᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: YB7L */
/* JADX INFO: loaded from: classes5.dex */
public final class C20844 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC8585 f66736;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f66737 = new ArrayList();

    public C20844(AbstractC8585 abstractC8585) {
        this.f66736 = abstractC8585;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47663(InterfaceC5252 interfaceC5252) {
        this.f66736.mo23077(interfaceC5252);
        this.f66737.add(interfaceC5252);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47662() {
        ArrayList arrayList = this.f66737;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f66736.mo23078((InterfaceC5252) it.next());
        }
        arrayList.clear();
    }
}
