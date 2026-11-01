package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۘۜ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: W79N */
/* JADX INFO: loaded from: classes2.dex */
public final class C3764 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f13623;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f13625 = new ArrayList();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ArrayList f13624 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11008() {
        synchronized (C19288.f62249) {
            if (this.f13623) {
                return;
            }
            this.f13623 = true;
            ArrayList arrayList = new ArrayList(this.f13624);
            ArrayList arrayList2 = new ArrayList(this.f13625);
            this.f13624.clear();
            this.f13625.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C12938) it.next()).f43005 = false;
            }
            C19288.f62249.notifyAll();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C19288.m44274((C12938) it2.next());
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                C19288.m44276((C0942) it3.next());
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m11009() {
        boolean z;
        synchronized (C19288.f62249) {
            z = this.f13623;
        }
        return z;
    }
}
