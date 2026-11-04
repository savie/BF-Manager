package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۧۛ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: W79N */
/* JADX INFO: loaded from: classes3.dex */
public final class C11422 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f35920;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f35922 = new ArrayList();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayList f35921 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28776() {
        synchronized (C12168.f39132) {
            if (this.f35920) {
                return;
            }
            this.f35920 = true;
            ArrayList arrayList = new ArrayList(this.f35921);
            ArrayList arrayList2 = new ArrayList(this.f35922);
            this.f35921.clear();
            this.f35922.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C1728) it.next()).f5902 = false;
            }
            C12168.f39132.notifyAll();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C12168.m30428((C1728) it2.next());
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                C12168.m30430((C5457) it3.next());
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m28777() {
        boolean z;
        synchronized (C12168.f39132) {
            z = this.f35920;
        }
        return z;
    }
}
