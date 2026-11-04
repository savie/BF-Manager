package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ᩴ᩶ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: EBAY */
/* JADX INFO: loaded from: classes5.dex */
public final class C20067 extends AbstractC13354 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final TreeMap f64519;

    public C20067(C10918 c10918) {
        super("type_ids", c10918, 4);
        this.f64519 = new TreeMap();
    }

    @Override // l.AbstractC13354
    /* JADX INFO: renamed from: ۧ */
    public final void mo3720() {
        Iterator it = this.f64519.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            ((C23051) it.next()).m38319(i);
            i++;
        }
    }

    @Override // l.AbstractC8681
    /* JADX INFO: renamed from: ᩸ */
    public final Collection mo3721() {
        return this.f64519.values();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16139 m46185(AbstractC13487 abstractC13487) {
        if (abstractC13487 == null) {
            throw new NullPointerException("cst == null");
        }
        m23365();
        AbstractC16139 abstractC16139 = (AbstractC16139) this.f64519.get(((C1028) abstractC13487).m3933());
        if (abstractC16139 != null) {
            return abstractC16139;
        }
        throw new IllegalArgumentException("not found: " + abstractC13487);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m46186(C15000 c15000) {
        m23365();
        TreeMap treeMap = this.f64519;
        int size = treeMap.size();
        int iM23364 = size == 0 ? 0 : m23364();
        if (size > 65536) {
            throw new C12083(String.format("Too many type identifiers to fit in one dex file: %1$d; max is %2$d.%nYou may try using multi-dex. If multi-dex is enabled then the list of classes for the main dex list is too large.", Integer.valueOf(treeMap.values().size()), 65536), null);
        }
        if (c15000.m36116()) {
            c15000.m36111(4, "type_ids_size:   ".concat(C5306.m15938(size)));
            c15000.m36111(4, "type_ids_off:    ".concat(C5306.m15938(iM23364)));
        }
        c15000.m36124(size);
        c15000.m36124(iM23364);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized void m46188(C5085 c5085) {
        try {
            if (c5085 == null) {
                throw new NullPointerException("type == null");
            }
            m23363();
            if (((C23051) this.f64519.get(c5085)) == null) {
                this.f64519.put(c5085, new C23051(new C1028(c5085)));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized C23051 m46187(C1028 c1028) {
        C23051 c23051;
        try {
            if (c1028 == null) {
                throw new NullPointerException("type == null");
            }
            m23363();
            C5085 c5085M3933 = c1028.m3933();
            c23051 = (C23051) this.f64519.get(c5085M3933);
            if (c23051 == null) {
                c23051 = new C23051(c1028);
                this.f64519.put(c5085M3933, c23051);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c23051;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m46184(C5085 c5085) {
        if (c5085 == null) {
            throw new NullPointerException("type == null");
        }
        m23365();
        C23051 c23051 = (C23051) this.f64519.get(c5085);
        if (c23051 == null) {
            throw new IllegalArgumentException("not found: " + c5085);
        }
        return c23051.m38321();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m46183(C1028 c1028) {
        if (c1028 == null) {
            throw new NullPointerException("type == null");
        }
        return m46184(c1028.m3933());
    }
}
