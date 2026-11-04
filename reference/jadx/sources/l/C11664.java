package l;

import java.util.Collection;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ۧܰܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: HBFX */
/* JADX INFO: loaded from: classes4.dex */
public final class C11664 extends AbstractC6445 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final TreeMap f37803;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized C1970 m29339(C16689 c16689) {
        C1970 c1970;
        try {
            if (c16689 == null) {
                throw new NullPointerException("field == null");
            }
            m23363();
            c1970 = (C1970) this.f37803.get(c16689);
            if (c1970 == null) {
                c1970 = new C1970(c16689);
                this.f37803.put(c16689, c1970);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c1970;
    }

    public C11664(C10918 c10918) {
        super("field_ids", c10918, 4);
        this.f37803 = new TreeMap();
    }

    @Override // l.AbstractC8681
    /* JADX INFO: renamed from: ᩸ */
    public final Collection mo3721() {
        return this.f37803.values();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16139 m29337(AbstractC13487 abstractC13487) {
        if (abstractC13487 == null) {
            throw new NullPointerException("cst == null");
        }
        m23365();
        AbstractC16139 abstractC16139 = (AbstractC16139) this.f37803.get((C16689) abstractC13487);
        if (abstractC16139 != null) {
            return abstractC16139;
        }
        throw new IllegalArgumentException("not found");
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m29338(C15000 c15000) {
        m23365();
        int size = this.f37803.size();
        int iM23364 = size == 0 ? 0 : m23364();
        if (c15000.m36116()) {
            c15000.m36111(4, "field_ids_size:  ".concat(C5306.m15938(size)));
            c15000.m36111(4, "field_ids_off:   ".concat(C5306.m15938(iM23364)));
        }
        c15000.m36124(size);
        c15000.m36124(iM23364);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m29336(C16689 c16689) {
        if (c16689 == null) {
            throw new NullPointerException("ref == null");
        }
        m23365();
        C1970 c1970 = (C1970) this.f37803.get(c16689);
        if (c1970 == null) {
            throw new IllegalArgumentException("not found");
        }
        return c1970.m38321();
    }
}
