package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ۖܰܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: IBEA */
/* JADX INFO: loaded from: classes3.dex */
public final class C2715 extends AbstractC13354 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final TreeMap f9071;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized void m9037(C6994 c6994) {
        try {
            if (c6994 == null) {
                throw new NullPointerException("prototype == null");
            }
            m23363();
            if (((C9426) this.f9071.get(c6994)) == null) {
                this.f9071.put(c6994, new C9426(c6994));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public C2715(C10918 c10918) {
        super("proto_ids", c10918, 4);
        this.f9071 = new TreeMap();
    }

    @Override // l.AbstractC13354
    /* JADX INFO: renamed from: ۧ */
    public final void mo3720() {
        Iterator it = this.f9071.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            ((C9426) it.next()).m38319(i);
            i++;
        }
    }

    @Override // l.AbstractC8681
    /* JADX INFO: renamed from: ᩸ */
    public final Collection mo3721() {
        return this.f9071.values();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16139 m9035(AbstractC13487 abstractC13487) {
        if (abstractC13487 == null) {
            throw new NullPointerException("cst == null");
        }
        if (!(abstractC13487 instanceof C7740)) {
            throw new IllegalArgumentException("cst not instance of CstProtoRef");
        }
        m23365();
        AbstractC16139 abstractC16139 = (AbstractC16139) this.f9071.get(((C7740) abstractC13487).m21068());
        if (abstractC16139 != null) {
            return abstractC16139;
        }
        throw new IllegalArgumentException("not found");
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m9036(C15000 c15000) {
        m23365();
        int size = this.f9071.size();
        int iM23364 = size == 0 ? 0 : m23364();
        if (size > 65536) {
            throw new UnsupportedOperationException("too many proto ids");
        }
        if (c15000.m36116()) {
            c15000.m36111(4, "proto_ids_size:  ".concat(C5306.m15938(size)));
            c15000.m36111(4, "proto_ids_off:   ".concat(C5306.m15938(iM23364)));
        }
        c15000.m36124(size);
        c15000.m36124(iM23364);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m9034(C6994 c6994) {
        if (c6994 == null) {
            throw new NullPointerException("prototype == null");
        }
        m23365();
        C9426 c9426 = (C9426) this.f9071.get(c6994);
        if (c9426 == null) {
            throw new IllegalArgumentException("not found");
        }
        return c9426.m38321();
    }
}
