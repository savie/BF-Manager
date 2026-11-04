package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ܰܰܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: QBEG */
/* JADX INFO: loaded from: classes5.dex */
public final class C14647 extends AbstractC13354 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final TreeMap f47921;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized void m35279(C21165 c21165) {
        try {
            if (c21165 == null) {
                throw new NullPointerException("methodHandle == null");
            }
            m23363();
            if (((C4207) this.f47921.get(c21165)) == null) {
                this.f47921.put(c21165, new C4207(c21165));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16139 m35278(AbstractC13487 abstractC13487) {
        if (abstractC13487 == null) {
            throw new NullPointerException("cst == null");
        }
        m23365();
        AbstractC16139 abstractC16139 = (AbstractC16139) this.f47921.get((C21165) abstractC13487);
        if (abstractC16139 != null) {
            return abstractC16139;
        }
        throw new IllegalArgumentException("not found");
    }

    public C14647(C10918 c10918) {
        super("method_handles", c10918, 8);
        this.f47921 = new TreeMap();
    }

    @Override // l.AbstractC13354
    /* JADX INFO: renamed from: ۧ */
    public final void mo3720() {
        Iterator it = this.f47921.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            ((C4207) it.next()).m38319(i);
            i++;
        }
    }

    @Override // l.AbstractC8681
    /* JADX INFO: renamed from: ᩸ */
    public final Collection mo3721() {
        return this.f47921.values();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m35277(C21165 c21165) {
        return ((C4207) this.f47921.get(c21165)).m38321();
    }
}
