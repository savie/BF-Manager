package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۧۢ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: M9Q4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11530 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f36276;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f36277 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m29032(InterfaceC17713 interfaceC17713) {
        if (this.f36276) {
            return false;
        }
        this.f36277.add(interfaceC17713);
        return true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized void m29033(InterfaceC17713 interfaceC17713) {
        this.f36277.remove(interfaceC17713);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29031() {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            if (this.f36276) {
                return;
            }
            this.f36276 = true;
            Iterator it = this.f36277.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC17713) it.next()).mo34028());
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                try {
                    ((InterfaceC15475) it2.next()).close();
                } catch (IOException unused) {
                }
            }
        }
    }
}
