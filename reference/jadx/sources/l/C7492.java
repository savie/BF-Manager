package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.۟۬ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: QBEG */
/* JADX INFO: loaded from: classes4.dex */
public final class C7492 extends AbstractC5106 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final TreeMap f24947;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized void m19995(C16022 c16022) {
        try {
            if (c16022 == null) {
                throw new NullPointerException("methodHandle == null");
            }
            m52249();
            if (((C10315) this.f24947.get(c16022)) == null) {
                this.f24947.put(c16022, new C10315(c16022));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC15254 m19994(AbstractC9901 abstractC9901) {
        if (abstractC9901 == null) {
            throw new NullPointerException("cst == null");
        }
        m52243();
        AbstractC15254 abstractC15254 = (AbstractC15254) this.f24947.get((C16022) abstractC9901);
        if (abstractC15254 != null) {
            return abstractC15254;
        }
        throw new IllegalArgumentException("not found");
    }

    public C7492(C4669 c4669) {
        super("method_handles", c4669, 8);
        this.f24947 = new TreeMap();
    }

    @Override // l.AbstractC5106
    /* JADX INFO: renamed from: ۜ */
    public final void mo12266() {
        Iterator it = this.f24947.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            ((C10315) it.next()).m36533(i);
            i++;
        }
    }

    @Override // l.AbstractC23721
    /* JADX INFO: renamed from: ۖ */
    public final Collection mo12263() {
        return this.f24947.values();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m19993(C16022 c16022) {
        return ((C10315) this.f24947.get(c16022)).m36534();
    }
}
