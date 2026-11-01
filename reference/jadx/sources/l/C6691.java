package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۜۤ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M9Q4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6691 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f22561;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f22562 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m18067(InterfaceC7739 interfaceC7739) {
        if (this.f22561) {
            return false;
        }
        this.f22562.add(interfaceC7739);
        return true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized void m18068(InterfaceC7739 interfaceC7739) {
        this.f22562.remove(interfaceC7739);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18066() {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            if (this.f22561) {
                return;
            }
            this.f22561 = true;
            Iterator it = this.f22562.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC7739) it.next()).mo4866());
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                try {
                    ((InterfaceC21850) it2.next()).close();
                } catch (IOException unused) {
                }
            }
        }
    }
}
