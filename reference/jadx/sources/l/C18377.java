package l;

import java.util.Collection;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ܿܰܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBHA */
/* JADX INFO: loaded from: classes5.dex */
public final class C18377 extends AbstractC6445 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final TreeMap f59873;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized void m42875(AbstractC22657 abstractC22657) {
        try {
            if (abstractC22657 == null) {
                throw new NullPointerException("method == null");
            }
            m23363();
            if (((C21361) this.f59873.get(abstractC22657)) == null) {
                this.f59873.put(abstractC22657, new C21361(abstractC22657));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public C18377(C10918 c10918) {
        super("method_ids", c10918, 4);
        this.f59873 = new TreeMap();
    }

    @Override // l.AbstractC8681
    /* JADX INFO: renamed from: ᩸ */
    public final Collection mo3721() {
        return this.f59873.values();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16139 m42873(AbstractC13487 abstractC13487) {
        if (abstractC13487 == null) {
            throw new NullPointerException("cst == null");
        }
        m23365();
        AbstractC16139 abstractC16139 = (AbstractC16139) this.f59873.get((AbstractC22657) abstractC13487);
        if (abstractC16139 != null) {
            return abstractC16139;
        }
        throw new IllegalArgumentException("not found");
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m42874(C15000 c15000) {
        m23365();
        int size = this.f59873.size();
        int iM23364 = size == 0 ? 0 : m23364();
        if (c15000.m36116()) {
            c15000.m36111(4, "method_ids_size: ".concat(C5306.m15938(size)));
            c15000.m36111(4, "method_ids_off:  ".concat(C5306.m15938(iM23364)));
        }
        c15000.m36124(size);
        c15000.m36124(iM23364);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m42872(AbstractC22657 abstractC22657) {
        if (abstractC22657 == null) {
            throw new NullPointerException("ref == null");
        }
        m23365();
        C21361 c21361 = (C21361) this.f59873.get(abstractC22657);
        if (c21361 == null) {
            throw new IllegalArgumentException("not found");
        }
        return c21361.m38321();
    }
}
