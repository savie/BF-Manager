package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ۤ᩶ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3BHY */
/* JADX INFO: loaded from: classes4.dex */
public final class C11116 extends AbstractC13354 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final TreeMap f35062;

    public C11116(C10918 c10918) {
        super("string_ids", c10918, 4);
        this.f35062 = new TreeMap();
    }

    @Override // l.AbstractC8681
    /* JADX INFO: renamed from: ᩸ */
    public final Collection mo3721() {
        return this.f35062.values();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16139 m28066(AbstractC13487 abstractC13487) {
        if (abstractC13487 == null) {
            throw new NullPointerException("cst == null");
        }
        m23365();
        AbstractC16139 abstractC16139 = (AbstractC16139) this.f35062.get((C9976) abstractC13487);
        if (abstractC16139 != null) {
            return abstractC16139;
        }
        throw new IllegalArgumentException("not found");
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m28067(C15000 c15000) {
        m23365();
        int size = this.f35062.size();
        int iM23364 = size == 0 ? 0 : m23364();
        if (c15000.m36116()) {
            c15000.m36111(4, "string_ids_size: ".concat(C5306.m15938(size)));
            c15000.m36111(4, "string_ids_off:  ".concat(C5306.m15938(iM23364)));
        }
        c15000.m36124(size);
        c15000.m36124(iM23364);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m28068(C9976 c9976) {
        C22305 c22305 = new C22305(c9976);
        synchronized (this) {
            m23363();
            C9976 value = c22305.getValue();
            if (((C22305) this.f35062.get(value)) != null) {
                return;
            }
            this.f35062.put(value, c22305);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m28065(C9976 c9976) {
        if (c9976 == null) {
            throw new NullPointerException("string == null");
        }
        m23365();
        C22305 c22305 = (C22305) this.f35062.get(c9976);
        if (c22305 == null) {
            throw new IllegalArgumentException("not found");
        }
        return c22305.m38321();
    }

    @Override // l.AbstractC13354
    /* JADX INFO: renamed from: ۧ */
    public final void mo3720() {
        Iterator it = this.f35062.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            ((C22305) it.next()).m38319(i);
            i++;
        }
    }
}
